package Class.JavaClass;

import java.util.*;

public class Study0512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, num;
        int i, j, tmp;
        int sum = 0, cnt = 0;

        // Q1
        for (int i = 0; i < 10; i++) {
            a = sc.nextInt();
            if (a % 2 == 0) {
                cnt++;
            }
            System.out.println("입력받은 짝수는 " + cnt + "개 입니다.");
        }

        // Q2
        int cnt3 = 0, cnt5 = 0;
        for (int i = 0; i < 10; i++) {
            num = sc.nextInt();
            if (num % 3 == 0) {
                cnt3++;
            } else if (num % 5 == 0) {
                cnt5++;
            }
        }
        System.out.println("3의 배수 : " + cnt3);
        System.out.println("5의 배수 : " + cnt5);

        // Q3
        double avg;

        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            sum += num;
        }
        avg = sum / 5.0;

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f\n", avg);

        // Q4
        for (i = 0; i < 5; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Q5
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (i = 1; i <= num; i++) {
            for (j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Q6
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Q7
        for (i = 2; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %2d \n", i, j, i * j);
            }
            System.out.println();
        }

        System.out.println();

        // Q8
        for (i = 1; i <= 9; i++) {
            for (j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %2d \t", j, i, i * j);
            }
            System.out.println();
        }

        // Q9
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        for (i = 1; i <= 9; i++) {
            for (j = a; j >= b; j--) {
                System.out.printf("%d * %d = %2d\t", j, i, i * j);
            }
            System.out.println();
        }

        // Q10
        a = sc.nextInt();

        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a; j++) {
                System.out.printf("[%d, %d]", i, j);
            }
            System.out.println();
        }

        // Q11
        a = sc.nextInt();

        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a; j++) {
                if (i == j) {
                    System.out.printf("[%d,%d]", i, j);
                } else
                    System.out.printf("%5c", ' ');
            }
            System.out.println();
        }

        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        for (i = a; i <= b; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.printf("%d*%d = %2d     ", i, j, i * j);
            }
            System.out.println();
        }
    }
}
