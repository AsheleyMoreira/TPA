package prjExercVetor;
import java.util.Scanner;
public class Exerc1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int TAM=20;
		int a[],b[],i;
		a = new int[TAM];
		b = new int[TAM];
		int posPares = 0;
		int posImpares = 19;
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+" valor do vetor A:");
			a[i] = sc.nextInt();
		}
		for(i=0; i<TAM; i++) {
			if (a[i]%2==0) {
				b[posPares] = a[i];
				posPares++;
			}else {
				b [posImpares] = a[i];
				posImpares--;
			}
		}

		System.out.print("Pares primeiros, depois ímpares:");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
	