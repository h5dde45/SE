package ru.tk.nio.t2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("text.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer buffer = ByteBuffer.allocate(28);
            for (int i = 0; i < buffer.capacity(); i++) {
                buffer.put((byte) ('a' + i));
            }
            buffer.rewind();//position = 0]
            channel.write(buffer);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("text2.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE)) {
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_WRITE, 0, 27);
            for (int i = 0; i < buffer.capacity(); i++) {
                buffer.put((byte) ('A' + i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
