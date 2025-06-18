
class Hi extends Thread {
    public void run()
    {
       for(int i =0; i<10; i++)
       {
           System.out.println("Hi......");
           try {
               Thread.sleep(10);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }

}
class Hello extends Thread {
    public void run()
    {
        for(int i =0; i<10; i++)
        {
            System.out.println("Hello......");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class ThreadExample {
    public static void main(String[] args) {
         Hi h = new Hi();
         h.start();
         Hello he = new Hello();
         he.start();
    }
}
