class OperatorsPractice {
    public static void main(String[] args) {
        // int x = 5;
        // System.out.println(x++); // 5
        // System.out.println(++x); // 7
        // System.out.println(x--); // 7
        // System.out.println(--x); // 5
        // System.out.println(--x + ++x); // 4 + 5 = 9
        // System.out.println(--x + --x); // 4 + 3 = 7
        // int y = x++ + ++x; // 3 + 5 = 8
        // System.out.println("y = "+y);
        // int a = 5;
        // a = ++a;
        // System.out.println("a = "+a); // 6
        // int b = 10;
        // System.out.println(b++ + ++b); // 10 + 12 = 22
        // int i = 1;
        // System.out.println(i++ + i++); // 1 + 2 = 3
        // int x1 = 5;
        // int y1 = x1++ + ++x1;
        // System.out.println("y1 = "+y1); // 5 + 7 = 12
        // int i = 1;
        // System.out.println(i++ + ++i); // 1 + 2 = 3
        // int x = 5;
        // System.out.println(x++ + ++x); // 5 + 7 = 12
        // int i = 10;
        // i = i++ + i-- + ++i;
        // System.out.println(i); // 32
        // int x = 1;
        // x = x++ + x++ + ++x;
        // System.out.println(x); // 7
        // int x = 2;
        // int y = x++ + x++ * x;
        // System.out.println(y); // 2 + 3* 4 = 14
        // int x = 2;
        // x += x++ + ++x; // 12
        // System.out.println(x);
        // int x = 2;
        // int y = 3;
        // int z = x++ * ++y + y-- - --x; // 10
        // System.out.println(z);
        // int x = 6;
        // int y = x++ + ++x * x--; // 70
        // System.out.println(y);
        // int i = 2;
        // i = ++i + i++ * --i; // 12
        // System.out.println(i);
        // int a = 3;
        // int b = a++ + ++a + a++; // 13
        // System.out.println(b);
        // int a = 1;
        // a = ++a + a++ + --a; // 6
        // System.out.println(a);
        // int i = 3;
        // i += i++ + ++i;
        // // System.out.println(i);
        // int x = 1;
        // int y = x++ + x++ + x++ - --x; // 3
        // System.out.println(y);
        int x = 10;
        int y = 5;
        System.out.println(++x + (++y)); // 17
    }
}
