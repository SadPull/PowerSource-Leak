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
import net.minecraft.client.package82.Class387;
import net.minecraft.client.package82.Class390;
import net.minecraft.client.package82.Class391;
import net.minecraft.client.package82.Class474;
import net.minecraft.client.package82.Class487;
import net.minecraft.client.package82.client245.Class1527;
import net.minecraft.client.package82.client245.Class1531;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client36.Class1076;
import net.minecraft.client36.Class1082;
import net.minecraft.client36.Class1100;
import net.minecraft.client52.Class614;
import net.minecraft.client52.Class891;
import net.minecraft.client59.Class1886;

public class Class132
extends Module {
    public static Value<Boolean> hzp = new Value<Boolean>("ChestESP_chest", true);
    public static Value<Boolean> hzv = new Value<Boolean>("ChestESP_enderChest", false);
    public static Value<Boolean> hzj = new Value<Boolean>("ChestESP_box", false);
    public Value<Double> hzz = new Value<Double>("ChestESP_Width", 1.5, 0.5, 5.0, 0.1);
    public Value<Double> hzq = new Value<Double>("ChestESP_box Alpha", 0.5, 0.1, 1.0, 0.1);

    public Class132() {
        super("ChestESP", Category.Render);
    }

    @EventTarget
    public void n(Class2227 class2227) {
        for (Object e : Minecraft.theWorld.nkj) {
            Class1082 class1082 = (Class1082)e;
            float f = (float)((double)class1082.xt().xl() - this.pst.ngf().jon);
            float f2 = (float)((double)class1082.xt().xb() - this.pst.ngf().jop);
            float f3 = (float)((double)class1082.xt().xi() - this.pst.ngf().jov);
            double d = f;
            double d2 = f2;
            double d3 = f3;
            double d4 = (double)f + class1082.vaq().thePlayer();
            double d5 = (double)f2 + class1082.vaq().vrd();
            double d6 = (double)f3 + class1082.vaq().vrtoggle();
            double d7 = 0.0;
            double d8 = 0.0;
            double d9 = 0.0;
            double d10 = 0.0;
            if (class1082 instanceof Class1100) {
                if (class1082 instanceof Class1100) {
                    d7 = ((Class1100)class1082).kde != null ? 1.0 : 0.0;
                    d8 = ((Class1100)class1082).kdw != null ? 0.875 : 0.0;
                    d9 = ((Class1100)class1082).kdi != null ? 1.0 : 0.0;
                    d10 = ((Class1100)class1082).knd != null ? 0.875 : 0.0;
                }
                d = (double)f + 0.0625 - d7;
                d2 = f2;
                d3 = (double)f3 + 0.0625 - d9;
                d4 = (double)f + 0.9375 - d8;
                d5 = (double)f2 + 0.875;
                d6 = (double)f3 + 0.9375 - d10;
                Class132.d(new Class614(d, d2, d3, d4, d5, d6), 255.0f, 170.0f, 0.0f, hzj.vut() != false && hzp.vut() == false ? 0.1f : this.hzq.vut().floatValue(), 255.0f, 170.0f, 0.0f, 1.0f, this.hzz.vut().floatValue(), hzj.vut(), hzp.vut());
            }
            if (!(class1082 instanceof Class1076)) continue;
            if (class1082 instanceof Class1100) {
                d7 = ((Class1100)class1082).kde != null ? 1.0 : 0.0;
                d8 = ((Class1100)class1082).kdw != null ? 0.875 : 0.0;
                d9 = ((Class1100)class1082).kdi != null ? 1.0 : 0.0;
                d10 = ((Class1100)class1082).knd != null ? 0.875 : 0.0;
            }
            d = (double)f + 0.0625 - d7;
            d2 = f2;
            d3 = (double)f3 + 0.0625 - d9;
            d4 = (double)f + 0.9375 - d8;
            d5 = (double)f2 + 0.875;
            d6 = (double)f3 + 0.9375 - d10;
            Class132.d(new Class614(d, d2, d3, d4, d5, d6), 170.0f, 0.0f, 171.0f, hzj.vut() != false && hzv.vut() == false ? 0.1f : this.hzq.vut().floatValue(), 170.0f, 0.0f, 171.0f, 1.0f, this.hzz.vut().floatValue(), hzj.vut(), hzv.vut());
        }
    }

    public static void vc(Class891 class891) {
        double d = (double)class891.xl() - Minecraft.nmk().ngf().jon;
        double d2 = (double)class891.xb() - Minecraft.nmk().ngf().jop;
        double d3 = (double)class891.xi() - Minecraft.nmk().ngf().jov;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glColor4d((double)255.0, (double)170.0, (double)0.0, (double)1.0);
        Class390.x(new Class614(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0));
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void vs(Class891 class891) {
        double d = (double)class891.xl() - Minecraft.nmk().ngf().jon;
        double d2 = (double)class891.xb() - Minecraft.nmk().ngf().jop;
        double d3 = (double)class891.xi() - Minecraft.nmk().ngf().jov;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.0f);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glColor4d((double)170.0, (double)0.0, (double)170.0, (double)1.0);
        Class390.x(new Class614(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0));
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void d(Class614 class614, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean bl, boolean bl2) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        Class487.pbz();
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        if (bl) {
            Class132.r(new Class614(class614.xas, class614.xax, class614.xao, class614.xau, class614.xay, class614.xak));
        }
        GL11.glLineWidth((float)f9);
        GL11.glColor4f((float)f5, (float)f6, (float)f7, (float)f8);
        if (bl2) {
            Class132.h(new Class614(class614.xas, class614.xax, class614.xao, class614.xau, class614.xay, class614.xak));
        }
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        Class487.pbj();
        Class391.pie();
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void h(Class614 class614) {
        Class474 class474 = Class474.pwl();
        Class387 class387 = class474.pwi();
        class387.d(3, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class474.pwb();
        class387.d(3, Class1527.jrp);
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class474.pwb();
        class387.d(1, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class474.pwb();
    }

    public static void r(Class614 class614) {
        Class474 class474 = Class474.pwl();
        Class387 class387 = class474.pwi();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class474.pwb();
    }
}

