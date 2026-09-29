package UnaryOperator;

public class question3 {
    static void main(String[] args) {
        int x=10;
        int temp;
        temp=++x - --x - --x + --x - x++ + x++ + x-- - --x ;
    //  temp=11-10-9+8-9+10+10-8
        System.out.println(x);
        System.out.println(temp);
    }
}
