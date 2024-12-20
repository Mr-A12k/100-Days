package day6;

public class HollowPatterns {
    public static void main(String[] args) {
        Square(5);
        RightTriangle(5);
        LeftTriangle(5);
        Pyramid(5);
        InversePyramid(5);
        PatternA(5);
        PatternB(5);
        PatternC(5);
        PatternD(5);
        PatternE(5);
        PatternF(5);
    }

    public static void Square(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void RightTriangle(int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void LeftTriangle(int n) {
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = n - i - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Pyramid(int n) {
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = n - i - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void InversePyramid(int n) {
        int i, j, k;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = n - i; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void PatternA(int n) {
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            // n-=1;
        }
    }

    public static void PatternB(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void PatternC(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void PatternD(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            int printValue = i % 2 == 0 ? 0 : 1;
            for (j = 1; j <= i; j++) {
                System.out.print(printValue + " ");
                printValue = printValue == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }

    public static void PatternE(int n) {
        int i, j;
        int printValue = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(printValue + " ");
                printValue++;
            }
            System.out.println();
        }
    }

    public static void PatternF(int n){
        int i,j;
        for(i=1; i<=(n*2)-1; i++){
            int rowCount= i>n ? (n*2)-i:i;
            for(j=1; j<=rowCount; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}

// New patterns comming