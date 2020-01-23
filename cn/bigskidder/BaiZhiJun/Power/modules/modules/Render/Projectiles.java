/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import java.util.List;
import org.lwjgl.opengl.GL11;
import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2227;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package82.Class390;
import net.minecraft.client.package82.Class487;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client52.Class409;
import net.minecraft.client52.Class609;
import net.minecraft.client52.Class614;
import net.minecraft.client52.Class891;
import net.minecraft.client52.Class897;
import net.minecraft.client52.Class910;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.minecraft531.Class1991;
import net.minecraft.client59.package520.Class1789;
import net.minecraft.net29.Class2001;
import net.minecraft.net29.Class2052;
import net.minecraft.net29.Class2059;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.Entity;
import net.minecraft.net9.minecraft018.Class2286;
import net.minecraft.net9.net530.Class859;

public class Class148
extends Module {
    public Value<Boolean> hzc = new Value<Boolean>("Projectiles_ArrowESP", true);
    private Entity hzs;
    private Class609 hzx;
    private Class609 hzo;
    private Class614 hzu;

    public Class148() {
        super("Projectiles", Category.Render);
    }

    @EventTarget
    public void z(Class2227 class2227) {
        double d2;
        double d;
        double d3;
        double d4;
        Object object;
        int n;
        double d5;
        double d6;
        Class0 class0 = Minecraft.thePlayer;
        Class2059 class2059 = class0.nhl.wx();
        if (Minecraft.thePlayer.nhl.wx() != null && ((n = Class2001.u(Minecraft.thePlayer.vtoggle().vrw())) == 261 || n == 368 || n == 332 || n == 344)) {
            double d7 = class0.uf + (class0.of - class0.uf) * (double)this.pst.vhf.odc - Math.cos(Math.toRadians(class0.oi)) * 0.1599999964237213;
            d5 = class0.um + (class0.om - class0.um) * (double)this.pst.vhf.odc + (double)class0.nk() - 0.1;
            d = class0.ug + (class0.og - class0.ug) * (double)this.pst.vhf.odc - Math.sin(Math.toRadians(class0.oi)) * 0.1599999964237213;
            d6 = class2059.vrw() instanceof Class2052 ? 1.0f : 0.4f;
            d2 = Math.toRadians(class0.oi);
            d3 = Math.toRadians(class0.ow);
            d4 = -Math.sin(d2) * Math.cos(d3) * d6;
            double d8 = -Math.sin(d3) * d6;
            double d9 = Math.cos(d2) * Math.cos(d3) * d6;
            object = Math.sqrt(d4 * d4 + d8 * d8 + d9 * d9);
            d4 /= object;
            d8 /= object;
            d9 /= object;
            if (class2059.vrw() instanceof Class2052) {
                float f = (float)(72000 - class0.by()) / 20.0f;
                if ((f = (f * f + f * 2.0f) / 3.0f) > 1.0f) {
                    f = 1.0f;
                }
                d4 *= (double)(f *= 3.0f);
                d8 *= (double)f;
                d9 *= (double)f;
            } else {
                d4 *= 1.5;
                d8 *= 1.5;
                d9 *= 1.5;
            }
            GL11.glPushMatrix();
            GL11.glDisable((int)3553);
            GL11.glEnable((int)3042);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)2929);
            GL11.glDepthMask((boolean)false);
            GL11.glEnable((int)2848);
            GL11.glLineWidth((float)2.0f);
            double d10 = class2059.vrw() instanceof Class2052 ? 0.05 : 0.03;
            GL11.glColor4f((float)0.0f, (float)1.0f, (float)0.2f, (float)0.5f);
            GL11.glBegin((int)3);
            for (int d11 = 0; d11 < 2000; ++d11) {
                this.pst.ngf();
                this.pst.ngf();
                this.pst.ngf();
                GL11.glVertex3d((double)(d7 - Class1543.jxf), (double)(d5 - Class1543.jxm), (double)(d - Class1543.jxg));
                d8 *= 0.999;
                Class897 class897 = new Class897(class0.of, class0.om + (double)class0.nk(), class0.og);
                this.hzx = Minecraft.theWorld.n(class897, new Class897(d7 += (d4 *= 0.999) * 0.1, d5 += (d8 -= d10 * 0.1) * 0.1, d += (d9 *= 0.999) * 0.1));
                for (EntityLivingBase d12 : Minecraft.theWorld.lc()) {
                    if (!(d12 instanceof Entity) || d12 instanceof Class0) continue;
                    this.hzs = (Entity)d12;
                    Class614 d13 = this.hzs.sy().nc(0.3, 0.3, 0.3);
                    this.hzo = d13.toggle(class897, new Class897(d7, d5, d));
                    if (this.hzo != null) {
                        this.hzx = this.hzo;
                    }
                    if (this.hzo != null) {
                        GL11.glColor4f((float)1.0f, (float)0.0f, (float)0.2f, (float)0.5f);
                    }
                    if (this.hzo == null) continue;
                    this.hzx = this.hzo;
                }
                if (this.hzx != null) break;
            }
            GL11.glEnd();
            this.pst.ngf();
            double d11 = d7 - Class1543.jxf;
            this.pst.ngf();
            double d12 = d5 - Class1543.jxm;
            this.pst.ngf();
            double d13 = d - Class1543.jxg;
            GL11.glPushMatrix();
            GL11.glTranslated((double)(d11 - 0.5), (double)(d12 - 0.5), (double)(d13 - 0.5));
            switch (this.hzx.xaz.nek()) {
                case 2: 
                case 3: {
                    Class487.x(90.0f, 1.0f, 0.0f, 0.0f);
                    this.hzu = new Class614(0.0, 0.5, -1.0, 1.0, 0.45, 0.0);
                    break;
                }
                case 4: 
                case 5: {
                    Class487.x(90.0f, 0.0f, 0.0f, 1.0f);
                    this.hzu = new Class614(0.0, -0.5, 0.0, 1.0, -0.45, 1.0);
                    break;
                }
                default: {
                    this.hzu = new Class614(0.0, 0.5, 0.0, 1.0, 0.45, 1.0);
                }
            }
            this.f(this.hzu);
            Class390.x(this.hzu);
            GL11.glPopMatrix();
            GL11.glDisable((int)3042);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2929);
            GL11.glDepthMask((boolean)true);
            GL11.glDisable((int)2848);
            GL11.glPopMatrix();
        }
        if (this.hzc.vut().booleanValue()) {
            for (Object e : Minecraft.theWorld.nkp) {
                if (!(e instanceof Class2286)) continue;
                Class2286 class2286 = (Class2286)e;
                if (class2286.vim) continue;
                d5 = class2286.of;
                d = class2286.om;
                d6 = class2286.og;
                d2 = class2286.oa;
                d3 = class2286.ol;
                d4 = class2286.ob;
                Class609 class609 = null;
                boolean bl = false;
                float f = 0.05f;
                Class148.qtoggle(true);
                this.setKey(3196666);
                GL11.glLineWidth((float)2.0f);
                GL11.glBegin((int)3);
                for (int i = 0; !bl && i < 300; ++i) {
                    Class891 class891;
                    Class1886 class1886;
                    object = new Class897(d5, d, d6);
                    Class897 class897 = new Class897(d5 + d2, d + d3, d6 + d4);
                    class609 = Minecraft.theWorld.d((Class897)object, class897, false, true, false);
                    if (class609 != null) {
                        bl = true;
                    }
                    if ((class1886 = Minecraft.theWorld.u(class891 = new Class891(d5 += d2, d += d3, d6 += d4)).xk()).vhr() == Class1991.jma) {
                        d2 *= 0.6;
                        d3 *= 0.6;
                        d4 *= 0.6;
                    } else {
                        d2 *= 0.99;
                        d3 *= 0.99;
                        d4 *= 0.99;
                    }
                    d3 -= 0.05000000074505806;
                    this.pst.ngf();
                    this.pst.ngf();
                    this.pst.ngf();
                    GL11.glVertex3d((double)(d5 - Class1543.jxf), (double)(d - Class1543.jxm), (double)(d6 - Class1543.jxg));
                }
                GL11.glEnd();
                Class148.qv(true);
            }
        }
    }

    public void f(Class614 class614) {
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class614.xas, (double)class614.xax, (double)class614.xao);
        GL11.glVertex3d((double)class614.xau, (double)class614.xax, (double)class614.xao);
        GL11.glVertex3d((double)class614.xau, (double)class614.xax, (double)class614.xak);
        GL11.glVertex3d((double)class614.xas, (double)class614.xax, (double)class614.xak);
        GL11.glVertex3d((double)class614.xas, (double)class614.xay, (double)class614.xao);
        GL11.glVertex3d((double)class614.xas, (double)class614.xay, (double)class614.xak);
        GL11.glVertex3d((double)class614.xau, (double)class614.xay, (double)class614.xak);
        GL11.glVertex3d((double)class614.xau, (double)class614.xay, (double)class614.xao);
        GL11.glVertex3d((double)class614.xas, (double)class614.xax, (double)class614.xao);
        GL11.glVertex3d((double)class614.xas, (double)class614.xay, (double)class614.xao);
        GL11.glVertex3d((double)class614.xau, (double)class614.xay, (double)class614.xao);
        GL11.glVertex3d((double)class614.xau, (double)class614.xax, (double)class614.xao);
        GL11.glVertex3d((double)class614.xau, (double)class614.xax, (double)class614.xao);
        GL11.glVertex3d((double)class614.xau, (double)class614.xay, (double)class614.xao);
        GL11.glVertex3d((double)class614.xau, (double)class614.xay, (double)class614.xak);
        GL11.glVertex3d((double)class614.xau, (double)class614.xax, (double)class614.xak);
        GL11.glVertex3d((double)class614.xas, (double)class614.xax, (double)class614.xak);
        GL11.glVertex3d((double)class614.xau, (double)class614.xax, (double)class614.xak);
        GL11.glVertex3d((double)class614.xau, (double)class614.xay, (double)class614.xak);
        GL11.glVertex3d((double)class614.xas, (double)class614.xay, (double)class614.xak);
        GL11.glVertex3d((double)class614.xas, (double)class614.xax, (double)class614.xao);
        GL11.glVertex3d((double)class614.xas, (double)class614.xax, (double)class614.xak);
        GL11.glVertex3d((double)class614.xas, (double)class614.xay, (double)class614.xak);
        GL11.glVertex3d((double)class614.xas, (double)class614.xay, (double)class614.xao);
        GL11.glEnd();
    }

    public static void gn(int n) {
        float f = (float)(n >> 24 & 255) / 255.0f;
        float f2 = (float)(n >> 16 & 255) / 255.0f;
        float f3 = (float)(n >> 8 & 255) / 255.0f;
        float f4 = (float)(n & 255) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)(f == 0.0f ? 1.0f : f));
    }

    public static void qtoggle(boolean bl) {
        if (bl) {
            GL11.glDepthMask((boolean)false);
            GL11.glDisable((int)2929);
        }
        GL11.glDisable((int)3008);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glLineWidth((float)1.0f);
    }

    public static void qv(boolean bl) {
        if (bl) {
            GL11.glDepthMask((boolean)true);
            GL11.glEnable((int)2929);
        }
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glDisable((int)2848);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }
}

