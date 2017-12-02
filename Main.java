package com.media.aluno;

import java.util.Scanner;

public class Main {

	public static void main(String...args) {
		
		Scanner reader = new Scanner(System.in);
		Aluno primeiroAluno = new Aluno();
		Aluno segundoAluno = new Aluno();
		Aluno terceiroAluno = new Aluno();
		Aluno quartoAluno = new Aluno();
		Aluno quintoAluno = new Aluno();
		Aluno sextoAluno = new Aluno();
		
		Media media = new Media();
		
		System.out.println("Digite o nome do primeiro aluno: ");
		primeiroAluno.setNome(reader.next());
		System.out.println("Digite a média do primeiro aluno:");
		primeiroAluno.setMedia(reader.nextDouble());
		
		System.out.println("Digite o nome do segundo aluno: ");
		segundoAluno.setNome(reader.next());
		System.out.println("Digite a média do segundo aluno:");
		segundoAluno.setMedia(reader.nextDouble());
		
		System.out.println("Digite o nome do terceiro aluno: ");
		terceiroAluno.setNome(reader.next());
		System.out.println("Digite a média do terceiro aluno:");
		terceiroAluno.setMedia(reader.nextDouble());
		
		System.out.println("Digite o nome do quarto aluno: ");
		quartoAluno.setNome(reader.next());
		System.out.println("Digite a média do quarto aluno:");
		quartoAluno.setMedia(reader.nextDouble());
		
		System.out.println("Digite o nome do quinto aluno: ");
		quintoAluno.setNome(reader.next());
		System.out.println("Digite a média do quinto aluno:");
		quintoAluno.setMedia(reader.nextDouble());
		
		System.out.println("Digite o nome do sexto aluno: ");
		sextoAluno.setNome(reader.next());
		System.out.println("Digite a média do sexto aluno:");
		sextoAluno.setMedia(reader.nextDouble());
		
		media.resultado(primeiroAluno.getNome(), primeiroAluno.getMedia());
		media.resultado(segundoAluno.getNome(), segundoAluno.getMedia());
		media.resultado(terceiroAluno.getNome(), terceiroAluno.getMedia());
		media.resultado(quartoAluno.getNome(), quartoAluno.getMedia());
		media.resultado(quintoAluno.getNome(), quintoAluno.getMedia());
		media.resultado(sextoAluno.getNome(), sextoAluno.getMedia());
		
	}
}
