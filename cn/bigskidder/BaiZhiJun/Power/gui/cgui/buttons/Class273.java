/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package184.package4340;

import java.awt.Color;
import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1384;
import cn.bigskidder.BaiZhiJun.Power.utils.package2993.Class964;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class584;
import package3.package2.package1.package33.Class2429;
import package3.package2.package1.package33.Class2432;
import package3.package2.package1.package33.Class2437;
import package3.package2.package1.package82.Class487;
import package3.package2.package152.Class415;
import package3.package2.package152.Class421;


//UIFlatButton.java
public class Class273
extends Class584 {
    private Class964 hge = new Class964();
    public String had;
    public int han;
    public boolean hap;
    public boolean hav;
    protected boolean haj;
    private int haz;
    private float haq;
    private Class1655 hac;

    public Class273(int n, int n2, int n3, int n4, int n5, String string, int n6) {
        super(n, n2, n3, 10, 12, string);
        this.keb = n4;
        this.kei = n5;
        this.hap = true;
        this.hav = true;
        this.han = n;
        this.kew = n2;
        this.kee = n3;
        this.had = string;
        this.haz = n6;
        this.hac = Class1652.jvz;
    }

    public Class273(int n, int n2, int n3, int n4, int n5, String string, int n6, Class1655 class1655) {
        super(n, n2, n3, 10, 12, string);
        this.keb = n4;
        this.kei = n5;
        this.hap = true;
        this.hav = true;
        this.han = n;
        this.kew = n2;
        this.kee = n3;
        this.had = string;
        this.haz = n6;
        this.hac = class1655;
    }

    @Override
    protected int zo(boolean bl) {
        int n = 1;
        if (!this.hap) {
            n = 0;
        } else if (bl) {
            n = 2;
        }
        return n;
    }

    @Override
    public void d(Class2556 class2556, int n, int n2) {
        if (this.hav) {
            Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
            this.haj = n >= this.kew && n2 >= this.kee && n < this.kew + this.keb && n2 < this.kee + this.kei;
            int n3 = this.zo(this.haj);
            Class487.pbu();
            Class487.f(770, 771, 1, 0);
            Class487.vz(770, 771);
            if (!this.haj) {
                this.hge.npr();
                this.haq = 0.0f;
            }
            if (this.haj) {
                this.haq += 0.5f;
                if (this.haq > 1.0f) {
                    this.haq = 1.0f;
                }
            }
            float f = (float)this.kei / 2.0f;
            Class1384.p((float)this.kew - this.haq * 0.1f, (float)this.kee - this.haq, (float)(this.kew + this.keb) + this.haq * 0.1f, (float)this.kee + f * 2.0f + this.haq, 1.0f, this.haz);
            GL11.glColor3f((float)2.55f, (float)2.55f, (float)2.55f);
            this.n(class2556, n, n2);
            GL11.glPushMatrix();
            GL11.glPushAttrib((int)1048575);
            GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
            int n4 = -1;
            float f2 = this.hac.jz(Class415.xq(this.had));
            this.hac.p(this.had, this.kew + this.keb / 2, (float)this.kee + (float)(this.kei - this.hac.lf()) / 2.0f, this.haj ? -1 : -3487030);
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }
    }

    private Color d(Color color, int n) {
        int n2 = color.getRed();
        int n3 = color.getBlue();
        int n4 = color.getGreen();
        if (n2 >= n) {
            n2 -= n;
        }
        if (n3 >= n) {
            n3 -= n;
        }
        if (n4 >= n) {
            n4 -= n;
        }
        return color.darker();
    }

    @Override
    protected void n(Class2556 class2556, int n, int n2) {
    }

    @Override
    public void jl(int n, int n2) {
    }

    @Override
    public boolean p(Class2556 class2556, int n, int n2) {
        return this.hap && this.hav && n >= this.kew && n2 >= this.kee && n < this.kew + this.keb && n2 < this.kee + this.kei;
    }

    @Override
    public boolean jdu() {
        return this.haj;
    }

    @Override
    public void d(int n, int n2) {
    }

    @Override
    public void d(Class2429 class2429) {
        class2429.d(Class2437.d(new Class421("gui.button.press"), 1.0f));
    }

    @Override
    public int jdy() {
        return this.keb;
    }

    @Override
    public void fn(int n) {
        this.keb = n;
    }
}

