package org.example;

import com.google.zxing.Result;
import com.yzk18.commons.IOHelpers;
import com.yzk18.commons.QRCodeHelpers;

import java.util.Arrays;

public class checkQR
{
    public static void main(String[] args)
    {
        String[] files = IOHelpers.getFilesRecursively("/Users/jiahaodembp/Downloads/高清图片素材", "jpg", "png");
//        System.out.println(Arrays.toString(files));
        boolean qrcodeFound = false;
        for (String file : files)
        {
            Result result = QRCodeHelpers.parseImage(file);
            if (result != null)
            {
                System.out.println("含有二维码");
                qrcodeFound=true;
                break;
            }
        }
        if (qrcodeFound == true)
        {
            System.out.println("含有二维码");
        }
        else
        {
            System.out.println("不含有二维码");
        }

    }
}
