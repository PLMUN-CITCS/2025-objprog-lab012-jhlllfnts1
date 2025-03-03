public class MethodDemo {

    // Main method to call other methods
    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!"); // Calling the printMessage method
    }

    // greet method definition
    public static void greet() {
        System.out.println("Hello from the greet method!"); 
    }

    // printMessage method definition
    public static void printMessage(String message) {
        System.out.println(message);
    }
}
