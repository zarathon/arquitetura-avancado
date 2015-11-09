package br.com.cesar.dependenceinjector;

import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.Parameter;
import org.picocontainer.parameters.ConstantParameter;

public class Main {

	public static void main(String[] args) {
		MutablePicoContainer mpico = configureContainer();
		
	}

	private static MutablePicoContainer configureContainer() {
		
		MutablePicoContainer picao = new DefaultPicoContainer();
		
		picao.addComponent(ILogger.class, FileLogger.class);
		picao.addComponent(ILogger.class, StdOutLogger.class);
		picao.addComponent(Escola.class);
		
		return picao;
		
	}

}
