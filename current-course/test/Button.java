import javax.swing.*;
import java.awt.*;
public class Button {
	public static void main(String[] args) {
		JFrame frame=new JFrame("��ť��ʾ");
		Container container=frame.getContentPane();
		frame.setLayout(new GridLayout(1,3));
	    JButton b1 = new JButton("��ǰ", new ImageIcon("prev.gif"));
	    JButton b2 = new JButton("��ʾ��ǰ");
	    JButton b3 = new JButton("���",new ImageIcon("next.gif"));
	    container.add(b1);	
        container.add(b2);
	    container.add(b3);
	    frame.setVisible(true);
	    frame.pack();
	}
}
