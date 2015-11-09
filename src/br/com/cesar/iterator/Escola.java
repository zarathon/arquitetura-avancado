package br.com.cesar.iterator;

import java.util.ArrayList;

public class Escola implements Aggregate{
	
	private ArrayList<Aluno> alunos;
	
	private Escola(){
		this.alunos = new ArrayList<>();
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void addAluno(Aluno a){
		this.alunos.add(a);
	}
	
	public void removeAluno(Aluno a){
		this.alunos.remove(a);
	}

	@Override
	public Iterator createIterator() {
		return new EscolaIterator(this);
	}
	
	
	
	
	
	
	

}
