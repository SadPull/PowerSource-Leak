/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

public class Class170 {
    public static float rcv;
    private static float rcj;

    static {
        rcj = 0.125f;
    }

    public static float nz(float f, float f2, float f3) {
        return Class170.r(f, f2, rcj, f3);
    }

    public static double nl(double d, double d2, double d3) {
        float f = (float)((double)rcv * d3);
        d = d < d2 ? (d + (double)f < d2 ? (d = d + (double)f) : d2) : (d - (double)f > d2 ? (d = d - (double)f) : d2);
        return d;
    }

    public static float r(float f, float f2, float f3, float f4) {
        float f5 = (f2 - f) * f3;
        if (f5 > 0.0f) {
            f5 = Math.max(f4, f5);
            f5 = Math.min(f2 - f, f5);
        } else if (f5 < 0.0f) {
            f5 = Math.min(-f4, f5);
            f5 = Math.max(f2 - f, f5);
        }
        return f + f5;
    }
}

