package es.studium.TablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar
{

	public static void main(String[] args)
	{
		int numero, i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero");
		numero = teclado.nextInt();
		teclado.close();
		for (i = 0; i <= 10; i++)
		{
			System.out.println(numero + "x" + i + "=" + (numero * i));
		}
	}
}
