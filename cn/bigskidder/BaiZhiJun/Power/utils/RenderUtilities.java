/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

public class Class166 {
    double rqq;
    double rqc;

    public Class166(double d, double d2) {
        this.rqq = d;
        this.rqc = d2;
    }

    public double xc() {
        return this.rqq;
    }

    public double se() {
        return this.rqc;
    }

    public double d(Class166 class166) {
        double d = Math.abs(this.rqq - class166.xc());
        double d2 = Math.abs(this.rqc - class166.se());
        double d3 = Math.sqrt(d * d + d2 * d2);
        return d3;
    }

    public String jmd() {
        return "(" + this.rqq + " | " + this.rqc + ")";
    }
}

