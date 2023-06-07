package model;

import java.awt.*;

public class Figure
{
    private final int y;
    private final int x;
    private final Color color;

    public Figure(int x, int y, Color color)
    {
        this.x = x;
        this.y = y;
        this.color = color;
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
}
