//https://www.aceptaelreto.com/problem/statement.php?id=380

import java.util.Scanner;

public class CalculoBoda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int iteraciones = scan.nextInt();
        int total;
        while(iteraciones != 0){
            total = 0;
            for (int i = 0; i < iteraciones; i++){
                int num = scan.nextInt();
                total = total + num;
            }
            System.out.println(total);
            iteraciones = scan.nextInt();
        }
    }
}
