package org.building;

public class Drawer {
    Material material;
    Shape shape;
    double width;
    double height;
    double depth;
    int num;

    public Drawer(Material material, Shape shape, double width, double height, double depth, int num) {
        this.material = material;
        this.shape = shape;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Drawer{" +
                "material=" + material +
                ", shape=" + shape +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", num=" + num +
                '}';
    }
}
