package prjExercVetor;
import java.util.Scanner;
public class Exerc5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int TAM=10;
		int a[],i,d;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.print("Digite o"+(i+1)+"valor do vetor A:");
			a[i] = sc.nextInt();
		}
		for(i=0; i<TAM; i++) {
			System.out.print("Divisores do respectivo elemento:" +a[i]);
			for(d=1; d<=a[i]; d++) {
				if(a[i]%d ==0) {
					System.out.print(" "+d);
				}
			}
			
		}
	}

}
