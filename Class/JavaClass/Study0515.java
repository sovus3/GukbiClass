package Class.JavaClass;
import java.util.*;

public class Study0515 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Q1
        char alpha = 'A';

        while(alpha <= 'Z'){
            System.out.print(alpha);
            alpha++;
        }
    
        //Q2
        int num, i = 1, sum = 0;
        num = sc.nextInt();

        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println(sum);
        
        //Q3
        int score;
        System.out.print("점수를 입력하세요.>");
        score = sc.nextInt();

        while((score >= 0) && (score <= 100)){

            if(score >= 80){
                System.out.println("축하합니다. 합격입니다.");
            }
            else{
                System.out.println("죄송합니다. 불합격입니다.");
            }

            System.out.print("점수를 입력하세요.>");
            score = sc.nextInt();
        }
        
        //Q3-4
        int score;
        while(true){
            System.out.print("점수를 입력하세요.>");
            score = sc.nextInt();

            if(score > 100)
            break;

            if(score >= 80){
                System.out.println("축하합니다. 합격입니다.");
            }
            else{
                System.out.println("죄송합니다. 불합격입니다.");
            }
        }
        
        //Q3-5
        int num = 1;
        while(num <= 10){
            if(num % 2 == 0){
                num++;
            continue;
            }

            if(num % 2 != 0){
                System.out.println(num );
            }
            num++;
        
        //Q4
        int num, cnt = 0, sum = 0;
        double avg;

        while(true){
            num = sc.nextInt();

            if(num == 0){
                break;
            }
            sum += num;
            cnt++;
        }
        avg = (double)sum / cnt;

        System.out.println("입력된 자료의 개수는 = " + cnt);
        System.out.println("입력된 자료의 합계는 = " + sum);
        System.out.printf("입력된 자료의 평균은 = %.2f \n", avg);
        
        //Q5
        int num, avg, cnt = 0, sum = 0;
        while(true){
            num = sc.nextInt();

            if(num == 0){
                break;
            }
            if(num % 2 == 0){
                continue;
            }

            else (num % 2 != 0){
                sum += num;
                cnt++;
            }
        }
        avg = sum / cnt;
        System.out.println("홀수의 합 : " + sum);
        System.out.println("홀수의 평균 : " + avg);

        //Q6
        int num, avg, sum = 0, cnt = 0;
        do{
            num = sc.nextInt();

            if(num % 2 != 0){
                sum += num;
                cnt++;
            }
        }
        while(num != 0);

        avg = sum / cnt;
        System.out.println("홀수의 합 : " + sum);
        System.out.println("홀수의 평균 : " + avg);
        

        //Q7
        int num;
        do{
            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 삭제하기");
            System.out.println("4. 끝내기");
            System.out.print("작업할 번호를 선택하세요.>");
            num = sc.nextInt();
            
            if(num == 1){
                System.out.println("입력하기를 선택하셨습니다.");
            }
            else if(num == 2){
                System.out.println("출력하기를 선택하셨습니다.");
            }
            else if(num == 3){
                System.out.println("삭제하기를 선택하셨습니다.");
            }
            else if(num == 4){
                System.out.println("끝내기를 선택하셨습니다.");
            }
            else{
                System.out.println("잘못 입력하셨습니다.");
            }
        }
        while(num != 4);
    }
}

