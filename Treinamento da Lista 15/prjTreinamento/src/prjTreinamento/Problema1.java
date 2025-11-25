package prjTreinamento;
import  java.util.Scanner;
public class Problema1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=20;
		int a[], b[], i, pares, impares;
		a = new int [TAM];
		b = new int [TAM];
		pares = 0;
		impares = 19;
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A:");
			a[i] = in.nextInt();
		}
		for(i=0; i<TAM; i++) {
			if(a[i]%2==0) {
				b[pares] = a[i];
				pares++;
			}else{
				b[impares] = a[i];
				impares--;
			}
		}
		System.out.print("Pares primeiros, depois ímpares:");
		for(i=0; i<TAM; i++) {
			System.out.print(" "+ b[i]);
		}
	}

}
