package org.tsukue;

public class Desk implements Tsukue {
    private final Building building;
    public Desk(Building building) {
        this.building = building;
    }

    @Override
    public String build() {
        return building.build();
    }
}
