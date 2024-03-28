package org.building;

public class WorkingBuilding implements Building {
    BuildingType buildingType;
    Pillar pillar;
    TopBoard topBoard;
    Drawer drawer;

    public WorkingBuilding(BuildingType buildingType, Pillar pillar, TopBoard topBoard, Drawer drawer) {
        this.buildingType = buildingType;
        this.pillar = pillar;
        this.topBoard = topBoard;
        this.drawer = drawer;
    }

    @Override
    public String build() {
        return workBuild(buildingType, pillar, topBoard, drawer);
    }

    private String workBuild(BuildingType buildingType, Pillar pillar, TopBoard topBoard, Drawer drawer) {
        return buildingType.toString() + " Building! " + "pillar=" + pillar + ", topBoard=" + topBoard + ", drawer=" + drawer;
    }
}
