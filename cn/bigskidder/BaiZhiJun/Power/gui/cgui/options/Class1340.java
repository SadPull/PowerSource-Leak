/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package184.package2276;

import java.awt.Color;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1387;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import cn.bigskidder.BaiZhiJun.Power.package639.package638.package3206.Class140;
import package3.package2.package1.package0.Class578;

//UISlider.java
public class Class1340 {
    private int yae = 1;
    public int yld = 100;
    public boolean yln;
    private Color ylp;
    private float ylv = -1.0f;
    private int ylj;
    private int ylz;
    private String ylq;
    private double ylc;
    private double yls;
    private double ylx;

    public Class1340(String string, double d, double d2, double d3) {
        this.ylq = string;
        this.ylc = d;
        this.yls = d2;
        this.ylx = d3;
        this.ylv = -1.0f;
    }

    public Class1340(String string, double d, double d2, double d3, int n) {
        this.ylq = string;
        this.yld = n;
        this.ylc = d;
        this.yls = d2;
        this.ylx = d3;
        this.ylv = -1.0f;
    }

    public double d(float f, int n, int n2, int n3, int n4) {
        this.yae = 2;
        Class1655 class1655 = Class1652.jvv;
        String string = String.valueOf(String.valueOf(String.valueOf(this.ylq)) + " ");
        String string2 = "" + f;
        float f2 = class1655.jj(this.ylq);
        float f3 = class1655.jz(this.ylq);
        float f4 = class1655.jj(string);
        float f5 = class1655.jz(string);
        Class578.z(n3, n4, n3 + this.yld, n4 + this.yae, Class1387.rju.rjl);
        class1655.d(string, n3 + this.yae / 2, (float)(n4 + this.yae) + 2.5f, Class1387.rjs.rjl);
        class1655.d(string2, n3 + this.yld - class1655.jj(string2), (float)(n4 + this.yae) + 2.5f, Class1387.rjs.rjl);
        this.ylj = n3;
        this.ylz = n4;
        return this.n(f, n, n2, n3, n4);
    }

    public boolean jh(int n, int n2) {
        if (this.na(n, n2)) {
            this.yln = true;
        }
        return this.yln;
    }

    public void van() {
        this.yln = false;
    }

    private double n(float f, int n, int n2, int n3, int n4) {
        double d = n - n3;
        double d2 = d / (double)this.yld;
        d2 = Math.min(Math.max(0.0, d2), 1.0);
        double d3 = (this.yls - this.ylc) * d2;
        double d4 = this.ylc + d3;
        double d5 = ((double)f - this.ylc) / (this.yls - this.ylc);
        double d6 = (double)n3 + (double)this.yld * d5;
        Class578.d((float)n3, (float)n4, this.ylv == -1.0f ? (float)((int)d6) : (float)n3 + (float)this.yld * this.ylv, (float)(n4 + this.yae), Class140.jcj());
        Class578.d(this.ylv == -1.0f ? (float)((int)d6) : (float)n3 + (float)this.yld * this.ylv - 1.0f, (float)n4 - 1.0f, this.ylv == -1.0f ? (float)((int)d6 + 2) : (float)n3 + (float)this.yld * this.ylv + 1.0f, (float)(n4 + this.yae + 1), Class140.jcj());
        if (this.yln) {
            this.ylv = ((float)Math.min(Math.max(n3, n), n3 + this.yld) - (float)n3) / (float)this.yld;
            d4 = (double)Math.round(d4 * (1.0 / this.ylx)) / (1.0 / this.ylx);
            return d4;
        }
        return (double)Math.round((double)f * (1.0 / this.ylx)) / (1.0 / this.ylx);
    }

    public boolean na(int n, int n2) {
        return n >= this.ylj && n2 >= this.ylz && n <= this.ylj + this.yld && n2 < this.ylz + this.yae;
    }
}

