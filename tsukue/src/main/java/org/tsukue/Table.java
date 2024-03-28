package org.tsukue;

public class Table implements Tsukue {
    private Building building;
    public Table(Building building) {
        this.building = building;
    }

    @Override
    public String build() {
        return building.build();
    }
}
