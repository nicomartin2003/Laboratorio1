import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1) Programa Java que lea un número entero por teclado y calcule si es par o impar.

            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero entero: ");
            int num1 = scanner.nextInt();
            if (num1 % 2 == 0) {
                System.out.print("El numero ingresado es par");
            } else {
                System.out.print("El numero ingresado es impar");
            } */

        //2) Programa que lea un número entero y muestre si el número es múltiplo de 10.

            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero entero: ");
            int num = scanner.nextInt();
            if (num % 10 == 0) {
                System.out.println(num + " es multiplo de 10");
            }else {
                System.out.println(num + "NO es multiplo de 10");
            } */

        //3) Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.

            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un caracter: ");
            char caracter = scanner.next().charAt(0);
            if (Character.isUpperCase(caracter)) {
                System.out.println(caracter + " es una letra mayuscula ");
            }else {
                System.out.println(caracter + " es una letra minuscula ");
            } */

        //4) Programa java que comprueba si dos números enteros son iguales o no. Los números a comprobar se introducen por teclado.

            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el primer numero entero: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = scanner.nextInt();
            if (num1 == num2) {
                System.out.println(num1 + " es igual a " + num2);
            }else {
                System.out.println(num1 + " NO es igual a " + num2);
            } */

        //5) Programa java para calcular el mayor de dos números enteros que se introducen por teclado.

            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el primer numero: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                System.out.println(num1 + " es mayor a " + num2);
            }else {
                System.out.println(num2 + " es mayor a " + num1);
            } */

        //6) Programa java para calcular si la última cifra de dos números enteros es la misma.

            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el primer numero: ");
            int num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            int num2 = scanner.nextInt();
            int ult_cifras1 = num1 %10;
            int ult_cifras2 = num2 %10;
            if (ult_cifras1 == ult_cifras2) {
                System.out.println("La ultima cifra de " + num1 + " es igual a la ultima cifra de " + num2);
            }else {
                System.out.println("La ultima cifra de " + num1 + " NO es igual a la ultima cifra de " + num2);
            } */

        //7) Programa java para calcular si un número entero es múltiplo de tres y de cinco.

            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero entero: ");
            int num1 = scanner.nextInt();
            if (num1 % 3 == 0 && num1 % 5 == 0){
                System.out.println(num1 + " es multiplo de 3 y de 5 ");
            }else {
                System.out.println(num1 + " NO es multiplo ni de 3 ni de 5 ");
            } */

        //8) Programa java para calcular si un número entero es múltiplo de dos o de tres.

            /*Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero entero: ");
            int num1 = scanner.nextInt();
            if (num1 % 3 == 0){
                System.out.println(num1 + " es multiplo de tres ");
            } else if (num1 % 2 == 0){
                System.out.println(num1 + " es multiplo de 2 ");
            }*/

        //9) Programa que lea dos caracteres y compruebe si son iguales.

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una letra cualquiera: ");
        char char1 = scanner.nextLine().charAt(0);
        System.out.print("Ingrese una segunda letra cualquiera: ");
        char char2 = scanner.nextLine().charAt(0);
        if (char1 == char2){
            System.out.println(char1 + " es igual a " + char2);
        }else
            System.out.println(char1 + " no es igual a " + char2);*/

        //10) Programa java que lea dos caracteres por teclado y compruebe si los dos son letras minúsculas

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una letra cualquiera: ");
        char char1 = scanner.nextLine().charAt(0);
        System.out.print("Ingrese una segunda letra cualquiera: ");
        char char2 = scanner.nextLine().charAt(0);
        if (Character.isLowerCase(char1) && Character.isLowerCase(char2)){
            System.out.println(char1 + " y " + char2 + " son minusculas ");
        }else
            System.out.println(char1 + " y " + char2 + " no son minusculas");*/

        //11) Programa java que lea un carácter por teclado y compruebe si es un dígito numérico (cifra entre 0 y 9).

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un digito cualquiera (pueden ser numeros entre 0 y 9): ");
        char char1 = scanner.nextLine().charAt(0);
        if (Character.isDigit(char1)){
            if (char1 >= "0" && char1 <= "9"){
                    System.out.println("El caracter ingresado es un numero entre 0 y 9");
            }else
                System.out.println("El caracter ingresado no es un numero entre 0 y 9");
        }else
            System.out.println("El caracter ingresado no es un numero");*/

        //12) Programa que lea dos números por teclado y muestre el resultado de la división del primer número por el segundo. Se debe comprobar que el divisor no puede ser cero.

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            double resultado = numero1 / numero2;
            System.out.println("Resultado de la división: " + resultado);
        }*/

        //13) Programa java para comprobar si un año es bisiesto.
        //El programa pide que se introduzca el valor de un año por teclado y calcula si es un año bisiesto o no lo es.
        //Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int year = scanner.nextInt();
        boolean esBisiesto = false;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            esBisiesto = true;
        }
        if (esBisiesto){
            System.out.println(year + " es un año bisiesto ");
        }else{
            System.out.println(year + " no es un año bisiesto ");
        }*/

        //14) Programa java para comprobar si un número entero de tres cifras es capicúa.
        //El programa pide que se introduzca un número entero y comprueba si el número es capicúa o no lo es. Si el número introducido no tiene tres cifras se muestra un mensaje indicándolo y el programa finaliza.
        //Un número es capicúa si se puede leer igual de izquierda a derecha que de derecha a izquierda. Por ejemplo, los números 1221, 35053, 969 ... son capicúa.
        //Como el programa pide que el número introducido sea de tres ciftras, para comprobar si es capicúa solo tendremos que comprobar si la primera cifra y la última son iguales.

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero de tres cifras: ");
        int num = scanner.nextInt();
        scanner.close();
        if (num >= 100 && num <= 999){
            int digito1 = num / 100;
            int digito3 = num % 10;
            if (digito1 == digito3){
                System.out.println("El numero " + num + " es capicua ");
            }else {
                System.out.println("El numero " + num + " no es capicua ");
            }
        }else {
            System.out.println("El numero no tiene tres cifras ");
        }*/

        //15) Programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y segundos respectivamente, y comprueba si la hora que indican es una hora válida.
        //
        //Supondremos que se leemos una hora en modo 24 Horas, es decir, el valor válido para las horas será mayor o igual que cero y menor que 24. El valor válido para los minutos y segundos estará comprendido entre 0 y 59 ambos incluidos.

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la hora (0-23): ");
        int H = scanner.nextInt();

        System.out.print("Introduce los minutos (0-59): ");
        int M = scanner.nextInt();

        System.out.print("Introduce los segundos (0-59): ");
        int S = scanner.nextInt();

        if (esHoraValida(H, M, S)) {
            System.out.println("La hora ingresada es válida.");
        } else {
            System.out.println("La hora ingresada no es válida.");
        }
    }
    static boolean esHoraValida(int hora, int minutos, int segundos) {
        return (hora >= 0 && hora < 24) && (minutos >= 0 && minutos < 60) && (segundos >= 0 && segundos < 60);*/

        //16) Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará además el nombre del mes. Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número de mes (entre 1 y 12): ");
        int mes = scanner.nextInt();
        if (mes >= 1 && mes <= 12) {
           switch (mes){
               case 1:
                   System.out.print("El mes es enero, tiene 31 dias ");
                   break;
               case 2:
                   System.out.print("El mes es febrero, tiene 28 dias ");
                   break;
               case 3:
                   System.out.print("El mes es marzo, tiene 31 dias ");
                   break;
               case 4:
                   System.out.print("El mes es abril, tiene 30 dias ");
                   break;
               case 5:
                   System.out.print("El mes es mayo, tiene 31 dias ");
                   break;
               case 6:
                   System.out.print("El mes es junio, tiene 30 dias ");
                   break;
               case 7:
                   System.out.print("El mes es julio, tiene 31 dias ");
                   break;
               case 8:
                   System.out.print("El mes es agosto, tiene 31 dias ");
                   break;
               case 9:
                   System.out.print("El mes es septiembre, tiene 30 dias ");
                   break;
               case 10:
                   System.out.print("El mes es octubre, tiene 31 dias ");
                   break;
               case 11:
                   System.out.print("El mes es noviembre, tiene 30 dias ");
                   break;
               case 12:
                   System.out.print("El mes es diciembre, tiene 31 dias ");
                   break;
           }
            }*/

        //17) Programa java para convertir una calificación numérica en alfabética.
        //El programa lee por teclado una calificación numérica entre 0 y 10 y muestra por pantalla su correspondiente calificación alfabética.
        //La equivalencia entre la calificación numérica y la alfabética se muestra en esta tabla:
        //La calificación numérica que se introduce por teclado debe estar comprendida entre 0 y 10 para poder obtener su equivalente calificación alfabética. Si la calificación introducida no es válida se muestra un mensaje indicándolo y el programa finaliza.

        /*Scanner scanner =new Scanner(System.in);

        System.out.print("Introduce tu calificación numérica: ");
        int calificacionNumerica=scanner.nextInt();

        if(calificacionNumerica>=0 && calificacionNumerica <=10)
        {
            String calificacionAlfabetica = "";

            if (calificacionNumerica >= 9)
                calificacionAlfabetica = "A";
            else if (calificacionNumerica >= 8 )
                calificacionAlfabetica = "B";
            else if (calificacionNumerica >= 7)
                calificacionAlfabetica = "C";
            else if (calificacionNumerica >= 6)
                calificacionAlfabetica = "D";
            else
                calificacionAlfabetica = "F";

            System.out.println("La calificación alfabética es: " + calificacionAlfabetica);
        }
        else
        {
            System.out.println("Calificación introducida no es válida.");
        }*/

        //18) Ejemplo de uso de while: Programa Java que muestre los números del 1 al 100 utilizando la instrucción while.

        /*int num = 1;

        while (num <= 100) {
            System.out.println(num);
            num++;
        }*/

        //19) Ejemplo de uso de do-while. Programa Java que muestre los números del 1 al 100 utilizando la instrucción do..while.

        /*int num = 1;

        do {
            System.out.println(num);
            num++;
        } while (num <= 100);*/

        //20) Ejemplo de uso de for. Programa Java que muestre los números del 1 al 100 utilizando la instrucción for.
        /*for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }*/

        //21) Ejemplo de uso de while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción while.
        /*int numero = 100;

        while (numero >= 1) {
            System.out.println(numero);
            numero--;
        }*/

        //22) Ejemplo de uso de do-while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while.
        /*int numero = 100;
        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 1);*/

        //23) Ejemplo de for. Programa Java que muestre los números del 100 al 1 utilizando la instrucción for.
        /*for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }*/

        //24) Escribe un programa Java que pida por teclado el valor de un número N y muestre por pantalla todos los números desde 1 hasta N. Resuelve este ejercicio de tres formas distintas:
        //1.      Utilizando la estructura for
        //2.      Utilizando la estructura while
        //3.      Utilizando la estructura do .. while

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();
        // Bucle for
        System.out.println("Utilizando la estructura for:");
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        // Bucle while
        System.out.println("Utilizando la estructura while:");
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i++;
        }
        // Bucle do while
        System.out.println("Utilizando la estructura do..while:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= N);*/

        //25) Programa que pida que se introduzca por teclado el valor de un número entero N y muestre los números desde N hasta 1 ambos incluidos. Se debe resolver este ejercicio de tres formas distintas utilizando la estructura repetitiva:
        //1.      Utilizando la estructura for
        //2.      Utilizando la estructura while
        //3.      Utilizando la estructura do .. while

        /*Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero N: ");
        int N = sc.nextInt();
        System.out.println("Utilizando la estructura for:");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Utilizando la estructura while:");
        int i = N;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        System.out.println("Utilizando la estructura do..while:");
        i = N;
        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);*/

        //26) Programa que pida que se introduzcan dos números enteros por teclado y muestre los números desde el menor hasta el mayor de los números introducidos. Los dos números introducidos deben ser distintos. Si son iguales se mostrará un mensaje indicándolo y se vuelven a introducir.

        /*Scanner sc = new Scanner(System.in);
        int numero1, numero2;

        do {
            System.out.print("Introduce el primer número entero: ");
            numero1 = sc.nextInt();
            System.out.print("Introduce el segundo número entero: ");
            numero2 = sc.nextInt();

            if (numero1 == numero2) {
                System.out.println("Los números son iguales. Por favor, introdúcelos de nuevo.");
            }
        } while (numero1 == numero2);

        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + " ");
        }*/

        //27) Programa que pida que se introduzcan dos números enteros A y B por teclado y muestre los números pares que hay entre A y B. A debe ser menor que B. Si no es así se mostrará un mensaje indicándolo y se vuelven a introducir.
        /*Scanner scanner = new Scanner(System.in);
        int A, B;

        do {
            System.out.print("Introduce el número A (debe ser menor que B): ");
            A = scanner.nextInt();
            System.out.print("Introduce el número B: ");
            B = scanner.nextInt();

            if (A >= B) {
                System.out.println("A debe ser menor que B. Inténtalo de nuevo.");
            }
        } while (A >= B);

        System.out.println("Números pares entre " + A + " y " + B + ":");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

        //28) Programa que lea dos números enteros positivos N y M y muestre los múltiplos de N que hay desde 1 hasta M. Por ejemplo si N = 4 y M = 500 el programa mostrará los múltiplos de 4 desde 1 hasta 500. El valor de N deberá ser menor que el valor de M. Si no se introducen valores válidos para N o M se mostrará el mensaje correspondiente y se vuelven a pedir.

        /*Scanner sc = new Scanner(System.in);
        int N, M;

        do {
            System.out.print("Introduce un número entero positivo N: ");
            N = sc.nextInt();
            if (N <= 0) {
                System.out.println("N debe ser un número entero positivo.");
            }
        } while (N <= 0);

        do {
            System.out.print("Introduce un número entero positivo M mayor que N: ");
            M = sc.nextInt();
            if (M <= N) {
                System.out.println("M debe ser mayor que N.");
            }
        } while (M <= N);

        System.out.println("Los múltiplos de " + N + " desde 1 hasta " + M + " son:");
        for (int i = 1; i <= M; i++) {
            if (i % N == 0) {
                System.out.print(i + " ");
            }
        }*/

        //29) Programa Java que convierte millas a kilómetros. El programa pide que se introduzca una cantidad de millas y calcula y muestra su equivalente en Kilómetros. El proceso se repite hasta que se introduzca un 0 como valor para las millas.
        //1 Milla equivale a 1.6093 Kilómetros.
        //El valor de los KM resultantes se debe mostrar con dos decimales.
        //Para pasar de millas a Km realizaremos la operación:
        //Km = millas * 1.6093

        /*Scanner input = new Scanner(System.in);
        double millas;
        double kilometros;
        do {
            System.out.print("Introduce la cantidad de millas (0 para salir): ");
            millas = input.nextDouble();
            if (millas != 0) {
                kilometros = millas * 1.6093;
                System.out.printf("%.2f millas equivale a %.2f kilómetros%n", millas, kilometros);
            }
        } while (millas != 0);
        System.out.println("¡Hasta luego!");*/
    }
}