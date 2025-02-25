
public class MensajeOperaciones {

    // Método para mostrar mensaje de bienvenida
    public static void mostrarMensajeBienvenida() {
        System.out.println("\n*******************************************");
        System.out.println("**   Bienvenido al sistema de operaciones   **");
        System.out.println("*******************************************\n");
    }

    // Método para mostrar mensaje de despedida
    public static void mostrarMensajeDespedida() {
        System.out.println("\n*******************************************");
        System.out.println("**   Gracias por usar el sistema. Hasta luego.   **");
        System.out.println("*******************************************\n");
    }

    public static void main(String[] args) {
        // Llamamos a los métodos para probarlos
        mostrarMensajeBienvenida();
        // Simulación de operaciones
        System.out.println("Ejecutando operaciones...");
        mostrarMensajeDespedida();
    }
}
