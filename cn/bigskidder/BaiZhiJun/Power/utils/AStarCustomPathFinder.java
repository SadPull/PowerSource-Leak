/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

public final class Class133 {
    public static float rcs;
    private long rcx;
    private long rco = System.nanoTime() / 1000000L;
    private long rcu = 0L;

    public boolean jc(float f) {
        return (float)(this.pqb() - this.rcu) >= f;
    }

    public long pqb() {
        return System.nanoTime() / 1000000L;
    }

    public boolean d(long l, boolean bl) {
        if (this.jtd() >= l) {
            if (bl) {
                this.npr();
            }
            return true;
        }
        return false;
    }

    public boolean nk(long l) {
        return this.jtd() >= l;
    }

    public boolean lv(int n) {
        return this.jtd() >= (long)(1000 / n - 50);
    }

    public boolean zm(int n, int n2) {
        return this.jtd() >= (long)(n / n2 - 50);
    }

    public long jtd() {
        return System.nanoTime() / 1000000L - this.rco;
    }

    public void jme() {
        this.rcu = this.pqb();
    }

    public void npr() {
        this.rcu = this.pqb();
    }

    public long vol() {
        return this.pqb() - this.rcu;
    }

    public void nq(long l) {
        this.rcu = this.pqb() - l;
    }

    public boolean ps(double d) {
        return (double)(this.pqb() - this.rcx) >= d;
    }

    public long jgd() {
        return this.pqb() - this.rcx;
    }

    public void jgn() {
        this.rcx = this.pqb();
    }
}

