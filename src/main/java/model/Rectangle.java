package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Rectangle extends Pixel {

    private final int width;
    private final int height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Collection<Pixel> collection) {
        List<Pixel> pixels = new ArrayList<>();
        for (int i = getY(); i < getY()+height; i++)
            for (int j = getX(); j < getX() + width; j++)
            {
                pixels.add(new Pixel(getColor(),j,i));
            }
        collection.addAll(pixels);
    }
}
