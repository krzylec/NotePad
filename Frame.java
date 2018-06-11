import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.BorderUIResource.BevelBorderUIResource;

public class Frame extends JFrame implements ActionListener {
	
	String title = "NotePad", 
			titlenofile= " - new file";
	
	JTextArea textArea= new JTextArea();
	

	TreeMap<Integer, String> fonts=new TreeMap<>();
	TreeMap<String, Color> colors=new TreeMap<>();
	
	
	
	DoFile dofile = new DoFile();
	
	public Frame(){
		
		putColor();
		putFont();
		
		
		
		
		setSize(600,500);
		setLocation(300, 300);
		setTitle(title+""+titlenofile);
		
		JMenuBar menubar= new JMenuBar();
		
		setJMenuBar(menubar);
		menubar.setBorder(BorderFactory.createMatteBorder(3, 0, 1, 0, Color.gray));
		//menubar.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		JMenu file =new JMenu("File");
		JMenu edit =new JMenu("Edit");
		JMenu adresy = new JMenu("Adresy");
		JMenu options =new JMenu("Options");
		
		menubar.add(file);
		
		menubar.add(edit);
		adresy.setBorder(new BevelBorder(BevelBorder.RAISED));
		edit.add(adresy);
		
		menubar.add(options);
		
		
		JmenuFile menuFileO = new JmenuFile("Open", this, dofile);	
		JmenuFile menuFileS = new JmenuFile("Save", this, dofile);
		JmenuFile menuFileSa = new JmenuFile("Save As", this, dofile);
		JmenuFile menuFileE = new JmenuFile("Exit", this, dofile);
		
		file.add(menuFileO);
		file.add(menuFileS);
		file.add(menuFileSa);
		file.add(menuFileE);
		
		
		
		
		JmenuE jmenueD = new JmenuE("Dom","Reguly, Regulska 6b ",this);
		JmenuE jmenueS = new JmenuE("Szkola","Warszawa, Koszykowa 86 ",this);
		JmenuE jmenueF= new JmenuE("Firma","Warszawa, Warszawska 50 ",this);
		JmenuE jmenueK = new JmenuE("Kosciil","sadasdas", this);
		
		adresy.add(jmenueD);
		adresy.add(jmenueS);
		adresy.add(jmenueF);
		adresy.add(jmenueK);
		
		
		
		JmenuC jmenucf = new JmenuC("Foreground",this);
		JmenuC jmenucb = new JmenuC("Background",this);
		JmenuF jmenuff= new JmenuF("Fonts", this);
		
		
		options.add(jmenucf);
		options.add(jmenucb);
		options.add(jmenuff);
		
		add(textArea);
		add(new JScrollPane(textArea));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public void putFont() {
		fonts.put(8, "8 pts");
		fonts.put(10, "10 pts");
		fonts.put(12, "12 pts");
		fonts.put(14, "14 pts");
		fonts.put(16, "16 pts");
		fonts.put(18, "18 pts");
		fonts.put(20, "20 pts");
		fonts.put(22, "22 pts");
		fonts.put(24, "24 pts");
	}
	
	public void putColor() {
		colors.put("Blue", Color.BLUE);
		colors.put("Yellow", Color.YELLOW);
		colors.put("Orange", Color.ORANGE);
		colors.put("Red", Color.RED);
		colors.put("White", Color.WHITE);
		colors.put("Black", Color.BLACK);
		colors.put("Green", Color.GREEN);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
