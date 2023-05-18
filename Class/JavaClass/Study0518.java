package Class.JavaClass;

import java.util.*;

import javax.swing.plaf.ScrollBarUI;
public class Study0518 {
    
    //Q1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[100];
        int i, cnt = 0, sum = 0;
        double avg;

        for(i = 0; i < a.length; i++){
            a[i] = sc.nextInt();

            if(a[i] == 0) 
                break;

            if(a[i] % 5 == 0){
                sum += a[i];
                cnt++;
            }
        }
        avg = (double)sum / cnt;

        System.out.printf("5의 배수 : %d개\n합계 : %d\n평균 : %.1f", cnt, sum, avg);
        
        //Q2
        int a[] = new int[100];
        int i, val, cnt = 0;

        for(i = 0; i < a.length; i++){
            a[i] = sc.nextInt();

            if(a[i] == 0) break;

            cnt++;
        }
        System.out.println(cnt);

        for(i = 0; i < cnt; i++){
            if(a[i] % 2 == 0){
                val = a[i] / 2;
            }
            else{
                val = a[i] * 2;
            }
            System.out.printf("%d ", val);
        }
        
        //Q3
        int score[] = new int[10];
        int max, i;

        for(i = 0; i < score.length; i++){
            score[i] = sc.nextInt();

            if((score[i] < 0) || (score[i] > 100)){
                System.out.println("숫자의 범위가 초과 되었습니다.");
                System.out.println("0~100까지의 숫자를 다시 입력하세요.");
                i--;
            }
        }
        max = score[0];

        for(i = 1; i < score.length; i++){
            if(score[i] > max){
                max = score[i];
            }
        }
        System.out.println("가장 큰 값은 " + max + "입니다.");
        
        //Q4
        int n, i, j, tmp, val, idx = 0;

        n = sc.nextInt();
        int score[] = new int[n];

        for(i = 0; i < score.length; i++){
            score[i] = sc.nextInt();
        }

        for(i = 0; i < score.length-1; i++){
            val = score[i];
            for(j = i + 1; j < score.length; i++){
                if(val < score[j]){
                    val = score[j];
                    idx = j;
                }
            }
            if(i < idx){
                tmp = score[i];
                score[i] = score[idx];
                score[idx] = tmp;
            }
            idx = 0;
        }

        for(i = 0; i < score.length; i++){
            System.out.print(score[i] + " ");
        }
        
        //Q1(배열복사)
        int arr[] = new int[5];
        int tmp[] = new int[arr.length * 2];
        int i;

        for(i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.printf("arr.length : %d", arr.length);
        System.out.println();

        for(i = 0; i < arr.length; i++){
            tmp[i] = arr[i];
        }

        for(i = arr.length; i < tmp.length; i++){
            tmp[i] = sc.nextInt();
        }
        arr = tmp;

        for(i = 0; i < tmp.length; i++){
            System.out.print(tmp[i] + " ");
        }
        Q2(로또생성기)
        int val, i, tmp;
        int a[] = new int[45];
        
        for(i = 0; i < a.length; i++){
            a[i] = i;
        }

        for(i = 0; i < 100; i++){
        val = (int)(Math.random() * 45);

        tmp = a[0];
        a[0] = a[val];
        a[val] = tmp;
        }
        
        for(i = 0; i < 6; i++){
        System.out.print(a[i] + " ");
        }
        
    }
}
