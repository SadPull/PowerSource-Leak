/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.awt.Color;
import package3.package2.package152.Class608;

public enum Class1387 {
    rjv(-16711423),
    rjj(-12028161),
    rjz(-12621684),
    rjq(-9830551),
    rjc(-9320847),
    rjs(-65794),
    rjx(-7820064),
    rjo(-12621684),
    rju(-9868951),
    rjy(-14342875),
    rjk(-65536),
    rjt(-8388608),
    rjh(-29696),
    rjr(-2263808),
    rjf(-256),
    rjm(-2702025),
    rjg(-18751),
    rja(-2252579);
    
    public int rjl;

    private Class1387(int n2) {
        this.rjl = n2;
    }

    public static int d(Color color) {
        return Class1387.y(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static int sl(int n) {
        return Class1387.y(n, n, n, 255);
    }

    public static int pa(int n, int n2) {
        return Class1387.y(n, n, n, n2);
    }

    public static int pn(int n, int n2, int n3) {
        return Class1387.y(n, n2, n3, 255);
    }

    public static int y(int n, int n2, int n3, int n4) {
        int n5 = 0;
        n5 |= Class608.ns(n4, 0, 255) << 24;
        n5 |= Class608.ns(n, 0, 255) << 16;
        n5 |= Class608.ns(n2, 0, 255) << 8;
        return n5 |= Class608.ns(n3, 0, 255);
    }

    public static int nl(int n, int n2, int n3, int n4) {
        int n5 = 0;
        n5 |= Class608.ns(n4, 0, 255) << 24;
        n5 |= Class608.ns(n, 0, 255) << 16;
        n5 |= Class608.ns(n2, 0, 255) << 8;
        return n5 |= Class608.ns(n3, 0, 255);
    }
}

