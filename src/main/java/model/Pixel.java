package model;

import java.awt.*;
import java.util.Collection;
import java.util.List;

public class Pixel {

    private final int y;
    private final int x;
    private final Color color;

    public Pixel(Color color, int x, int y)
    {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public final int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

    public void draw(Collection<Pixel> collection)
    {
         collection.add(this);
    }
}
