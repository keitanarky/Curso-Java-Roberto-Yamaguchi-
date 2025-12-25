// sucesión Fibonacci
// 0,1,1,2,3,5,8,13,21,34

public class Clase16 {
    public static void main(String[] args) {

        // usando for
        int a = 0, b = 1, c;

        for (int i = 0; i < 10; i++) {
            System.out.print(a);
            if (i < 9) {
                System.out.print(",");
            }
            c = a + b;
            a = b;
            b = c;
        }

        // usando while
        System.out.println();
        int i = 0;
        a = 0;
        b = 1;

        while (i < 10) {
            System.out.print(a);
            if (i < 9) {
                System.out.print(",");
            }
            c = a + b;
            a = b;
            b = c;
            i++;
        }

        // usando do-while
        System.out.println();
        i = 0;
        a = 0;
        b = 1;

        do {
            System.out.print(a);
            if (i < 9) {
                System.out.print(",");
            }
            c = a + b;
            a = b;
            b = c;
            i++;
        } while (i < 10);
    }
}
