/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import cn.bigskidder.BaiZhiJun.Power.utils.Class1381;

public class Class1397 {
    public int rzx;
    public int rzo;
    public int rzu;
    public int rzy;

    public Class1397(int n, int n2, int n3, int n4) {
        this.rzx = n;
        this.rzo = n2;
        this.rzu = n3;
        this.rzy = n4;
    }

    public int jch() {
        return this.rzx;
    }

    public int jcr() {
        return this.rzo;
    }

    public int jcf() {
        return this.rzu;
    }

    public int jfu() {
        return this.rzy;
    }

    public void ar(int n) {
        this.rzx = n;
    }

    public void af(int n) {
        this.rzo = n;
    }

    public void am(int n) {
        this.rzu = n;
    }

    public void ag(int n) {
        this.rzy = n;
    }

    public int jfy() {
        return Class1381.y(this.rzx, this.rzo, this.rzu, this.rzy);
    }

    public void nb(int n, int n2, int n3, int n4) {
        this.rzx = n;
        this.rzo = n2;
        this.rzu = n3;
        this.rzy = n4;
    }
}

