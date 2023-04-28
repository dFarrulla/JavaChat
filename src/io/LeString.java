package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeString {

	public static void main(String[] args) {
		System.out.println("Digite uma tecla");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		char c;
		try {
			c = (char) isr.read();
			System.out.println("Você digitou a tecla : " + c);
		} catch (IOException e) {
			//
			e.printStackTrace();
		}
		
	}


}
