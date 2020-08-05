import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    int[] arr = new int[n+1];
    arr[0] = 0;
    arr[1] = 1;
    for(int i=2;i<=n;i++)
    {
      arr[i] = arr[i-1]+arr[i-2];
    }

    return(arr[n]);
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    if(n == 0)
      System.out.println(0);
    else if(n == 1)
      System.out.println(1);
    else
      System.out.println(calc_fib(n));
  }
}