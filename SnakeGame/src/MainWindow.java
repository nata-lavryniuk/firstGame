import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by infuntis on 15/01/17.
 */
public class MainWindow extends JFrame {

  public MainWindow(){
    setTitle("Змейка");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(520,545);
    setLocation(400,400);
    add(new GameField());
    setVisible(true);
  }

}
