/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.awt.Color;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1387;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1388;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1390;
import cn.bigskidder.BaiZhiJun.Power.utils.Class163;
import cn.bigskidder.BaiZhiJun.Power.package639.package638.package637.Class2173;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package0.Class960;
import package3.package2.package1.package4133.Class0;
import package3.package2.package1.package82.Class487;
import package3.package2.package39.EntityLivingBase;
import package3.package2.package39.Class1839;

public class Class171 {
    public static void k(Class1815 class1815) {
        int n = class1815.jvs() / 2 + 10;
        int n2 = class1815.jvx() - 90;
        Class1839 class1839 = Class2173.kmo;
        if (class1839 != null) {
            Class487.pbe();
            Class1388.p((double)n + 0.0, (double)n2 + 0.0, (double)n + 125.0, (double)n2 + 36.0, Class1387.pa(0, 150));
            Class2556.nmk().vrj.v(class1839.ce(), (float)n + 38.0f, (float)n2 + 2.0f, -1);
            BigDecimal bigDecimal = new BigDecimal(class1839.po());
            bigDecimal = bigDecimal.setScale(1, RoundingMode.HALF_UP);
            double d = bigDecimal.doubleValue();
            Class2556.nmk();
            BigDecimal bigDecimal2 = new BigDecimal(Class2556.vhw.u(class1839));
            bigDecimal2 = bigDecimal2.setScale(1, RoundingMode.HALF_UP);
            double d2 = bigDecimal2.doubleValue();
            float f = class1839.po();
            float[] arrf = new float[]{0.0f, 0.5f, 1.0f};
            Color[] arrcolor = new Color[]{Color.RED, Color.YELLOW, Color.GREEN};
            float f2 = f / class1839.pa();
            Color color = f >= 0.0f ? Class171.d(arrf, arrcolor, f2).brighter() : Color.RED;
            double d3 = Class2556.nmk().vrj.jj(class1839.ce());
            d3 = Class1390.m(d3, 10.0);
            if (d3 < 50.0) {
                d3 = 50.0;
            }
            double d4 = d3 * (double)f2;
            Class1388.p((double)n + 37.5, (double)n2 + 11.5, (double)n + 38.0 + d4 + 0.5, (double)n2 + 14.5, color.getRGB());
            Class1388.p((double)n + 37.0, (double)n2 + 11.0, (double)n + 39.0 + d3, (double)n2 + 15.0, 0.5, Class1387.pa(0, 0), Class1387.sl(0));
            for (int i = 1; i < 10; ++i) {
                double d5 = d3 / 10.0 * (double)i;
                Class1388.p((double)n + 38.0 + d5, (double)n2 + 11.0, (double)n + 38.0 + d5 + 0.5, (double)n2 + 15.0, Class1387.sl(0));
            }
            String string = (double)f > 20.0 ? " \u00a79" : ((double)f >= 10.0 ? " \u00a7a" : ((double)f >= 3.0 ? " \u00a7e" : " \u00a74"));
            Class487.i(0.5, 0.5, 0.5);
            String string2 = "HP: " + string + d + "\u00a7r | Dist: " + d2;
            Class2556.nmk().vrj.v(string2, (float)(n * 2) + 76.0f, (float)(n2 * 2) + 35.0f, -1);
            String string3 = String.format("Yaw: %s Pitch: %s BodyYaw: %s", (int)class1839.oi, (int)class1839.ow, (int)class1839.zo);
            Class2556.nmk().vrj.v(string3, (float)(n * 2) + 76.0f, (float)(n2 * 2) + 47.0f, -1);
            String string4 = String.format("G: %s HURT: %s TE: %s", class1839.up, class1839.jb, class1839.uw);
            Class2556.nmk().vrj.v(string4, (float)(n * 2) + 76.0f, (float)(n2 * 2) + 59.0f, -1);
            Class487.f(2.0f, 2.0f, 2.0f);
            Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
            Class487.pbv();
            Class487.pbu();
            Class487.f(770, 771, 1, 0);
            Class163.d(n + 18, n2 + 32, 14, 0.0f, 0.0f, Class2173.kmo);
            Class487.pid();
        }
    }

    public static int[] d(float[] arrf, float f) {
        int n;
        int[] arrn = new int[2];
        for (n = 0; n < arrf.length && arrf[n] <= f; ++n) {
        }
        if (n >= arrf.length) {
            n = arrf.length - 1;
        }
        arrn[0] = n - 1;
        arrn[1] = n;
        return arrn;
    }

    public static Color d(float[] arrf, Color[] arrcolor, float f) {
        Color color = null;
        if (arrf == null) {
            throw new IllegalArgumentException("Fractions can't be null");
        }
        if (arrcolor == null) {
            throw new IllegalArgumentException("Colours can't be null");
        }
        if (arrf.length == arrcolor.length) {
            int[] arrn = Class171.d(arrf, f);
            float[] arrf2 = new float[]{arrf[arrn[0]], arrf[arrn[1]]};
            Color[] arrcolor2 = new Color[]{arrcolor[arrn[0]], arrcolor[arrn[1]]};
            float f2 = arrf2[1] - arrf2[0];
            float f3 = f - arrf2[0];
            float f4 = f3 / f2;
            color = Class171.d(arrcolor2[0], arrcolor2[1], (double)(1.0f - f4));
            return color;
        }
        throw new IllegalArgumentException("Fractions and colours must have equal number of elements");
    }

    public static Color d(Color color, Color color2, double d) {
        float f = (float)d;
        float f2 = 1.0f - f;
        float[] arrf = new float[3];
        float[] arrf2 = new float[3];
        color.getColorComponents(arrf);
        color2.getColorComponents(arrf2);
        float f3 = arrf[0] * f + arrf2[0] * f2;
        float f4 = arrf[1] * f + arrf2[1] * f2;
        float f5 = arrf[2] * f + arrf2[2] * f2;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 255.0f) {
            f3 = 255.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        } else if (f4 > 255.0f) {
            f4 = 255.0f;
        }
        if (f5 < 0.0f) {
            f5 = 0.0f;
        } else if (f5 > 255.0f) {
            f5 = 255.0f;
        }
        Color color3 = null;
        try {
            color3 = new Color(f3, f4, f5);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            NumberFormat numberFormat = NumberFormat.getNumberInstance();
            System.out.println(String.valueOf(numberFormat.format(f3)) + "; " + numberFormat.format(f4) + "; " + numberFormat.format(f5));
            illegalArgumentException.printStackTrace();
        }
        return color3;
    }
}

