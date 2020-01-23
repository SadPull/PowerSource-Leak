/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.util.ArrayList;
import package3.package2.package152.Class897;

public class Class1395 {
    private Class897 rzf;
    private Class897 rzm;
    private Class897 rzg;
    private double rza;
    private double rzl;
    private double rzb;

    public Class1395(Class897 class897, Class897 class8972) {
        this.rzf = class897;
        this.rzg = class8972;
        this.v(class897, class8972);
    }

    public Class1395(Class897 class897, float f, float f2, double d) {
        this.rzf = class897;
        double d2 = Math.sin(Math.toRadians(f)) * Math.cos(Math.toRadians(f2));
        double d3 = Math.sin(Math.toRadians(f2));
        double d4 = Math.cos(Math.toRadians(f)) * Math.cos(Math.toRadians(f2));
        double d5 = d2 * d + class897.xfy;
        double d6 = d3 * d + class897.xfk;
        double d7 = d4 * d + class897.xft;
        this.rzg = new Class897(d5, d6, d7);
        this.v(this.rzf, this.rzg);
    }

    private void v(Class897 class897, Class897 class8972) {
        this.rzm = this.j(class897, class8972);
        this.rza = class8972.xfy - class897.xfy;
        this.rzl = class8972.xfk - class897.xfk;
        this.rzb = class8972.xft - class897.xft;
    }

    private Class897 j(Class897 class897, Class897 class8972) {
        double d = (class897.xfy + class897.xfk) / 2.0;
        double d2 = (class897.xfk + class8972.xfk) / 2.0;
        double d3 = (class897.xft + class8972.xft) / 2.0;
        return new Class897(d, d2, d3);
    }

    public double jfm() {
        return this.rza;
    }

    public double pfn() {
        return this.rzl;
    }

    public double jfg() {
        return this.rzb;
    }

    public Class897 jfa() {
        return this.rzf;
    }

    public double z(Class897 class897, Class897 class8972) {
        return class897.o(class8972);
    }

    public ArrayList<Class897> pv(double d) {
        int n = (int)(this.jfa().o(this.jfl()) / d) + 1;
        return this.ai(n);
    }

    private ArrayList<Class897> ai(int n) {
        ArrayList<Class897> arrayList = new ArrayList<Class897>();
        double d = this.jfm() / (double)(--n);
        double d2 = this.pfn() / (double)n;
        double d3 = this.jfg() / (double)n;
        for (int i = 0; i <= n; ++i) {
            double d4 = d * (double)i;
            double d5 = d2 * (double)i;
            double d6 = d3 * (double)i;
            arrayList.add(new Class897(this.jfa().xfy + d4, this.jfa().xfk + d5, this.jfa().xft + d6));
        }
        return arrayList;
    }

    public Class897 jfl() {
        return this.rzg;
    }
}

