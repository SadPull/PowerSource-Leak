/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package185;

import java.awt.Color;
import java.util.Random;
import cn.bigskidder.BaiZhiJun.Power.package185.Class1158;
import package3.package2.package1.package0.Class578;

public class Class444 {
    private Random hee = new Random();
    public float rdd;
    public float rdn;
    public float rdp = this.hee.nextInt(2) + 1;
    private boolean rdv;
    private double rdj = 0.5;
    private double rdz = 1.0;
    public Class1158 rdq = Class1158.hel;
    public int[] rdc = new int[2];

    public Class444(int n, int n2) {
        this.rdd = n;
        this.rdn = n2;
        this.rdv = this.rdp < 2.0f;
        this.rdc[0] = n;
        this.rdc[1] = n2;
    }

    public void pd(int n, int n2, int n3) {
        Color color = new Color(255, 255, 255, 255);
        this.jtb();
        this.an(n3);
        Class578.n(this.rdd, this.rdn, this.rdp, color);
        Class578.n(this.rdd, this.rdn - 1.8f, this.rdd, this.rdn + 1.8f, color);
        Class578.n(this.rdd - 0.2f, this.rdn - 1.8f, this.rdd, this.rdn - 1.8f, color);
        Class578.n(this.rdd - 1.8f, this.rdn - 0.8f, this.rdd + 1.8f, this.rdn + 0.8f, color);
        Class578.n(this.rdd - 1.8f, this.rdn + 0.8f, this.rdd + 1.8f, this.rdn - 0.8f, color);
    }

    private void an(int n) {
        this.rdd += this.hee.nextFloat() - 0.5f;
        this.rdn = (float)((double)this.rdn + 1.2);
        if (this.rdn > (float)n) {
            this.rdn = 0.0f;
        }
    }

    private void jtb() {
        if (this.rdv) {
            this.rdp = (float)((double)this.rdp + 0.1);
            if ((double)this.rdp > this.rdj) {
                this.rdv = !this.rdv;
            }
        } else {
            this.rdp = (float)((double)this.rdp - 0.1);
            if ((double)this.rdp < this.rdz) {
                this.rdv = !this.rdv;
            }
        }
    }
}

