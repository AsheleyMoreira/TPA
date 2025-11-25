package prjTreinamento;
import java.util.Scanner;
public class Problema2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=5;
		int a[],i,y;
		a = new int[TAM];
		y = 1;
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número do vetor A:");
			a[i] = in.nextInt();
		}
		for(i=0; i<TAM; i++) {
			System.out.println("Tabuada de "+a[i]+":");
			for(y=1; y<=10; y++) {
				System.out.println(a[i]+"x"+ y +"="+ (a[i]*y));
			}
			
		}
	}
}
