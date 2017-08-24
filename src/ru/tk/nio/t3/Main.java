package ru.tk.nio.t3;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        int i;

        try(SeekableByteChannel channel= Files.newByteChannel(Paths.get("text.txt"))){
            ByteBuffer buffer=ByteBuffer.allocate(128);

            do {
                i=channel.read(buffer);
                if(i!=-1){
                    buffer.rewind();
                    for (int j = 0; j < i; j++) {
                        System.out.print((char) buffer.get());
                    }
                }
            }while (i!=-1);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("text2.txt"))) {
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            for (int k = 0; k < channel.size(); k++) {
                System.out.print((char) buffer.get());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
