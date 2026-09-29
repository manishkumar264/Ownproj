package UnaryOperator;

public class question1 {
    static void main(String[] args) {
        int x=10;
        int temp;
        temp=++x - --x - ++x + --x - x++ + ++x;
        System.out.println(x);
        System.out.println(temp);
    }
}
