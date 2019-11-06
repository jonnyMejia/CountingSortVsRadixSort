package main;

import java.util.stream.Stream;

public class RadixVsCounting implements Sort{
	
	public int[] radixSort(int[] arreglo) {
		int x,i,j;
		for(x=Integer.SIZE-1;x>=0;x--) {
			int[] auxiliar=new int[arreglo.length];
			j=0;
			for(i=0;i<arreglo.length;i++) {
				boolean mover=arreglo[i]<<x>=0;
				if(x==0?!mover:mover) {
					auxiliar[j]=arreglo[i];
					j++;
				}else {
					arreglo[i-j]=arreglo[i];
					
				}
			}
			for(i=j;i<auxiliar.length;i++) {
				auxiliar[i]=arreglo[i-j];
			}
			arreglo=auxiliar;
		}
		return arreglo;
		
	}

	@Override
	public int[] countingSort(int[] a, int max) {
		// TODO Auto-generated method stub
		int b[]= new int[a.length];
		int c[] = new int[max+1];
		for (int i=0;i<=max;i++) {
			c[i]=0;
		}
		for (int j=0;j<a.length;j++) {
			c[a[j]]=c[a[j]]+1;
		}
		c[0]--;
		for (int i=1;i<=max;i++) {
			c[i]=c[i]+c[i-1];
		}
		for (int j=a.length-1;j>=0;j--) {
			b[c[a[j]]]=a[j];
			c[a[j]]--;
		}
		return b;
	}
	public String  mostrarArreglo(int[] data) {
		StringBuilder objetos=new StringBuilder();
		// TODO Auto-generated method stub
		if(data.length==0) {
			return "Arreglo vacío";
		}
		for(int i=0;i<data.length;i++) {
			objetos.append("(");
			objetos.append(String.valueOf(data[i]));
			objetos.append(")");
		}
		return objetos.toString();
	}
	
	
}
