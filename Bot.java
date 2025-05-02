import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, ¿Cómo te llamas?");

        //Recoge el dato

        String name = scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("\nHola " + name + "! Soy FemBot. ¿De qué ciudad eres?");

        //Recoge el dato

        String city = scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("He escuchado que " + city + " es un encanto. Yo nací en Oracle city.");
        System.out.println("\n¿Cuántos años tienes?");

        //Recoge el dato

        int age = scanner.nextInt();
        scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("\nEntonces me dices que tienes " + age + " años. Yo tengo 400 años.");
        System.out.println("Eso quiere decir que soy " + (400 / age) + " veces más vieja que tu.");
        System.out.println("Basta de hablar de mi misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");

        //Recoge el dato

        String language = scanner.nextLine();

        //Añade una nueva línea.
        System.out.println("\n" + language + ", ¡Eso es excelente! Mucho gusto haber hablado contigo " + name + " ¡Hablamos luego!");

        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner
        scanner.close();
    }
}