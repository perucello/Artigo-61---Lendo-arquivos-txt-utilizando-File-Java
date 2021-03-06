package com.educaciencia.leitorFile.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeitorFile {

	public static void main(String[] args) {
		
		//criando variavel para nossa rota do arquivo
		String path = "C:\\DocumentoTXT\\";
		
		//criando variavel para receber nosso arquivo txt
		String arquivo = "Documento.txt"; //arquivo txt
		
		File file = new File(path + arquivo);
		Scanner lendo = null;
		//criamos tryCath para tratar caso algo d? errado
		try {
			lendo = new Scanner(file);
			// while para percorrer nosso arquivo
			while (lendo.hasNextLine()) {
				System.out.println(lendo.nextLine());
			}
		} 
		//excess?o
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		//finalizando processo
		finally {
			if (lendo != null) {
				lendo.close();
			}
		}
	}
}
