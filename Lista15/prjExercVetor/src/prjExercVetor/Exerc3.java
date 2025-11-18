package prjExercVetor;
import java.util.Scanner;
public class Exerc3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TAM=10;
		int a[],i,y, num, divisores;
		a = new int[TAM];
		
		 for (i=0; i < 10; i++) {
	            System.out.print("Digite o " +(i+1) + ": ");
	            a[i] = sc.nextInt();
	        }

	        for (i= 0; i < 10; i++) {
	             num = a[i];

	            if (num <= 1) {
	                System.out.println(num + " não é primo."); 
	            }
	            divisores = 0;

	            for (y=1; y<=num; y++) {
	                if (num%y==0) {
	                    divisores++;
	                }
	            }
	            if (divisores==2) {
	                System.out.println(num + " é primo.");
	            } else {
	                System.out.println(num + " não é primo.");
	            }
	        }
	    }
	}
