package net.abc.model02;

import net.abc.model01.Abs1;

public abstract class Abs2 extends Abs1 {
	
	protected int b = 100;
	
	public abstract int getB();
	
	public int getA() {
		return a;
	}
}
