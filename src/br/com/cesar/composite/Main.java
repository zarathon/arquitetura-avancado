package br.com.cesar.composite;

public class Main {

	public static void main(String[] args) {
		
		Picture p = new Picture();
		
		Graphic g1 = new Line();
		Graphic g2 = new Rectangle();
		Graphic g3 = new Text();
		
		p.add(g1);
		p.add(g2);
		p.add(g3);
		
		p.draw();

	}

}
