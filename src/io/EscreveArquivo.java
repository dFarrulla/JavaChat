package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreveArquivo {

	public static void main(String[] args) throws IOException {
		//System.out.println("Digite uma tecla");
		OutputStream os = new FileOutputStream("escrita.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("Apreder Java é muito legal");
		bw.close();
		osw.close();
		os.close();
		System.out.println("Escrita realizada com sucesso");
		
		
	}




}
