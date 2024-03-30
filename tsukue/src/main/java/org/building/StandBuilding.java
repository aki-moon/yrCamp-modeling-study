package org.building;

import org.tsukue.BuildingType;

public class StandBuilding implements Building {
    Pillar pillar;
    TopBoard topBoard;
    public StandBuilding(Pillar pillar, TopBoard topBoard) {
        this.pillar = pillar;
        this.topBoard = topBoard;
    }

    @Override
    public String build(BuildingType buildingType) {
        return standBuild(buildingType, pillar, topBoard);
    }

    private String standBuild(BuildingType buildingType, Pillar pillar, TopBoard topBoard) {
        return buildingType.toString() + " Building! " + "pillar=" + pillar + ", topBoard=" + topBoard;
    }
}
