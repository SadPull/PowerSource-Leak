/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1397;

public class Class1400 {
    private static List<Class1397> rzd = new CopyOnWriteArrayList<Class1397>();
    public static Class1397 rzn = new Class1397(0, 255, 0, 255);
    public static Class1397 rzp = new Class1397(255, 0, 0, 255);
    public static Class1397 rzv = new Class1397(0, 0, 255, 255);
    public static Class1397 rzj = new Class1397(0, 255, 0, 255);
    public static Class1397 rzz = new Class1397(255, 0, 0, 255);
    public static Class1397 rzq = new Class1397(255, 255, 0, 255);
    public static Class1397 rzc = new Class1397(0, 192, 255, 255);
    public static Class1397 rzs = new Class1397(0, 255, 0, 200);

    public static List<Class1397> jfj() {
        return rzd;
    }

    public static Class1397 jfz() {
        return rzv;
    }

    public static Class1397 jfq() {
        return rzj;
    }

    public static Class1397 jfc() {
        return rzz;
    }

    public static Class1397 jfs() {
        return rzq;
    }

    public Class1397 jfx() {
        return rzc;
    }

    public static Class1397 jfo() {
        return rzn;
    }

    public Class1400() {
        rzd.add(rzv);
        rzd.add(rzj);
        rzd.add(rzz);
        rzd.add(rzq);
        rzd.add(rzc);
        rzd.add(rzn);
        rzd.add(rzp);
        rzd.add(rzs);
    }
}

