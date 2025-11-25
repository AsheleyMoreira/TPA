package prjTreinamento;
import java.util.Scanner;
public class Problema3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], i, y, numero, divisores;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A:");
			a[i] = in.nextInt();
		}
		for (i=0; i<TAM; i++) {
			numero = a[i];
		
			  if (numero <= 1) {
	                System.out.println(numero+ " Não é primo."); 
	            }
	            divisores = 0;

	            for (y=1; y<=numero; y++) {
	                if (numero%y==0) {
	                    divisores++;
	                }
	            }
	            if (divisores==2) {
	                System.out.println(numero + " É primo.");
	            } else {
	                System.out.println(numero + " Não é primo.");
	            }
	        }
	    }
	}
