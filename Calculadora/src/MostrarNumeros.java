import java.util.Scanner;

public class MostrarNumeros {

    public static void main(String[] args) {


        System.out.println("Por favor, ingresa el primer número:");

        double numero1 = scanner.nextDouble();



        System.out.println("Ahora, ingresa el segundo número:");

        double numero2 = scanner.nextDouble();



        System.out.println("Los números ingresados son:");

        System.out.println("Número 1: " + numero1);

        System.out.println("Número 2: " + numero2);



        scanner.close();
    }

    public static double sumar(double a, double b) { 

        return a + b; 

    } 
    public static double multiplicar(double a, double b) { 

        return a * b; 

    } 

    public static double potencia(double base, double exponente) { 

        return Math.pow(base, exponente);

    public static double restar(double a, double b) { 

        return a - b; 

    } 

    public static double dividir(double a, double b) { 

        if (b != 0) { 

            return a / b; 

        } else { 

            throw new IllegalArgumentException("No se puede dividir por cero"); 

        } 

    } 

    public static double raizCuadrada(double a) { 

        if (a >= 0) { 

            return Math.sqrt(a); 

        } else { 

            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo"); 

        }

    }
}
