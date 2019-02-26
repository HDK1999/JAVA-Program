package java2d;
import java.awt.*;
import java.awt.geom.*;
import java.awt.font.*;

class MyCanvas4 extends Canvas {
	public void paint(Graphics oldg) {
		Graphics2D g = (Graphics2D) oldg;
		// ��������
		Font f1 = new Font("Courier", Font.PLAIN, 24);
		Font f2 = new Font("helvetica", Font.BOLD, 24);
		FontRenderContext frc = g.getFontRenderContext();
		String str = new String("����һ���ı��������ʵ��");
		String str2 = new String("��������ı��Ĺ���");
		// �����ı����ֶ���
		TextLayout layout = new TextLayout(str, f1, frc);
		Point2D loc = new Point2D.Float(20, 50);
		// �����ı�
		layout.draw(g, (float) loc.getX(), (float) loc.getY());
		// ���ñ߿�
		Rectangle2D bounds = layout.getBounds();
		bounds.setRect(bounds.getX() + loc.getX(), bounds.getY() + loc.getY(),
				bounds.getWidth(), bounds.getHeight());
		g.draw(bounds);
		layout = new TextLayout(str2, f2, frc);
		g.setColor(Color.red);
		layout.draw(g, 20, 80);
	}
}

public class GUIText {
	public static void main(String[] args) {
		MyCanvas4 cv = new MyCanvas4();
		Frame f = new Frame("test frame");
		f.add(cv);
		f.setBounds(30, 30, 200, 200);
		f.setVisible(true);
	}
}