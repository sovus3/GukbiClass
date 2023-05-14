package MyStudy;

import java.util.*;

public class Compare3Num {
    public static void main(String[] args) {
        int a, b, c, max = 0;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a == b) && (b == c)) {
            System.out.println(10000 + a * 1000);
        } 
        else if (a == b || a == c) {
            System.out.println(1000 + a * 100);
        } 
        else if (b == c) {
            System.out.println(1000 + b * 100);
        } 
        else {
            if (a > b) {
                if (a > c) {
                    max = a; 
                }
                else{
                    max = c;
                }
            }
            else if(b > c){
                max = b;
            }
            else{
                max = c;
            }
            System.out.println(max * 100);
        }
    }
}
