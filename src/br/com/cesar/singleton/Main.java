package br.com.cesar.singleton;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Escola escola = Escola.getInstance();
		
		for (int i = 0; i < 3; i++) {
			Aluno a = new Aluno();
			a.setMatricula(i);
			a.setNome("Joao " + i);
			a.setTelefone("9900 000"+i);
			
			escola.getAlunos().add(a);
		}
		
		escola.getAlunos().remove(0);
		
		for (Aluno a : escola.getAlunos()) {
			System.out.println(a.toString());
		}
		

	}

}
