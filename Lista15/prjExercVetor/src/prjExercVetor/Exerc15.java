package prjExercVetor;
import java.util.Scanner;
public class Exerc15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int TAM=10;
		int a[],b[],c[],i;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		 for(i=0; i < TAM; i++){
	            System.out.print("Digite o " + (i+1) + "º valor do vetor A: ");
	            a[i] = sc.nextInt();
	        }
	        for(i=0; i < TAM; i++){
	            System.out.print("Digite o " + (i+1) + "º valor do vetor B: ");
	            b[i] = sc.nextInt();
	        }
	        for(i=0; i < TAM; i++){
	            if(a[i] > b[i]){
	                c[i] = 1;
	            }
	            else if(a[i] == b[i]){
	                c[i] = 0;
	            }
	            else {
	                c[i] = -1;
	            }
	        }
	        System.out.println("\nResultado do vetor C:");
	        for(i=0; i < TAM; i++){
	            System.out.println("C[" + i + "] = " + c[i]);
	        }
	    }
	}