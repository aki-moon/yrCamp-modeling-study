package org.tsukue;

import org.building.Building;
import org.tsukue.Tsukue;

public class Table implements Tsukue {
    private final Building building;
    public Table(Building building) {
        this.building = building;
    }

    @Override
    public String build() {
        return building.build(BuildingType.TABLE);
    }
}
