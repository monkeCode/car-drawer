package main_package;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main {

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("test");
        frame.getContentPane().add(label);
        frame.add(new PixelCanvas());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static class PixelCanvas extends Canvas {
        private static final int WIDTH = 400;
        private static final int HEIGHT = 400;
        private static final Random random = new Random();

        private Color randomColor() {
            return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);

            for (int x = 0; x < WIDTH; x++) {
                for (int y = 0; y < HEIGHT; y++) {
                    g.setColor(randomColor());
                    g.drawLine(x, y, x, y);
                }
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