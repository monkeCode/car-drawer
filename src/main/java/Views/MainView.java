package Views;

import model.Car;
import model.Circle;

import java.awt.*;

public class MainView extends View
{
    @Override
    protected void initComponents() {

        addDrawable(new Car(200,200,1));
    }
}
