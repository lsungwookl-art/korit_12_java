package ch06_loops;
/*
    중첩 while문(Nested - while)
    형식 :
    while(조건식1) {
        반복실행문1-a
        while(조건식2) {
            반복실행문2
        }
        반복실행문1-b
    }
    1일차 1교시입니다.
    ...
    1일차 3교시입니다.
    ...
    5일차 1교시입니다.
    ...
    5일차 3교시입니다.

    - 반복 횟수 : 15 번
 */
public class Loop03While2 {
    public static void main(String[] args) {
       int day = 1;
       while (day < 6) {
           int lesson = 1;          // 반복실행문1-a
           while (lesson < 4) {
               System.out.println(day + "일차 " + lesson + "교시입니다."); // 반복실행문2
               lesson++;
           }
           System.out.println();
           day++;  // 반복실행문1-b
       }

//       int i = 1;
//       while (i < 11) {
//           System.out.println(i);
//           i++;


       }

    }

