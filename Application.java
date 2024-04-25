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
    #feature203 changes by developer Kalpana for citibank
    public class Calculator {
    
    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method to subtract two numbers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    // Method to multiply two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    // Method to divide two numbers (returns a double to handle fractional results)
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) num1 / num2;
    }
    
    // Main method to test the Calculator class
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Perform arithmetic operations
        int sum = calc.add(5, 3);
        int difference = calc.subtract(10, 4);
        int product = calc.multiply(6, 2);
        double quotient = calc.divide(15, 5);
        
        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}


