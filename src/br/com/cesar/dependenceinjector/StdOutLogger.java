package br.com.cesar.dependenceinjector;

public class StdOutLogger implements ILogger {

	@Override
	public void print(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

}
