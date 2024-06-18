import java.util.Scanner;
public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("");
        number = scan.nextInt();

        if(number < 0) {
            System.out.println(number * (-1));
        } else {
            System.out.println(number);
        }
    }
}
