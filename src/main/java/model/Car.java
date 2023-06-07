package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Car implements Drawable {

    private final List<Drawable> drawables = new ArrayList<>();
    private int layer;

    public Car(int x, int y, int layer)
    {
        this.layer = layer;

        drawables.add(new Rectangle(x,y, 400,100, Color.gray,layer));
        drawables.add(new Rectangle(x+100,y-50,250,50, Color.gray,layer));
        drawables.add(new Circle(x+80,y+100, 50, Color.cyan, layer+1));
        drawables.add(new Circle(x+320,y+100, 50, Color.cyan, layer+1 ));
    }

    @Override
    public Collection<Pixel> decompose() {
        List<Pixel> pixels = new ArrayList<>();
        for(var f : drawables){
            pixels.addAll(f.decompose());
        }
        return pixels;
    }

    @Override
    public int getLayer() {
        return layer;
    }

    @Override
    public void setLayer(int layer) {
        this.layer = layer;
    }
}
