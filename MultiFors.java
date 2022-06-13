public class MultiFors {
    public static void main(String[] args) {
        for (int i = 2; i < 1000000; i = i + i) {
            System.out.println(i);
        }
    }
}
// when I run the loop as (int i = 2; i < 10; i = i * i) but tthe condition is
// over 10,000, and the iteration is a * factor, why does it run as an 
// infinate loop?
