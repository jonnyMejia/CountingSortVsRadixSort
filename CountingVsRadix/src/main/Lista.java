package main;

import java.util.Random;

public class Lista {
	public int[] data;
	private int tama�o;
	
	public Lista(int tama�o) {
		// TODO Auto-generated constructor stub
		this.tama�o=tama�o;
		data= new int[tama�o];
		for(int i=0;i<tama�o;i++) {
			data[i]=(int)(Math.random()*1000);
		}
	}
}
