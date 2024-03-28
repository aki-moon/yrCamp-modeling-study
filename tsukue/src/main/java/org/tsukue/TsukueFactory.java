package org.tsukue;

public class TsukueFactory {
    public static Tsukue createStandingDesk(){
        Pillar pillar = new Pillar(new Wood(), new Square(), 10.7, 20.8, 30.9, 1);
        TopBoard topBoard = new TopBoard(new Wood(), new Circle(), 40.7, 50.8, 60.9);
        Building building = new StandBuilding(BuildingType.DESK, pillar, topBoard);
        return new Desk(building) {};
    }

    public static Tsukue createTable(){
        Building building = new TableBuilding();
        return new Table(building) {};
    }
}
