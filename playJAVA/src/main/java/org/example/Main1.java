package org.example;


public class Main1
{
    public static void main(String[] args)
    {
        /*String s = "杨中科是最丑的人，我讨厌杨中科！！！";
        String s1=s.replace("杨中科","dand");
        System.out.println(s);
        System.out.println(s1);*/

        /*String s="zack yang tom lucy ni shi shui";
        String[]strs=s.split(" ");
        for (String s1 : strs)
        {
            System.out.println(s1);

        }*/
       /* String s="http://www.youzack.com";
        if (s.startsWith("https://") || s.startsWith("http://"))
        {
            System.out.println("这是一个网址");

        }
        else
        {
            System.out.println("不是一个网址");
        }*/

        /*String s ="a.txt";
        System.out.println(s.endsWith(".txt"));
        System.out.println(s.endsWith(".exe"));
        System.out.println(s.endsWith("a")); */
        /*String email="abc@qq.com";
        if (email.contains("@")&&!email.startsWith("@")
                && !email.endsWith("@")&&email.endsWith(".com"))
        {
            System.out.println("是邮箱");
        }
        else
        {
            System.out.println("不是邮箱");
        }*/

        String username = "Admin";
        String password = "123456";
        if (username.trim().equalsIgnoreCase("admin") && password.equals("123456"))
        {
            System.out.println("ok");
        } else
        {
            System.out.println("error");
        }

    }
}