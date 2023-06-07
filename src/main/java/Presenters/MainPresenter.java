package Presenters;

import Views.MainView;
import Views.View;

public class MainPresenter implements Presentable
{
    private View activeView;

    public MainPresenter()
    {
        activeView = new MainView();
    }

    @Override
    public View getView() {
        return activeView;
    }
}
