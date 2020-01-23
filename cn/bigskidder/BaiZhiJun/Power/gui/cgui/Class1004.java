/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package184;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.Class997;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1384;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1387;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import cn.bigskidder.BaiZhiJun.Power.utils.package4337.Class2497;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1613;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package152.Class421;

//UIMenuCategory.java
public class Class1004 {
    public Class1613 rdl;
    Class997 rdb;
    private Class2497 rdi;
    public boolean rdw;
    public int rde;
    public int rnd;
    public int rnn;
    public int rnp;
    public int rnv;
    public int rnj;
    public boolean rnz = true;
    private double rnq = 0.0;

    public Class1004(Class1613 class1613, int n, int n2, int n3, int n4, Class2497 class2497) {
        this.rdl = class1613;
        this.rde = n;
        this.rnd = n2;
        this.rnn = n3;
        this.rnp = n4;
        this.rdb = new Class997(class1613, class2497);
        this.rdi = class2497;
    }

    public void ng(int n, int n2) {
        Class1815 class1815 = new Class1815(Class2556.nmk());
        Class1655 class1655 = Class1652.jvj;
        Class1655 class16552 = Class1652.jvc;
        Class1655 class16553 = Class1652.jvs;
        Class1384.p(this.rde, this.rnd, (float)(this.rde + this.rnn) + 0.5f, (float)this.rnd + 0.5f + (float)this.rnp - 2.0f, 0.0f, Class1386.s(Class1387.rjv.rjl, 0.4f));
        String string = "";
        string = String.valueOf(this.rdl.name().substring(0, 1)) + this.rdl.name().toLowerCase().substring(1, this.rdl.name().length()) + "   ";
        class1655.d(string, (float)this.rde + (float)((this.rnn - class1655.jj(string)) / 3), this.rnd + (this.rnp - class1655.lf()) / 3, Class1386.s(Class1387.rjs.rjl, 1.0f));
        double d = this.rde + this.rnn - 6;
        double d2 = this.rnd + 10;
        GL11.glPushMatrix();
        GL11.glTranslated((double)d, (double)d2, (double)0.0);
        GL11.glTranslated((double)(-d), (double)(-d2), (double)0.0);
        boolean bl = n >= this.rde + this.rnn - 15 && n <= this.rde + this.rnn - 5 && n2 >= this.rnd + 7 && n2 <= this.rnd + 17;
        boolean bl2 = bl;
        if (bl) {
            if (this.rdb.rnx) {
                class16553.d("-", (float)this.rde + (float)((this.rnn - 8 - class1655.jz(string)) / 1), this.rnd + 1 + (this.rnp - class1655.lf()) / 4, Class1386.s(Class1387.rju.rjl, 1.0f));
            } else {
                class16552.d("+", (float)this.rde + (float)((this.rnn - 8 - class1655.jz(string)) / 1), this.rnd + (this.rnp - class1655.lf()) / 4 + 2, Class1386.s(Class1387.rju.rjl, 1.0f));
            }
        } else if (this.rdb.rnx) {
            class16553.d("-", (float)this.rde + (float)((this.rnn - 8 - class1655.jz(string)) / 1), this.rnd + 1 + (this.rnp - class1655.lf()) / 4, Class1386.s(Class1387.rjs.rjl, 1.0f));
        } else {
            class16552.d("+", (float)this.rde + (float)((this.rnn - 8 - class1655.jz(string)) / 1), this.rnd + (this.rnp - class1655.lf()) / 4 + 2, Class1386.s(Class1387.rjs.rjl, 1.0f));
        }
        GL11.glPopMatrix();
        if (this.rdl == Class1613.pxc) {
            Class1384.d(new Class421("Power/ico/combat.png"), this.rde - 3, this.rnd - 1, 20, 20);
        } else if (this.rdl == Class1613.pxs) {
            Class1384.d(new Class421("Power/ico/movement.png"), this.rde - 2, this.rnd - 1, 20, 20);
        } else if (this.rdl == Class1613.pxx) {
            Class1384.d(new Class421("Power/ico/render.png"), this.rde - 2, this.rnd - 1, 20, 20);
        } else if (this.rdl == Class1613.pxo) {
            Class1384.d(new Class421("Power/ico/player.png"), this.rde - 2, this.rnd - 2, 20, 20);
        } else if (this.rdl == Class1613.pxu) {
            Class1384.d(new Class421("Power/ico/world.png"), this.rde - 2, this.rnd - 1, 20, 20);
        }
        this.jhp();
        this.rnn = class1655.jj(string) + 55;
        this.rdb.ng(n, n2);
        this.zr(n, n2);
    }

    private void zr(int n, int n2) {
        boolean bl = n >= this.rde + this.rnn - 15 && n <= this.rde + this.rnn - 5 && n2 >= this.rnd + 7 && n2 <= this.rnd + 17;
        boolean bl2 = bl;
        if (!bl && this.na(n, n2) && this.rdi.jkw()) {
            this.rnz = true;
            this.rnv = n - this.rde;
            this.rnj = n2 - this.rnd;
        }
        if (bl && this.rdi.jkw()) {
            this.rdb.rnx = !this.rdb.rnx;
            boolean bl3 = this.rdb.rnx;
        }
        if (!Mouse.isButtonDown((int)0)) {
            this.rnz = false;
        }
        if (this.rnz) {
            this.rde = n - this.rnv;
            this.rnd = n2 - this.rnj;
        }
    }

    private boolean na(int n, int n2) {
        return n >= this.rde && n <= this.rde + this.rnn && n2 >= this.rnd && n2 <= this.rnd + this.rnp;
    }

    private void jhp() {
        this.rdb.rno = this.rde;
        this.rdb.rnu = this.rnd;
        this.rdb.rnk = this.rnp;
        this.rdb.rny = this.rnn;
    }

    public void zt(int n, int n2) {
        this.rdb.zt(n, n2);
    }

    public void zh(int n, int n2) {
        this.rdb.zh(n, n2);
    }
}

