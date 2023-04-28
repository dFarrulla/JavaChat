package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {

	public static void main(String[] args) {
		System.out.println("Digite uma palavra");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String s;
		
		
		//char c;
		try {
			//c = (char) isr.read();
			s = br.readLine();
			//System.out.println("Você digitou a tecla : " + c);
			System.out.println("Você digitou a palavra : " + s);
			
		} catch (IOException e) {
			//
			e.printStackTrace();
		}
		
	}


}
