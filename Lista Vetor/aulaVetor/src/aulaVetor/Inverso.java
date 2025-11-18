package aulaVetor;
import java.util.Scanner;
public class Inverso {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[],b[],i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+" valor do vetor A");
			a[i]= in.nextInt();
		 }
		System.out.print("A=[ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
		
		for(i=0; i<TAM; i++) {
			b[i]= a[TAM-1-i];
		}
		System.out.print("B=[ ");
		for(i=0; i<TAM;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");
	}
}
