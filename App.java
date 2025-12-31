
 package com.su2;
 
 import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        boolean[] prime = new boolean[end + 1];
        for (int i = 2; i <= end; i++) prime[i] = true;

        for (int p = 2; p * p <= end; p++)
            if (prime[p])
                for (int i = p * p; i <= end; i += p)
                    prime[i] = false;

        for (int i = Math.max(start, 2); i <= end; i++)
            if (prime[i]) System.out.print(i + " ");
    }
}

