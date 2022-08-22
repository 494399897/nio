package com.more.nio.groupchat;

public class Main {
    public static void main(String[] args) {
        GroupChatServer server = new GroupChatServer();
        server.listen();

    }
}
