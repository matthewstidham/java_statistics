public class HelloWorldApp {
    static int iteration = 0; // This is a variable with the int type

    static void iterator() {
        iteration += 1; // We can add numbers together
        System.out.print("This test has run "); // print does not add a new line
        System.out.println(iteration + " times"); // println adds a new line
        /* This is a multiline
         comment
         */
    }
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Prints the string to the console.
        System.out.println("This is a test!");
        System.out.println("Java makes it easy to print text on the screen");
        for (int i = 0; i < 10; i++) {
            iterator();
        }
    }
}