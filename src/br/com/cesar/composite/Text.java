package br.com.cesar.composite;

public class Text implements Graphic {

	@Override
	public void draw() {
		System.out.println("I'm text");
	}

}
