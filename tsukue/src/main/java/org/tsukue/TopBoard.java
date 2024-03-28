package org.tsukue;

public class TopBoard {
    Material material;
    Shape shape;
    double width;
    double height;
    double depth;

    public TopBoard(Material material, Shape shape, double width, double height, double depth) {
        this.material = material;
        this.shape = shape;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "TopBoard{" +
                "material=" + material +
                ", shape=" + shape +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}
