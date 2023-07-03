package main_package;

import model.Drawer;
import model.Pixel;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;
import java.util.Random;

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


        Collection<Pixel> pixels;

        public PixelCanvas()
        {
            Drawer drawer = new Drawer();
            drawer.setColor(Color.GRAY)
                    .drawRect(100,100, 400,100)
                    .drawRect(200,50,250,50)
                    .setColor(Color.cyan)
                    .drawCircle(180,200, 50)
                    .drawCircle(420,200, 50)
                    .setColor(Color.YELLOW)
                    .drawTriangle(260,0, 100,50);

            pixels = drawer.draw();
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            for(var pixel : pixels)
            {
                g.setColor(pixel.color());
                g.drawLine(pixel.x(),pixel.y(), pixel.x(),pixel.y());
            }

        }
    }


    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}