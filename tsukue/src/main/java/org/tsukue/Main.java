package org.tsukue;

public class Main {
    public static void main(String[] args) {
        Tsukue desk = TsukueFactory.createStandingDesk();
        Tsukue table = TsukueFactory.createWorkingTable();

        desk.build();
        table.build();
    }
}