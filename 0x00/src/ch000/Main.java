package ch000;

import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    JFrame myWindow;
    myWindow = new JFrame();
    myWindow.setSize(300, 200);
    myWindow.setTitle("My First Java Program");
    myWindow.setVisible(true);
    myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
