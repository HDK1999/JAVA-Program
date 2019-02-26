import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComplexListener implements MouseMotionListener, MouseListener,
		ActionListener {
	JFrame f;
	JTextArea ta;
	JButton bt;
	int number = 1;

	public ComplexListener() {
		JLabel label = new JLabel("click and drag the mouse");
		f = new JFrame("Complex Listener");
		ta = new JTextArea();
		bt = new JButton("�˳�");

		ta.addMouseListener(this);
		ta.addMouseMotionListener(this);
		bt.addActionListener(this);

		f.add(label, BorderLayout.NORTH);
		f.add(ta, BorderLayout.CENTER);
		f.add(bt, BorderLayout.SOUTH);
		f.setSize(300, 200);
		f.setVisible(true);
	}

	// MouseMotionListener�ķ���
	public void mouseDragged(MouseEvent e) {
		String s = number++ + " " + "The mouse Dragged: x=" + e.getX() + " y="
				+ e.getY() + "\n";
		ta.append(s);
	}

	// MouseListener�ķ���
	public void mouseEntered(MouseEvent e) {
		String s = number++ + " " + "The mouse entered" + "\n";
		ta.append(s);
	}

	public void mouseClicked(MouseEvent e) {
		String s = number++ + " " + "The mouse clicked" + "\n";
		ta.append(s);
	}

	public void mouseExited(MouseEvent e) {
		String s = number++ + " " + "The mouse exit." + "\n";
		ta.append(s);
	}

	// δʹ�õ�MouseMotionListener����
	public void mouseMoved(MouseEvent e) {
	}

	// δʹ�õ�MouseListener����
	public void mouseReleased(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	// ActionListener�ķ���
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		ComplexListener two = new ComplexListener();
	}
}