import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.border.BevelBorder;

public class JmenuFile extends JMenuItem{
	
	public JmenuFile(String name, Frame frame, DoFile dofile) {
		
	
		if(name.equals("Open")) {
			
			this.setText(name);
		
			this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					dofile.pickFile(frame);
				} catch (Exception ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
				
				frame.textArea.setText(dofile.sb.toString());
			}
		});
		}
		
		
		  if(name.equals("Save")) {
			this.setText(name);
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dofile.saveFile(frame);
				}});
		}
		
		  
		  
		 if(name.equals("Save As")) {
			this.setText(name);
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					dofile.saveFileAs(frame);
				}});
		}
		
		 
		 if(name.equals("Exit")) {
			this.setText(name);
			this.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					int choice = JOptionPane.showConfirmDialog(null,
							"Are u sure you want to exit?",
							"Exit", 2);
					if (choice == JOptionPane.OK_OPTION) {
						System.exit(0);
					} else {
						return;
					}
				}});
		}
		
		this.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		this.setAccelerator(KeyStroke.getKeyStroke(name.charAt(0), ActionEvent.CTRL_MASK));
		if(name.equals("Save As"))
			setAccelerator(KeyStroke.getKeyStroke('A', ActionEvent.CTRL_MASK));
	
	
	

}
}
