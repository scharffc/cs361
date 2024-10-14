package circle;

public class DanglingElse {

    public static void main(String[] args) {
        int x = 0;
        if (x == 5)
            System.out.println("5");
        if (x == 6)
            System.out.println("6");
        else
            System.out.println("else");
    }
}