package ExampleSwing;

import java.awt.*;
import javax.swing.*;

public class Corner extends JComponent {

	public void paintComponent(Graphics g) {
		// fill me with dirty brown/orange
		g.setColor(new Color(230, 163, 4));
		g.fillRect(0, 0, getWidth(), getHeight());
	}
}
