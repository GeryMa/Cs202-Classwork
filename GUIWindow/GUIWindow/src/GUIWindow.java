import javax.swing.JFrame;
public class GUIWindow extends JFrame{
    public static void main(String[] args){
        GUIWindow();
    }
    public GUIWindow(){
        setTitle("Gui Program");
        setSize(500, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}