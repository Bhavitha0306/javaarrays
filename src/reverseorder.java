import java.util.Scanner;
public class reverseorder {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner r=new Scanner(System.in);
        System.out.println("enter array elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");

        }
        System.out.println("/n array reverse elements ");
        for (int i = a.length - 1; i >= 0; i--) ;
        {
        }
    }
}
