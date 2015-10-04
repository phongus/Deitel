import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Fig. 18.18: Fractal.java
 * Fractal user interface
 */

public class Fractal extends JFrame
{
    private static final int WIDTH = 400;   //  define width of GUI
    private static final int HEIGHT = 480;  //  define height of GUI
    private static final int MIN_LEVEL = 0, MAX_LEVEL = 15;

    private JButton changeColorJButton, increaseLevelJButton, decreaseLevelJButton;
    private JLabel levelJLabel;
    private FractalJPanel drawSpace;
    private JPanel mainJPanel, controlJPanel;

    //  set up GUI
    public Fractal()
    {
        super("Fractal");

        //  set up control panel
        controlJPanel = new JPanel();
        controlJPanel.setLayout(new FlowLayout());

        //  set up color button and register listener
        changeColorJButton = new JButton("Color");
        controlJPanel.add(changeColorJButton);
        changeColorJButton.addActionListener(
                new ActionListener() // anonymous listener
                {
                    //  process changeColorJButton event
                    public void actionPerformed(ActionEvent event)
                    {
                        Color color = JColorChooser.showDialog(
                                Fractal.this, "Choose a color", Color.BLUE);

                        //  set default color, if no color is returned
                        if (color == null)
                            color = Color.BLUE;

                        drawSpace.setColor(color);
                    }   //  end method actionPerformed
                }   //  end anonymous inner class
        );  //  end addActionListener

        //  set up decrease level button to add to control panel and
        //  register listener
        decreaseLevelJButton = new JButton("Decrease Level");
        controlJPanel.add(decreaseLevelJButton);
        decreaseLevelJButton.addActionListener(
                new ActionListener()    //  anonymous inner class
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        int level = drawSpace.getLevel();
                        --level;    //  decrease level by one

                        //  modify level if possible
                        if ((level >= MIN_LEVEL) && (level <= MAX_LEVEL))
                        {
                            levelJLabel.setText("Level: " + level );
                            drawSpace.setLevel(level);
                            repaint();
                        }   //  end if
                    }   //  end method actionPerformed
                }   //  end anonymous inner class
        );  //  end addActionListener

        //  set up increase level button to add to control panel
        //  and register listener
        increaseLevelJButton = new JButton("Increase Level");
        controlJPanel.add(increaseLevelJButton);
        increaseLevelJButton.addActionListener(
                new ActionListener() // anonymous inner class
                {
                    //  process increaseLevelJButton event
                    public void actionPerformed(ActionEvent event)
                    {
                        int level = drawSpace.getLevel();
                        ++level;    //  increase level by one

                        //  modify level if possible
                        if ( ( level >= MIN_LEVEL) && (level <= MAX_LEVEL ) )
                        {
                            levelJLabel.setText("Level: " + level );
                            drawSpace.setLevel(level);
                            repaint();
                        }   //  end if
                    }   //  end method actionPerformed
                }   //  end anonymous inner class
        );  //  end addActionListener

        //  set up levelJLabel to add to controlJPanel
        levelJLabel = new JLabel("Level: 0");
        controlJPanel.add(levelJLabel);

        drawSpace = new FractalJPanel(0);

        //  create mainJPanel to contain controlJPanel and drawSpace
        mainJPanel = new JPanel();
        mainJPanel.add(controlJPanel);
        mainJPanel.add(drawSpace);

        add(mainJPanel);    //  add JPanel to JFrame

        setSize(WIDTH, HEIGHT); //  set size of JFrame
        setVisible(true);   //  display JFrame
    }   //  end Fractal Constructor

    public static void main(String[] args)
    {
        Fractal demo = new Fractal();
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   //  end main
}   //  end class Fractal
