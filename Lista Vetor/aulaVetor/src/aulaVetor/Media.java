package aulaVetor;
import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[],i;
		a = new int[TAM];
		int soma=0;
		double media;
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o"+(i+1)+" valor do vetor A");
			a[i]= in.nextInt();
		 }
		System.out.print("A=[ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");
			soma+=a[i];
		}
		System.out.print("]");
		
		media=soma/TAM;
		
		System.out.println("A média dos valores é:"+media);
	}
}
