/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.util.List;
import java.util.Random;
import package3.package2.package1.Class2556;
import package3.package2.package1.package103.Class1224;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class409;
import package3.package2.package152.Class608;
import package3.package2.package152.Class614;
import package3.package2.package39.EntityLivingBase;
import package3.package2.package39.Class1839;
import package3.package2.package39.package1436.Class598;
import package3.package2.package39.package1436.Class626;
import package3.package2.package39.package149.Class933;
import package3.package2.package39.package149.Class937;
import package3.package2.package39.package2018.Class2279;
import package3.package2.package39.package2018.Class2286;
import package3.package2.package39.package2018.Class2290;
import package3.package2.package39.package3530.Class858;
import package3.package2.package39.package38.Class515;

public class Class168 {
    public static boolean rsm;
    public static float rsg;
    public static float rsa;
    public static Class2556 rsl;

    static {
        rsl = Class2556.nmk();
    }

    public static synchronized float nc(Class1839 class1839) {
        return Class2556.vhw.u(class1839);
    }

    public static void ns(Class1839 class1839) {
        float[] arrf = Class168.pj(class1839);
        if (arrf != null) {
            Class2556.nmk();
            Class2556.vhw.oi = arrf[0];
            Class2556.nmk();
            Class2556.vhw.ow = arrf[1] - 8.0f;
        }
    }

    public static float[] pj(EntityLivingBase EntityLivingBase) {
        double d = EntityLivingBase.of;
        double d2 = EntityLivingBase.og;
        double d3 = EntityLivingBase.un.xay - 4.5;
        return Class168.nr(d, d2, d3);
    }

    public static float[] pg(EntityLivingBase EntityLivingBase) {
        double d;
        if (EntityLivingBase == null) {
            return null;
        }
        double d2 = EntityLivingBase.of - Class2556.vhw.of;
        if (EntityLivingBase instanceof Class1839) {
            Class1839 class1839 = (Class1839)EntityLivingBase;
            d = class1839.om + (double)class1839.nk() * 0.9 - (Class2556.vhw.om + (double)Class2556.vhw.nk());
        } else {
            d = EntityLivingBase.un.xax + EntityLivingBase.un.xay / 2.0 - (Class2556.vhw.om + (double)Class2556.vhw.nk());
        }
        double d3 = EntityLivingBase.og - Class2556.vhw.og;
        double d4 = Class608.nd(d2 * d2 + d3 * d3);
        float f = (float)(Math.atan2(d3, d2) * 180.0 / 3.141592653589793) - 90.0f;
        float f2 = (float)(-Math.atan2(d, d4) * 180.0 / 3.141592653589793);
        return new float[]{Class2556.vhw.oi + Class608.jp(f - Class2556.vhw.oi), Class2556.vhw.ow + Class608.jp(f2 - Class2556.vhw.ow)};
    }

    public static synchronized void nx(Class1839 class1839) {
        float[] arrf = Class168.pg(class1839);
        if (arrf != null) {
            rsg = Class168.nq(Class2556.vhw.oe, arrf[0], 55.0f);
            rsa = arrf[1];
            rsm = true;
        }
    }

    private static final float nq(float f, float f2, float f3) {
        float f4 = f2 - f;
        if (f4 > f3) {
            f4 = f3;
        } else if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    public static float[] nr(double d, double d2, double d3) {
        double d4 = d - Class2556.vhw.of;
        double d5 = d2 - Class2556.vhw.og;
        double d6 = d3 - Class2556.vhw.om + (double)Class2556.vhw.nk();
        double d7 = Class608.nd(d4 * d4 + d5 * d5);
        float f = (float)((double)((float)(Math.atan2(d5, d4) * 180.0 / 3.141592653589793) - 90.0f) + Math.random() + Math.random() + Math.random() + Math.random() + Math.random() + Math.random());
        float f2 = (float)(-(Math.atan2(d6, d7) * 180.0 / 3.141592653589793 + Math.random() + Math.random()));
        return new float[]{f, f2};
    }

    public static float[] d(EntityLivingBase EntityLivingBase, float f, float f2, boolean bl) {
        Object object;
        double d;
        double d2 = EntityLivingBase.of - Class2556.vhw.of;
        double d3 = EntityLivingBase.og - Class2556.vhw.og;
        if (EntityLivingBase instanceof Class1839) {
            object = (Class1839)EntityLivingBase;
            d = ((Class1839)object).om + (double)((EntityLivingBase)object).nk() - (Class2556.vhw.om + (double)Class2556.vhw.nk());
        } else {
            d = (EntityLivingBase.sy().xax + EntityLivingBase.sy().xay) / 2.0 - (Class2556.vhw.om + (double)Class2556.vhw.nk());
        }
        object = new Random();
        double d4 = Class608.nd(d2 * d2 + d3 * d3);
        float f3 = (float)(Math.atan2(d3, d2) * 180.0 / 3.141592653589793) - 90.0f;
        float f4 = (float)(-(Math.atan2(d - (EntityLivingBase instanceof Class858 ? 0.25 : 0.0), d4) * 180.0 / 3.141592653589793));
        float f5 = Class168.nc(Class2556.vhw.ow, f4, f2);
        float f6 = Class168.nc(Class2556.vhw.oi, f3, f);
        return new float[]{f6, f5};
    }

    public static float nc(float f, float f2, float f3) {
        float f4 = Class608.jp(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    public static EntityLivingBase px(double d) {
        EntityLivingBase EntityLivingBase = null;
        double d2 = 360.0;
        Class2556.nmk();
        for (Object e : Class2556.vhg.nkp) {
            EntityLivingBase EntityLivingBase2 = (EntityLivingBase)e;
            if (!(EntityLivingBase2 instanceof Class858)) continue;
            Class2556.nmk();
            double d3 = EntityLivingBase2.of - Class2556.vhw.of;
            Class2556.nmk();
            double d4 = EntityLivingBase2.og - Class2556.vhw.og;
            float f = (float)(Math.toDegrees(Math.atan2(d4, d3)) - 90.0);
            Class2556.nmk();
            double d5 = Math.abs(Class168.a(f, Class2556.vhw.oi));
            Class2556.nmk();
            if (EntityLivingBase2 == Class2556.vhw) continue;
            Class2556.nmk();
            if (!((double)Class2556.vhw.u(EntityLivingBase2) <= d) || !(EntityLivingBase2 instanceof Class858) || !(d5 < d2)) continue;
            d2 = d5;
            EntityLivingBase = EntityLivingBase2;
        }
        return EntityLivingBase;
    }

    public static double a(double d, double d2) {
        return ((d - d2) % 360.0 + 360.0) % 360.0 - 180.0;
    }

    public static boolean s(EntityLivingBase EntityLivingBase, float f) {
        f = (float)((double)f * 0.5);
        double d = Class168.a(Class2556.vhw.oi, Class168.pa(EntityLivingBase)[0]);
        return d > 0.0 && d < (double)f || (double)(-f) < d && d < 0.0;
    }

    public static double[] pa(EntityLivingBase EntityLivingBase) {
        double d = Class2556.vhw.of;
        double d2 = Class2556.vhw.om + (double)Class2556.vhw.nk();
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
        return new double[]{d11, 90.0 - d12};
    }

    public static boolean d(boolean bl, boolean bl2, boolean bl3, EntityLivingBase EntityLivingBase) {
        boolean bl4 = false;
        if (!(!Class168.pw(EntityLivingBase) || Class168.pl(EntityLivingBase) || Class168.pi(EntityLivingBase) || Class168.vp(EntityLivingBase) || Class168.pe(EntityLivingBase) || Class168.vn(EntityLivingBase) || Class168.pb(EntityLivingBase))) {
            bl4 = false;
        }
        if (!(!bl || !Class168.pi(EntityLivingBase) || Class168.pw(EntityLivingBase) || Class168.pl(EntityLivingBase) || Class168.vp(EntityLivingBase) || Class168.pe(EntityLivingBase) || Class168.vn(EntityLivingBase) || Class168.pb(EntityLivingBase))) {
            bl4 = true;
        }
        if (!(!bl2 || !Class168.pl(EntityLivingBase) || Class168.pw(EntityLivingBase) || Class168.pi(EntityLivingBase) || Class168.vp(EntityLivingBase) || Class168.pe(EntityLivingBase) || Class168.vn(EntityLivingBase) || Class168.pb(EntityLivingBase))) {
            bl4 = true;
        }
        if (!(!Class168.pe(EntityLivingBase) || Class168.pw(EntityLivingBase) || Class168.pi(EntityLivingBase) || Class168.pl(EntityLivingBase) || Class168.vp(EntityLivingBase) || Class168.vn(EntityLivingBase) || Class168.pb(EntityLivingBase))) {
            bl4 = false;
        }
        if (!(!Class168.vp(EntityLivingBase) || Class168.pw(EntityLivingBase) || Class168.pl(EntityLivingBase) || Class168.pe(EntityLivingBase) || Class168.pi(EntityLivingBase) || Class168.vn(EntityLivingBase))) {
            bl4 = false;
        }
        if (bl3 && Class168.pb(EntityLivingBase) && bl && Class168.pi(EntityLivingBase) && !Class168.pe(EntityLivingBase) && !Class168.pl(EntityLivingBase) && !Class168.pw(EntityLivingBase)) {
            bl4 = true;
        }
        if (bl3 && Class168.pb(EntityLivingBase) && bl2 && Class168.pl(EntityLivingBase) && !Class168.pe(EntityLivingBase) && !Class168.pi(EntityLivingBase) && !Class168.pw(EntityLivingBase)) {
            bl4 = true;
        }
        if (bl3 && Class168.pb(EntityLivingBase) && Class168.pw(EntityLivingBase) && !Class168.pe(EntityLivingBase) && !Class168.pl(EntityLivingBase) && !Class168.pi(EntityLivingBase)) {
            bl4 = false;
        }
        return bl4;
    }

    public static boolean pl(EntityLivingBase EntityLivingBase) {
        return EntityLivingBase instanceof Class858;
    }

    public static boolean pb(EntityLivingBase EntityLivingBase) {
        return EntityLivingBase.cl();
    }

    public static boolean pi(EntityLivingBase EntityLivingBase) {
        return EntityLivingBase instanceof Class937 || EntityLivingBase instanceof Class933;
    }

    public static boolean pw(EntityLivingBase EntityLivingBase) {
        return EntityLivingBase instanceof Class515;
    }

    public static boolean pe(EntityLivingBase EntityLivingBase) {
        return EntityLivingBase instanceof Class2290 || EntityLivingBase instanceof Class2279;
    }

    public static boolean vd(EntityLivingBase EntityLivingBase) {
        return EntityLivingBase instanceof Class2286;
    }

    public static boolean vn(EntityLivingBase EntityLivingBase) {
        return EntityLivingBase instanceof Class598;
    }

    public static double[] pc(EntityLivingBase EntityLivingBase) {
        double d = Class2556.nmk().vhf.odc;
        double[] arrd = new double[]{EntityLivingBase.uf + (EntityLivingBase.of - EntityLivingBase.uf) * d, EntityLivingBase.um + (EntityLivingBase.om - EntityLivingBase.um) * d, EntityLivingBase.ug + (EntityLivingBase.og - EntityLivingBase.ug) * d};
        return arrd;
    }

    public static boolean vp(EntityLivingBase EntityLivingBase) {
        return EntityLivingBase instanceof Class626;
    }

    public static boolean vv(EntityLivingBase EntityLivingBase) {
        return Class168.pi(EntityLivingBase) || Class168.pw(EntityLivingBase) || Class168.pe(EntityLivingBase) || Class168.vn(EntityLivingBase) || Class168.vp(EntityLivingBase);
    }
}

