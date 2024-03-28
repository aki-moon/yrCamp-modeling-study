package org.tsukue;

public class TsukueFactory {
    public static Tsukue createStandingDesk(){
        Pillar pillar = new Pillar(new Wood(), new Square(), 10.7, 20.8, 30.9, 1);
        TopBoard topBoard = new TopBoard(new Wood(), new Circle(), 40.7, 50.8, 60.9);
        Building building = new StandBuilding(BuildingType.DESK, pillar, topBoard);
        return new Desk(building) {};
    }

    public static Tsukue createWorkingTable(){
        Pillar pillar = new Pillar(new Wood(), new Square(), 10.7, 20.8, 30.9, 1);
        TopBoard topBoard = new TopBoard(new Wood(), new Circle(), 40.7, 50.8, 60.9);
        Drawer drawer = new Drawer(new Wood(), new Square(), 70.7, 80.8, 90.9, 10);
        Building building = new WorkingBuilding(BuildingType.TABLE, pillar, topBoard, drawer);
        return new Table(building) {};
    }

    public static Tsukue createWorkingDesk() {
        Pillar pillar = new Pillar(new Wood(), new Square(), 10.7, 20.8, 30.9, 1);
        TopBoard topBoard = new TopBoard(new Wood(), new Circle(), 40.7, 50.8, 60.9);
        Drawer drawer = new Drawer(new Wood(), new Square(), 70.7, 80.8, 90.9, 10);
        Building building = new WorkingBuilding(BuildingType.DESK, pillar, topBoard, drawer);
        return new Desk(building) {};
    }

    public static Tsukue createStandingTable(){
        Pillar pillar = new Pillar(new Wood(), new Square(), 10.7, 20.8, 30.9, 1);
        TopBoard topBoard = new TopBoard(new Wood(), new Circle(), 40.7, 50.8, 60.9);
        Drawer drawer = new Drawer(new Wood(), new Square(), 70.7, 80.8, 90.9, 10);
        Building building = new StandBuilding(BuildingType.TABLE, pillar, topBoard);
        return new Table(building) {};
    }
}
