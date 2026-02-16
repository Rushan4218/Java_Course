import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RuLayout extends JFrame {

  JPanel panelOne, panelTwo, panelThree, panelFour, panelFive;

  public RuLayout() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 500);
    setLocation(600, 150);

    panelOne = new JPanel();
    panelOne.setBackground(Color.RED);
    panelOne.setBounds(0, 0, 100, 100);

    panelTwo = new JPanel();
    panelTwo.setBackground(Color.GREEN);
    panelTwo.setBounds(100, 100, 100, 100);

    panelThree = new JPanel();
    panelThree.setBackground(Color.BLUE);
    panelThree.setBounds(200, 200, 100, 100);

    panelFour = new JPanel();
    panelFour.setBackground(Color.YELLOW);
    panelFour.setBounds(300, 300, 100, 100);

    panelFive = new JPanel();
    panelFive.setBackground(Color.ORANGE);
    panelFive.setBounds(400, 400, 100, 100);

    // For border layout
    // setLayout(new BorderLayout(5, 5));
    //
    // add(panelOne, BorderLayout.NORTH);
    // add(panelTwo, BorderLayout.SOUTH);
    // add(panelThree, BorderLayout.EAST);
    // add(panelFour, BorderLayout.WEST);
    // add(panelFive, BorderLayout.CENTER);

    // For Flow Layout
    // setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
    // add(panelOne);
    // add(panelTwo);
    // add(panelThree);
    // add(panelFour);
    // add(panelFive);

    // For Grid Layout
    // setLayout(new GridLayout(2, 3, 10, 10));
    // add(panelOne);
    // add(panelTwo);
    // add(panelThree);
    // add(panelFour);
    // add(panelFive);

    // For Card Layout
    // setLayout(new CardLayout());
    // add(panelOne);
    // add(panelTwo);
    // add(panelThree);
    // add(panelFour);
    // add(panelFive);

    // For null layout
    setLayout(null);
    add(panelOne);
    add(panelTwo);
    add(panelThree);
    add(panelFour);
    add(panelFive);
  }
}
