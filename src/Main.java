import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] array = input.nextLine().split(" ");
        for (String a:array){
            if (Pattern.matches(".*?a[^a].*?b[^ab].*?c.*?", a))
                System.out.println(a);
        }

    }
}
