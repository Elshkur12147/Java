import java.util.Scanner;

public class Lab1 {

    static Scanner sc = new Scanner(System.in);

    // дробная часть
    public double fraction(double x) {
        int c = (int) x;
        return x - c;
    }

    // сумма двух последних цифр
    public int sumLastNums(int x) {
        if (x < 0) x = -x;
        int a = x % 10;
        int b = (x / 10) % 10;
        return a + b;
    }

    // символ цифры в число
    public int charToNum(char x) {
        return x - '0';
    }

    // положительное?
    public boolean isPositive(int x) {
        return x > 0;
    }

    // двузначное?
    public boolean is2Digits(int x) {
        if (x < 0) x = -x;
        return x >= 10 && x <= 99;
    }

    // модуль
    public int abs(int x) {
        if (x < 0) return -x;
        return x;
    }

    // деление без ошибки на 0
    public double safeDiv(int x, int y) {
        if (y == 0) return 0;
        return (double) x / y;
    }

    // делится на 3 или 5, но не на оба
    public boolean is35(int x) {
        boolean a = x % 3 == 0;
        boolean b = x % 5 == 0;
        if (a && b) return false;
        if (a || b) return true;
        return false;
    }

    // сравнение двух чисел строкой
    public String makeDecision(int x, int y) {
        if (x < y) return x + " < " + y;
        if (x > y) return x + " > " + y;
        return x + "==" + y;
    }

    // макс из трёх
    public int max3(int x, int y, int z) {
        int m = x;
        if (y > m) m = y;
        if (z > m) m = z;
        return m;
    }

    // числа от 0 до x
    public String listNums(int x) {
        String s = "";
        for (int i = 0; i <= x; i++) {
            if (i == 0) s = "" + i;
            else s = s + " " + i;
        }
        return s;
    }

    // от x до 0
    public String reverseListNums(int x) {
        String s = "";
        for (int i = x; i >= 0; i--) {
            if (i == x) s = "" + i;
            else s = s + " " + i;
        }
        return s;
    }

    // чётные от 0 до x
    public String chet(int x) {
        String s = "";
        for (int i = 0; i <= x; i += 2) {
            if (i == 0) s = "0";
            else s = s + " " + i;
        }
        return s;
    }

    // степень
    public int pow(int x, int y) {
        int r = 1;
        for (int i = 0; i < y; i++) {
            r = r * x;
        }
        return r;
    }

    // длина числа (кол-во цифр)
    public int numLen(long x) {
        if (x == 0) return 1;
        if (x < 0) x = -x;
        int n = 0;
        while (x > 0) {
            x = x / 10;
            n++;
        }
        return n;
    }

    // первый индекс
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // последний индекс
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // элемент с макс модулем
    public int maxAbs(int[] arr) {
        int maxV = arr[0];
        int maxM = abs(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int m = abs(arr[i]);
            if (m > maxM) {
                maxM = m;
                maxV = arr[i];
            }
        }
        return maxV;
    }

    // вставка числа
    public int[] add(int[] arr, int x, int pos) {
        int[] r = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) r[i] = arr[i];
        r[pos] = x;
        for (int i = pos; i < arr.length; i++) r[i + 1] = arr[i];
        return r;
    }

    // вставка массива
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] r = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) r[i] = arr[i];
        for (int i = 0; i < ins.length; i++) r[pos + i] = ins[i];
        for (int i = pos; i < arr.length; i++) r[i + ins.length] = arr[i];
        return r;
    }

    static void printArr(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Lab1 lab = new Lab1();
        while (true) {
            System.out.println("1 методы  2 условия  3 циклы  4 массивы  0 выход");
            System.out.print("> ");
            int v = sc.nextInt();
            if (v == 0) break;
            if (v == 1) m1(lab);
            if (v == 2) m2(lab);
            if (v == 3) m3(lab);
            if (v == 4) m4(lab);
        }
    }

    static void m1(Lab1 lab) {
        System.out.println("1 fraction  2 sumLastNums  3 charToNum  4 isPositive  5 is2Digits");
        System.out.print("> ");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.print("x: ");
            System.out.println(lab.fraction(sc.nextDouble()));
        }
        if (c == 2) {
            System.out.print("x: ");
            System.out.println(lab.sumLastNums(sc.nextInt()));
        }
        if (c == 3) {
            System.out.print("символ: ");
            System.out.println(lab.charToNum(sc.next().charAt(0)));
        }
        if (c == 4) {
            System.out.print("x: ");
            System.out.println(lab.isPositive(sc.nextInt()));
        }
        if (c == 5) {
            System.out.print("x: ");
            System.out.println(lab.is2Digits(sc.nextInt()));
        }
    }

    static void m2(Lab1 lab) {
        System.out.println("1 abs  2 safeDiv  3 is35  4 makeDecision  5 max3");
        System.out.print("> ");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.print("x: ");
            System.out.println(lab.abs(sc.nextInt()));
        }
        if (c == 2) {
            System.out.print("x y: ");
            System.out.println(lab.safeDiv(sc.nextInt(), sc.nextInt()));
        }
        if (c == 3) {
            System.out.print("x: ");
            System.out.println(lab.is35(sc.nextInt()));
        }
        if (c == 4) {
            System.out.print("x y: ");
            System.out.println(lab.makeDecision(sc.nextInt(), sc.nextInt()));
        }
        if (c == 5) {
            System.out.print("x y z: ");
            System.out.println(lab.max3(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }

    static void m3(Lab1 lab) {
        System.out.println("1 listNums  2 reverseListNums  3 chet  4 pow  5 numLen");
        System.out.print("> ");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.print("x: ");
            System.out.println(lab.listNums(sc.nextInt()));
        }
        if (c == 2) {
            System.out.print("x: ");
            System.out.println(lab.reverseListNums(sc.nextInt()));
        }
        if (c == 3) {
            System.out.print("x: ");
            System.out.println(lab.chet(sc.nextInt()));
        }
        if (c == 4) {
            System.out.print("x y: ");
            System.out.println(lab.pow(sc.nextInt(), sc.nextInt()));
        }
        if (c == 5) {
            System.out.print("x: ");
            System.out.println(lab.numLen(sc.nextLong()));
        }
    }

    static void m4(Lab1 lab) {
        int[] a1 = {1, 2, 3, 4, 2, 2, 5};
        int[] a2 = {1, -2, -7, 4, 2, 2, 5};
        int[] a3 = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};

        System.out.println("1 findFirst  2 findLast  3 maxAbs  4 add число  5 add массив");
        System.out.print("> ");
        int c = sc.nextInt();
        if (c == 1) {
            printArr(a1);
            System.out.println("2 -> " + lab.findFirst(a1, 2));
        }
        if (c == 2) {
            printArr(a1);
            System.out.println("2 -> " + lab.findLast(a1, 2));
        }
        if (c == 3) {
            printArr(a2);
            System.out.println("-> " + lab.maxAbs(a2));
        }
        if (c == 4) {
            printArr(a3);
            int[] r = lab.add(a3, 9, 3);
            System.out.print("9 на 3 -> ");
            printArr(r);
        }
        if (c == 5) {
            printArr(a3);
            int[] r = lab.add(a3, ins, 3);
            System.out.print("[7,8,9] на 3 -> ");
            printArr(r);
        }
    }
}
