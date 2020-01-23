/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

public class Class167 {
    private long rqz = System.currentTimeMillis();

    public boolean pj(double d) {
        return (double)(System.currentTimeMillis() - this.rqz) >= d;
    }

    public boolean aw(int n) {
        return System.currentTimeMillis() - this.rqz >= (long)n;
    }

    public void npr() {
        this.rqz = System.currentTimeMillis();
    }

    public long jfe() {
        return System.currentTimeMillis() - this.rqz;
    }
}

