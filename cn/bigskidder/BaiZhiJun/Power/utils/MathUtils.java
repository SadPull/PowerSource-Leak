/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import package3.package2.package1.Class2556;
import package3.package2.package1.package103.Class1224;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class575;
import package3.package2.package152.Class614;
import package3.package2.package3579.Class2418;
import package3.package2.package3579.Class2421;
import package3.package2.package39.EntityLivingBase;

public final class Class1399 {
    public static int ja(int n, int n2) {
        return (int)(Math.random() * (double)(n - n2)) + n2;
    }

    public static double n(double d, int n) {
        if (n < 0) {
            return d;
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public static double m(double d, double d2) {
        double d3 = 1.0 / d2;
        return (double)Math.round(d * d3) / d3;
    }

    public static boolean d(Double d) {
        if (d != Math.floor(d)) {
            return false;
        }
        return !Double.isInfinite(d);
    }

    public static int jha() {
        if (Class2556.vhw.d(Class2418.veb)) {
            return Class2556.vhw.n(Class2418.veb).nlw() + 1;
        }
        return 0;
    }

    public static int jhl() {
        if (Class2556.vhw.d(Class2418.veh)) {
            return Class2556.vhw.n(Class2418.veh).nlw() + 1;
        }
        return 0;
    }

    public static boolean pd(double d) {
        return !Class2556.vhg.d((EntityLivingBase)Class2556.vhw, Class2556.vhw.sy().ns(0.0, -d, 0.0)).isEmpty();
    }

    public static void pn(double d) {
        double d2 = Class575.odg;
        double d3 = Class575.odm;
        float f = Class2556.vhw.oi;
        if (d2 == 0.0 && d3 == 0.0) {
            Class2556.vhw.oa = 0.0;
            Class2556.vhw.ob = 0.0;
        } else {
            if (d2 != 0.0) {
                if (d3 > 0.0) {
                    f += (float)(d2 > 0.0 ? -45 : 45);
                } else if (d3 < 0.0) {
                    f += (float)(d2 > 0.0 ? 45 : -45);
                }
                d3 = 0.0;
                if (d2 > 0.0) {
                    d2 = 1.0;
                } else if (d2 < 0.0) {
                    d2 = -1.0;
                }
            }
            Class2556.vhw.oa = d2 * d * Math.cos(Math.toRadians(f + 90.0f)) + d3 * d * Math.sin(Math.toRadians(f + 90.0f));
            Class2556.vhw.ob = d2 * d * Math.sin(Math.toRadians(f + 90.0f)) - d3 * d * Math.cos(Math.toRadians(f + 90.0f));
        }
    }

    public static double jhb() {
        return 0.0;
    }
}

