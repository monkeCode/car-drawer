package Views;

import model.Drawable;
import model.Pixel;

import java.util.*;

public abstract class View
{
    private final Set<Drawable> drawables = new HashSet<>();

    public View()
    {
        initComponents();
    }

    protected abstract void initComponents();

    public void addDrawable(Drawable drawable)
    {
        drawables.add(drawable);
    }
    public void deleteDrawable(Drawable drawable)
    {
        drawables.remove(drawable);
    }
    public Collection<Pixel> draw()
    {
        PriorityQueue<Drawable> drawableQueue =  new PriorityQueue<>(Comparator.comparingInt(Drawable::getLayer));
        drawableQueue.addAll(drawables);
        List<Pixel> pixels = new ArrayList<>();
        for(Drawable d = drawableQueue.poll(); d != null; d = drawableQueue.poll())
        {
            pixels.addAll(d.decompose());
        }
        return pixels;
    }
}
