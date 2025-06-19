package OOPS.Abstraction;

abstract class shape{
    public abstract void Draw();
}

class Circle extends shape{
    public void Draw()
    {
        System.out.println("Draw a Circle......");
    }
}
class Square extends shape{
    public void Draw()
    {

        System.out.println("Draw a Square......");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        shape c = new Circle();
        c.Draw();
        shape s = new Square();
        s.Draw();
    }
}
