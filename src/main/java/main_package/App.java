package main_package;

import Views.MainView;
import Views.View;

public class App
{
    private View activeView;

    public App()
    {
        activeView = new MainView();
    }

    public View getView() {
        return activeView;
    }
}
