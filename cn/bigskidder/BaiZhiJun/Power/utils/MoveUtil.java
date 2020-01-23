/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.awt.Color;

public class Class1381 {
    public static int d(Color color) {
        return Class1381.y(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
    }

    public static int sl(int n) {
        return Class1381.y(n, n, n, 255);
    }

    public static int pa(int n, int n2) {
        return Class1381.y(n, n, n, n2);
    }

    public static int pn(int n, int n2, int n3) {
        return Class1381.y(n, n2, n3, 255);
    }

    public static int y(int n, int n2, int n3, int n4) {
        int n5 = 0;
        n5 |= n4 << 24;
        n5 |= n << 16;
        n5 |= n2 << 8;
        return n5 |= n3;
    }
}

