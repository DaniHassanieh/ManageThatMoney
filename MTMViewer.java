import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class MTMViewer
{
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 800;
    // Set-up the GUI
    public static void main( String[] args) 
    {
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Manage That Money");
        /*
        MTMComponent component = new MTMComponent();
        frame.add(component);
        frame.setVisible(true);
        */
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField bob = new JTextField();

        bob.setLocation(FRAME_WIDTH / 2, FRAME_HEIGHT / 2);
        frame.add(bob);
        frame.setVisible(true);
    }
}