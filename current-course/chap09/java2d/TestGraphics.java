package java2d;
import java.awt.*;
import javax.swing.*;

class MyCanvas1 extends Canvas {
	public void paint(Graphics g) {
		// g.clipRect(50,50,180,180);
		// ����
		g.drawLine(0, 0, 20, 30);
		// ����ַ���
		g.drawString("ͼ����ʾ", 100, 30);
		// ������ɫ
		Color c = new Color(255, 200, 0);
		g.setColor(c);
		// ��������
		Font f = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 24);
		g.setFont(f);
		// ����������ɫ���Ĺ����ַ���
		g.drawString("ͼ����ʾ", 180, 30);
		// �����ɫ���ĺ����
		g.drawLine(20, 20, 100, 50);
		g.drawLine(20, 20, 50, 100);
		g.drawRect(40, 40, 40, 40);
		g.fillRect(60, 60, 40, 40);

		g.setColor(Color.red);
		// 3D����
		g.draw3DRect(80, 80, 40, 40, true);
		g.draw3DRect(100, 100, 40, 40, false);
		g.fill3DRect(120, 120, 40, 40, true);
		// ��Բ
		g.drawOval(150, 150, 30, 40);
		g.fillOval(170, 170, 20, 20);

		g.setColor(Color.blue);
		// Բ�Ǿ���
		g.drawRoundRect(180, 180, 40, 40, 20, 20);
		g.fillRoundRect(200, 200, 40, 40, 20, 20);
		// �����
		int xC[] = { 242, 260, 254, 297, 242 };
		int yC[] = { 240, 243, 290, 300, 270 };
		g.drawPolygon(xC, yC, 5);/**/
	}
}

public class TestGraphics {
	public static void main(String[] args) {
		MyCanvas1 cv = new MyCanvas1();
		Frame f = new Frame("���Դ���");
		f.setBounds(30, 30, 450, 400);
		f.add(cv);
		f.setVisible(true);
	}
}