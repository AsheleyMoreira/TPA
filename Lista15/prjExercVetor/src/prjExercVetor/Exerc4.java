package prjExercVetor;
import java.util.Scanner;
public class Exerc4 {

	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);
	        final int TAM=10;
	        int a[],i, y;
	        a = new int[TAM];
	      
	        for(i = 0; i < 10; i++) {
	            System.out.print("Digite o"+(i+1)+" valor do vetor A: ");
	            a[i] = sc.nextInt();
	        }
	        for(i = 0; i < 10; i++) {
	            System.out.println("A[" + i + "] = " + a[i]);
	            System.out.print("Pares até " + a[i] + ": ");

	            for(y= 0; y<= a[i]; y++) {
	                if (y%2==0) {
	                    System.out.print(y+" ");
	                }
	            }
	        }

	       
	    }
}
