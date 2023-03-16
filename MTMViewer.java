
import javax.swing.JFrame;

public class MTMViewer
{
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 800;
    // Set-up the GUI
    public static void main( String[] args) 
    {
        // Instantiate and define JFrame
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Manage That Money");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 
        MTMComponent component = new MTMComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}