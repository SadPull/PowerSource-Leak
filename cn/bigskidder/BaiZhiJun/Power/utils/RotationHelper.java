/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.awt.Color;
import java.security.SecureRandom;
import java.util.ArrayList;
import cn.bigskidder.BaiZhiJun.Power.Class2525;
import cn.bigskidder.BaiZhiJun.Power.package185.Class1610;
import cn.bigskidder.BaiZhiJun.Power.package185.Class451;
import cn.bigskidder.BaiZhiJun.Power.utils.Class160;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package103.Class1224;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class397;
import package3.package2.package152.Class398;
import package3.package2.package152.Class891;
import package3.package2.package159.Class1769;
import package3.package2.package159.Class1832;
import package3.package2.package159.Class1886;
import package3.package2.package159.package2531.Class1991;
import package3.package2.package159.package520.Class1789;

public enum Class1386 {
    rpt;
    
    protected static Class2556 rph;
    private static final Class1655 rpr;
    private static ArrayList<Class451> rpf;

    static {
        rph = Class2556.nmk();
        rpr = Class1652.jvq;
        rpf = new ArrayList();
    }

    public static Class1655 jhh() {
        return rpr;
    }

    public void jhr() {
        double d;
        Class1815 class1815 = new Class1815(Class2556.nmk());
        double d2 = d = (double)(class1815.jvx() - 25);
        for (int i = 0; i < rpf.size(); ++i) {
            Class451 class451 = rpf.get(i);
            if (class451.jta()) {
                rpf.remove(i);
            }
            class451.f(d, d2);
            d -= class451.jtl() + 1.0;
        }
    }

    public static void d(String string, Class1610 class1610) {
        rpf.add(new Class451(string, class1610));
    }

    public static int s(int n, float f) {
        Color color = new Color(n);
        float f2 = 0.003921569f * (float)color.getRed();
        float f3 = 0.003921569f * (float)color.getGreen();
        float f4 = 0.003921569f * (float)color.getBlue();
        return new Color(f2, f3, f4, f).getRGB();
    }

    public static String yb(String string) {
        String string2 = string;
        if (string.contains("\u00a7")) {
            for (int i = 0; i < string2.length(); ++i) {
                if (!Character.toString(string2.charAt(i)).equals("\u00a7")) continue;
                try {
                    String string3 = string2.substring(0, i);
                    String string4 = string2.substring(Math.min(i + 2, string2.length()), string2.length());
                    string2 = String.valueOf(string3) + string4;
                    continue;
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
        return string2;
    }

    public static void d(String string, Class160 class160) {
        if (class160 == Class160.rqn) {
            Class2556.nmk();
            Class2556.vhw.d(new Class397("\u00a7c[" + Class2525.oiz + "]\u00a7r\u00a77 " + string));
        } else if (class160 == Class160.rqp) {
            Class2556.nmk();
            Class2556.vhw.d(new Class397("\u00a7c[" + Class2525.oiz + "]\u00a7r\u00a7e " + string));
        } else if (class160 == Class160.rqv) {
            Class2556.nmk();
            Class2556.vhw.d(new Class397("\u00a7b[" + Class2525.oiz + "]\u00a7r\u00a74 " + string));
        }
    }

    public static boolean z(Class891 class891, Class891 class8912) {
        int n = class891.xl();
        int n2 = class891.xb();
        int n3 = class891.xi();
        int n4 = class8912.xl();
        int n5 = class8912.xb();
        int n6 = class8912.xi();
        double d = n4 - n;
        double d2 = n5 - n2;
        double d3 = n6 - n3;
        double d4 = n;
        double d5 = n2;
        double d6 = n3;
        double d7 = 0.1;
        int n7 = (int)Math.max(Math.abs(d), Math.max(Math.abs(d2), Math.abs(d3))) * 4;
        for (int i = 0; i < n7 - 1; ++i) {
            Class1886 class1886;
            Class891 class8913;
            if ((d4 += d / (double)n7) == (double)n4 && (d5 += d2 / (double)n7) == (double)n5 && (d6 += d3 / (double)n7) == (double)n6 || (class1886 = Class2556.vhg.u(class8913 = new Class891(d4, d5, d6)).xk()).vhr() == Class1991.jmk || class1886.vhr() == Class1991.jma || class1886 instanceof Class1832 || class1886 instanceof Class1769) continue;
            return true;
        }
        return false;
    }

    public float np(float f, float f2) {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextFloat() * (f2 - f) + f;
    }
}

