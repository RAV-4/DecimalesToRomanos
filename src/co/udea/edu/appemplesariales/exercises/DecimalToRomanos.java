package co.udea.edu.appemplesariales.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalToRomanos {

	public static void main(String[] args) {
		String[] romanosUnidades = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		String[] romanosDecenas = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String[] romanosCentenas = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String mil = "M";
		String opcion = "";
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bienvenido");
		System.out.println("Ingrese 1 para mostrar los numeros romanos del 1 al 1000");
		System.out.println("Ingrese 2 para mostrar un numero decinal ingresado como numero romano ");
		System.out.println("Ingrese 0 para terminar");
		StringBuffer romano = new StringBuffer();
		int unidades;
		int decenas;
		int centenas;
		try {
			opcion = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch (opcion) {

		case "1":
			for (int i = 1; i < 1000; i++) {
				unidades = i % 10;
				decenas = (i / 10) % 10;
				centenas = (i / 10) / 10;
				romano.append(romanosCentenas[centenas]);
				romano.append(romanosDecenas[decenas]);
				romano.append(romanosUnidades[unidades]);
				System.out.println("Decimal: " + i + " => Romano: " + romano);
				romano = new StringBuffer();
			}
			System.out.println("Decimal: 1000 => Romano: " + mil);
			break;

		case "2":
			System.out.println("Ingrese el numero decimal (entre 1 y 1000) que desea convertir a numero romano");
			boolean bandera = false;
			int numero = 0;
			while (!bandera) {
				try {
					numero = Integer.parseInt(br.readLine());
				} catch (IOException e) {
					System.out.println("No se ingreso un numero, Adios");
				}
				if (numero < 1 || numero > 1000) {
					System.out.println("No se ingreso un numero correcto");
					System.out
							.println("Ingrese el numero decimal (entre 1 y 1000) que desea convertir a numero romano");
				} else {
					bandera = true;
				}
			}
			if (numero == 1000) {
				System.out.println("Decimal: 1000 => Romano: " + mil);
			} else {
				unidades = numero % 10;
				decenas = (numero / 10) % 10;
				centenas = (numero / 10) / 10;
				romano.append(romanosCentenas[centenas]);
				romano.append(romanosDecenas[decenas]);
				romano.append(romanosUnidades[unidades]);
				System.out.println("Decimal: " + numero + " => Romano: " + romano);
			}
			break;

		default:
			System.out.println("No se ingreso una opción correcta, Adios");
			break;

		}
	}
}
