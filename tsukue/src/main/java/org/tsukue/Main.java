package org.tsukue;

public class Main {
    public static void main(String[] args) {
        Tsukue desk = TsukueFactory.createDesk();
        Tsukue table = TsukueFactory.createTable();

        desk.build();
        table.build();
    }
}