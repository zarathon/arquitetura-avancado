package br.com.cesar.singleton;

import java.util.ArrayList;

public class Escola {
	
	private ArrayList<Aluno> alunos;
	private static Escola instance = new Escola(new ArrayList<Aluno>());
	
	private Escola(ArrayList alunos){
		this.alunos = alunos;
	}
	
	public static Escola getInstance(){
		return instance;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	

}
