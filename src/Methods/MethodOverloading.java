package Methods;

public class MethodOverloading {

    static int add(int a, int b)
    {
        return a+b;
    }

    static int add(int a, int b, int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("Addition of two numbers : "+ add(1,2));
        System.out.println("Addition of three number : " + add(1,5,9));
    }
}
