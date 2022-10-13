package Lecteur;

import java.util.ArrayList;

public abstract class FileType  implements LecteurFichiers{
    ArrayList<String> lines = new ArrayList<String>();

	public void affiche(String source)
	{
		readFile(source);
	}
	
	public abstract void readFile(String source);
}
