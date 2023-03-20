package com.ploy.model.vo;

/**
 * @author GDJ64
 *
 */
public class Wariror extends Character{
	private int power;
	
	public Wariror() {
		// TODO Auto-generated constructor stub
	}
	
	public Wariror(int hp, int level, String name, int power) {
		super(hp, level, name);
		this.power = power;
	}

	public Wariror(int power) {
		super();
		this.power = power;
	}

	int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return super.toString() + "Wariror [power=" + power + "]";
	}
	
	public void warirorAttack() {
		System.out.println(power + "로 공격하기!");
	}
	
	public void warirorDefence() {
		System.out.println("전사 막기!");
		
	}
	
	@Override
	public void attack() {
		warirorAttack();
	}
	
	@Override
	public void defence() {
		warirorDefence();;
	}
}
