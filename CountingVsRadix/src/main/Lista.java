package main;

import java.util.Random;

public class Lista {
	public int[] data;
	private int tamaño;
	
	public Lista(int tamaño) {
		// TODO Auto-generated constructor stub
		this.tamaño=tamaño;
		data= new int[tamaño];
		for(int i=0;i<tamaño;i++) {
			data[i]=(int)(Math.random()*1000);
		}
	}
}
