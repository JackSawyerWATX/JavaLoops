public class SwitchExpression {
    public static void main(String[] args) {
        int day = 3;
        String dayString = switch(day) {
            case 1, 2, 3, 4, 5 -> "Working Day";
            case 6, 7 -> "Weekend";
            default -> "Invalid Day";
        };
        System.out.println(dayString);
    }
}