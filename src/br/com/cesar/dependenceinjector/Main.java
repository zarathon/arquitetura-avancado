package br.com.cesar.dependenceinjector;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.Parameter;
import org.picocontainer.parameters.ConstantParameter;

public class Main {

	public static void main(String[] args) {
		MutablePicoContainer mpico = configureContainer();
		
		Escola a = mpico.getComponent(Escola.class);
		Aluno aluno1 = new Aluno(00666,"Chico Pesao","666-99900");
		Aluno aluno2 = new Aluno(00033,"Xe-sus","000001");
		
		a.addAluno(aluno1);
		a.addAluno(aluno2);
		
		a.removeAluno(aluno1);
		
	}

	private static MutablePicoContainer configureContainer() {
		
		MutablePicoContainer picao = new DefaultPicoContainer();
		
		//picao.addComponent(ILogger.class, FileLogger.class);
		picao.addComponent(ILogger.class, StdOutLogger.class);
		picao.addComponent(Escola.class);
		
		return picao;
		
	}

}
