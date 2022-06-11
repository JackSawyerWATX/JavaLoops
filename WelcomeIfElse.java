public class WelcomeIfElse {
    public static void main(String[] args) {
        int age = 0;

        if (age > 0) {
            if (age > 21) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Too Young.");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}