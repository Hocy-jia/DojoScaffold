package org.example;

import java.lang.ref.SoftReference;
import java.util.Locale;

public class zifuchuan2
{
    public static void main(String[] args)
    {
        /*String s1="ABC";
        String s2="Abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
*/
        /*String s="我是杨中科，我是一个帅气的杨科科，你好呀，你好帅！！";
        System.out.println(s.indexOf("杨中科"));
        System.out.println(s.indexOf("1杨中科"));
        System.out.println(s.lastIndexOf("杨科科"));
        System.out.println(s.lastIndexOf("你好"));*/
        /*
        String s = "我是杨中科，我是一个帅气的杨科科，你好呀，你好帅！！";
        String s1 = s.substring(3);
        System.out.println(s1);
        String s2 = s.substring(3,5);
        System.out.println(s2);
        String s3=s.substring(4,8);
        System.out.println(s3);*/
        /*String s = "   你   好   ";
        System.out.println(s);
        String s1 = s.trim();
        System.out.println(s1);
        String s2 = s.replace(" ", "");
        System.out.println(s2);*/
       /* String s = "Zack Yang";
        String s1 = s.toLowerCase();
        System.out.println(s1);
        String s2 = s.toUpperCase();
        System.out.println(s2);*/

        //String s1 = "c:/s/b/c.txt";
        //String result = String.valueOf(s1.indexOf("c.txt"));
        /*
        String s2 = s1.substring(7);
        System.out.println(s2);
        String s3 = s1.substring(8);
        System.out.println(s3);
        String s4 = "  admin   ";
        String s5 = "ADMIN";
        String s6 = "123456";
        String s7 = "123456";
        String s8 = s4.trim();
        System.out.println(s5.equalsIgnoreCase(s4));
        System.out.println(s6.equals(s7));
        System.out.println(s8.equalsIgnoreCase(s5));
        String a1 = "name=杨中科";
        System.out.println(a1.indexOf("=") - 1);
        System.out.println(a1.indexOf("=") + 1);
        String a2 = "adasd.jpg";
        if (a2.endsWith(".jpg"))
        {
            System.out.println("是jpg文件");
        }*/
        String s = "c:/a/b/c.txt";
        int lastIndexOfSlash = s.lastIndexOf("/");
        String filename = s.substring(lastIndexOfSlash + 1);
        System.out.println(filename);

    }

}
