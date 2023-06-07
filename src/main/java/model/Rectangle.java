package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rectangle extends Figure {

    private final int width;
    private final int height;

    public Rectangle(int x, int y, int width, int height, Color color, int layer) {
        super(x, y, color, layer);
        this.width = width;
        this.height = height;
    }

    @Override
    public Collection<Pixel> decompose() {
        List<Pixel> pixels = new ArrayList<>();
        for (int i = getY(); i < getY()+height; i++)
            for (int j = getX(); j < getX() + width; j++)
            {
                pixels.add(new Pixel(getColor(),j,i));
            }
        return pixels;
    }
}
