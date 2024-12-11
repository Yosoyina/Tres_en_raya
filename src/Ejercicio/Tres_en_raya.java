package Ejercicio;
import java.util.Scanner;
import java.util.Random;
public class Tres_en_raya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Random numAl = new Random ();
		
		// Apartado de los Jugadores
		
		String Jugador1;
		String Jugador2;
		String TurnoJug = "";
		
		// Apartado de los contadores de los jugadores 
		
		int contJ1 = 0;
		int contJ2 = 0;
		
		// Apartado de la moneda
		
		int moneda = 0;
		
		moneda = numAl.nextInt(2)+1;
			
		// Apartado del Tablero del Tres en raya
		
		String [][] Tabla = {{"-", "-", "-"},
				             {"-", "-", "-"},
				             {"-", "-", "-"}};
		
		
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|         Bienvenido al Juego de Tres en Raya          |");
		System.out.println("|______________________________________________________|");
		
		System.out.println("");
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|          Introducce el nombre al Jugador 1           |");
		System.out.println("|______________________________________________________|");
		
		Jugador1 = teclado.next(); // El jugador 1 introuducce su nombre
		
		System.out.println("");
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|          Introducce el nombre al Jugador 2           |");
		System.out.println("|______________________________________________________|");
		
		Jugador2 = teclado.next(); // El jugador 2 introuducce su nombre
		
		// Aparatado de la Condicion ( Cara ) que es igual a 1
		
		if(moneda == 1) {
			
			TurnoJug = Jugador1;
			
			System.out.println(" ____________________________________");
			System.out.println("|                                    |");
			System.out.println("|    Ha salido Cara " + Jugador1 +  "|");
			System.out.println("|____________________________________|");
			
		}
		
		// Aparatado de la Condicion ( Cruz ) que es igual a 2
		
		else if (moneda == 2) {
			
			TurnoJug = Jugador2;
			
			System.out.println(" ____________________________________");
			System.out.println("|                                    |");
			System.out.println("|    Ha salido Cruz " + Jugador2 +"  |");
			System.out.println("|____________________________________|");
			
		}
		
		System.out.println("");
		
		// Parte de las rondas 
		
		
		System.out.println(" ______________________________________________________");
		System.out.println("|                                                      |");
		System.out.println("|            Tabla Actual del tres en Raya             |");
		System.out.println("|______________________________________________________|");
		
		System.out.println("");
		
		while(true) { // bucle verdadero para los turnos de cada jugador 
			
			// En este bucle el recorrido for mostramos la tabla actual de tres en raya
			
			for (int filas = 0; filas < Tabla.length; filas++) {
				for (int columnas = 0; columnas < Tabla[filas].length; columnas++) {
					
					System.out.print(Tabla[filas][columnas] + " ");
					
				}
				System.out.println("");
			} // acaba el recorrido de la tabla del tres en raya
			
			System.out.println("");
			
			// En este aparatdo decimos que jugador le toca su turno
			
			System.out.println(" ______________________________________________________");
			System.out.println("|                                                      |");
			System.out.println("|         " +TurnoJug + "este jugador comienza         |");
			System.out.println("|______________________________________________________|");
			
			boolean Partida = false;
			
			while(!Partida) {
				
				int fila, columna;
				
				System.out.println(" ______________________________________________________");
				System.out.println("|                                                      |");
				System.out.println("|            Escoge la fila que es 1, 2, 3             |");
				System.out.println("|______________________________________________________|");
				
				fila = teclado.nextInt() -1;
				
				System.out.println(" ______________________________________________________");
				System.out.println("|                                                      |");
				System.out.println("|            Escoge la columna que es 1                |");
				System.out.println("|                                     2                |");
				System.out.println("|                                     3                |");
				System.out.println("|______________________________________________________|");
				
				columna = teclado.nextInt() -1;
			}
			
			
			
		} // acaba el bucle while
		
		
		
		
	}

}
