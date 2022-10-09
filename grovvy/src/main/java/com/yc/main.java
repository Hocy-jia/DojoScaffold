package com.yc;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        System.out.println("input number:");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        Game FizzBuzz_game = new Game(result);
        System.out.println(FizzBuzz_game.words());
    }
}
