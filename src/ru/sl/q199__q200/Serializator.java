package ru.sl.q199__q200;

import java.io.*;

public class Serializator {
    public boolean serialization(Student student, String fileName) {
        boolean flag = false;
        File file = new File(fileName);
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(student);
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public Student deserialization(String fileName) throws InvalidObjectException {
        File file = new File(fileName);

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Student student = (Student) ois.readObject();
            return student;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new InvalidObjectException("Object not deserialize");
    }

}
