package model;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Drawer {

    private Color activeColor;

    private final Set<Pixel> pixels;

    public Drawer()
    {
        activeColor = Color.black;
        pixels = new HashSet<>();
    }

    public Drawer setColor(Color color)
    {
        activeColor = color;
        return this;
    }

    /**
     * <h3>Add a new circle instance to draw queue</h3>
     * @param centerX the center of the circle in the horizontal coordinate
     * @param centerY the center of the circle in the vertical coordinate
     * @param radius circle radius
     * @return Drawer instance
     */
    public Drawer drawCircle(int centerX, int centerY, int radius )
    {
        for(int y = - radius; y <=radius; y++)
        {
            for(int x = - radius; x <=radius; x++)
            {
                if(x*x + y*y < radius*radius)
                {
                    pixels.add(new Pixel(activeColor, centerX+x, centerY+ y));
                }
            }
        }
        return this;
    }

    /**
        <h3>Add rectangle to draw queue</h3>
        @param x left side position
        @param y top side position
        @return Drawer instance
     **/
    public Drawer drawRect(int x, int y , int width, int height)
    {
        for (int i = y; i < y+height; i++)
            for (int j = x; j < x + width; j++)
            {
                pixels.add(new Pixel(activeColor,j,i));
            }
        return this;
    }

    public Drawer drawTriangle(int x, int y, int width, int height)
    {
        y-=height;
        int baseY = y + height;
        int halfBase = width / 2;

        for (int i = 0; i < height; i++) {
            int startX = x + halfBase - (i * halfBase / height);
            int endX = x + halfBase + (i * halfBase / height);

            for (int j = startX; j <= endX; j++) {
                pixels.add(new Pixel(activeColor, j, baseY + i));
            }
        }
        return this;
    }

    public Collection<Pixel> draw()
    {
        return pixels;
    }

}
