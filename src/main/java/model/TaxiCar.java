package model;

import java.awt.*;

public class TaxiCar extends Car{
    public TaxiCar(int x, int y, int layer) {
        super(x, y, layer);
        drawables.add(new Triangle(x+ 160, y-100, 100,50, Color.yellow, layer+1));
    }
}
