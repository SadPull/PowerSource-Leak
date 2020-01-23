/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils.package2993;

public class Class964 {
    public long hlf = 0L;

    public boolean no(long l) {
        return System.currentTimeMillis() - this.hlf > l;
    }

    public long jtv() {
        return System.nanoTime() / 1000000L;
    }

    public void npr() {
        this.hlf = System.currentTimeMillis();
    }

    public long jtp() {
        return this.hlf;
    }

    public void gb(int n) {
        this.hlf = System.currentTimeMillis() + (long)n;
    }

    public boolean nu(long l) {
        return this.jtv() - this.hlf >= l;
    }

    public boolean zx(float f) {
        return (float)(this.jtv() - this.hlf) >= f;
    }

    public boolean nl(double d) {
        return (double)(System.currentTimeMillis() - this.hlf) >= d;
    }
}

