/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.util.List;
import package3.package2.package1.Class2556;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class608;
import package3.package2.package152.Class614;
import package3.package2.package152.Class891;
import package3.package2.package39.EntityLivingBase;
import package3.package2.package39.Class1839;

public class Class134 {
    public static float[] nq(Class1839 class1839) {
        double d = class1839.of;
        double d2 = class1839.og;
        double d3 = class1839.om + (double)(class1839.nk() / 2.0f);
        return Class134.nr(d, d2, d3);
    }

    public static float[] nn(List<Class1839> list) {
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        for (EntityLivingBase EntityLivingBase : list) {
            d += EntityLivingBase.of;
            d2 += EntityLivingBase.un.xay - 2.0;
            d3 += EntityLivingBase.og;
        }
        return new float[]{Class134.nr(d /= (double)list.size(), d3 /= (double)list.size(), d2 /= (double)list.size())[0], Class134.nr(d, d3, d2)[1]};
    }

    public static float[] pm(EntityLivingBase EntityLivingBase) {
        double d = EntityLivingBase.of - EntityLivingBase.uf;
        double d2 = EntityLivingBase.og - EntityLivingBase.ug;
        Class2556.nmk();
        double d3 = Class2556.vhw.u(EntityLivingBase);
        d3 -= d3 % 0.8;
        double d4 = 1.0;
        double d5 = 1.0;
        boolean bl = EntityLivingBase.ca();
        d4 = d3 / 0.8 * d * (bl ? 1.25 : 1.0);
        d5 = d3 / 0.8 * d2 * (bl ? 1.25 : 1.0);
        Class2556.nmk();
        double d6 = EntityLivingBase.of + d4 - Class2556.vhw.of;
        Class2556.nmk();
        double d7 = EntityLivingBase.og + d5 - Class2556.vhw.og;
        Class2556.nmk();
        Class2556.nmk();
        double d8 = Class2556.vhw.om + (double)Class2556.vhw.nk() - (EntityLivingBase.om + (double)EntityLivingBase.nk());
        Class2556.nmk();
        double d9 = Class2556.vhw.u(EntityLivingBase);
        float f = (float)Math.toDegrees(Math.atan2(d7, d6)) - 90.0f;
        float f2 = (float)Math.toDegrees(Math.atan2(d8, d9));
        return new float[]{f, f2};
    }

    private static float[] nr(double d, double d2, double d3) {
        Class2556.nmk();
        double d4 = d - Class2556.vhw.of;
        Class2556.nmk();
        double d5 = d2 - Class2556.vhw.og;
        Class2556.nmk();
        double d6 = d3 - Class2556.vhw.om - 0.6;
        double d7 = Class608.nd(d4 * d4 + d5 * d5);
        float f = (float)(Math.atan2(d5, d4) * 180.0 / 3.141592653589793) - 90.0f;
        float f2 = (float)(-(Math.atan2(d6, d7) * 180.0 / 3.141592653589793));
        return new float[]{f, f2};
    }

    public static float nj(float f, float f2, float f3) {
        float f4 = 0.006f;
        float f5 = f3 * f3 * f3 * f3 - f4 * (f4 * (f * f) + 2.0f * f2 * (f3 * f3));
        return (float)Math.toDegrees(Math.atan(((double)(f3 * f3) - Math.sqrt(f5)) / (double)(f4 * f)));
    }

    public static float g(double d, double d2) {
        Class2556.nmk();
        double d3 = d - Class2556.vhw.of;
        Class2556.nmk();
        double d4 = d2 - Class2556.vhw.og;
        double d5 = d4 < 0.0 && d3 < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d4 / d3)) : (d4 < 0.0 && d3 > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d4 / d3)) : Math.toDegrees(-Math.atan(d3 / d4)));
        Class2556.nmk();
        return Class608.jp(-(Class2556.vhw.oi - (float)d5));
    }

    public static float q(EntityLivingBase EntityLivingBase, double d) {
        Class2556.nmk();
        double d2 = EntityLivingBase.of - Class2556.vhw.of;
        Class2556.nmk();
        double d3 = EntityLivingBase.og - Class2556.vhw.og;
        Class2556.nmk();
        double d4 = d - 2.2 + (double)EntityLivingBase.nk() - Class2556.vhw.om;
        double d5 = Class608.nd(d2 * d2 + d3 * d3);
        double d6 = -Math.toDegrees(Math.atan(d4 / d5));
        Class2556.nmk();
        return -Class608.jp(Class2556.vhw.ow - (float)d6) - 2.5f;
    }

    public static float zt(float f) {
        if ((f %= 360.0f) >= 180.0f) {
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

    public static float[] jv(Class891 class891) {
        return null;
    }
}

