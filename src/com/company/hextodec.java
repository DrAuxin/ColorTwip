package com.company;

/**
 * Created by Paul on 1/26/2017.
 */
public class hextodec {
    public hextodec()
    {
    }
public static String p;
    public static int[] s = new int[100];
    public static int a;
    public static int b;
    public static String h;
    public static String convert(String s)
    {
        char k = s.charAt(0);
        if (k < 65) {
            p = Character.toString(k);
            a = Integer.parseInt(p)*16;
        }
        else {
            a = Character.getNumericValue(k)*16;
        }
        k = s.charAt(1);
        if (k < 65) {
            h = Character.toString(k);
            b = Integer.parseInt(h);
        }
        else {
            b = Character.getNumericValue(k);
        }
        return Integer.toString(a+b);

    }
    public static String revert(int x)
    {
        int g = x;
        int q = 0;
        while (g != 0)
        {
            s[q] = g % 16;
            g = g/16;
            ++q;
        }
        System.out.println(s[q-1]);
        h = "";
        while (q > 0)
        {
            if (s[q-1] < 10)
                p = Integer.toString(s[q-1]);
            else
                p = Character.toString((char)(s[q-1]+ 55));

            h = h + p;
            --q;
        }
        return h;
    }

}
