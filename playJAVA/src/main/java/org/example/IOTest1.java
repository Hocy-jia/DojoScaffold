package org.example;

import com.yzk18.commons.IOHelpers;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class IOTest1
{
    public static void main(String[] args)
    {
        /*File file = new File("/Users/jiahaodembp/Downloads/uiui");
        //file.delete();
        IOHelpers.deleteDir(file);*/
//        System.out.println(IOHelpers.detectTextEncoding("/Users/jiahaodembp/aaa.txt"));
//        System.out.println(IOHelpers.getExtension("/Users/jiahaodembp/aaa.txt"));
//        System.out.println(IOHelpers.getFileNameWithoutExtension("/Users/jiahaodembp/nikjua.txt"));
//        File file = new File("/Users/jiahaodembp/Downloads/yzk18-commons-1.6.0-javadoc");
//        System.out.println(Arrays.toString(file.list()));
        String[] files = IOHelpers.getFilesRecursively("/Users/jiahaodembp/Movies","mp4");
        System.out.println(Arrays.toString(files));





    }
}