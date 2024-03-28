package org.tsukue;

public class Pillar {
    Material material;
    Shape shape;
    double width;
    double height;
    double depth;
    int number;

    public Pillar(Material material, Shape shape, double width, double height, double depth, int number) {
        this.material = material;
        this.shape = shape;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Pillar{" +
                "material=" + material +
                ", shape=" + shape +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", number=" + number +
                '}';
    }
}
