package model;

import java.awt.*;
import java.util.Iterator;

public abstract class Figure implements Drawable, Iterable<Pixel>
{
    private final int y;
    private final int x;
    private final Color color;

    private int layer;

    public Figure(int x, int y, Color color, int layer)
    {
        this.x = x;
        this.y = y;
        this.color = color;
        this.layer = layer;
    }

    public Color getColor() {
        return color;
    }

    @Override
     public void setLayer(int layer) {
        this.layer = layer;
    }

    @Override
    public int getLayer() {
        return layer;
    }

    public final int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

    @Override
    public Iterator<Pixel> iterator() {
        return decompose().iterator();
    }

}
