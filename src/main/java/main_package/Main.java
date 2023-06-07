package main_package;

import Presenters.MainPresenter;
import Presenters.Presentable;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static void createAndShowGUI() {


        //Create and set up the window.
        JFrame frame = new JFrame("Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("test");
        frame.setSize(800,600);
        frame.getContentPane().add(label);
        frame.add(new PixelCanvas());
        //Display the window.
        frame.setVisible(true);
    }

    public static class PixelCanvas extends Canvas {

        private Presentable presenter = new MainPresenter();

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for(var pixel : presenter.getView().draw())
            {
                g.setColor(pixel.getColor());
                g.drawLine(pixel.getX(),pixel.getY(), pixel.getX(),pixel.getY());
            }
        }
    }


    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.

        javax.swing.SwingUtilities.invokeLater(Main::createAndShowGUI);
    }
}