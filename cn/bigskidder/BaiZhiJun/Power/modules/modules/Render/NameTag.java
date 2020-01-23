/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;
import client87.client86.Value;
import client87.client86.minecraft30.Class1388;
import client87.client86.minecraft30.Class159;
import client87.client86.minecraft30.package5073.Class1632;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1035;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1047;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2183;
import client87.client86.package858.Class2227;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class1815;
import net.minecraft.client.package0.Class960;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package82.Class391;
import net.minecraft.client.package82.Class487;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client.package82.package833.Class2537;
import net.minecraft.client52.Class398;
import net.minecraft.client52.Class409;
import net.minecraft.minecraft311.Class1368;
import net.minecraft.net29.Class2001;
import net.minecraft.net29.Class2002;
import net.minecraft.net29.Class2052;
import net.minecraft.net29.Class2059;
import net.minecraft.net29.Class2070;
import net.minecraft.net29.Class2099;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.net530.Entity;
import net.minecraft.net9.net530.Class859;
import net.minecraft.net96.Class2078;
import net.minecraft.package4.Class31;
import net.minecraft.package4.Class61;

public class Class127
extends Module {
    public Value<Boolean> hjb = new Value<Boolean>("NameTag_Armor", true);
    public Value<Boolean> hji = new Value<Boolean>("NameTag_Health", true);
    public Value<Boolean> hjw = new Value<Boolean>("NameTag_Antibot", false);
    public Value<Boolean> hje = new Value<Boolean>("NameTag_Dis", false);
    public Value<Boolean> hzd = new Value<Boolean>("NameTag_Invisibles", true);
    private Value<Double> hzn = new Value<Double>("NameTag_Size", 1.0, 1.0, 5.0, 0.1);

    public Class127() {
        super("NameTag", Category.Render);
    }

    @EventTarget
    public void n(Class2227 class2227) {
        for (Object e : Minecraft.theWorld.loadedEntity) {
            Entity Entity = (Entity)e;
            if (Entity == Minecraft.thePlayer || !Entity.ph() || ((EntityLivingBase)e).cl() && !this.hzd.vut().booleanValue() || Class2183.kaa.contains(e) && !this.hjw.vut().booleanValue() || Class2183.kal.contains(e) && !this.hjw.vut().booleanValue()) continue;
            double d = Entity.uf + (Entity.of - Entity.uf) * (double)this.pst.vhf.odc - Class1543.jxf;
            double d2 = Entity.um + (Entity.om - Entity.um) * (double)this.pst.vhf.odc - Class1543.jxm;
            double d3 = Entity.ug + (Entity.og - Entity.ug) * (double)this.pst.vhf.odc - Class1543.jxg;
            this.d(Entity, Entity.getName(), d, d2, d3);
        }
    }

    private void d(Entity Entity, String string, double d, double d2, double d3) {
        Class1815 class1815 = new Class1815(this.pst);
        Class960 class960 = this.pst.vrj;
        float f = Minecraft.thePlayer.u(Entity) / 6.0f;
        if (f < 1.1f) {
            f = 1.1f;
        }
        d2 += Entity.cg() ? 0.5 : 0.7;
        float f2 = (float)((double)f * this.hzn.vut());
        f2 /= 100.0f;
        string = Entity.no().vqb();
        String string2 = "";
        string2 = Class2183.kaa.contains(Entity) ? "\u00a78[BOT]" : "";
        string2 = Class1047.ef.contains(Entity.getName()) ? "\u00a74[Hanabi]" : "";
        string2 = Class1047.er.contains(Entity.getName()) ? "\u00a74[Hanabi]" : "";
        string2 = Class2183.kal.contains(Entity) ? "\u00a78[BOT]" : "";
        String string3 = "";
        string3 = Class1035.l(Entity) ? "\u00a7a[Team]" : "";
        String string4 = "";
        if (Class1632.w(Entity)) {
            string4 = "\u00a73[F]";
        }
        String string5 = String.valueOf(string3) + string2 + string4 + string;
        double d4 = Entity.getHealth();
        BigDecimal bigDecimal = new BigDecimal(Entity.getHealth());
        double d5 = (bigDecimal = bigDecimal.setScale(1, RoundingMode.HALF_UP)).doubleValue();
        String string6 = d5 > 20.0 ? " \u00a7b" : (d5 >= 10.0 ? " \u00a7a" : (d5 >= 3.0 ? " \u00a7e" : " \u00a74"));
        String string7 = "";
        string7 = this.hji.vut() != false ? String.valueOf(string6) + String.valueOf(d5) : "";
        String string8 = "";
        string8 = this.hje.vut() != false ? "\u00a7a[\u00a76" + (int)Entity.u(Minecraft.thePlayer) + "\u00a7a]\u00a7r" : "";
        GL11.glPushMatrix();
        GL11.glTranslatef((float)((float)d), (float)((float)d2 + 1.4f), (float)((float)d3));
        GL11.glNormal3f((float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)(-Class1543.jxw), (float)0.0f, (float)1.0f, (float)0.0f);
        GL11.glRotatef((float)Class1543.jxe, (float)1.0f, (float)0.0f, (float)0.0f);
        GL11.glScalef((float)(-f2), (float)(-f2), (float)f2);
        Class159.y(2896, false);
        Class159.y(2929, false);
        int n = class1815.jvx() / 2;
        int n2 = class1815.jvx() / 2;
        Class159.y(3042, true);
        GL11.glBlendFunc((int)770, (int)771);
        String string9 = String.valueOf(string8) + string5 + string7 + " ";
        int n3 = (int)((float)class960.jj(string9) / 2.0f);
        Class1388.toggle((float)(-n3) - 1.0f, -15.0, n3, -4.0, new Color(0, 0, 0, 120).getRGB());
        class960.v(string9, (float)(-class960.jj(string9)) / 2.0f + 2.0f, class960.tjk - 22, 16777215);
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glScaled((double)0.6000000238418579, (double)0.6000000238418579, (double)0.6000000238418579);
        GL11.glScaled((double)1.0, (double)1.0, (double)1.0);
        int n4 = new Color(188, 0, 0).getRGB();
        if (Entity.getHealth() > 20.0f) {
            n4 = -65292;
        }
        GL11.glPushMatrix();
        GL11.glScaled((double)1.5, (double)1.5, (double)1.5);
        if (this.hjb.vut().booleanValue()) {
            Class2059 class2059;
            int n5 = 0;
            Class2059[] arrclass2059 = Entity.nhl.getNetworkManager;
            int n6 = arrclass2059.length;
            for (int i = 0; i < n6; ++i) {
                class2059 = arrclass2059[i];
                if (class2059 == null) continue;
                n5 -= 11;
            }
            if (Entity.vtoggle() != null) {
                n5 -= 8;
                class2059 = Entity.vtoggle().vmd();
                if (class2059.vmc() && (class2059.vrw() instanceof Class2099 || class2059.vrw() instanceof Class2002)) {
                    class2059.yhq = 1;
                }
                this.z(class2059, n5, -37);
                n5 += 20;
            }
            for (Class2059 class20592 : Entity.nhl.getNetworkManager) {
                if (class20592 == null) continue;
                Class2059 class20593 = class20592.vmd();
                if (class20593.vmc() && (class20593.vrw() instanceof Class2099 || class20593.vrw() instanceof Class2002)) {
                    class20593.yhq = 1;
                }
                this.z(class20593, n5, -36);
                n5 += 20;
            }
        }
        GL11.glPopMatrix();
        Class159.jmtoggle();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPopMatrix();
    }

    public void z(Class2059 class2059, int n, int n2) {
        ArrayList arrayList = new ArrayList();
        Class487.pbe();
        Class487.jt(true);
        Class391.pwd();
        this.pst.ngm().jto = -150.0f;
        Class487.pbs();
        Class487.pbu();
        Class487.pbv();
        Class487.pbj();
        Class487.pbx();
        Class487.pbs();
        this.pst.ngm().toggle(class2059, n, n2);
        this.pst.ngm().d(this.pst.vrj, class2059, n, n2);
        this.pst.ngm().jto = 0.0f;
        Class391.pie();
        Class487.pbv();
        Class487.pbo();
        Class487.pbz();
        Class487.i(0.5, 0.5, 0.5);
        Class487.pbs();
        this.q(class2059, n, n2 - 17);
        Class487.pbx();
        Class487.f(2.0f, 2.0f, 2.0f);
        Class487.pid();
    }

    public static void d(float f, float f2, float f3, float f4, float f5, int n, int n2) {
        Class127.d(f, f2, f3, f4, n2);
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

    private void q(Class2059 class2059, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = n2 - 24;
        if (class2059.vmj() != null && class2059.vmj().nws() >= 6) {
            this.pst.vrj.v("god", n * 2, n7, 16711680);
            return;
        }
        if (class2059.vrw() instanceof Class2002) {
            n6 = Class31.q(Class61.hby.hiu, class2059);
            n4 = Class31.q(Class61.hbr.hiu, class2059);
            n5 = Class31.q(Class61.hbh.hiu, class2059);
            n3 = Class31.q(Class61.hbk.hiu, class2059);
            int n8 = Class31.q(Class61.hbg.hiu, class2059);
            int n9 = Class31.q(Class61.hiv.hiu, class2059);
            if (class2059.vrw() instanceof Class2002) {
                int n10 = class2059.vfe() - class2059.vfw();
            }
            if (n6 > 0) {
                this.pst.vrj.v("pr" + n6, n * 2, n7, 52479);
                n7 += 8;
            }
            if (n4 > 0) {
                this.pst.vrj.v("pp" + n4, n * 2, n7, 52479);
                n7 += 8;
            }
            if (n5 > 0) {
                this.pst.vrj.v("bp" + n5, n * 2, n7, 52479);
                n7 += 8;
            }
            if (n3 > 0) {
                this.pst.vrj.v("fp" + n3, n * 2, n7, 52479);
                n7 += 8;
            }
            if (n8 > 0) {
                this.pst.vrj.v("t" + n8, n * 2, n7, 52479);
                n7 += 8;
            }
            if (n9 > 0) {
                this.pst.vrj.v("u" + n9, n * 2, n7, 52479);
                n7 += 8;
            }
        }
        if (class2059.vrw() instanceof Class2052) {
            n6 = Class31.q(Class61.hiz.hiu, class2059);
            n4 = Class31.q(Class61.hiq.hiu, class2059);
            n5 = Class31.q(Class61.hic.hiu, class2059);
            n3 = Class31.q(Class61.hiv.hiu, class2059);
            if (n6 > 0) {
                this.pst.vrj.v("po" + n6, n * 2, n7, 65535);
                n7 += 8;
            }
            if (n4 > 0) {
                this.pst.vrj.v("pu" + n4, n * 2, n7, 65535);
                n7 += 8;
            }
            if (n5 > 0) {
                this.pst.vrj.v("f" + n5, n * 2, n7, 65535);
                n7 += 8;
            }
            if (n3 > 0) {
                this.pst.vrj.v("u" + n3, n * 2, n7, 65535);
                n7 += 8;
            }
        }
        if (class2059.vrw() instanceof Class2070) {
            n6 = Class31.q(Class61.hbl.hiu, class2059);
            n4 = Class31.q(Class61.hbw.hiu, class2059);
            n5 = Class31.q(Class61.hbe.hiu, class2059);
            n3 = Class31.q(Class61.hiv.hiu, class2059);
            if (n6 > 0) {
                this.pst.vrj.v("sh" + n6, n * 2, n7, 65535);
                n7 += 8;
            }
            if (n4 > 0) {
                this.pst.vrj.v("kn" + n4, n * 2, n7, 65535);
                n7 += 8;
            }
            if (n5 > 0) {
                this.pst.vrj.v("f" + n5, n * 2, n7, 65535);
                n7 += 8;
            }
            if (n3 > 0) {
                this.pst.vrj.v("ub" + n3, n * 2, n7, 65535);
            }
        }
        if (class2059.vrw() instanceof Class2099) {
            n6 = Class31.q(Class61.hiv.hiu, class2059);
            n4 = Class31.q(Class61.hin.hiu, class2059);
            n5 = Class31.q(Class61.hij.hiu, class2059);
            n3 = Class31.q(Class61.hip.hiu, class2059);
            if (n4 > 0) {
                this.pst.vrj.v("eff" + n4, n * 2, n7, 65535);
                n7 += 8;
            }
            if (n5 > 0) {
                this.pst.vrj.v("fo" + n5, n * 2, n7, 65535);
                n7 += 8;
            }
            if (n3 > 0) {
                this.pst.vrj.v("st" + n3, n * 2, n7, 65535);
                n7 += 8;
            }
            if (n6 > 0) {
                this.pst.vrj.v("ub" + n6, n * 2, n7, 65535);
            }
        }
        if (class2059.vrw() == Class2078.oyc && class2059.vmc()) {
            this.pst.vrj.v("god", n * 2, n7, 52479);
        }
    }
}

