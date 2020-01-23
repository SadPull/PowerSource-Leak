/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.glu.GLU
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import java.awt.Color;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.vecmath.Vector3f;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import client87.client86.Value;
import client87.client86.client85.Class1610;
import client87.client86.minecraft30.Class1384;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class1387;
import client87.client86.minecraft30.Class161;
import client87.client86.minecraft30.package5073.Class1632;
import cn.bigskidder.BaiZhiJun.Power.modules.ModuleManager;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1035;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2173;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2183;
import client87.client86.package858.Class2227;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class578;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package82.Class387;
import net.minecraft.client.package82.Class391;
import net.minecraft.client.package82.Class474;
import net.minecraft.client.package82.Class482;
import net.minecraft.client.package82.Class487;
import net.minecraft.client.package82.client245.Class1527;
import net.minecraft.client.package82.client245.Class1531;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client52.Class409;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.Entity;
import net.minecraft.net9.net530.Entity;

public class Class135
extends Module {
    public static Value<String> hzy = new Value("ESP", "Mode", 0);
    public Value<Boolean> hzk = new Value<Boolean>("ESP_Player", true);
    public Value<Boolean> hzt = new Value<Boolean>("ESP_Animals", false);
    public Value<Boolean> hzh = new Value<Boolean>("ESP_Mobs", false);
    public Value<Boolean> hzr = new Value<Boolean>("ESP_Invisibles", true);
    public Value<Boolean> hzf = new Value<Boolean>("ESP_Antibot", true);
    public static boolean hzm = false;

    public Class135() {
        super("ESP", Category.Render);
        ArrayList arrayList = new ArrayList();
        Class135.hzy.obg.add("2D");
        Class135.hzy.obg.add("Box");
        Class135.hzy.obg.add("3DBox");
        Class135.hzy.obg.add("Outline");
        Class135.hzy.obg.add("Twinkle");
    }

    @Override
    public void onEnable() {
        hzm = false;
        super.onEnable();
    }

    @EventTarget
    public void n(Class2227 class2227) {
        if (hzy.xm("2D")) {
            this.pc("2D");
            this.jca();
        }
        if (hzy.xm("Box")) {
            this.pc("Box");
            this.q(class2227);
        }
        if (hzy.xm("3DBox")) {
            this.pc("3DBox");
            this.q(class2227);
        }
        if (hzy.xm("Outline")) {
            this.pc("Outline");
            hzm = true;
        } else {
            hzm = false;
        }
        if (hzy.xm("Twinkle")) {
            this.pc("Twinkle");
            if (this.pst.vrf.uut) {
                this.toggle(false);
                Class1386.d("Options->Video Settings->Performance->Fast Render->Off", Class1610.hec);
                return;
            }
        }
    }

    private void q(Class2227 class2227) {
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        for (Object e : Minecraft.theWorld.nkp) {
            if (!(e instanceof Entity) || e == Minecraft.thePlayer) continue;
            Entity Entity = (Entity)e;
            if (((EntityLivingBase)e).cl() && !this.hzr.vut().booleanValue() || Class2183.kal.contains(Entity) && !this.hzf.vut().booleanValue()) continue;
            if (Class1632.w(Entity)) {
                Class1384.d(Entity, new Color(0, 255, 255), class2227);
                continue;
            }
            if (Class1035.l(Entity)) {
                Class1384.d(Entity, new Color(0, 255, 0), class2227);
                continue;
            }
            if (Entity.jb > 0) {
                Class1384.d(Entity, new Color(255, 0, 0), class2227);
                continue;
            }
            if (Entity.cl()) {
                Class1384.d(Entity, new Color(255, 255, 0), class2227);
                continue;
            }
            Class1384.d(Entity, new Color(255, 255, 255), class2227);
        }
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
    }

    private Color m(Entity Entity) {
        if (Entity.jb > 0) {
            return new Color(192, 57, 43);
        }
        return Entity != Class2173.kmo && Entity != Class2173.kmu ? new Color(80, 255, 150) : new Color(255, 255, 0);
    }

    private boolean g(Entity Entity) {
        return Entity instanceof Entity && Entity.getHealth() >= 0.0f && Entity != Minecraft.thePlayer;
    }

    private void jca() {
        Iterator iterator = Minecraft.theWorld.loadedEntity.iterator();
        while (iterator.hasNext()) {
            Entity Entity = (Entity)iterator.next();
            if (Entity == Minecraft.thePlayer || Entity.cl() && !this.hzr.vut().booleanValue()) continue;
            if (!this.g(Entity)) {
                return;
            }
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glDisable((int)2929);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            Class487.pbu();
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)3553);
            float f = this.pst.vhf.odc;
            this.pst.ngf();
            double d = Entity.uf + (Entity.of - Entity.uf) * (double)f - Class1543.jxf;
            this.pst.ngf();
            double d2 = Entity.um + (Entity.om - Entity.um) * (double)f - Class1543.jxm;
            this.pst.ngf();
            double d3 = Entity.ug + (Entity.og - Entity.ug) * (double)f - Class1543.jxg;
            float f2 = Minecraft.thePlayer.u(Entity);
            float f3 = Math.min(f2 * 0.15f, 2.5f);
            float f4 = 0.035f;
            Class487.m((float)d, (float)d2 + Entity.uu + 0.5f - (Entity.nz() ? Entity.uu / 2.0f : 0.0f), (float)d3);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            this.pst.ngf();
            Class487.x(-Class1543.jxw, 0.0f, 1.0f, 0.0f);
            GL11.glScalef((float)(-(f4 /= 2.0f)), (float)(-f4), (float)(-f4));
            Class474 class474 = Class474.pwl();
            Class387 class387 = class474.pwi();
            Color color = new Color(Class161.rsn.rsk);
            if (Entity.jb > 0) {
                color = new Color(255, 0, 0);
            } else if (Class1035.l(Entity)) {
                color = new Color(0, 255, 0);
            } else if (Entity.cl()) {
                color = new Color(255, 255, 0);
            } else if (Class2183.kaa.contains(Entity)) {
                color = new Color(40, 40, 40);
            } else if (Entity == Class2173.kmo && ModuleManager.px("onEnablellAura").nji()) {
                color = new Color(0, 0, 255);
            }
            Color color2 = new Color(0, 0, 0);
            double d4 = 8.0f + f2 * 0.08f;
            double d5 = -35.0;
            double d6 = 35.0;
            double d7 = 15.0;
            double d8 = 140.0;
            double d9 = 20.0;
            Class135.d(d5 + d9 / 2.0 - 4.2, d7 - 1.0, d9 - 9.2, d4, color2);
            this.n(d5 + 1.0 - 2.0, d7 - 15.0 + d9, d9 - 11.0, d4, color2);
            Class135.d(d5 + d9 / 3.0, d7, d9 / 2.0, d4, color);
            this.n(d5, d7 - 15.0 + d9, d9 - 11.0, d4, color);
            Class135.d(d6 - d9 / 2.0 + 4.2, d7 - 1.0, d9 - 9.2, d4, color2);
            this.n(d6 + 1.0, d7 - 15.0 + d9, d9 - 11.0, d4, color2);
            Class135.d(d6 - d9 / 3.0, d7, d9 / 2.0, d4, color);
            this.n(d6, d7 - 15.0 + d9, d9 - 11.0, d4, color);
            Class135.d(d5 + d9 / 2.0 + -4.2, d8 + 1.0, d9 - 9.2, d4, color2);
            this.n(d5 + 1.0 - 2.0, d8 + 15.0 - d9, d9 - 11.0, d4, color2);
            Class135.d(d5 + d9 / 3.0, d8, d9 / 2.0, d4, color);
            this.n(d5, d8 + 15.0 - d9, d9 - 11.0, d4, color);
            Class135.d(d6 - d9 / 2.0 + 4.2, d8 + 1.0, d9 - 9.2, d4, color2);
            this.n(d6 + 1.0, d8 + 15.0 - d9, d9 - 11.0, d4, color2);
            Class135.d(d6 - d9 / 3.0, d8, d9 / 2.0, d4, color);
            this.n(d6, d8 + 15.0 - d9, d9 - 11.0, d4, color);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2929);
            Class487.pbo();
            GL11.glDisable((int)3042);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glNormal3f((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
        return;
    }

    private Vector3f ntoggle(float f, float f2, float f3) {
        FloatBuffer floatBuffer = Class482.oa(3);
        IntBuffer intBuffer = Class482.og(16);
        FloatBuffer floatBuffer2 = Class482.oa(16);
        FloatBuffer floatBuffer3 = Class482.oa(16);
        floatBuffer.clear();
        floatBuffer2.clear();
        floatBuffer3.clear();
        intBuffer.clear();
        GL11.glGetFloat((int)2982, (FloatBuffer)floatBuffer2);
        GL11.glGetFloat((int)2983, (FloatBuffer)floatBuffer3);
        GL11.glGetInteger((int)2978, (IntBuffer)intBuffer);
        boolean bl = GLU.gluProject((float)f, (float)f2, (float)f3, (FloatBuffer)floatBuffer2, (FloatBuffer)floatBuffer3, (IntBuffer)intBuffer, (FloatBuffer)floatBuffer);
        if (bl) {
            return new Vector3f(floatBuffer.get(0) / 2.0f, floatBuffer.get(1) / 2.0f, floatBuffer.get(2));
        }
        return null;
    }

    private static void d(double d, double d2, double d3, double d4, Color color) {
        Class474 class474 = Class474.pwl();
        Class387 class387 = class474.pwi();
        class387.d(7, Class1527.jrv);
        class387.a(d - d3, d2 - d4 / 2.0, 0.0).c((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).paf();
        class387.a(d - d3, d2 + d4 / 2.0, 0.0).c((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).paf();
        class387.a(d + d3, d2 + d4 / 2.0, 0.0).c((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).paf();
        class387.a(d + d3, d2 - d4 / 2.0, 0.0).c((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).paf();
        class474.pwb();
    }

    private void n(double d, double d2, double d3, double d4, Color color) {
        Class474 class474 = Class474.pwl();
        Class387 class387 = class474.pwi();
        class387.d(7, Class1527.jrv);
        class387.a(d - d4 / 2.0, d2 - d3, 0.0).c((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).paf();
        class387.a(d - d4 / 2.0, d2 + d3, 0.0).c((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).paf();
        class387.a(d + d4 / 2.0, d2 + d3, 0.0).c((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).paf();
        class387.a(d + d4 / 2.0, d2 - d3, 0.0).c((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f).paf();
        class474.pwb();
    }

    private void jcl() {
        Iterator iterator = Minecraft.theWorld.loadedEntity.iterator();
        while (iterator.hasNext()) {
            Entity Entity = (Entity)iterator.next();
            if (Entity == Minecraft.thePlayer) continue;
            if (!Entity.cl() || !this.hzr.vut().booleanValue()) {
                // empty if block
            }
            if (!this.g(Entity)) continue;
            GL11.glPushMatrix();
            GL11.glEnable((int)3042);
            GL11.glDisable((int)2929);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            Class487.pbu();
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glDisable((int)3553);
            float f = this.pst.vhf.odc;
            this.pst.ngf();
            double d = Entity.uf + (Entity.of - Entity.uf) * (double)f - Class1543.jxf;
            this.pst.ngf();
            double d2 = Entity.um + (Entity.om - Entity.um) * (double)f - Class1543.jxm;
            this.pst.ngf();
            double d3 = Entity.ug + (Entity.og - Entity.ug) * (double)f - Class1543.jxg;
            float f2 = Minecraft.thePlayer.u(Entity);
            float f3 = Math.min(f2 * 0.15f, 0.15f);
            float f4 = 0.035f;
            float f5 = (float)d;
            float f6 = (float)d2 + Entity.uu + 0.5f - (Entity.nz() ? Entity.uu / 2.0f : 0.0f);
            float f7 = (float)d3;
            Class487.m((float)d, (float)d2 + Entity.uu + 0.5f - (Entity.nz() ? Entity.uu / 2.0f : 0.0f), (float)d3);
            GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
            this.pst.ngf();
            Class487.x(-Class1543.jxw, 0.0f, 1.0f, 0.0f);
            GL11.glScalef((float)(-(f4 /= 2.0f)), (float)(-f4), (float)(-f4));
            Class474 class474 = Class474.pwl();
            Class387 class387 = class474.pwi();
            new java.awt.Color(0, 0, 0);
            double d4 = 1.5;
            double d5 = -30.0;
            double d6 = 30.0;
            double d7 = 15.0;
            double d8 = 140.0;
            double d9 = 10.0;
            Color color = new Color(255, 255, 255);
            if (Entity.jb > 0) {
                color = new Color(255, 0, 0);
            } else if (Class1035.l(Entity)) {
                color = new Color(0, 255, 0);
            } else if (Entity.cl()) {
                color = new Color(255, 255, 0);
            } else if (Class2183.kaa.contains(Entity)) {
                color = new Color(100, 100, 100);
            } else if (Entity == Class2173.kmo && ModuleManager.px("onEnablellAura").nji()) {
                color = new Color(0, 0, 255);
            }
            Class391.d((float)d5, (float)d7, (float)d6, (float)d8, (float)d4 + 3.0f, Class1387.rjv.rjl, 0);
            Class391.d((float)d5, (float)d7, (float)d6, (float)d8, (float)d4 + 1.0f, color.getRGB(), 0);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2929);
            Class487.pbo();
            GL11.glDisable((int)3042);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glNormal3f((float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glPopMatrix();
        }
        return;
    }

    private void d(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        double d6 = 0.0;
        if (d5 < 1.0) {
            d6 = 1.0;
        }
        Class578.d(d + d5, d2 + d5, d3 - d5, d4 - d5, n);
        Class578.d(d, d2 + 1.0 - d6, d + d5, d4, n2);
        Class578.d(d, d2, d3 - 1.0 + d6, d2 + d5, n2);
        Class578.d(d3 - d5, d2, d3, d4 - 1.0 + d6, n2);
        Class578.d(d + 1.0 - d6, d4 - d5, d3, d4, n2);
    }

    public Minecraft jcb() {
        return Minecraft.nmk();
    }

    public static void d(float f, float f2, float f3, float f4, float f5, int n, int n2) {
        Class135.d(f, f2, f3, f4, n2);
        float f6 = (float)(n >> 24 & 255) / 255.0f;
        float f7 = (float)(n >> 16 & 255) / 255.0f;
        float f8 = (float)(n >> 8 & 255) / 255.0f;
        float f9 = (float)(n & 255) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)f7, (float)f8, (float)f9, (float)f6);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    public static void d(float f, float f2, float f3, float f4, int n) {
        float f5 = (float)(n >> 24 & 255) / 255.0f;
        float f6 = (float)(n >> 16 & 255) / 255.0f;
        float f7 = (float)(n >> 8 & 255) / 255.0f;
        float f8 = (float)(n & 255) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    public void jci() {
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
    }

    public void jcw() {
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glColor3d((double)1.0, (double)1.0, (double)1.0);
    }
}

