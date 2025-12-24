package ch06_loops;
/*
    Nested for - loop
    for ( 시작값 ; 한계값 ; 증감값 ) {
        반복실행문1-a
        for ( 시작값 ; 한계값 ; 증감값 ) {
            반복실행문2
        }
        반복실행문1-b
        for ( 시작값 ; 한계값 ; 증감값 ) {
            반복실행문3
        }
        반복실행문1-c
 */
public class Loop08Star3 {
    public static void main(String[] args) {
        // 개행을 책임지는 for-i문
        for (int i = 0 ; i < 6 ; i++ ) {
            // 공백을 책임지는 for-j문 : 공백은 줄어들어야 함.
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // 별을 책임지는 for-k문 : 별 개수는 늘어나야 함.
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 개행을 책임지는 for-i문
        // 공백을 책임지는 for-j문 : 공백은 늘어나야 함.
        // 별을 책임지는 for-k문 : 별 개수는 줄어들어야 함.
        System.out.println();

        for (int i = 0 ; i < 6 ; i++ ) {
            // 공백을 책임지는 for-j문 : 공백은 줄어들어야 함.
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 별을 책임지는 for-k문 : 별 개수는 늘어나야 함.
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
