/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package858;

import cn.bigskidder.BaiZhiJun.Power.package858.Class2202;

public class Class2212 {
    private double tl;
    private double tb;
    private double ti;
    private float tw;
    private float te;
    private boolean hd;
    private Class2202 hn;

    public Class2212(double d, double d2, double d3, float f, float f2, boolean bl) {
        this.tl = d;
        this.tb = d2;
        this.ti = d3;
        this.tw = f;
        this.te = f2;
        this.hd = bl;
        this.hn = Class2202.kf;
    }

    public Class2212() {
        this.hn = Class2202.km;
    }

    public double xr() {
        return this.tl;
    }

    public double xf() {
        return this.tb;
    }

    public double xm() {
        return this.ti;
    }

    public boolean xx() {
        return this.hd;
    }

    public Class2202 xg() {
        return this.hn;
    }

    public void j(double d) {
        this.tl = d;
    }

    public void z(double d) {
        this.tb = d;
    }

    public void q(double d) {
        this.ti = d;
    }

    public void f(boolean bl) {
        this.hd = bl;
    }

    public void d(Class2202 class2202) {
        this.hn = class2202;
    }

    public float si() {
        return this.tw;
    }

    public float sw() {
        return this.te;
    }

    public void r(float f) {
        this.tw = f;
    }

    public void f(float f) {
        this.te = f;
    }

    public boolean sl() {
        return this.hn.equals((Object)Class2202.kf);
    }
}

