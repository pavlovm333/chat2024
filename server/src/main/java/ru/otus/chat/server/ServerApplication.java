package ru.otus.chat.server;

import java.util.Arrays;

public class ServerApplication {
    public static void main(String[] args) {
        new Server(8189).start();
    }
}