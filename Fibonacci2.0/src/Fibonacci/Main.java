package Fibonacci;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BigDecimal M = BigDecimal.valueOf(1000); //Левый предел позже переделать в сканер
        BigDecimal K = BigDecimal.valueOf(3000); // Правый предел позже переделать в сканер
        int N = 92;
        double n = N / 2;
        BigDecimal F = new BigDecimal(0);


       F = BigDecimal.valueOf(((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5)));
        //System.out.println(F);
        for (int j = 0; j < 7; j++) {
            if (M.compareTo(F) == 1) {
                n = ((int) (n + (N / 2) / (Math.pow(2, j + 1))));
                F = BigDecimal.valueOf((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
            } else {
                n = (int) (n - (N / 2) / (Math.pow(2, j + 1)));
                F = BigDecimal.valueOf(((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5)));
            }
            if (F.compareTo(M) == 1)
                   break ;
            System.out.println(F);

        }


           /* for (int i = (int) (n + 2); i < N; i++) {
                F = BigDecimal.valueOf(((Math.pow((1 + Math.sqrt(5)) / 2, i) - Math.pow((1 - Math.sqrt(5)) / 2, i)) / Math.sqrt(5)));
                System.out.print(F + ", ");
                if (F.compareTo(K) == 1) break;
            }
*/

        }
    }

