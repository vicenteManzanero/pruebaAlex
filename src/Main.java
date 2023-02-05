import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");

        String user = "vicen";
        String pass = "123";
        String userFromConsole;
        String passFromConsole;
        int error = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el usuario: ");
        userFromConsole = teclado.nextLine();
        System.out.println("Introduce la contraseña: ");
        passFromConsole = teclado.nextLine();

        if (!userFromConsole.equals(user) || !passFromConsole.equals(pass)) {
            System.out.println("El usuario o la contraseña no son correctos");
            System.out.println("-------------------------------------------");
            error++;
            while (!userFromConsole.equals(user) && !passFromConsole.equals(pass)) {
                System.out.println("Introduce el usuario: ");
                userFromConsole = teclado.nextLine();
                System.out.println("Introduce la contraseña: ");
                passFromConsole = teclado.nextLine();
                if (!userFromConsole.equals(user) || !passFromConsole.equals(pass)) {
                    System.out.println("El usuario o la contraseña no son correctos");
                    System.out.println("-------------------------------------------");
                    error++;
                }
            }
        }else{
            System.out.println("Bienvenido " + user);
        }
        System.out.println("Intentos: " + error);
    }
}