package org.tsukue;

public class StandBuilding implements Building {
    BuildingType buildingType;
    Pillar pillar;
    TopBoard topBoard;
    public StandBuilding(BuildingType buildingType, Pillar pillar, TopBoard topBoard) {
        this.buildingType = buildingType;
        this.pillar = pillar;
        this.topBoard = topBoard;
    }

    @Override
    public String build() {
        return standBuild(buildingType, pillar, topBoard);
    }

    private String standBuild(BuildingType buildingType, Pillar pillar, TopBoard topBoard) {
        return buildingType.toString() + " Building! " + "pillar=" + pillar + ", topBoard=" + topBoard;
    }
}
