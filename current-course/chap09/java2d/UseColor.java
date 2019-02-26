package java2d;
import java.awt.*;
import java.awt.geom.*;

class MyCanvas2 extends Canvas {
	public void paint(Graphics oldg) {
		Graphics2D g = (Graphics2D) oldg;

		g.setColor(Color.blue);
		g.fill(new Ellipse2D.Float(50, 50, 150, 150));

		g.setColor(new Color(255, 0, 0, 0));
		g.fill(new Ellipse2D.Float(50, 50, 140, 140));

		g.setColor(new Color(255, 0, 0, 64));
		g.fill(new Ellipse2D.Float(50, 50, 130, 130));

		g.setColor(new Color(255, 0, 0, 128));
		g.fill(new Ellipse2D.Float(50, 50, 110, 110));

		g.setColor(new Color(255, 0, 0, 255));
		g.fill(new Ellipse2D.Float(50, 50, 90, 90));

		g.setColor(new Color(255, 200, 0));
		g.fill(new Ellipse2D.Float(50, 50, 70, 70));/**/
	}
}

public class UseColor {
	public static void main(String[] args) {
		MyCanvas2 cv = new MyCanvas2();
		Frame f = new Frame("���Դ���");
		f.setBounds(30, 30, 400, 400);
		f.add(cv);
		f.setVisible(true);
	}
}