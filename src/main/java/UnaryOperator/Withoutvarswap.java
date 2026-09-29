package UnaryOperator;

public class Withoutvarswap {
    static void main(String[] args) {
//        int a=10;
//        int b=100;
//        a=a+b;//110
//        b=a-b;//110-100
//        a=a-b;//110-10
        int a=10;
        int b=20;
       b=b-a;
        a=a+b;
             System.out.println("a=" + a);
             System.out.println("b=" + b);
    }
}
