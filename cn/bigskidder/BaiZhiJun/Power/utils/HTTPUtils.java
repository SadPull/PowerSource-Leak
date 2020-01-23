/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

public class Class138 {
    public static Object z(String string, Object object) {
        if (string.contains(".")) {
            if (string.toLowerCase().contains("f")) {
                return Float.valueOf(Float.parseFloat(string));
            }
            return Double.parseDouble(string);
        }
        if (Class138.kp(string)) {
            return Integer.parseInt(string);
        }
        return string;
    }

    public static boolean kp(String string) {
        try {
            Integer.parseInt(string);
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            return false;
        }
    }
}

