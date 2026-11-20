import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);

        int aciertos = 0;

        System.out.println("========== JAVAQUIZ ==========");
        System.out.println("Concurso de preguntas sobre Java");
        System.out.println("Responde escribiendo A, B o C.");

                        System.out.println("--- RONDA 1 ---");
            System.out.println("Pregunta 1. ¿Qué tipo de dato almacena números enteros?");
            System.out.println("A) double");
            System.out.println("B) int");
            System.out.println("C) String");
            System.out.print("Respuesta: ");
            String respuesta = teclado.nextLine();
            if (respuesta.equalsIgnoreCase("B")) {
                System.out.println("¡Correcto!");
                aciertos++;
            } else {
                System.out.println("Incorrecto");

                            System.out.println("Pregunta 2. ¿Qué palabra clave se usa en Java para declarar una constante?");
            System.out.println("A) var");
            System.out.println("B) static");
            System.out.println("C) final");
            System.out.print("Respuesta: ");
            String respuesta2 = teclado.nextLine();
            if (respuesta2.equalsIgnoreCase("C")) {
                System.out.println("¡Correcto!");
                aciertos++;
            } else {
                System.out.println("Incorrecto");
            }
                        System.out.println("Pregunta 3. ¿Qué clase se utiliza para leer datos escritos por teclado?");
            System.out.println("A) Scanner");
            System.out.println("B) Printer");
            System.out.println("C) Keyboard");
            System.out.print("Respuesta: ");
            String respuesta3 = teclado.nextLine();
            if (respuesta3.equalsIgnoreCase("A")) {
                System.out.println("¡Correcto!");
                aciertos++;
            } else {
                System.out.println("Incorrecto");
            }
            
            }