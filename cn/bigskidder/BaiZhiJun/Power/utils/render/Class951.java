/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils.package2993;

public final class Class951 {
    public double hlh = System.nanoTime() / 1000000L;
    private long hlr;

    public boolean n(double d, boolean bl) {
        if (this.jtz() >= d) {
            if (bl) {
                this.npr();
            }
            return true;
        }
        return false;
    }

    public double jtz() {
        return (double)(System.nanoTime() / 1000000L) - this.hlh;
    }

    public void npr() {
        this.hlh = System.nanoTime() / 1000000L;
    }

    private long jtv() {
        return System.nanoTime() / 1000000L;
    }

    public boolean nb(double d) {
        return (double)(this.jtv() - this.hlr) >= d;
    }
}

