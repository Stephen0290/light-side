import javax.swing.JFrame;

public class DrawFaceTest {

	public static void main(String[] args) 
	{
		DrawFace panel = new DrawFace();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(250,  250);;
		application.setVisible(true);
		

	}

}
