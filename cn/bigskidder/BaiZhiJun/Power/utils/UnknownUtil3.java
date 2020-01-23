/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import cn.bigskidder.BaiZhiJun.Power.utils.Class166;
import cn.bigskidder.BaiZhiJun.Power.utils.Class172;

public class Class173 {
    public double rqs;
    public double rqx;

    public Class173(Class172 class172, Class172 class1722) {
        double d = new Class166(class172.xc(), class172.xs()).d(new Class166(class1722.xc(), class1722.xs()));
        double d2 = class1722.se() - class172.se();
        double d3 = new Class166(0.0, 0.0).d(new Class166(d, d2));
        double d4 = d / d3;
        double d5 = -Math.toDegrees(Math.asin(d2 /= d3));
        double d6 = class1722.xc() - class172.xc();
        double d7 = class1722.xs() - class172.xs();
        double d8 = new Class166(0.0, 0.0).d(new Class166(d6, d7));
        d4 = d6 / d8;
        double d9 = Math.toDegrees(Math.asin(d7 /= d8));
        d9 -= 90.0;
        if (class172.xc() > class1722.xc()) {
            d9 *= -1.0;
        }
        this.rqs = d5;
        this.rqx = d9;
    }

    public double jyh() {
        return this.rqs;
    }

    public double jmn() {
        return this.rqx;
    }
}

