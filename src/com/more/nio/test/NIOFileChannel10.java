package com.more.nio.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileChannel10 {
    public static void main(String[] args) throws IOException {
       /* String str = "hello nio";
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\Desktop\\guigu\\Netty教程源码资料\\讲义\\nio.txt");
        FileChannel fileChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(str.getBytes());
        byteBuffer.flip();
        fileChannel.write(byteBuffer);
        fileOutputStream.close();*/
       /* File file = new File("C:\\Users\\Admin\\Desktop\\guigu\\Netty教程源码资料\\讲义\\kk.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel fileChannel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());
        fileChannel.read(byteBuffer);
        byteBuffer.flip();
        System.out.println(new String(byteBuffer.array()));
        fileInputStream.close();*/
        File file = new File("C:\\Users\\Admin\\Desktop\\guigu\\Netty教程源码资料\\讲义\\kk.txt");
        File file1 = new File("C:\\Users\\Admin\\Desktop\\guigu\\Netty教程源码资料\\讲义\\kk1.txt");
        try (FileChannel fileChannel = new FileInputStream(file).getChannel();
             FileChannel fileChannel1 = new FileOutputStream(file1).getChannel();) {
            ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());
            fileChannel.read(byteBuffer);
            byteBuffer.flip();
            fileChannel1.write(byteBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
