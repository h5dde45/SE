package ru.tk.io.t10;

import java.io.*;

public class Main {
    private static final String PATH = "object.txt";

    public static void main(String[] args) throws ClassNotFoundException {

        serialize();
        deserialize();
    }

    private static void serialize() {
        SerializableClass serializableClass = new SerializableClass(
                SerializableClass.class.getName(), 0);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATH))) {
            outputStream.writeObject(serializableClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize() throws ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(PATH))) {
            SerializableClass serializableClass = (SerializableClass) inputStream.readObject();
            System.out.printf("%s %n %d",serializableClass.title,serializableClass.size);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class SerializableClass implements Serializable {
//        private transient String title;
        private String title;
        private int size;

        public SerializableClass(String title, int size) {
            this.title = title;
            this.size = size;
        }
    }
}
