package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Triangle extends Pixel{

    private final int width;
    private final int height;
    public Triangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Collection<Pixel> collection) {
        int halfBase = width / 2;
        var pixels = new ArrayList<Pixel>();
        for (int i = 0; i < height; i++) {
            int startX = getX() + halfBase - (i * halfBase / height);
            int endX = getX() + halfBase + (i * halfBase / height);

            for (int j = startX; j <= endX; j++) {
                pixels.add(new Pixel(getColor(), j, getY() + i));
            }
        }
        collection.addAll(pixels);
    }
}
