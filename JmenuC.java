import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;

public class JmenuC extends JMenu{
	public JmenuC(String name, Frame frame) {
		this.setText(name);
		this.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		JMenuItem menuItem;
		for (String key : frame.colors.keySet()) {
			menuItem = new JMenuItem(key, new MyIcon(frame.colors.get(key)));
			menuItem.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(name.equals("Foreground"))
					frame.textArea.setForeground(frame.colors.get(key));
					if(name.equals("Background"))
					frame.textArea.setBackground(frame.colors.get(key));	
					
				}
				
			});
			menuItem.setBorder(new BevelBorder(BevelBorder.RAISED));
			this.add(menuItem);
		}
	}
}
