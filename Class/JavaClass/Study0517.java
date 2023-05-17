package Class.JavaClass;

import java.util.*;
public class Study0517 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Q1
        int a[] = new int[100];
        int i, cnt = 0;

        for(i = 0; i < a.length; i++){
            a[i] = sc.nextInt();

            if(a[i] == 0)
                break;
            cnt++;
        }
        for(i = cnt-1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
        
        //Q2
        int year, month;
        int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,30, 31};

        for(;;){
            System.out.print("년 = ");
            year = sc.nextInt();
            System.out.print("월 = ");
            month = sc.nextInt();

            if(month == 0)
            break;

            if((month < 0) || (month > 12)){
                System.out.println("잘못 입력하셨습니다.\n");
                continue;
            }

            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                days[2] = 29;
            }
            else{
                days[2] = 28;
            }
            System.out.printf("입력하신 달의 날수는 %d일 입니다. \n\n", days[month]);
        }
        
        //Q3
        int num[] = new int[10];
        int i, max;

        for(i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        max = num[0];

        for(i = 1; i < num.length; i++){
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println(max);
        
        //Q4
        int num[] = new int[10];
        int i, min;
        for(i = 0; i< num.length; i++){
            num[i] = sc.nextInt();
        }

        min = num[0];

        for(i = 1; i < num.length; i++){
            if(min > num[i]){
                min = num[i];
            }
        }
        System.out.println(min);
        
        //Q5
        int min = 10000, max = -10000, i;
        int num [] = new int[10];

        for(i = 0; i < num.length; i++){
            num[i] = sc.nextInt();

            if(num[i] % 2 == 0){
                if(num[i] > max){
                    max = num[i];
                }
            }
            else{
                if(num[i] < min){
                min = num[i];
                }
            }
        }
        System.out.printf("홀수 중 가장 작은 값 : %d\n",min);
        System.out.printf("짝수 중 가장 큰 값 : %d\n",max);
        
        //Q6
        int num []  = new int[10];
        int i, sum = 0;
        double avg;

        for(i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
            sum += num[i];
        }
        avg = (double)sum / num.length;
        System.out.printf("총점 = %d\n평균 = %.2f", sum, avg);
        
        //Q7선택정렬(오름차순, 매번 교환)
        int num [] = {95, 100, 88, 65, 76, 89, 58, 93, 77, 99};
        int i, j, tmp;

        for(i = 0; i < num.length-1; i++){
            for(j = i+1; j < num.length; j++){

                if(num[i] > num[j]){
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        for(i = 0; i < num.length; i++){
            System.out.printf("%d ", num[i]);
        }
        
        //Q8선택정렬(내림차순, 매번 교환)
        int i, j, tmp;
        int num [] = new int[10];

        for(i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }

        for(i = 0; i < num.length-1; i++){
            for(j = i+1; j < num.length; j++){

                if(num[i] < num[j]){
                    tmp = num[j];
                    num[j] = num[i];
                    num[i] = tmp;
                }
            }
        }
        for(i = 0; i < num.length; i++){
            System.out.printf("%d ", num[i]);
        }
        
        //Q9선택정렬 정석
        int i, j, tmp, val, idx = 0;
        int num [] = {95, 100, 88, 65, 76, 89, 58, 93, 77, 99};

        for(i = 0; i < num.length-1; i++){
            val = num[i];
            for(j = i+1; j < num.length; j++){

                if(val > num[j]){
                    val = num[j];
                    idx = j;
                }
            }
            
            if(i < idx){
                tmp = num[idx];
                num[idx] = num[i];
                num[i] = tmp;
            }
            idx = 0;//(95 100 65 88)초기화 이유 예시
        }
        for(i = 0; i < num.length; i++){
            System.out.printf("%d ", num[i]);
        }

    }
}
