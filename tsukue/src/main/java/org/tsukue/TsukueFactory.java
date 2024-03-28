package org.tsukue;

public class TsukueFactory {
    public static Tsukue createDesk(){
        Building building = new DeskBuilding();
        return new Desk(building) {};
    }

    public static Tsukue createTable(){
        Building building = new TableBuilding();
        return new Table(building) {};
    }
}
