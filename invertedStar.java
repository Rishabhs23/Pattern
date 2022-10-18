import java.util.Scanner;
public class invertedStar{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter the limit");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
