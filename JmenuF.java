import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;

public class JmenuF extends JMenu{
	public JmenuF(String name,Frame frame) {
	JMenuItem menuItem;
	this.setBorder(new BevelBorder(BevelBorder.RAISED));
	
	for (Integer key : frame.fonts.keySet()) {
				this.setText(name);
				menuItem = new JMenuItem(frame.fonts.get(key));
				menuItem.addActionListener(new ActionListener() {
	
					@Override
					public void actionPerformed(ActionEvent arg0) {
						frame.textArea.setFont(new Font(null, Font.LAYOUT_LEFT_TO_RIGHT,key));;
						
					}	
				
				
			});
				menuItem.setBorder(new BevelBorder(BevelBorder.RAISED));
				this.add(menuItem);
				
			}
		}
}
