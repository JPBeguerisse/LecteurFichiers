package Lecteur;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileText extends FileType{
	@Override
	public void readFile(String source) {
		// TODO Auto-generated method stub
		// Le fichier d'entrée
      File file = new File(source);    
      // Créer l'objet File Reader
      Scanner in = null;
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	      while (in.hasNext()) {
	          lines.add(in.nextLine());
	      }

	      in.close();
	      System.out.println("Affichage du contenu: ");
	      
	      for (int i = 0; i<lines.size(); i++) {
	          System.out.println(lines.get(i));
	      }
  }
}
