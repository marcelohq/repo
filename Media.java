package com.media.aluno;

public class Media {
	
	public void resultado(String nome, Double media) {
	
		if(media >= 7) {
			System.out.println("Nome: "+nome);
			System.out.println("M�dia: "+media+" Aluno Aprovado.");
		
		}else if(media >=5 & media <7) {
			System.out.println("Nome: "+nome);
			System.out.println("M�dia: "+media+" Aluno em Recupera��o.");
		}else {
			System.out.println("Nome: "+nome);
			System.out.println("M�dia: "+media+" Aluno Reprovado.");
			
		}
		
	}
	
}
