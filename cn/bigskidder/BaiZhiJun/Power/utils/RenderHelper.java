/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

public class Class1383 {
    private long rje = 0L;

    public boolean jc(float f) {
        return (float)(this.pqb() - this.rje) >= f;
    }

    public void npr() {
        this.rje = this.pqb();
    }

    public long pqb() {
        return System.nanoTime() / 1000000L;
    }

    public long vol() {
        return this.pqb() - this.rje;
    }

    public void nq(long l) {
        this.rje = this.pqb() - l;
    }

    public boolean pv(float f) {
        return (float)this.pqb() >= f;
    }
}

