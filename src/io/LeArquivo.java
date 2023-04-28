package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Digite uma tecla");
		InputStream is = new FileInputStream("teste.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s;
		try {
			s = br.readLine();
			//System.out.println("Conteudo arquivo teste.txt : " + s);
			System.out.println("Conteudo arquivo teste.txt : " + s);
			while (s!=null) {
				System.out.println(s);
				s = br.readLine();
			}
		} catch (IOException e) {
			//
			e.printStackTrace();
		}
		
	}




}
