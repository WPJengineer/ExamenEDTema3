import java.util.Scanner;
/**
*
* <h2>Programa suma, para calcular la suma de dos valores introducidos por teclado</h2>
*
* @version v1.0
* @author Miquel
* @see Para más información ver <a href="https://google.com">Google</a>
*/

public class FuncionSuma {
	/**
	* Variable para guardar el primer sumando
	*/
	private static int primerSumando;
	/**
	* Variable para guardar el segundo sumando
	*/
	private static int segundoSumando; 
	/**
	* @param Función principal del programa
	*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " + suma(primerSumando, segundoSumando));
		
		in.close();

	}
	/**
	* @param Función que realiza la suma de los dos operandos
	*/
	private static int suma (int sumando1, int sumando2) {
		return sumando1+sumando2;
	}

}
