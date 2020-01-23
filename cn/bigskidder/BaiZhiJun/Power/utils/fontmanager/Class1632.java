/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils.package5073;

import java.util.ArrayList;
import cn.bigskidder.BaiZhiJun.Power.utils.package5073.Class1639;
import package3.package2.package39.package3530.Class858;

public class Class1632 {
    private static ArrayList vtn = new ArrayList();

    public static ArrayList nrb() {
        return vtn;
    }

    public static boolean w(Class858 class858) {
        for (Class1639 class1639 : vtn) {
            if (!class1639.ce().equalsIgnoreCase(class858.ce())) continue;
            return true;
        }
        return false;
    }

    public static boolean vg(String string) {
        for (Class1639 class1639 : vtn) {
            if (!class1639.ce().equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }

    public static Class1639 va(String string) {
        for (Class1639 class1639 : vtn) {
            if (!class1639.ce().equalsIgnoreCase(string)) continue;
            return class1639;
        }
        return null;
    }
}

