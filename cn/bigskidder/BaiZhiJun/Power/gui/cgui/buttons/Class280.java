/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package184.package4340;

import java.util.ArrayList;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.Class1000;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.package4340.Class215;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1384;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import cn.bigskidder.BaiZhiJun.Power.utils.package4337.Class2487;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package152.Class409;

//UIPopUPButton.java
public class Class280 {
    private float has;
    private float hax;
    private float hao;
    private float hau;
    private float hay;
    private float hak;
    private boolean hat;
    private boolean hah;
    private boolean har;
    private Class2487 haf;
    private ArrayList<Class215> ham = new ArrayList();
    private Class215 hag = null;
    private Class1000 haa;
    private boolean hal;

    public Class280(float f, float f2, float f3, float f4) {
        this.has = f;
        this.hax = f2;
        this.hau = f3;
        this.hay = f4;
        this.hao = f4;
        this.haf = new Class2487();
        this.ham.add(new Class215("ClickGUI", (int)f + (int)f4, 0, "Client/menu_icon.png"));
        int n = (int)f2 - 60;
        for (Class215 class215 : this.ham) {
            class215.zc(n);
            n -= 40;
        }
        this.hag = this.ham.get(0);
        this.haa = new Class1000();
    }

    public void ng(int n, int n2) {
        Class1815 class1815 = new Class1815(Class2556.nmk());
        Class1655 class1655 = Class1652.jvy;
        boolean bl = this.na(n, n2) && this.hao == this.hay;
        this.hax = class1815.jvx() - 10;
        int n3 = (int)this.hax - 50;
        for (Class215 class215 : this.ham) {
            class215.zc(n3);
            n3 -= 30;
        }
        this.jki();
        GL11.glPushMatrix();
        float f = this.hao / this.hay;
        float f2 = this.has + this.hay - 0.5f;
        float f3 = (float)class1815.jvx() - this.hay - 10.0f;
        GL11.glTranslated((double)f2, (double)f3, (double)0.0);
        GL11.glScalef((float)f, (float)f, (float)f);
        GL11.glTranslated((double)(-f2), (double)(-f3), (double)0.0);
        if (this.haf.qu(Mouse.isButtonDown((int)0)) && bl) {
            this.har = true;
        }
        if (this.hao > this.hay / 2.0f) {
            // empty if block
        }
        GL11.glPopMatrix();
        int n4 = 0;
        for (Class215 class215 : this.ham) {
            if (this.hat) {
                class215.ng(n, n2);
                if (!class215.zk(n, n2)) continue;
                this.hag = class215;
                continue;
            }
            if (n4 == 0) {
                n4 = (int)(-class215.hld);
            }
            class215.haw = n4;
            n4 = (int)((float)n4 - class215.hld);
        }
        if (this.hag.hlc.equalsIgnoreCase("ClickGUI")) {
            float f4 = Class2556.nmk().vhf.odc;
            this.haa.ng(n, n2);
        }
    }

    public void d(int n, int n2, int n3) {
        if (this.hag.hlc.equalsIgnoreCase("ClickGUI")) {
            this.haa.zt(n, n2);
        }
    }

    public void jl(int n, int n2) {
        if (this.hag.hlc.equalsIgnoreCase("ClickGUI")) {
            this.haa.zh(n, n2);
        }
    }

    private void jki() {
        Class1815 class1815 = new Class1815(Class2556.nmk());
        float f = Class1384.rzh * 45.0f;
        float f2 = Class1384.rzh * 1500.0f;
        int n = class1815.jvs() + (int)((float)class1815.jvs() * 0.25f);
        if (this.hat && !this.har) {
            this.hak = this.hak + f2 > (float)n ? (float)n : (this.hak = this.hak + f2);
        } else {
            this.hal = true;
            float f3 = this.hak = this.hak <= (float)n / 1.2631578f ? 0.0f : (this.hak = this.hak - f2);
        }
        if (this.har) {
            if (this.hao - f > this.hau) {
                this.hao -= f;
            } else {
                this.hao = this.hau;
                this.har = false;
                this.hah = true;
                this.hat = !this.hat;
            }
        } else if (this.hah) {
            if (this.hao + f < this.hay) {
                this.hao += f;
            } else {
                this.hao = this.hay;
                this.hah = false;
            }
        }
    }

    private boolean na(int n, int n2) {
        return (float)n >= this.has && (float)n <= this.has + this.hay * 2.0f && (float)n2 >= this.hax - this.hay * 2.0f && (float)n2 <= this.hax;
    }
}

