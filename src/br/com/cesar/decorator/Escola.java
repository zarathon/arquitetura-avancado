package br.com.cesar.decorator;

import java.util.ArrayList;

public class Escola implements IEscola {
	
	private ArrayList<Aluno> alunos;
	
	private Escola(){
		this.alunos = new ArrayList<>();
	}

	public ArrayList<Aluno> getAlunos(char c) {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

}
