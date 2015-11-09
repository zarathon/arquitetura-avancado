package br.com.cesar.dependenceinjector;

public class Aluno {
	
	private int matricula;
	private String nome;
	private String telefone;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString(){
		return this.matricula + " - " + this.nome +" - "+ this.telefone;
	}

}
