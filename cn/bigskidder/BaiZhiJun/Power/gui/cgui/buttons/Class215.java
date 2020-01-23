/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package184.package4340;

import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1384;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1387;
import cn.bigskidder.BaiZhiJun.Power.utils.Class161;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import cn.bigskidder.BaiZhiJun.Power.utils.package4337.Class2497;
import package3.package2.package1.package0.Class578;
import package3.package2.package152.Class421;


//UIPopUPChooseButton.java
public class Class215 {
    public float hab;
    public float hai;
    public float haw;
    public float hae;
    public float hld;
    private boolean hln;
    private boolean hlp;
    private boolean hlv;
    private Class2497 hlj = new Class2497(0);
    private double hlz;
    public String hlq;
    public String hlc;

    public Class215(String string, int n, int n2, String string2) {
        this.hlc = string;
        this.hld = 15.0f;
        this.hlq = string2;
        this.hab = n;
        this.hai = n2;
    }

    public void ng(int n, int n2) {
        this.hld = 12.0f;
        float f = Class1384.rzh * 100.0f;
        this.haw = this.haw + f < this.hld ? (this.haw = this.haw + f) : this.hld;
        this.hlz = Class1384.nl(this.hlz, this.na(n, n2) ? 1.05 : 1.0, 1.0);
        if (this.hlz < 1.0) {
            this.hlz = 1.0;
        }
        float f2 = this.hab + this.hld / 2.0f;
        float f3 = this.hai + this.hld / 2.0f;
        GL11.glPushMatrix();
        GL11.glTranslated((double)f2, (double)f3, (double)0.0);
        if (this.na(n, n2)) {
            GL11.glScaled((double)this.hlz, (double)this.hlz, (double)0.0);
        }
        GL11.glTranslated((double)(-f2), (double)(-f3), (double)0.0);
        if (this.haw > 1.0f) {
            Class578.p(this.hab, this.hai, this.haw, Class161.rci.rsk);
            if (this.na(n, n2)) {
                Class578.v(this.hab, this.hai, this.haw + 0.5f, Class1386.s(Class1387.rjv.rjl, 0.1f));
            }
            Class1384.d(new Class421(this.hlq), (int)(this.hab - this.haw / 2.0f), (int)(this.hai - this.haw / 2.0f), (int)this.haw, (int)this.haw);
        }
        GL11.glPopMatrix();
        if (this.haw == this.hld && this.na(n, n2)) {
            Class1655 class1655 = Class1652.jvu;
            int n3 = (int)(this.hab + this.hld + 5.0f);
            int n4 = (int)(this.hai - this.hld / 4.0f - 1.0f);
            Class1384.p(n3 - 2, n4 - 1, n3 + class1655.jj(this.hlc) + 2, n4 + class1655.lf() + 1, 1.0f, Class161.rci.rsk);
            class1655.d(this.hlc, n3, n4, Class161.rsd.rsk);
        }
    }

    public boolean zk(int n, int n2) {
        return this.haw == this.hld && this.hlj.jkw() && this.na(n, n2);
    }

    private boolean na(int n, int n2) {
        return (float)n >= this.hab - this.haw && (float)n <= this.hab + this.haw && (float)n2 >= this.hai - this.haw && (float)n2 <= this.hai + this.haw;
    }

    public void zc(float f) {
        this.hai = f;
    }
}

