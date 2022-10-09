package org.example;

import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        while (myScanner.hasNextInt())
        {
            int key = myScanner.nextInt();
            int arr[] = new int[key];
            for (int i = 0; i < arr.length; i++)
            {
                int key01 = myScanner.nextInt();
                arr[i] = key01;
            }
            int sum = 0;
            for (int m = 0; m < arr.length - 1; m++)
            {
                for (int n = 0; n < arr.length - m - 1; n++)
                {
                    if (arr[n] > arr[n + 1])
                    {
                        sum = arr[n + 1];
                        arr[n + 1] = arr[n];
                        arr[n] = sum;
                    }
                }
            }
            for (int l = 0; l < arr.length; l++)
            {
                if (l != arr.length - 1)
                {
                    System.out.print(arr[l] + " ");
                } else
                {
                    System.out.println(arr[l]);
                }
            }
        }
    }
}