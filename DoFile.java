import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

import javafx.stage.FileChooser;

public class DoFile {
	
	 JFileChooser fileChooser = new JFileChooser();
	
	 StringBuilder sb;
	 File file;
	 File direction =new File(System.getProperty("user.dir"));
	 
	 public void pickFile(Frame frame) throws Exception{
		 
		 fileChooser.setCurrentDirectory(direction);
		 direction=fileChooser.getSelectedFile();
	  
		 sb = new StringBuilder();
	  if(fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
	   
	  
	   file = fileChooser.getSelectedFile();
	   
	  
	   Scanner input = new Scanner(file);
	   
	  
	   while(input.hasNext()){
	    sb.append(input.nextLine());
	    sb.append("\n");;
	   }
	   
	   input.close();
	   frame.setTitle(frame.title+" - "+file.getAbsolutePath());
	  }
	  
	  else{
	   sb.append("No file was selected");
	  }
	  
	 
	 }

	 
	 public void saveFile(Frame frame) {
		 
		 
		 if(file==null) {
			System.out.println("saved/file");
			fileChooser.showSaveDialog(null);
			file= fileChooser.getSelectedFile();
			 
			 try {
				 frame.textArea.write(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			 }
			 catch(Exception ex){
			
			 }
			 
		 }
		 else {
			 System.out.println("saved");
			 try {
				 frame.textArea.write(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			 }
			 catch(Exception ex){
				
			 }
		 }
	 }
	 
	 public void saveFileAs(Frame frame) {
		 
		 fileChooser.showSaveDialog(null);
			file= fileChooser.getSelectedFile();
			
			 
			 try {
				 frame.textArea.write(new OutputStreamWriter(new FileOutputStream(file), "utf-8"));
			 }
			 catch(Exception ex){
				// ex.printStackTrace();
			 }
			 
	 }
	 
	 
	 
	 
}
