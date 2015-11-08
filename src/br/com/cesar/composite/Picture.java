package br.com.cesar.composite;

import java.util.ArrayList;

public class Picture implements Graphic{
	
	private ArrayList<Graphic> graphics;

	public Picture() {
		this.graphics = new ArrayList<Graphic>();
	}
	
	@Override
	public void draw() {
		System.out.println("I'm picture");
	}
	
	public void add(Graphic g){
		
		this.graphics.add(g);
		
	}
	
	public void remove(Graphic g){
		this.graphics.remove(g);
	}
	
	public Graphic getChild(int i){
		return this.graphics.get(i);
	}

}
