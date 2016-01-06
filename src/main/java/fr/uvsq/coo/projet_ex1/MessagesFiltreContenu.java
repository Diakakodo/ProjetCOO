package fr.uvsq.coo.projet_ex1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class MessagesFiltreContenu implements Filtre {
	
	String motCl�;
	
	public MessagesFiltreContenu(String motCl�){
		this.motCl�=motCl�;
	}

	@Override
	public void filtreMessage(String nomMessage) {
		// TODO Auto-generated method stub
		
		//Verification de la presence du mot cl�
		boolean presence=false;
	    try {
	        // Create the tokenizer to read from a file
	                FileReader rd = new FileReader(nomMessage);
	                StreamTokenizer st = new StreamTokenizer(rd);
	        // Parse the file
	                int token = st.nextToken();
	                while (token != StreamTokenizer.TT_EOF) {
	                    token = st.nextToken();
	                    String word = st.sval;
	                    if (word.startsWith(motCl�)) {
	                    	presence=true; break;
	            	    }
	            }
	            rd.close();
	            } catch (IOException e) {
	            }
		//Suppression du fichier si le mot cl� a �t� trouv� 
	    if (presence==true) {
	    	File MyFile = new File(nomMessage);
        	MyFile.delete();
	    }
	}
}
