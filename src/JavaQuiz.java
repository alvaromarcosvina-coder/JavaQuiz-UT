import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // declaramos las variables constantes de los colores
        // declaramos las variables de las respuestas
        // declaramos la variable que va a contar los aciertos

        final String VERDE = "\u001B[32m";
        final String ROJO = "\u001B[31m";
        final String RESET = "\u001B[0m";

        String respuesta1;
        String respuesta2;
        String respuesta3;
        String respuesta4;
        String respuesta5;
        String respuesta6;
        int aciertos = 0;

        System.out.println("===== JAVAQUIZ =====");
        System.out.println("Pregunta 1. ¿Que tipo de dato almacena numeros enteros?");
        System.out.println("A) String");
        System.out.println("B) double");
        System.out.println("C) int");
        System.out.print("Respuesta: ");
        respuesta1 = sc.nextLine();

        // declaramos las condiciones para confirmar que sea correcta la opcion

        if (respuesta1.equalsIgnoreCase("c")){
            System.out.println(VERDE + "¡Correcto!" + RESET);
            aciertos++;
        }else{
            System.out.println(ROJO + "¡Incorrecto!" + RESET); 
        }

        System.out.println("Pregunta 2. ¿Con que se comparan las cadenas en java?");
        System.out.println("A) .equals");
        System.out.println("B) .equalString");
        System.out.println("C) ==");
        System.out.print("Respuesta: ");
        respuesta2 = sc.nextLine();

        if (respuesta2.equalsIgnoreCase("a")){
            System.out.println(VERDE + "¡Correcto!" + RESET);
            aciertos++;
        }else{
            System.out.println(ROJO + "¡Incorrecto!" + RESET);
        }

        System.out.println("Pregunta 3. ¿Como se expresa la comparacion 'esto y esto' en Java?");
        System.out.println("A) &&");
        System.out.println("B) ||");
        System.out.println("C) %%");
        System.out.print("Respuesta: ");
        respuesta3 = sc.nextLine();

        if (respuesta3.equalsIgnoreCase("a")){
            System.out.println(VERDE + "¡Correcto!" + RESET);
            aciertos++;
        }else{
            System.out.println(ROJO + "¡Incorrecto!" + RESET);
        }

        System.out.println("4) ¿Que hace la función de math.random?");
        System.out.println("A) generar un número aleatorio.");
        System.out.println("B) generar una operacion aleatoria.");
        System.out.println("C) generar un número aleatorio entre 0 y 1.");
        respuesta4 = sc.nextLine();

        if (respuesta4.equalsIgnoreCase("c")) {

            System.out.println(VERDE + "Correcto!!!" + RESET);
            aciertos++;
            
        }else
            System.out.println(ROJO + "Incorrecto!!!" + RESET);

        System.out.println("5) ¿Por que numero se empieza a contar la posicion de un Array");
        System.out.println("A) 0.");
        System.out.println("B) 1.");
        System.out.println("C) -1.");
        respuesta5 = sc.nextLine();

        if (respuesta5.equalsIgnoreCase("a")) {

            System.out.println(VERDE + "Correcto!!!" + RESET);
            aciertos++;

        }else
            System.out.println(ROJO + "Incorrecto!!!" + RESET);

        System.out.println("6) ¿Se debe poner un break en un bucle if?");
        System.out.println("A) No,no se puede.");
        System.out.println("B) Si, pero no se debe.");
        System.out.println("C) Si.");
        respuesta6 = sc.nextLine();

        if (respuesta4.equalsIgnoreCase("b")) {

            System.out.println(VERDE + "Correcto!!!" + RESET);
            aciertos++;

        }else
            System.out.println(ROJO + "Incorrecto!!!" + RESET);


        System.out.println("Numero de aciertos: " + aciertos);


         System.out.println("4) ¿Que hace la función de math.random?");
        System.out.println("A) generar un número aleatorio.");
        System.out.println("B) generar una operacion aleatoria.");
        System.out.println("C) generar un número aleatorio entre 0 y 1.");
        respuesta4 = sc.nextLine();

        if (respuesta4.equalsIgnoreCase("c")) {

            System.out.println(VERDE + "Correcto!!!" + RESET);
            aciertos++;
            
        }else
            System.out.println(ROJO + "Incorrecto!!!" + RESET);

        System.out.println("5) ¿Por que numero se empieza a contar la posicion de un Array");
        System.out.println("A) 0.");
        System.out.println("B) 1.");
        System.out.println("C) -1.");
        respuesta5 = sc.nextLine();

        if (respuesta5.equalsIgnoreCase("a")) {

            System.out.println(VERDE + "Correcto!!!" + RESET);
            aciertos++;

        }else
            System.out.println(ROJO + "Incorrecto!!!" + RESET);

        System.out.println("6) ¿Se debe poner un break en un bucle if?");
        System.out.println("A) No,no se puede.");
        System.out.println("B) Si, pero no se debe.");
        System.out.println("C) Si.");
        respuesta6 = sc.nextLine();

        if (respuesta6.equalsIgnoreCase("b")) {

            System.out.println(VERDE + "Correcto!!!" + RESET);
            aciertos++;

        }else
            System.out.println(ROJO + "Incorrecto!!!" + RESET);


        System.out.println("Numero de aciertos: " + aciertos); 
        

        sc.close(); 
    }
    
}
        


    

