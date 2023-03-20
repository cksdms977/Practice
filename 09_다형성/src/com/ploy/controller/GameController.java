package com.ploy.controller;

import com.ploy.model.vo.Character;

public class GameController {
	
	private Character c;
	
	

	
	public GameController() {
		// TODO Auto-generated constructor stub
	}


	public GameController(Character c) {
		super();
		this.c = c;
	}
	
	public void attck() {
		c.attack();
		
	} 
	
	
	public void defence() {
		c.defence();
	}
	
	public void printCharacter() {
		System.out.println(c);
		
	}
	

}
