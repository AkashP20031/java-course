package ArraysExample;

public class Challenge3 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,15,6,7,8};
        int max = a[0];
        for (int i=0 ;i<a.length; i++ )
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
