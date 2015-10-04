import javax.swing.*;
import java.awt.*;

/**
 * Fig. 18.19: FractalJPanel.java
 * Drawing the "Lo fractal" using recursion.
 */
public class FractalPanel extends JPanel
{
    private Color color;    //  stores color used to draw fractal
    private int level;  //  stores current level of fractal
    private static final int WIDTH = 400;   //  define width fo JPanel
    private static final int HEIGHT = 400;  //  defines height of JPanel

    //  set the initial fractal level to the value specified
    //  and set up JPanel specifications
    public FractalPanel(int currentLevel)
    {
        color = Color.BLUE; //  initialize drawing color to blue
        level = currentLevel;   //  set initial fractal level
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }   //  end FractalJPanel constructor

    //  draw fractal recursively
    public void drawFractal(int level, int xA, int yA, int xB, int yB, Graphics g)
    {
        //  base case: draw a line connecting two given points
        if (level == 0)
        {

        }
    }
}
