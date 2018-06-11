
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.border.BevelBorder;


public class JmenuE extends JMenuItem{
	
	
	
	public JmenuE(String name, String place, Frame frame) {
		this.setBorder(new BevelBorder(BevelBorder.RAISED));
		this.setText(name);
		this.setAccelerator(KeyStroke.getKeyStroke(name.charAt(0), ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK));
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				frame.textArea.insert(place, frame.textArea
						.getCaretPosition());
						
			}
		});
	}
	
	
}
