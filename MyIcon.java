import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

public class MyIcon implements Icon {
Color color;
	public MyIcon(Color color) {
		// TODO Auto-generated constructor stub
		this.color=color;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
	    g.setColor(color);
	    g.fillOval(x, y, 10, 10);
	  }

}
