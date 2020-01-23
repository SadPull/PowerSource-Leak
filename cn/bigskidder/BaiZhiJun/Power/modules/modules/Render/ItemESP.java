/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;
import client87.client86.Value;
import client87.client86.minecraft30.Class1384;
import client87.client86.minecraft30.Class1386;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2204;
import client87.client86.package858.Class2227;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class578;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package82.Class391;
import net.minecraft.client.package82.Class486;
import net.minecraft.client.package82.Class487;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client.package82.package833.Class2397;
import net.minecraft.client.package82.package833.Class2537;
import net.minecraft.client52.Class409;
import net.minecraft.client52.Class614;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.client436.Class626;

public class Class149
extends Module {
    private Value hjc = new Value("ItemESP", "Mode", 0);
    private Value hjs = new Value<Double>("ItemESP_Red", 255.0, 0.0, 255.0, 5.0);
    private Value hjx = new Value<Double>("ItemESP_Green", 0.0, 0.0, 255.0, 5.0);
    private Value hjo = new Value<Double>("ItemESP_Blue", 0.0, 0.0, 255.0, 5.0);
    private Value hju = new Value<Double>("ItemESP_Alpha", 100.0, 0.0, 255.0, 5.0);
    private Class614 hjy = new Class614(-0.175, 0.0, -0.175, 0.175, 0.35, 0.175);

    public Class149() {
        super("ItemESP", Category.Render);
        this.hjc.obg.add("2DBox");
    }

    @EventTarget
    public void n(Class2227 class2227) {
        boolean bl = false;
        int n = Class578.d(System.nanoTime(), (float)bl, 1.0f).getRGB();
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glLineWidth((float)2.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)2929);
        double d = this.pst.ngf().jon;
        double d2 = this.pst.ngf().jop;
        double d3 = this.pst.ngf().jov;
        GL11.glTranslated((double)(-d), (double)(-d2), (double)(-d3));
        GL11.glColor4d((double)((Double)this.hjs.vut() / 255.0), (double)((Double)this.hjx.vut() / 255.0), (double)((Double)this.hjo.vut() / 255.0), (double)((Double)this.hju.vut() / 255.0));
        for (EntityLivingBase EntityLivingBase : Minecraft.theWorld.nkp) {
            if (!(EntityLivingBase instanceof Class626)) continue;
            GL11.glPushMatrix();
            GL11.glTranslated((double)EntityLivingBase.of, (double)EntityLivingBase.om, (double)EntityLivingBase.og);
            if (this.hjc.xm("OutlinedBox")) {
                Class1384.h(this.hjy);
            } else if (this.hjc.xm("Box")) {
                Class1384.r(this.hjy);
            } else if (this.hjc.xm("Circle")) {
                this.pst.ngf();
                Class487.x(-Class1543.jxw, 0.0f, 1.0f, 0.0f);
                Class578.v((int)this.hjy.xas, (float)((int)this.hjy.xax) + 0.25f, 0.3f, Class1386.s(new Color(((Double)this.hjs.vut()).intValue(), ((Double)this.hjx.vut()).intValue(), ((Double)this.hjo.vut()).intValue()).getRGB(), ((Double)this.hju.vut()).floatValue() / 255.0f));
            } else if (this.hjc.xm("2D")) {
                this.pst.ngf();
                Class487.x(-Class1543.jxw, 0.0f, 1.0f, 0.0f);
                Class487.f(-0.0267f, -0.0267f, 0.0267f);
                Class578.z(-10, -18, 12, -20, Class1386.s(new Color(((Double)this.hjs.vut()).intValue(), ((Double)this.hjx.vut()).intValue(), ((Double)this.hjo.vut()).intValue()).getRGB(), ((Double)this.hju.vut()).floatValue() / 255.0f));
                Class578.z(-10, 0, 12, -2, Class1386.s(new Color(((Double)this.hjs.vut()).intValue(), ((Double)this.hjx.vut()).intValue(), ((Double)this.hjo.vut()).intValue()).getRGB(), ((Double)this.hju.vut()).floatValue() / 255.0f));
                Class578.z(10, -20, 12, 0, Class1386.s(new Color(((Double)this.hjs.vut()).intValue(), ((Double)this.hjx.vut()).intValue(), ((Double)this.hjo.vut()).intValue()).getRGB(), ((Double)this.hju.vut()).floatValue() / 255.0f));
                Class578.z(-10, -20, -12, 0, Class1386.s(new Color(((Double)this.hjs.vut()).intValue(), ((Double)this.hjx.vut()).intValue(), ((Double)this.hjo.vut()).intValue()).getRGB(), ((Double)this.hju.vut()).floatValue() / 255.0f));
            }
            GL11.glPopMatrix();
        }
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)1.0f, (float)1.0f);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
    }

    @EventTarget
    public void d(Class2204 class2204) {
        if (this.hjc.xm("Shader")) {
            if (this.pst.vrf.uut) {
                this.toggle(false);
                return;
            }
            Minecraft.nmk().vrs.z(this.pst.vhf.odc, 0);
            Minecraft.nmk();
            for (Object e : Minecraft.theWorld.nkp) {
                EntityLivingBase EntityLivingBase = (EntityLivingBase)e;
                if (!(EntityLivingBase instanceof Class626)) continue;
                Minecraft.nmk().vrs.nrs();
                Class391.pie();
                Class2397 class2397 = this.pst.ngf().nm(EntityLivingBase);
                if (class2397 == null) continue;
                Class2537.jtx = false;
                class2397.d(EntityLivingBase, Class149.r(EntityLivingBase.of, EntityLivingBase.uf) - Class1543.jxf, Class149.r(EntityLivingBase.om, EntityLivingBase.um) - Class1543.jxm, Class149.r(EntityLivingBase.og, EntityLivingBase.ug) - Class1543.jxg, Minecraft.thePlayer.oi, this.pst.vhf.odc);
                Class2537.jtx = true;
            }
            Minecraft.nmk().vrs.nrs();
            Class391.pie();
            Minecraft.nmk().vrs.pia();
            Class578.z(0, 0, 0, 0, 0);
        }
    }

    public static double r(double d, double d2) {
        return d2 + (d - d2) * (double)Minecraft.nmk().vhf.odc;
    }

    public double[] pc(EntityLivingBase EntityLivingBase) {
        double d = Class149.r(EntityLivingBase.of, EntityLivingBase.uf) - Class1543.jxf;
        double d2 = Class149.r(EntityLivingBase.om, EntityLivingBase.um) - Class1543.jxm;
        double d3 = Class149.r(EntityLivingBase.og, EntityLivingBase.ug) - Class1543.jxg;
        return new double[]{d, d2, d3};
    }

    @EventTarget
    public void j(Class2227 class2227) {
        if (this.hjc.xm("2DBox")) {
            for (Object e : Minecraft.theWorld.nkp) {
                if (!(e instanceof Class626)) continue;
                Class626 class626 = (Class626)e;
                double d = class626.of;
                Minecraft.nmk().ngf();
                double d2 = d - Class1543.jxf;
                d = class626.om + 0.5;
                Minecraft.nmk().ngf();
                double d3 = d - Class1543.jxm;
                d = class626.og;
                Minecraft.nmk().ngf();
                double d4 = d - Class1543.jxg;
                double d5 = 0.5;
                GL11.glPushMatrix();
                GL11.glEnable((int)3042);
                GL11.glEnable((int)2848);
                GL11.glLineWidth((float)1.0f);
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.75f);
                GL11.glTranslated((double)d2, (double)d3, (double)d4);
                GL11.glRotated((double)(-class626.oi % 360.0f), (double)0.0, (double)1.0, (double)0.0);
                GL11.glTranslated((double)(-d2), (double)(-d3), (double)(-d4));
                GL11.glDisable((int)3553);
                GL11.glDisable((int)2929);
                GL11.glDepthMask((boolean)false);
                Class1384.h(new Class614(d2 - 0.2, d3 - 0.3, d4 - 0.2, d2 + 0.2, d3 - 0.4, d4 + 0.2));
                GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)0.15f);
                Class1384.r(new Class614(d2 - 0.2, d3 - 0.3, d4 - 0.2, d2 + 0.2, d3 - 0.4, d4 + 0.2));
                GL11.glEnable((int)3553);
                GL11.glEnable((int)2929);
                GL11.glDepthMask((boolean)true);
                GL11.glDisable((int)3042);
                GL11.glPopMatrix();
            }
        }
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.nji();
    }
}

