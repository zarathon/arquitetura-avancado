package br.com.cesar.decorator;

import java.util.ArrayList;

public abstract class EscolaDecorator implements IEscola {
	private IEscola e;
	
	public EscolaDecorator(IEscola e) {
		this.e = e;
	}
	
	@Override
	public ArrayList<Aluno> getAlunos(char c) {
		ArrayList<Aluno> alunosTotais = this.e.getAlunos(c);
		ArrayList<Aluno> alunosTemp = new ArrayList<>();
		for (Aluno aluno : alunosTotais) {
			if (aluno.getNome().charAt(0)==c){
				alunosTemp.add(aluno);
			}
		}
		return alunosTemp;
	}
	
	
}
