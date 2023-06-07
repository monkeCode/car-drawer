package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Circle extends Pixel
{

    private final int radius;

    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Collection<Pixel> draw() {
        List<Pixel> pixels = new ArrayList<>();
        for(int y = - radius; y <=radius; y++)
        {
            for(int x = - radius; x <=radius; x++)
            {
                if(x*x + y*y < radius*radius)
                {
                    pixels.add(new Pixel(getColor(), getX()+x, getY()+ y));
                }
            }
        }
        return pixels;
    }
}
