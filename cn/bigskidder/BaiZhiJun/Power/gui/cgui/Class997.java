/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package184;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.Value;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.package2276.Class1336;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.package2276.Class1339;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.package2276.Class1340;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1384;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1387;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import cn.bigskidder.BaiZhiJun.Power.utils.package4337.Class2497;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1609;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1611;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1613;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package0.Class578;
import package3.package2.package152.Class421;

//UIMenuMods.java
public class Class997 {
    private ArrayList<Class1611> rnc = new ArrayList();
    private Class2497 rns;
    public boolean rnx;
    public int rno;
    public int rnu;
    public int rny;
    public int rnk;
    private Class1613 rnt;
    public double rnh;
    private boolean rnr;
    private boolean rnf;
    private HashMap<Value, Class1340> rnm = new HashMap();
    private HashMap<Value, Class1336> rng = new HashMap();
    private HashMap<Value, Class1339> rna = new HashMap();
    private int rnl = 0;
    private float rnb;
    private float rni;

    public Class997(Class1613 class1613, Class2497 class2497) {
        this.rnt = class1613;
        this.rns = class2497;
        this.jhc();
        this.jhq();
        this.rnh = -(this.rnu + this.rnk + this.rnc.size() * 20 + 10);
    }

    public void ng(int n, int n2) {
        double d;
        int n3 = 248;
        if (n2 > this.rnu + 248) {
            n2 = Integer.MAX_VALUE;
        }
        Class1655 class1655 = Class1652.jvj;
        String string = "Panel" + this.rnt.name().substring(0, 1) + this.rnt.name().toLowerCase().substring(1, this.rnt.name().length());
        if (this.rnr) {
            this.rnh = this.rnu + this.rnk - 2;
        }
        if (this.rnf) {
            this.rnh = this.rnu - this.rnc.size() * 20 - this.rnl;
        }
        if (this.rnh > (double)(this.rnu + this.rnk - 2)) {
            this.rnh = this.rnu + this.rnk - 2;
        }
        if (this.rnx) {
            this.rnh = Class1384.nl(this.rnh, this.rnu + this.rnk - 2, Math.max(50.0, Math.abs(this.rnh - (double)(this.rnu + this.rnk - 2)) * 5.0));
            if (this.rnh == (double)(this.rnu + this.rnk - 2)) {
                this.rnr = true;
            }
            this.rnf = false;
        } else {
            this.rnh = Class1384.nl(this.rnh, this.rnu - this.rnc.size() * 20 - this.rnl, Math.max(1.0, Math.abs(this.rnh - (double)(this.rnu - this.rnc.size() * 20 - this.rnl) - 2.0) * 4.0));
            this.rnr = false;
            if (this.rnh == (double)(this.rnu - this.rnc.size() * 20 - this.rnl)) {
                this.rnf = true;
            }
        }
        int n4 = (int)this.rnh;
        int n5 = 20;
        Class1815 class1815 = new Class1815(Class2556.nmk());
        GL11.glPushMatrix();
        GL11.glEnable((int)3089);
        Class1384.ni(this.rno, this.rnu + this.rnk + 3, this.rny, class1815.jvx());
        float f = this.rnc.size() * 20 + n4 + this.rnl;
        Class1384.ni(this.rno, this.rnu + this.rnk - 2, this.rny, Math.min(248 - (this.rnk - 2), this.rnc.size() * 20 + this.rnl));
        GL11.glTranslated((double)0.0, (double)this.rnb, (double)0.0);
        n2 -= (int)this.rnb;
        this.rnl = 0;
        for (Class1611 class1611 : this.rnc) {
            int n6;
            double d2;
            Class578.z(this.rno, n4, this.rno + this.rny, n4 + 20, Class1386.s(Class1387.rjv.rjl, 0.7f));
            if (class1611.nji()) {
                Class578.z(this.rno, n4, this.rno + this.rny, n4 + 20, Class1386.s(Class1387.rjs.rjl, 0.45f));
            }
            boolean bl = this.rnh == (double)(this.rnu + this.rnk - 2) && n >= this.rno + this.rny - 11 && n <= this.rno + this.rny - 2 && n2 >= n4 && n2 < n4 + 20 && (float)n2 + this.rnb >= (float)(this.rnu + this.rnk);
            boolean bl2 = !bl && this.rnh == (double)(this.rnu + this.rnk - 2) && n >= this.rno && n <= this.rno + this.rny - 12 && n2 >= n4 && n2 < n4 + 20 && (float)n2 + this.rnb >= (float)(this.rnu + this.rnk);
            class1611.pse = bl2 ? Class1384.nl(class1611.pse, 0.25, 1.0) : Class1384.nl(class1611.pse, 0.09, 1.5);
            if (bl2 && this.rns.jkw()) {
                class1611.ni(!class1611.nji());
            }
            if (bl && this.rns.jkw() && class1611.njw()) {
                boolean bl3 = class1611.psb = !class1611.psb;
            }
            if (class1611.njw()) {
                class1611.psi = Class1384.nl(class1611.psi, class1611.psb ? 0 : -90, 1000.0);
                n6 = 5;
                double d3 = this.rno + this.rny - 8 + 2;
                d2 = n4 + 7 + 1 + 2;
                GL11.glPushMatrix();
                GL11.glTranslated((double)d3, (double)d2, (double)0.0);
                GL11.glRotated((double)class1611.psi, (double)0.0, (double)0.0, (double)1.0);
                GL11.glTranslated((double)(-d3), (double)(-d2), (double)0.0);
                if (bl) {
                    Class1384.d(new Class421("Power/icons/arrow_down.png"), this.rno + this.rny - 8, n4 + 7 + 1, 5, 5, new Color(0.7058824f, 0.7058824f, 0.7058824f));
                } else {
                    Class1384.d(new Class421("Power/icons/arrow_down.png"), this.rno + this.rny - 8, n4 + 7 + 1, 5, 5, new Color(255, 255, 255));
                }
                GL11.glPopMatrix();
            }
            Class578.z(this.rno, n4, this.rno + this.rny, n4 + 20, Class1386.s(Class1387.rjv.rjl, (float)class1611.pse));
            class1655.d(class1611.ce(), (float)(this.rno + (this.rny - class1655.jj(string)) / 2) - 15.0f, n4 + (20 - class1655.lf()) / 2, class1611.nji() ? Class1387.rjs.rjl : Class1387.rjs.rjl);
            if (class1611.psb) {
                n6 = n4;
                for (Value Value : Value.obb) {
                    if (!Value.vus().split("_")[0].equalsIgnoreCase(class1611.ce()) || !Value.obh) continue;
                    this.rnl += 20;
                    Class578.z(this.rno, n4 += 20, this.rno + this.rny, n4 + 20, Class1386.s(Class1387.rjv.rjl, 0.6f));
                    Class1336 class1336 = this.rng.get(Value);
                    class1336.ylf = this.rny;
                    class1336.nz(n, n2, this.rno, n4);
                }
                for (Value Value : Value.obb) {
                    if (!Value.vus().split("_")[0].equalsIgnoreCase(class1611.ce()) || !Value.obt) continue;
                    this.rnl += 20;
                    Class578.z(this.rno, n4 += 20, this.rno + this.rny, n4 + 20, Class1386.s(Class1387.rjv.rjl, 0.6f));
                    d2 = (Double)Value.vut();
                    Class1340 class1340 = this.rnm.get(Value);
                    class1340.yld = this.rny - 3;
                    double d4 = class1340.d((float)d2, n, n2, this.rno + 1, n4 + 10 - 5);
                    Value.k(d4);
                }
                for (Value Value : Value.obb) {
                    if (!Value.vus().split("_")[0].equalsIgnoreCase(class1611.ce()) || !Value.obu) continue;
                    this.rnl += 20;
                    Class578.z(this.rno, n4 += 20, this.rno + this.rny, n4 + 20, Class1386.s(Class1387.rjv.rjl, 0.5f));
                    Class1339 class1339 = this.rna.get(Value);
                    class1339.yly = this.rny;
                    class1339.nz(n, n2, this.rno, n4);
                }
                Class578.z(this.rno, n6 + 20, this.rno + this.rny, n6 + 20 + 1, Class1386.s(Class1387.rjv.rjl, 0.5f));
                Class578.z(this.rno, n4 + 20 - 1, this.rno + this.rny, n4 + 20, Class1386.s(Class1387.rjv.rjl, 0.5f));
            }
            n4 += 20;
        }
        GL11.glDisable((int)3089);
        GL11.glPopMatrix();
        if (n >= this.rno && n <= this.rno + this.rny && (float)n2 + this.rnb >= (float)this.rnu && (float)n2 + this.rnb <= (float)n4) {
            float f2 = Mouse.getDWheel();
            this.rnb += f2 / 10.0f;
        }
        if (n4 - 20 - this.rnk >= 248 && (d = (double)((float)(n4 - this.rnu) + this.rnb)) < 248.0) {
            this.rnb = 248.0f - (float)n4 + (float)this.rnu;
        }
        if (this.rnb > 0.0f || n4 - 20 - this.rnk < 248) {
            this.rnb = 0.0f;
        }
    }

    public void zt(int n, int n2) {
        n2 -= (int)this.rnb;
        for (Class1611 class1611 : this.rnc) {
            if (!class1611.psb) continue;
            for (Value Value : Value.obb) {
                Class1340 class1340;
                if (!Value.vus().split("_")[0].equalsIgnoreCase(class1611.ce()) || !Value.obt || !(class1340 = this.rnm.get(Value)).jh(n, n2)) continue;
                this.rns.hlx = true;
            }
        }
    }

    public void zh(int n, int n2) {
        for (Class1611 class1611 : this.rnc) {
            if (!class1611.psb) continue;
            for (Value Value : Value.obb) {
                if (!Value.vus().split("_")[0].equalsIgnoreCase(class1611.ce()) || !Value.obt) continue;
                Class1340 class1340 = this.rnm.get(Value);
                class1340.van();
            }
        }
    }

    private void jhv() {
        for (Class1611 class1611 : this.rnc) {
            for (Value Value : Value.obb) {
                if (!Value.vus().split("_")[0].equalsIgnoreCase(class1611.ce()) || !Value.obt) continue;
                Class1340 class1340 = new Class1340(Value.vus().split("_")[1], (Double)Value.vuo(), (Double)Value.vuy(), Value.vuu(), this.rny - 3);
                this.rnm.put(Value, class1340);
            }
        }
    }

    private void jhj() {
        int n = 20;
        for (Class1611 class1611 : this.rnc) {
            for (Value Value : Value.obb) {
                if (!Value.vus().split("_")[0].equalsIgnoreCase(class1611.ce()) || !Value.obh) continue;
                Class1336 class1336 = new Class1336(Value, this.rns, this.rny, 20);
                this.rng.put(Value, class1336);
            }
        }
    }

    private void jhz() {
        int n = 20;
        for (Class1611 class1611 : this.rnc) {
            for (Value Value : Value.obb) {
                if (!Value.vus().split("_")[0].equalsIgnoreCase(class1611.ce()) || !Value.obu) continue;
                Class1339 class1339 = new Class1339(Value, this.rns, this.rny, 20);
                this.rna.put(Value, class1339);
            }
        }
    }

    private void jhq() {
        this.jhv();
        this.jhj();
        this.jhz();
    }

    private void jhc() {
        for (Class1611 class1611 : Class1609.nzn()) {
            if (class1611.njb() != this.rnt) continue;
            this.rnc.add(class1611);
        }
    }
}

