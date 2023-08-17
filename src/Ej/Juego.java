/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package Ej;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    public void jugar() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);

        int numero = (int) (Math.random() * 500) + 1;
        System.out.println("el numero a adivinar es " + numero);
        
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        int cont = 0;
        
        do {
            if (num > numero) {
                cont++;
                System.out.println("el contador esta en " + cont);
                System.out.println("numero equivocado, el numero a adivinar es menor!");
                num = sc.nextInt();
            } else if (num < numero) {
                cont++;
                System.out.println("el contador esta en " + cont);
                System.out.println("numero equivocado, el numero a adivinar es mayor!");
                num = sc.nextInt();
            }
        } while (numero != num);
        
        System.out.println("ADIVINASTEEE");
        System.out.println("intentaste " + cont + " veces");
        for (int i = 0; i < cont; i++) {
            System.out.println(numero);
        }
    }

}
