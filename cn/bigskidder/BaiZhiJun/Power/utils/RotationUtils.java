/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import package3.package2.package1.Class2556;

public class Class1392 {
    public static String rjp = "=3193307334a330f3336332b33bf33ae33843372331033c933d53390331f3349";

    public static String jrw() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        StringBuilder stringBuilder = new StringBuilder();
        String string = System.getenv("COMPUTERNAME");
        byte[] arrby = string.getBytes("UTF-8");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] arrby2 = messageDigest.digest(arrby);
        int n = 0;
        for (byte by : arrby2) {
            stringBuilder.append(Integer.toHexString(by & 255 | 768), 0, 3);
            if (n != arrby2.length - 1) {
                stringBuilder.append("3");
            }
            ++n;
        }
        return stringBuilder.toString();
    }

    public static String kd(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string.getBytes());
            byte[] arrby = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer("");
            for (int i = 0; i < arrby.length; ++i) {
                int n = arrby[i];
                if (n < 0) {
                    n += 256;
                }
                if (n < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(n));
            }
            return stringBuffer.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "";
        }
    }

    public static String jre() {
        String string = "";
        try {
            string = Class1392.c(Class2556.vma, String.valueOf(Class1392.jrw()) + " ", " ");
        }
        catch (UnsupportedEncodingException | NoSuchAlgorithmException exception) {
            // empty catch block
        }
        return string;
    }

    public static String jfd() {
        return Class1392.c(Class2556.vmm, "YT[", "]");
    }

    public static String c(String string, String string2, String string3) {
        int n;
        String string4 = "";
        n = string2 == null || string2.isEmpty() ? 0 : ((n = string.indexOf(string2)) > -1 ? (n += string2.length()) : 0);
        int n2 = string.indexOf(string3, n);
        if (n2 < 0 || string3 == null || string3.isEmpty()) {
            n2 = string.length();
        }
        string4 = string.substring(n, n2);
        return string4;
    }
}

