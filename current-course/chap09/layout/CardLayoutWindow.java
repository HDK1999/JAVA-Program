package layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutWindow extends JFrame implements ActionListener {
	JPanel cards;
	CardLayout cl = new CardLayout();

	public CardLayoutWindow() {
		setLayout(new BorderLayout());// ����FrameΪBorderLayout
		// �����ڷš���Ƭ�л�����ť��Panel������ӵ�Frame��
		JPanel cp = new JPanel();
		JButton bt = new JButton("��Ƭ�л�");
		bt.addActionListener(this);
		cp.add(bt);
		add("North", cp);

		// ����ʢ�Ŷ����Ƭ��Panel������ΪCardLayout
		cards = new JPanel();
		cards.setLayout(cl);

		// ����cards�еĵ�һ��Panel�������
		JPanel p1 = new JPanel();
		p1.add(new JButton("Button 1"));
		p1.add(new JButton("Button 2"));
		p1.add(new JButton("Button 3"));

		// ����cards�е���һ��Panel�������
		JPanel p2 = new JPanel();
		p2.add(new JTextField("TextField", 20));

		// ������Panel���뵽cards��
		cards.add("Panel with Buttons", p1);
		cards.add("Panel with TextField", p2);

		// ��cards����Frame��
		add("Center", cards);
	}

	public void actionPerformed(ActionEvent e) {
		cl.next(cards);
	}

	public static void main(String[] args) {
		CardLayoutWindow clw = new CardLayoutWindow();
		clw.setTitle("CardWindow Application");
		clw.pack();
		clw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		clw.setVisible(true);
	}
}