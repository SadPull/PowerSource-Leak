/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.util.Random;
import package3.package2.package1.Class2556;
import package3.package2.package1.package103.Class1224;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class608;
import package3.package2.package152.Class614;
import package3.package2.package152.Class890;
import package3.package2.package152.Class891;
import package3.package2.package152.Class897;
import package3.package2.package152.Class910;
import package3.package2.package39.EntityLivingBase;
import package3.package2.package39.package2018.Class2282;
import package3.package2.package39.package3530.Class858;
import package3.package2.package9.Class2469;

public class Class1393 {
    public static Class2556 rji = Class2556.nmk();

    public static float[] pj(EntityLivingBase EntityLivingBase) {
        Class2556.nmk();
        double d = Class2556.vhw.of;
        Class2556.nmk();
        Class2556.nmk();
        double d2 = Class2556.vhw.om + (double)Class2556.vhw.nk();
        Class2556.nmk();
        double d3 = Class2556.vhw.og;
        double d4 = EntityLivingBase.of;
        double d5 = EntityLivingBase.om + (double)(EntityLivingBase.uu / 2.0f);
        double d6 = EntityLivingBase.og;
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = Math.sqrt(Math.pow(d7, 2.0) + Math.pow(d9, 2.0));
        double d11 = Math.toDegrees(Math.atan2(d9, d7)) + 90.0;
        double d12 = Math.toDegrees(Math.atan2(d10, d8));
        return new float[]{(float)d11, (float)(90.0 - d12)};
    }

    private static float[] ph(EntityLivingBase EntityLivingBase) {
        return new float[]{Class1393.pr(EntityLivingBase) + Class2556.vhw.oi, Class1393.pf(EntityLivingBase) + Class2556.vhw.ow};
    }

    public static float[] d(double d, double d2, double d3, Class910 class910) {
        Class2282 class2282 = new Class2282(Class2556.vhg);
        class2282.of = d + 0.5;
        class2282.om = d2 + 0.5;
        class2282.og = d3 + 0.5;
        class2282.of += (double)class910.vjt().xl() * 0.25;
        class2282.om += (double)class910.vjt().xb() * 0.25;
        class2282.og += (double)class910.vjt().xi() * 0.25;
        return Class1393.ph(class2282);
    }

    public static float[] n(Class858 class858, Class891 class891) {
        double d = (double)class891.xl() - class858.of;
        double d2 = (double)class891.xb() + 0.5 - (class858.om + (double)class858.nk());
        double d3 = (double)class891.xi() - class858.og;
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = (float)(Math.atan2(d3, d) * 180.0 / 3.141592653589793) - 90.0f;
        float f2 = (float)(-Math.atan2(d2, d4) * 180.0 / 3.141592653589793);
        return new float[]{f, f2};
    }

    public static float pr(EntityLivingBase EntityLivingBase) {
        double d = EntityLivingBase.of - Class2556.vhw.of;
        double d2 = EntityLivingBase.og - Class2556.vhw.og;
        double d3 = d2 < 0.0 && d < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d2 / d)) : (d2 < 0.0 && d > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d2 / d)) : Math.toDegrees(-Math.atan(d / d2)));
        return Class608.jp(-Class2556.vhw.oi - (float)d3);
    }

    public static float pf(EntityLivingBase EntityLivingBase) {
        double d = EntityLivingBase.of - Class2556.vhw.of;
        double d2 = EntityLivingBase.og - Class2556.vhw.og;
        double d3 = EntityLivingBase.om - 1.6 + (double)EntityLivingBase.nk() - Class2556.vhw.om;
        double d4 = Class608.nd(d * d + d2 * d2);
        double d5 = -Math.toDegrees(Math.atan(d3 / d4));
        return -Class608.jp(Class2556.vhw.ow - (float)d5);
    }

    public static float[] nr(double d, double d2, double d3) {
        Class2556.nmk();
        double d4 = d - Class2556.vhw.of;
        Class2556.nmk();
        double d5 = d3 - Class2556.vhw.og;
        Class2556.nmk();
        Class2556.nmk();
        double d6 = d2 - Class2556.vhw.om - (double)Class2556.vhw.nk();
        double d7 = Class608.nd(d4 * d4 + d5 * d5);
        float f = (float)(Math.atan2(d5, d4) * 180.0 / 3.141592653589793) - 90.0f;
        float f2 = (float)(-Math.atan2(d6, d7) * 180.0 / 3.141592653589793);
        return new float[]{f, f2};
    }

    public static float[] ng(double d, double d2, double d3) {
        Class2556.nmk();
        double d4 = d + 0.5 - Class2556.vhw.of;
        Class2556.nmk();
        double d5 = d3 + 0.5 - Class2556.vhw.og;
        Class2556.nmk();
        Class2556.nmk();
        double d6 = d2 + 0.5 - (Class2556.vhw.om + (double)Class2556.vhw.nk());
        double d7 = Class608.nd(d4 * d4 + d5 * d5);
        float f = (float)(Math.atan2(d5, d4) * 180.0 / 3.141592653589793) - 90.0f;
        float f2 = (float)(-Math.atan2(d6, d7) * 180.0 / 3.141592653589793);
        float[] arrf = new float[2];
        Class2556.nmk();
        Class2556.nmk();
        arrf[0] = Class2556.vhw.oi + Class608.jp(f - Class2556.vhw.oi);
        Class2556.nmk();
        Class2556.nmk();
        arrf[1] = Class2556.vhw.ow + Class608.jp(f2 - Class2556.vhw.ow);
        return arrf;
    }

    public static float[] na(double d, double d2, double d3) {
        Class2556.nmk();
        double d4 = d + 0.5 - Class2556.vhw.of;
        Class2556.nmk();
        double d5 = d3 + 0.5 - Class2556.vhw.og;
        Class2556.nmk();
        Class2556.nmk();
        double d6 = d2 + 0.5 - (Class2556.vhw.om + (double)Class2556.vhw.nk());
        double d7 = Class608.nd(d4 * d4 + d5 * d5);
        float f = (float)(Math.atan2(d5, d4) * 180.0 / 3.141592653589793) - 90.0f;
        float f2 = (float)(-Math.atan2(d6, d7) * 180.0 / 3.141592653589793);
        float[] arrf = new float[2];
        Class2556.nmk();
        arrf[0] = Class2556.vhw.oi + Class608.jp(f - (float)(120 + new Random().nextInt(2)));
        Class2556.nmk();
        Class2556.nmk();
        arrf[1] = Class2556.vhw.ow + Class608.jp(f2 - Class2556.vhw.ow);
        return arrf;
    }

    public static float[] z(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d4 + 0.5 - d;
        double d8 = d6 + 0.5 - d3;
        Class2556.nmk();
        double d9 = d5 + 0.5 - (d2 + (double)Class2556.vhw.nk());
        double d10 = Class608.nd(d7 * d7 + d8 * d8);
        float f = (float)(Math.atan2(d8, d7) * 180.0 / 3.141592653589793) - 90.0f;
        float f2 = (float)(-Math.atan2(d9, d10) * 180.0 / 3.141592653589793);
        return new float[]{f, f2};
    }

    public static float nj(float f, float f2, float f3) {
        float f4 = 0.006f;
        float f5 = f3 * f3 * f3 * f3 - f4 * (f4 * (f * f) + 2.0f * f2 * (f3 * f3));
        return (float)Math.toDegrees(Math.atan(((double)(f3 * f3) - Math.sqrt(f5)) / (double)(f4 * f)));
    }

    public static float zt(float f) {
        float f2;
        f %= 360.0f;
        if (f2 >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static float nj(float f, float f2) {
        float f3 = Math.abs(f - f2) % 360.0f;
        if (f3 > 180.0f) {
            f3 = 360.0f - f3;
        }
        return f3;
    }

    public static Class897[] a(Class614 class614) {
        return new Class897[]{new Class897(class614.xas, class614.xax, class614.xao), new Class897(class614.xau, class614.xax, class614.xao), new Class897(class614.xas, class614.xay, class614.xao), new Class897(class614.xas, class614.xax, class614.xak), new Class897(class614.xau, class614.xay, class614.xao), new Class897(class614.xas, class614.xay, class614.xak), new Class897(class614.xau, class614.xax, class614.xak), new Class897(class614.xau, class614.xay, class614.xak)};
    }

    public static Class614 d(Class614 class614, Class614 class6142) {
        for (Class897 class897 : Class1393.a(class6142)) {
            if (!Class1393.d(Class1393.nr(class897.xfy, class897.xfk, class897.xft), class614)) continue;
            return Class1393.l(class6142) < Class1393.l(class614) ? class6142 : class614;
        }
        return class6142;
    }

    public static double l(Class614 class614) {
        Class2556.nmk();
        return Class2556.vhw.z((class614.xas + class614.xau) / 2.0, (class614.xax + class614.xay) / 2.0, (class614.xao + class614.xak) / 2.0);
    }

    public static boolean d(float[] arrf, Class614 class614) {
        float[] arrf2 = Class1393.i(class614);
        return arrf2[0] < arrf[0] && arrf2[2] < arrf[1] && arrf2[1] > arrf[0] && arrf2[3] > arrf[1];
    }

    public static float[] b(Class614 class614) {
        float[] arrf = Class1393.i(class614);
        float f = (float)Class608.d(new Random(), (double)arrf[0], (double)arrf[1]);
        float f2 = (float)Class608.d(new Random(), (double)arrf[2], (double)arrf[3]);
        return new float[]{f, f2};
    }

    public static float[] i(Class614 class614) {
        float f = 2.14748365E9f;
        float f2 = -2.14748365E9f;
        float f3 = 2.14748365E9f;
        float f4 = -2.14748365E9f;
        for (Class897 class897 : Class1393.a(class614)) {
            float[] arrf = Class1393.nr(class897.xfy, class897.xfk, class897.xft);
            if (arrf[0] < f) {
                f = arrf[0];
            }
            if (arrf[0] > f2) {
                f2 = arrf[0];
            }
            if (arrf[1] < f3) {
                f3 = arrf[1];
            }
            if (!(arrf[1] > f4)) continue;
            f4 = arrf[1];
        }
        return new float[]{f, f2, f3, f4};
    }

    public static Class614 v(Class614 class614, double d) {
        d = 1.0 - d / 100.0;
        return class614.nc((class614.xau - class614.xas) * d, 0.12, (class614.xak - class614.xao) * d);
    }

    public static Class614 j(Class614 class614, double d) {
        d = 1.0 - d / 100.0;
        return class614.nx((class614.xau - class614.xas) * d, 0.12, (class614.xak - class614.xao) * d);
    }

    public static float nz(float f, float f2) {
        float f3;
        return f3 + ((f3 = (f2 + 180.0f - f) % 360.0f) > 0.0f ? -180.0f : 180.0f);
    }

    public static float nq(float f, float f2) {
        float f3;
        return f3 + ((f3 = (f2 + 90.0f - f) % 180.0f) > 0.0f ? -90.0f : 90.0f);
    }

    public static float[] r(Object object) {
        EntityLivingBase EntityLivingBase = (EntityLivingBase)object;
        Class2556.nmk();
        double d = Class2556.vhw.of;
        Class2556.nmk();
        Class2556.nmk();
        double d2 = Class2556.vhw.om + (double)Class2556.vhw.nk();
        Class2556.nmk();
        double d3 = Class2556.vhw.og;
        double d4 = EntityLivingBase.of;
        double d5 = EntityLivingBase.om + (double)(EntityLivingBase.uu / 2.0f);
        double d6 = EntityLivingBase.og;
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        double d10 = Math.sqrt(Math.pow(d7, 2.0) + Math.pow(d9, 2.0));
        double d11 = Math.toDegrees(Math.atan2(d9, d7)) + 90.0;
        double d12 = Math.toDegrees(Math.atan2(d10, d8));
        return new float[]{(float)d11, (float)(90.0 - d12)};
    }
}

