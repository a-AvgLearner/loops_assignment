package JAVA_BasicsPractice;


//sum of n numbers
import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum= sum+i;
        }
        System.out.println(sum);
    }
}




//Multiplication Table
import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int result=0;
        for (int i = 1; i <=10; i++) {
            result= n*i;
            System.out.println(n+"*"+i+"="+result);
        }

    }
}



  // GCD Program
import java.util.*;
public class gcd {
    public static int calcGCD(int n, int m){
        // Write your code here.

        int  Temp, GCD=0;
        while(m != 0)
        {
            Temp = m;
            m = n % m;
            n = Temp;
        }
        GCD = n;

        System.out.println(GCD);
        return GCD;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        calcGCD(n,m);
    }
}




//Palindrome Check
import java.util.*;
public class palindrome_check {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}




//Fibonacci Series
import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;
        for (int i = 2; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}
