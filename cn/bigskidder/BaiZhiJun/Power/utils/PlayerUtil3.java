/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  org.lwjgl.util.vector.Vector3f
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.lwjgl.util.vector.Vector3f;
import package3.package2.package1.Class2556;
import package3.package2.package1.package103.Class1224;
import package3.package2.package1.package103.Class1226;
import package3.package2.package1.package2860.Class1027;
import package3.package2.package1.package2860.Class1029;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class397;
import package3.package2.package152.Class398;
import package3.package2.package152.Class575;
import package3.package2.package152.Class608;
import package3.package2.package152.Class614;
import package3.package2.package152.Class891;
import package3.package2.package152.Class897;
import package3.package2.package159.Class1761;
import package3.package2.package159.Class1886;
import package3.package2.package159.Class2315;
import package3.package2.package159.package2531.Class1991;
import package3.package2.package159.package520.Class1789;
import package3.package2.package329.Class2001;
import package3.package2.package329.Class2059;
import package3.package2.package329.Class2070;
import package3.package2.package3579.Class2418;
import package3.package2.package3579.Class2421;
import package3.package2.package39.EntityLivingBase;
import package3.package2.package39.Class1839;
import package3.package2.package39.Class1879;
import package3.package2.package39.package3530.Class858;
import package3.package2.package39.package3530.Class859;
import package3.package2.package39.package714.package3700.Class461;
import package3.package2.package396.Class2072;
import package3.package2.package399.Class1449;
import package3.package2.package399.Class1467;
import package3.package2.package4.Class31;
import package3.package2.package9.Class2469;

public class Class1390 {
    private static Class2556 rvx = Class2556.nmk();

    public static float[] pj(EntityLivingBase EntityLivingBase) {
        double d = EntityLivingBase.of;
        double d2 = EntityLivingBase.og;
        double d3 = EntityLivingBase.om + (double)(EntityLivingBase.nk() / 4.0f);
        return Class1390.nr(d, d2, d3);
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

    public static double jhe() {
        double d = 0.2873;
        Class2556.nmk();
        if (Class2556.vhw.d(Class2418.veh)) {
            Class2556.nmk();
            int n = Class2556.vhw.n(Class2418.veh).nlw();
            d *= 1.0 + 0.2 * (double)(n + 1);
        }
        return d;
    }

    public static float pdw() {
        Class2556.nmk();
        float f = Class2556.vhw.zy;
        Class2556.nmk();
        float f2 = Class2556.vhw.qp;
        Class2556.nmk();
        float f3 = Class2556.vhw.qn;
        f += (float)(f2 < 0.0f ? 180 : 0);
        if (f3 < 0.0f) {
            f += (float)(f2 < 0.0f ? -45 : (f2 == 0.0f ? 90 : 45));
        }
        if (f3 > 0.0f) {
            f -= (float)(f2 < 0.0f ? -45 : (f2 == 0.0f ? 90 : 45));
        }
        return f * 0.017453292f;
    }

    public static boolean cv() {
        return Class2556.vhg.u(new Class891(Class2556.vhw.of, Class2556.vhw.om, Class2556.vhw.og)).xk().vhr() == Class1991.jma;
    }

    public static void pp(double d) {
        float f = Class2556.vhw.oi * 0.017453292f;
        Class0 class0 = Class2556.vhw;
        class0.oa -= (double)Class608.vb(f) * d;
        Class0 class02 = Class2556.vhw;
        class02.ob += (double)Class608.vi(f) * d;
    }

    public static Class1886 x(Class858 class858) {
        return Class1390.c(new Class891(class858.of, class858.om - 1.0, class858.og));
    }

    public static Class1886 c(Class891 class891) {
        Class2556.nmk();
        return Class2556.vhg.u(class891).xk();
    }

    public static Class1886 d(Class858 class858, double d, double d2, double d3) {
        return Class1390.c(new Class891(class858.of - d, class858.om - d2, class858.og - d3));
    }

    public static ArrayList<Vector3f> s(double d, double d2, double d3, double d4) {
        double d5;
        ArrayList<Vector3f> arrayList = new ArrayList<Vector3f>();
        Class2556 class2556 = Class2556.nmk();
        double d6 = d - Class2556.vhw.of;
        double d7 = d2 - (Class2556.vhw.om + (double)Class2556.vhw.nk() + 1.1);
        double d8 = d3 - Class2556.vhw.og;
        float f = (float)(Math.atan2(d8, d6) * 180.0 / 3.141592653589793 - 90.0);
        float f2 = (float)(-Math.atan2(d7, Math.sqrt(d6 * d6 + d8 * d8)) * 180.0 / 3.141592653589793);
        double d9 = Class2556.vhw.of;
        double d10 = Class2556.vhw.om;
        double d11 = Class2556.vhw.og;
        double d12 = 1.0;
        for (d5 = d4; d5 < Class1390.v(Class2556.vhw.of, Class2556.vhw.om, Class2556.vhw.og, d, d2, d3); d5 += d4) {
            d12 += 1.0;
        }
        for (d5 = d4; d5 < Class1390.v(Class2556.vhw.of, Class2556.vhw.om, Class2556.vhw.og, d, d2, d3); d5 += d4) {
            d9 = Class2556.vhw.of - Math.sin(Class1390.zu(f)) * d5;
            d11 = Class2556.vhw.og + Math.cos(Class1390.zu(f)) * d5;
            arrayList.add(new Vector3f((float)d9, (float)(d10 -= (Class2556.vhw.om - d2) / d12), (float)d11));
        }
        arrayList.add(new Vector3f((float)d, (float)d2, (float)d3));
        return arrayList;
    }

    public static float zu(float f) {
        Class2556.nmk();
        if (Class2556.vhw.qp < 0.0f) {
            f += 180.0f;
        }
        float f2 = 1.0f;
        Class2556.nmk();
        if (Class2556.vhw.qp < 0.0f) {
            f2 = -0.5f;
        } else {
            Class2556.nmk();
            if (Class2556.vhw.qp > 0.0f) {
                f2 = 0.5f;
            }
        }
        Class2556.nmk();
        if (Class2556.vhw.qn > 0.0f) {
            f -= 90.0f * f2;
        }
        Class2556.nmk();
        if (Class2556.vhw.qn < 0.0f) {
            f += 90.0f * f2;
        }
        return f *= 0.017453292f;
    }

    public static double v(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d - d4;
        double d8 = d2 - d5;
        double d9 = d3 - d6;
        return Class608.nd(d7 * d7 + d8 * d8 + d9 * d9);
    }

    public static boolean jrd() {
        return Class1390.rvx.vrf.usz.vkd() || Class1390.rvx.vrf.usq.vkd() || Class1390.rvx.vrf.uss.vkd() || Class1390.rvx.vrf.usc.vkd();
    }

    public static void j(EntityLivingBase EntityLivingBase, boolean bl) {
        Class2556 class2556 = Class2556.nmk();
        Class2059 class2059 = Class2556.vhw.bb();
        if (Class2556.vhw.bb() != null && EntityLivingBase != null && bl && class2059.vrw() instanceof Class2070 && (double)Class2556.vhw.zn > 0.2) {
            Class2556.vhw.bb().d(Class2556.vhg, (Class858)Class2556.vhw);
        }
    }

    public static float vy(Class2059 class2059) {
        Iterator iterator;
        Multimap<String, Class461> multimap = class2059.vmh();
        if (!multimap.isEmpty() && (iterator = multimap.entries().iterator()).hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Class461 class461 = (Class461)entry.getValue();
            double d = class461.pco() != 1 && class461.pco() != 2 ? class461.pcu() : class461.pcu() * 100.0;
            double d2 = d;
            if (class461.pcu() > 1.0) {
                return 1.0f + (float)d;
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public static int pk(EntityLivingBase EntityLivingBase) {
        Class2556 class2556 = Class2556.nmk();
        Class2556.vhw.nhl.nmx = 0;
        int n = 0;
        int n2 = -1;
        int n3 = 1;
        for (int n4 = 0; n4 < 9; n4 = (int)((byte)(n4 + 1))) {
            Class2556.vhw.nhl.nmx = n4;
            Class2059 class2059 = Class2556.vhw.vp();
            if (class2059 == null) continue;
            int n5 = (int)Class1390.vy(class2059);
            if ((n5 = (int)((float)n5 + Class31.d(class2059, Class1879.st))) <= n3) continue;
            n3 = n5;
            n2 = n4;
        }
        if (n2 != -1) {
            return n2;
        }
        return n;
    }

    public static void t(Class2001 class2001) {
        for (int i = 9; i < 37; ++i) {
            Class2059 class2059 = Class2556.vhw.nhi.yd(i).q();
            if (class2059 == null || class2059.vrw() != class2001) continue;
            Class2556.vhx.d(0, i, 0, 1, Class2556.vhw);
            break;
        }
    }

    public static boolean jrn() {
        for (int i = 0; i <= 36; ++i) {
            Class2059 class2059 = Class2556.vhw.nhl.pu(i);
            if (class2059 != null) continue;
            return false;
        }
        return true;
    }

    public static Class897 nv(float f, float f2) {
        float f3 = Class608.vi(-f2 * 0.017453292f - 3.1415927f);
        float f4 = Class608.vb(-f2 * 0.017453292f - 3.1415927f);
        float f5 = -Class608.vi(-f * 0.017453292f);
        float f6 = Class608.vb(-f * 0.017453292f);
        return new Class897(f4 * f5, f6, f3 * f5);
    }

    public static void yi(String string) {
        Class2556.vhw.d(new Class397(string));
    }

    public Class1839 jhg() {
        return null;
    }

    public static void m(double d) {
        Class2556.vhw.oa = -Math.sin(Class1390.pdw()) * d;
        Class2556.vhw.ob = Math.cos(Class1390.pdw()) * d;
    }

    public static double pvc() {
        Class2556.nmk();
        Class2556.nmk();
        Class2556.nmk();
        Class2556.nmk();
        return Math.sqrt(Class2556.vhw.oa * Class2556.vhw.oa + Class2556.vhw.ob * Class2556.vhw.ob);
    }

    public static boolean pnd() {
        if (Class1390.rvx.vrf.usz.vkp()) {
            return true;
        }
        if (Class1390.rvx.vrf.usc.vkp()) {
            return true;
        }
        if (Class1390.rvx.vrf.usq.vkp()) {
            return true;
        }
        if (Class1390.rvx.vrf.uss.vkp()) {
            return true;
        }
        if (Class575.odg != 0.0f) {
            return true;
        }
        return Class575.odm != 0.0f;
    }

    public static boolean vof() {
        Class614 class614 = Class2556.vhw.sy();
        if (class614 == null) {
            return false;
        }
        class614 = class614.nx(0.01, 0.0, 0.01).ns(0.0, -0.01, 0.0);
        boolean bl = false;
        int n = (int)class614.xax;
        for (int i = Class608.np((double)class614.xas); i < Class608.np(class614.xau + 1.0); ++i) {
            for (int j = Class608.np((double)class614.xao); j < Class608.np(class614.xak + 1.0); ++j) {
                Class1886 class1886 = Class2556.vhg.u(new Class891(i, n, j)).xk();
                if (class1886 == Class2072.opv) continue;
                if (!(class1886 instanceof Class1761)) {
                    return false;
                }
                bl = true;
            }
        }
        return bl;
    }

    public static boolean jsk() {
        if (Class2556.vhw == null) {
            return false;
        }
        for (int i = Class608.np((double)Class2556.vhw.un.xas); i < Class608.np(Class2556.vhw.un.xau) + 1; ++i) {
            for (int j = Class608.np((double)Class2556.vhw.un.xao); j < Class608.np(Class2556.vhw.un.xak) + 1; ++j) {
                Class891 class891 = new Class891(i, (int)Class2556.vhw.un.xax, j);
                Class1886 class1886 = Class2556.vhg.u(class891).xk();
                if (class1886 == null || class1886 instanceof Class2315) continue;
                return class1886 instanceof Class1761;
            }
        }
        return false;
    }

    public static Class2556 nmk() {
        return Class2556.nmk();
    }

    public static Class0 jrp() {
        Class1390.nmk();
        return Class2556.vhw;
    }

    public static boolean jrv() {
        return Class2556.vhw.qp != 0.0f || Class2556.vhw.qn != 0.0f;
    }

    public static Class891 yw(String string) {
        int n = 95;
        if (string != null && string.length() > 1) {
            char[] arrc = string.toCharArray();
            int n2 = arrc.length;
            for (int i = 0; i < n2; ++i) {
                n += arrc[i] * string.length() * string.length() + string.charAt(0) + string.charAt(1);
            }
            n /= string.length();
        }
        return new Class891(n, -n % 255, n);
    }

    public static double m(double d, double d2) {
        double d3 = 1.0 / d2;
        return (double)Math.round(d * d3) / d3;
    }
}

