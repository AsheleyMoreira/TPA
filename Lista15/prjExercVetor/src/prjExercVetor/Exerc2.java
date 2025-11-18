package prjExercVetor;
import java.util.Scanner;
public class Exerc2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int TAM=5;
		int a[], i, y;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite um número:");
			a[i] =sc.nextInt();
		}
		for(i=0; i<TAM; i++) {
			System.out.println("Tabuada de "+a[i]+":");
			for(y=1; y<=10; y++) {
				System.out.println(a[i]+"x"+ y +"="+ (a[i]*y));
		}
	}
 }
}