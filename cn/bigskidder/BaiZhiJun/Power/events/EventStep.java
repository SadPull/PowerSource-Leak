/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package858;

public abstract class EventStep {
    protected boolean hp;
    private boolean hv;

    public void sa() {
        this.hp = false;
    }

    public void h(boolean bl) {
        this.hp = bl;
    }

    public boolean xq() {
        return this.hp;
    }

    public void f(boolean bl) {
        this.hv = bl;
    }
}

