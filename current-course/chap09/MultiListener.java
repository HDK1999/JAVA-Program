import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultiListener extends JFrame implements ActionListener {
	JTextArea topTextArea;
	JTextArea bottomTextArea;
	JButton button1, button2;

	public MultiListener(String s) {
		super(s);
		JLabel l = null;
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(gridbag);// Frame����ΪGridBagLayout���ֹ�����

		c.fill = GridBagConstraints.BOTH;
		c.gridwidth = GridBagConstraints.REMAINDER;
		l = new JLabel("������������:");
		gridbag.setConstraints(l, c);
		add(l);

		c.weighty = 1.0;
		topTextArea = new JTextArea(5, 20);
		topTextArea.setEditable(false);
		gridbag.setConstraints(topTextArea, c);
		add(topTextArea);

		c.weightx = 0.0;
		c.weighty = 0.0;
		l = new JLabel("͵����������:");
		gridbag.setConstraints(l, c);
		add(l);

		c.weighty = 1.0;
		bottomTextArea = new JTextArea(5, 20);
		bottomTextArea.setEditable(false);
		gridbag.setConstraints(bottomTextArea, c);
		add(bottomTextArea);

		c.weightx = 1.0;
		c.weighty = 0.0;
		c.gridwidth = 1;
		c.insets = new Insets(10, 10, 0, 10);
		button1 = new JButton("������");
		gridbag.setConstraints(button1, c);
		add(button1);

		c.gridwidth = GridBagConstraints.REMAINDER;
		button2 = new JButton("���˵����");
		gridbag.setConstraints(button2, c);
		add(button2);

		// ��ǰMultiListener����ͬʱ��������Button���¼�
		button1.addActionListener(this);
		button2.addActionListener(this);

		// Ϊ�ڶ���Button��ע��һ��������
		button2.addActionListener(new Eavesdropper());

		// �򴰿�ע����Ӧ�رմ��ڲ����ļ�����
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		topTextArea.append(e.getActionCommand() + "\n");
	}

	// �ڶ���Button�ļ����࣬�ڲ���
	class Eavesdropper implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			bottomTextArea.append("OK," + e.getActionCommand() + "\n");
		}
	}

	public static void main(String[] args) {
		MultiListener m = new MultiListener("Multilistener example");
	}
}