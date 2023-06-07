package model;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Drawer {

    private Color activeColor;

    private final List<Pixel> elements;

    public Drawer()
    {
        activeColor = Color.black;
        elements = new ArrayList<>();
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
     public Drawer drawCircle(int centerX, int centerY, int radius)
     {
         elements.add(new Circle(activeColor, centerX, centerY, radius));
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
        elements.add(new Rectangle(activeColor, x, y, width, height));
        return this;
    }

    public Collection<Pixel> draw()
    {
        List<Pixel> pixels = new ArrayList<>();
        for(var el: elements){
            el.draw(pixels);
        }
        return pixels;
    }

}
