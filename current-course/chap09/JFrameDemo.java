import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameDemo {
	public static void main(String[] args) {
		// ָ��ʹ�õ�ǰ��Look&Feelװ�δ��ڡ������ڴ�������ǰ�趨
		JFrame.setDefaultLookAndFeelDecorated(true);
		// �������趨�رմ��ڲ���
		JFrame frame = new JFrame("JFrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		// frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		// frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		// ����һ��JLabel���ӵ�������
		JLabel emptyLabel = new JLabel("");
		emptyLabel.setPreferredSize(new Dimension(175, 100));
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

		// ��ʾ����
		frame.pack();
		frame.setVisible(true);
	}
}