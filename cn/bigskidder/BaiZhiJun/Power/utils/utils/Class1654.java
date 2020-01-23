/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils.package4614;

public class Class1654 {
    private long zgc = -1L;

    public boolean pv(float f) {
        return (float)this.pqb() >= f;
    }

    public long pqb() {
        return this.pqi() - this.zgc;
    }

    public void npr() {
        this.zgc = this.pqi();
    }

    public long pqi() {
        return System.currentTimeMillis();
    }
}

