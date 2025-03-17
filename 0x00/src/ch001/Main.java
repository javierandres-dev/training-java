package ch001;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello, Java!");
    frame.add(new HelloComponent("Java is powerful!"));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}

class HelloComponent extends JComponent implements MouseMotionListener {
  String theMessage;
  int messageX = 50, messageY = 50;

  public HelloComponent(String message) {
    theMessage = message;
    addMouseMotionListener(this);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawString(theMessage, messageX, messageY);
  }

  public void mouseDragged(MouseEvent e) {
    messageX = e.getX();
    messageY = e.getY();
    theMessage = "Mouse dragging on X: " + messageX + " Y: " + messageY;
    repaint();
  }

  public void mouseMoved(MouseEvent e) {
    // No action needed for mouseMoved in this example
  }
}
