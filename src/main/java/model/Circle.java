package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Circle extends Figure
{

    private final int radius;

    public Circle(int x, int y, int radius, Color color, int layer) {
        super(x, y, color, layer);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Collection<Pixel> decompose() {
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
