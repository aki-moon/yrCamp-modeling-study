package org.building;

import org.tsukue.BuildingType;

public class WorkingBuilding implements Building {
    Pillar pillar;
    TopBoard topBoard;
    Drawer drawer;

    public WorkingBuilding(Pillar pillar, TopBoard topBoard, Drawer drawer) {
        this.pillar = pillar;
        this.topBoard = topBoard;
        this.drawer = drawer;
    }

    @Override
    public String build(BuildingType buildingType) {
        return workBuild(buildingType, pillar, topBoard, drawer);
    }

    private String workBuild(BuildingType buildingType, Pillar pillar, TopBoard topBoard, Drawer drawer) {
        return buildingType.toString() + " Building! " + "pillar=" + pillar + ", topBoard=" + topBoard + ", drawer=" + drawer;
    }
}
