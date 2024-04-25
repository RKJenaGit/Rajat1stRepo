public class Application {
    
    // Method to print a welcome message
    public void printWelcomeMessage() {
        System.out.println("Welcome to the Application!");
    }
    
    // Method to add two numbers and return the result
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method to check if a number is even
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    // Main method to test the methods of the Application class
    public static void main(String[] args) {
        // Create an instance of the Application class
        Application app = new Application();
        
        // Call the printWelcomeMessage method
        app.printWelcomeMessage();
        
        // Call the addNumbers method and print the result
        int sum = app.addNumbers(5, 7);
        System.out.println("Sum of numbers: " + sum);
        
        // Call the isEven method and print the result
        int num = 10;
        boolean isEven = app.isEven(num);
        System.out.println(num + " is even: " + isEven);
    }
}
