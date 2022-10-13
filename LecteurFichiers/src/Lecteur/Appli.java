package Lecteur;

import java.io.File;
import java.io.FileInputStream;

public class Appli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileType f1 = new FileText();
		f1.affiche("doc.txt");
		
		System.out.println();
		FileType f = new ReverseFile();
		f.affiche("doc.txt");
		
		System.out.println();
		FileType f2 = new Palindromique();
		f2.affiche("doc.txt");
	}

}
