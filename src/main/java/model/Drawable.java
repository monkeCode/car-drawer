package model;

import java.util.Collection;

public interface Drawable
{
    Collection<Pixel> decompose();
    int getLayer();
    void setLayer(int layer);
}
