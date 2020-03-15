package java0313_1;
import java.util.Scanner;

public class Exam_7 {
     public static void main(String[] args) {
     int answer = (int)(Math.random()*100);
     System.out.println("1~100 사이의 숫자를 골랐으니 숫자를 맞춰 보시오.");
     Scanner scanner = new Scanner(System.in);
          
          int i=0;  
          while(true){
               System.out.print("숫자 입력 >");
               int sn = scanner.nextInt();
                 i++;
               if(answer != sn && answer > sn){
                    System.out.println("응 아니야~~ 더커~~");
                  
               }else if(answer != sn && answer < sn){
                    System.out.println("응 아니야~~ 더작아~~");
               }else if(answer == sn){
                    System.out.println("ㅅㄱ여 밥먹으로감"+ i +"손안아프냐?");
                    System.exit(0); 
               }
          }
          
     }
}