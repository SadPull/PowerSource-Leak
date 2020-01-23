/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package858;

import cn.bigskidder.BaiZhiJun.Power.package858.EventStep;

public class Class2201
extends EventStep {
    private boolean kx;
    private float ko;
    private float ku;
    private double ky;
    private boolean kk;
    private boolean kt;

    public void d(double d, float f, float f2, boolean bl) {
        this.kx = true;
        this.ko = f;
        this.ku = f2;
        this.ky = d;
        this.kk = bl;
        super.sa();
    }

    @Override
    public void sa() {
        this.kx = false;
        super.sa();
    }

    public boolean sl() {
        return this.kx;
    }

    public boolean sb() {
        return !this.kx;
    }

    public float si() {
        return this.ko;
    }

    public float sw() {
        return this.ku;
    }

    public double se() {
        return this.ky;
    }

    public boolean xd() {
        return this.kk;
    }

    public boolean xn() {
        return this.kt;
    }

    public void r(float f) {
        this.ko = f;
    }

    public void f(float f) {
        this.ku = f;
    }

    public void n(double d) {
        this.ky = d;
    }

    public void k(boolean bl) {
        this.kk = bl;
    }

    public void t(boolean bl) {
        this.kt = bl;
    }
}

