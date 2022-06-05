import java.util.Scanner;

public class CondicionalCompuesto5 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int x,y;
		System.out.print("Ingrese coordenada x:");
		x=teclado.nextInt();
		System.out.print("Ingrese coordenada y:");
		y=teclado.nextInt();
		if(x > 0 && y > 0) {
			System.out.print("Esta en el primer cuadrante:");
		}else {
			if(x < 0 && y > 0) {
				System.out.print("Esta en el segundo cuadrante:");
			}else {
				if(x < 0 && y < 0) {
					System.out.print("Esta en el tercer cuadrante:");
				}else {
					System.out.print("Esta en el cuarto cuadrante:");
				}
			}
		}
	}
}
