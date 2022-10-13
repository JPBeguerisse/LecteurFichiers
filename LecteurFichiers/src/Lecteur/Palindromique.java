package Lecteur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Palindromique  extends FileType{

	@Override
	public void readFile(String source) {
		// TODO Auto-generated method stub
		try
	    {
	      // Le fichier d'entrée
	      File file = new File(source);    
	      // Créer l'objet File Reader
	      FileReader fr = new FileReader(file);  
	      // Créer l'objet BufferedReader        
	      BufferedReader br = new BufferedReader(fr);  
	      StringBuffer sb = new StringBuffer();    
	      String line;
	      while((line = br.readLine()) != null)
	      {
	        // ajoute la ligne au buffer
	        sb.append(line);      
	        sb.append("\n");     
	      }
	      fr.close();    
	      System.out.println("Contenu du fichier en palindromique: ");
	      sb.reverse();
	      System.out.println(sb.toString());

	    }
	    catch(IOException e)
	    {
	      e.printStackTrace();
	    }
	}

}
