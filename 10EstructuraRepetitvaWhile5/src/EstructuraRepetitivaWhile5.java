import java.util.Scanner;

public class EstructuraRepetitivaWhile5 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int nota,nMayor,nMenor,x;
		nMayor=0;
		nMenor=0;
		x=1;
		while(x <=10) {
			System.out.print("Ingrese nota del alumno:");
			nota=teclado.nextInt();
			if(nota >=7) {
				nMayor=nMayor + 1;
			}else {
				nMenor=nMenor + 1;
			}x=x+1;
		}
		System.out.print("Cantidad de alumnos con notas mayores o iguales a 7: ");
		System.out.println(nMayor);
		System.out.print("Cantidad de alumunos con notas menores a 7: ");
		System.out.print(nMenor);
	}
}
