package com.media.aluno;

public class Media {
	
	public void resultado(String nome, Double media) {
	
		if(media >= 7) {
			System.out.println("Nome: "+nome);
			System.out.println("Média: "+media+" Aluno Aprovado.");
		
		}else if(media >=5 & media <7) {
			System.out.println("Nome: "+nome);
			System.out.println("Média: "+media+" Aluno em Recuperação.");
		}else {
			System.out.println("Nome: "+nome);
			System.out.println("Média: "+media+" Aluno Reprovado.");
			
		}
		
	}
	
}
