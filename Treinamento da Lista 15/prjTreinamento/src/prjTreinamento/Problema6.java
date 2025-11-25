package prjTreinamento;
import java.util.Scanner;
public class Problema6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        final int TAM = 11;
        int a[], i, numero;
        a = new int[TAM];
        numero = 1;

        for (i=0; i<TAM; i++) {
            a[i] = numero;   
            numero = numero * 2; 
        }

        for (i=0; i<TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
		}
	}
}
	
