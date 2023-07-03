package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class Triangle extends Figure{
    private final int height;
    private final int width;
    public Triangle(int x, int y, int width, int height, Color color, int layer) {
        super(x, y, color, layer);
        this.height = height;
        this.width = width;
    }

    @Override
    public Collection<Pixel> decompose() {
       int halfBase = width / 2;
        var pixels = new ArrayList<Pixel>();

        for (int i = 0; i < height; i++) {
            int startX = getX() + halfBase - (i * halfBase / height);
            int endX = getX() + halfBase + (i * halfBase / height);

            for (int j = startX; j <= endX; j++) {
                pixels.add(new Pixel(getColor(), j, getY() + i));
            }
        }
        return pixels;
    }
}
