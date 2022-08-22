package com.more.nio.biotest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class BIOClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",6666);
        OutputStream os =socket.getOutputStream();
        os.write("hello socket".getBytes());
        socket.close();
    }
}
