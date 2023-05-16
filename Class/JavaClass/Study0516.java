package Class.JavaClass;
import java.util.*;

public class Study0516 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1 
        
        int n, i, j, k = 1;
        n =sc.nextInt();
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
            System.out.printf("%2d ", k);
            k++;
            }

            System.out.println();
        }
        //Q2
        int n, i, j;
        char a = 'A';
        
        n = sc.nextInt();
        for(i = 1; i <= n; i++){
            for(j = n; j >= i; j--){
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
        
        //Q3
        int i, j, k = 1;
        char a = 'a';

        for(i = 1; i <= 4; i++){
            for(j = 1; j <= i; j++){
                System.out.printf("%c ", a);
                a++;
            }

            for(j = 4; j >= i; j--){
                System.out.printf("%d ", k);
                k++;                
            }
            System.out.println();
        }
        
        //Q4
        int money = 10000;
        int n;

        System.out.print("현재 가진 돈은 10000원입니다.\n");

        while(true){
            System.out.print("얼마를 사용하시겠습니까?");
            n = sc.nextInt();

            if((n < 0) || (n > money)){
                System.out.println("다시 입력하세요(사용범위 오류)");
                continue;
            }

            money -= n;
            System.out.printf("이제 %d원 남았습니다.\n\n", money);
            if(money == 0)
                break;
        }
        System.out.println("모든 돈을 사용했습니다.");
        
        //Q1(배열)
        int i, sum = 0;
        int num[] = new int[5];
        for(i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
            sum += num[i];
        }
        System.out.println(sum);
        
        //Q2
        char a[] = new char[10];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.next().charAt(0);
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }

        //Q3
        int i;
        int a[] = new int[10];
        
        for(i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.printf("%d %d %d", a[2], a[4], a[a.length-1]);
        

        //Q4
        int cnt = 0;
        int a[] = new int[100];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();

            if(a[i] == 0)
            break;

            cnt++;
        }
        for(int i = 1; i < cnt; i += 2){
            System.out.print(a[i] + " ");
        }
    }
}
