package prjExercVetor;
import java.util.Scanner;
public class Exerc7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		final int TAM=15;
		int a[],b[],i,n, fat;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+" valor do vetor A:");
			a[i] = in.nextInt();
		}
		for(i=0; i<TAM; i++) {
			fat = 1;
			for(n=1; n<=a[i]; n++) {
				fat = fat*n;
		}
		b[i] = fat;
	}
	for(i=0; i<TAM; i++) {
		System.out.println("Fatorial "+b[i]);
		}
	}
	
}
