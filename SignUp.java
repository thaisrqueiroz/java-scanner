import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro

        Scanner registrationForm = new Scanner(System.in);
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña

        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println("¡Hola! Vamos a crearte un usuario en nuestra plataforma. Rellena el siguiente formulario.");
        System.out.println("Nombre:");
        String name = registrationForm.nextLine();
        System.out.println("\nApellido:");
        String lastName = registrationForm.nextLine();
        System.out.println("\nNombre de usuario:");
        String userName = registrationForm.nextLine();
        System.out.println("\nContraseña:");
        String password = registrationForm.nextLine();
        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
        System.out.println("\nHola " + name + " " + lastName + ", tu nombre de usuario es " + userName + " y tu contraseña es " + password + ", gracias por registrarte.");
        registrationForm.close();
    }
}