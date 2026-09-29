package UnaryOperator;

public class question2 {
    static void main(String[] args) {
        int x=10;
        int temp;
        temp=++x - --x - --x + --x - x-- + --x;
        System.out.println(x);
        System.out.println(temp);
    }
}
