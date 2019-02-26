package layout;

import java.awt.*;
import javax.swing.*;

public class GridBagLayoutWindow extends JFrame {
	// ������ǩΪname��button��
	// ��ʹ��Լ������c����button���뵽����gridbag�Ĳ��ֹ�������
	protected void makebutton(String name, GridBagLayout gridbag,
			GridBagConstraints c) {
		JButton button = new JButton(name);
		gridbag.setConstraints(button, c);
		add(button);
	}

	public GridBagLayoutWindow() {
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(gridbag);
		c.fill = GridBagConstraints.BOTH; // ���������ʾ����
		c.weightx = 1.0;
		makebutton("Button1", gridbag, c);
		makebutton("Button2", gridbag, c);
		makebutton("Button3", gridbag, c);
		c.gridwidth = GridBagConstraints.REMAINDER;// ���н���
		makebutton("Button4", gridbag, c);

		c.weightx = 0.0;// �ָ�Ĭ��ֵ
		makebutton("Button5", gridbag, c);// ����һ�У�c.gridwidthͬButton4

		c.gridwidth = GridBagConstraints.RELATIVE;// �����еĵ����ڶ������
		makebutton("Button6", gridbag, c);

		c.gridwidth = GridBagConstraints.REMAINDER;// ���н���
		makebutton("Button7", gridbag, c);

		c.gridwidth = 1;// �ָ�ΪĬ��ֵ
		c.gridheight = 2;
		c.weighty = 1.0;
		makebutton("Button8", gridbag, c);

		c.weighty = 0.0;
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = 1;
		makebutton("Button9", gridbag, c);
		makebutton("Button10", gridbag, c);
	}

	public static void main(String[] args) {
		GridBagLayoutWindow window = new GridBagLayoutWindow();
		window.setTitle("GridBagLayoutWindow Application");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
	}
}