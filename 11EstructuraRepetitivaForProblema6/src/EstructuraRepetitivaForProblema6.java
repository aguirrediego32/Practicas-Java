import java.util.Scanner;

public class EstructuraRepetitivaForProblema6 {
	public static void main(String[] ar) {
		Scanner teclado=new Scanner(System.in);
		int cantidad,x,y,f,primerC,segundoC,tercerC,cuartoC;
		System.out.print("Ingrese la cantidad de puntos:");
		cantidad=teclado.nextInt();
		primerC=0;
		segundoC=0;
		tercerC=0;
		cuartoC=0;
		for(f=1;f<=cantidad;f++) {
			System.out.print("Ingrese la coordenada x:");
			x=teclado.nextInt();
			System.out.print("Ingrese coordenada y:");
			y=teclado.nextInt();
			if(x>0 && y>0) {
				primerC=primerC+1;
			}else {
				if(x<0 && y>0) {
					segundoC=segundoC+1;
				}else {
					if(x<0 && y<0) {
						tercerC=tercerC+1;
					}else {
						cuartoC=cuartoC+1;
					}
				}
			}
		}System.out.print("Los puntos en el primer cuadrante son:");
		 System.out.println(primerC);
		 System.out.print("Los puntos en el segundo cuadrante son:");
		 System.out.println(segundoC);
		 System.out.print("Los puntos en el tercer cuadrante son:");
		 System.out.println(tercerC);
		 System.out.print("Los puntos en el cuarto cuadrante son:");
		 System.out.println(cuartoC);
	}
}