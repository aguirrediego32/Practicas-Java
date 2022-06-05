import java.util.Scanner;

public class EstructuraRepetitivaFor2 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		 int aprobados,reprobados,nota,f;
		 aprobados=0;
		 reprobados=0;
		 for(f=1;f<=10;f++) {
			 System.out.print("Ingrese nota:");
			 nota=teclado.nextInt();
			 if(nota>=7) {
				 aprobados=aprobados+1;
			 }else {
				 reprobados=reprobados+1;
			 }
		 }System.out.print("Aprobados:");
		  System.out.println(aprobados);
		  System.out.print("Reprobados:");
		  System.out.print(reprobados);
	}
}
