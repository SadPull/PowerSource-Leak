/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

public class Class172 {
    double rcz;
    double rcq;
    double rcc;

    public Class172(double d, double d2, double d3) {
        this.rcz = d;
        this.rcq = d2;
        this.rcc = d3;
    }

    public double xc() {
        return this.rcz;
    }

    public double se() {
        return this.rcq;
    }

    public double xs() {
        return this.rcc;
    }

    public void pz(double d) {
        this.rcz += d;
    }

    public void pq(double d) {
        this.rcq += d;
    }

    public void pc(double d) {
        this.rcc += d;
    }

    public void nb(double d, double d2, double d3) {
        this.rcq += d2;
        this.rcz += d;
        this.rcc += d3;
    }

    public double d(Class172 class172) {
        double d = Math.abs(class172.se() - this.rcq);
        double d2 = Math.abs(class172.xs() - this.rcc);
        double d3 = Math.abs(class172.xc() - this.rcz);
        double d4 = Math.sqrt(d2 * d2 + d3 * d3);
        double d5 = Math.sqrt(d * d + d4 * d4);
        return d5;
    }

    public String jmw() {
        return "(" + this.rcz + " | " + this.rcq + " | " + this.rcc + ")";
    }
}

