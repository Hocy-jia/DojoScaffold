package org.example;

import java.util.Scanner;

public class Main
{

    private static int func(int n)
    {

        if (n == 1)
        {
            return 1;
        } else
        {
            return n * func(n - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int res = func(num);
        System.out.println(res);

    }


}
