package br.com.cesar.dependenceinjector;

import java.util.ArrayList;

public class Escola {
	
	private ArrayList<Aluno> alunos;
	ILogger log;
	
	private Escola(){
		this.alunos = new ArrayList<>();
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void addAluno(Aluno a){
		this.alunos.add(a);
		log.print("Aluno: "+a.getNome()+" adicionado com sucesso!");
	}
	
	public void removeAluno(Aluno a){
		this.alunos.remove(a);
		log.print("Aluno: "+a.getNome()+" removido com sucesso!");
	}

	
	
	
	
	
	
	

}
