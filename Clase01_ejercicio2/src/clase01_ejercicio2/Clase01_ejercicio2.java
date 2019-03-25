//2.Mostrar por pantalla todos los numeros primos que haya hasta un numero que ingrese el usuario por consola

package clase01_ejercicio2;

import java.util.Scanner;
//import static java.lang.Math.*;

public class Clase01_ejercicio2 {

    public static void main(String[] args) {
        
        int numero;
        
        Scanner lector=new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        numero=lector.nextInt();
        
       
        for (int i=2;i<=numero;i++) 
        { 
            for (int j=2;j<=i;j++) 
            { 
                if (i==j)
                {
                    System.out.println(i);
                }
                    if (i%j==0) 
                    {
                        break;
                    }
            }
        }
    }
    
}
/*
for (i=1;i<=numero;i++) 
        { 
            contador=0;
            raiz=(int)sqrt(i);
                
            for (j=1;j<=raiz;j++) 
            { 
                if (i%j==0)
                contador++;
            }
        
                if (contador<=1)//Si existe más de un divisor, entonces el número no es primo
                System.out.println (i + " es numero primo" );
        }
*/