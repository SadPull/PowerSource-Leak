/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import org.lwjgl.opengl.GL11;
import client87.client86.Value;
import client87.client86.minecraft30.Class1384;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class1387;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2204;
import client87.client86.package858.Class2227;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class1815;
import net.minecraft.client.package0.Class578;
import net.minecraft.client.package0.Class960;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client52.Class1523;
import net.minecraft.client52.Class609;
import net.minecraft.client52.Class614;
import net.minecraft.client52.Class891;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.Class2342;
import net.minecraft.client59.package520.Class1789;

public class Class131
extends Module {
    public Value<Double> hvi = new Value<Double>("BlockOverlay_Blue", 255.0, 0.0, 255.0, 1.0);
    public Value<Double> hvw = new Value<Double>("BlockOverlay_Green", 255.0, 0.0, 255.0, 1.0);
    public Value<Double> hve = new Value<Double>("BlockOverlay_Red", 255.0, 0.0, 255.0, 1.0);
    public Value<Boolean> hjd = new Value<Boolean>("BlockOverlay_RenderString", true);

    public Class131() {
        super("BlockOverlay", Category.Render);
    }

    public int jch() {
        return this.hve.vut().intValue();
    }

    public int jcr() {
        return this.hvw.vut().intValue();
    }

    public int jcf() {
        return this.hvi.vut().intValue();
    }

    public boolean jcm() {
        return this.hjd.vut();
    }

    @EventTarget
    public void d(Class2204 class2204) {
        if (this.pst.vrr.xaj == Class1523.xad) {
            Class960 class960 = this.pst.vrj;
            Class891 class891 = this.pst.vrr.fu();
            Class1886 class1886 = Minecraft.theWorld.u(class891).xk();
            int n = Class1886.g(class1886);
            String string = String.valueOf(String.valueOf(class1886.vkm())) + " ID:" + n;
            String string2 = class1886.vkm();
            String string3 = " ID:" + n;
            if (this.pst.vrr != null && this.jcm()) {
                Class1815 class1815 = new Class1815(this.pst);
                int n2 = class1815.jvs() / 2 + 10;
                int n3 = class1815.jvx() / 2 + 2;
                Class578.d((float)n2, (float)n3, (float)(n2 + class960.jj(string) + 3), (float)(n3 + class960.tjk) + 0.5f, Class1386.s(Class1387.rjv.rjl, 0.7f));
                class960.v(string2, (float)n2 + 2.0f, (float)n3 + 1.25f, Class1387.rjs.rjl);
                class960.v(string3, (float)(n2 + class960.jj(string2)) + 2.0f, (float)n3 + 1.25f, Class1387.rju.rjl);
            }
        }
    }

    @EventTarget
    public void v(Class2227 class2227) {
        if (this.pst.vrr != null && this.pst.vrr.xaj == Class1523.xad) {
            Class891 class891 = this.pst.vrr.fu();
            Class1886 class1886 = Minecraft.theWorld.u(class891).xk();
            String string = class1886.vkm();
            this.pst.ngf();
            this.pst.ngf();
            double d = (double)class891.xl() - Class1543.jxf;
            this.pst.ngf();
            this.pst.ngf();
            double d2 = (double)class891.xb() - Class1543.jxm;
            this.pst.ngf();
            this.pst.ngf();
            double d3 = (double)class891.xi() - Class1543.jxg;
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)3553);
            GL11.glEnable((int)2848);
            GL11.glDisable((int)2929);
            GL11.glDepthMask((boolean)false);
            GL11.glColor4f((float)((float)this.jch() / 255.0f), (float)((float)this.jcr() / 255.0f), (float)((float)this.jcf() / 255.0f), (float)0.15f);
            double d4 = class1886 instanceof Class2342 || Class1886.g(class1886) == 134 ? 0.0 : class1886.vhi();
            double d5 = class1886 instanceof Class2342 || Class1886.g(class1886) == 134 ? 0.0 : class1886.vhe();
            double d6 = class1886 instanceof Class2342 || Class1886.g(class1886) == 134 ? 0.0 : class1886.vrn();
            Class1384.r(new Class614(d + d4, d2 + d5, d3 + d6, d + class1886.thePlayer(), d2 + class1886.vrd(), d3 + class1886.vrtoggle()));
            GL11.glColor4f((float)((float)this.jch() / 255.0f), (float)((float)this.jcr() / 255.0f), (float)((float)this.jcf() / 255.0f), (float)1.0f);
            GL11.glLineWidth((float)0.5f);
            Class1384.h(new Class614(d + d4, d2 + d5, d3 + d6, d + class1886.thePlayer(), d2 + class1886.vrd(), d3 + class1886.vrtoggle()));
            GL11.glDisable((int)2848);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2929);
            GL11.glDepthMask((boolean)true);
            GL11.glDisable((int)3042);
            GL11.glPopMatrix();
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        }
    }
}

