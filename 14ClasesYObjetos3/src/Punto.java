import java.util.Scanner;

public class Punto {
	private Scanner teclado;
	int x,y;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese primer coordenada:");
		x=teclado.nextInt();
		System.out.print("Ingrese segunda coordenada:");
		y=teclado.nextInt();	
	}
	public void imprimirCuadrante() {
		if(x>0 && y>0) {
			System.out.print("El punto esta en el primer cuadrante");
		}else {
			if(x<0 && y>0) {
				System.out.print("El punto esta en el segundo cuadrante");
			}else {
				if(x<0 && y<0) {
					System.out.print("El punto esta en el tercer cuadrante");
				}else {
					System.out.print("El punto esta en el cuarto cuadrante");
				}
			}
		}
	}
	
	public static void main(String[] ar) {
		Punto punto1=new Punto();
		punto1.inicializar();
		punto1.imprimirCuadrante();
		
	}
}
