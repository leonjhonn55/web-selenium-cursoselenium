import java.util.Scanner;
public class Tetsting
{
    public static void main( String[] args )
    {
        int n1, n2, suma;

        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca primer n�mero: " );
        n1 = teclado.nextInt();

        System.out.print( "Introduzca segundo n�mero: " );
        n2 = teclado.nextInt();

        suma = n1 + n2;

        System.out.println( "La suma de " + n1 + " m�s " + n2 + " es " + suma + "." );
    }
}