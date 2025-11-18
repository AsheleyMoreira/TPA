package tresInteiro;
import java.util.Scanner;
public class diaMesAno {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, dia, mes, ano, diaMes,opcao;
		i=1;
		diaMes= 0;
		
	do { 
		System.out.println("Digite o dia:");
		dia= ler.nextInt();
		System.out.println("Digite o mês:");
		mes = ler.nextInt();
		System.out.println("Digite o ano:");
		ano = ler.nextInt();
	
			if (mes==1 || mes==3 || mes==5 || mes== 7 || mes==8 || mes==10 || mes==12) {
				diaMes= 31;
			} else if (mes==4 || mes==6 || mes==9 || mes==11) {
				diaMes= 30;
			} else if (mes==2) {
				if ((ano%4 == 0 && ano % 100 != 0) || (ano%400==0)) { 
					diaMes= 29;
				} else {
					diaMes= 28;
				}
			} else {
				System.out.println("MÊS INVÁLIDO");
			}
			
			if (mes>=1 && mes<=12) {
				if (dia<1 || dia>diaMes) {
					System.out.println("DIA INVÁLIDO!");
				} else {
					dia++;
					if (dia>diaMes) {
						dia=1;
						mes++;
						if (mes>12) {
							mes=1;
							ano++;
						}
					}                                                                                                                                        
					System.out.println("O dia seguinte é:"+dia+"/"+mes+"/"+ano);
				}
				
			}
			System.out.println("Deseja continuar? (1-Sim/2-Não):");
			opcao = ler.nextInt();
			i++;
	}while(opcao==1);
		ler.close();
		System.out.println("Programa encerrado.");
		}
	}	
		
	