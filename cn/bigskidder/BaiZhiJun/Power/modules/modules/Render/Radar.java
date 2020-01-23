/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import java.awt.Color;
import java.util.List;
import org.lwjgl.input.Mouse;
import client87.client86.Value;
import client87.client86.minecraft30.Class138;
import client87.client86.minecraft30.Class1381;
import client87.client86.minecraft30.Class1384;
import client87.client86.minecraft30.Class1400;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1035;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2183;
import client87.client86.package858.Class2204;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class1815;
import net.minecraft.client.package0.Class1821;
import net.minecraft.client.package0.Class970;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class409;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.net530.Entity;

public class Class154
extends Module {
    private boolean hjn;
    float hjp;
    private Value<Double> hjv = new Value<Double>("Radar_Scale", 2.0, 1.0, 5.0, 0.1);
    private Value<Double> hjj = new Value<Double>("Radar_X", 500.0, 1.0, 1920.0, 5.0);
    private Value<Double> hjz = new Value<Double>("Radar_Y", 2.0, 1.0, 1080.0, 5.0);
    private Value<Double> hjq = new Value<Double>("Radar_Size", 125.0, 50.0, 500.0, 5.0);

    public Class154() {
        super("Radar", Category.Render);
    }

    @EventTarget
    public void z(Class2204 class2204) {
        if (!this.pst.vrf.uxo) {
            Class1815 class1815 = new Class1815(this.pst);
            int n = this.hjq.vut().intValue();
            float f = this.hjj.vut().floatValue();
            float f2 = this.hjz.vut().floatValue();
            float f3 = (float)Minecraft.thePlayer.of;
            float f4 = (float)Minecraft.thePlayer.og;
            int n2 = class1815.jvs();
            int n3 = class1815.jvx();
            int n4 = Mouse.getX() * n2 / this.pst.vht;
            int n5 = n3 - Mouse.getY() * n3 / this.pst.vhh - 1;
            if ((float)n4 >= f && (float)n4 <= f + (float)n && (float)n5 >= f2 - 3.0f && (float)n5 <= f2 + 10.0f && Mouse.getEventButton() == 0) {
                this.hjn = !this.hjn;
                boolean bl = this.hjn;
            }
            if (this.hjn && this.pst.vrq instanceof Class1821) {
                Object object = Class138.z(Double.toString(n4 - n / 2), 5);
                this.hjj.k((Double)object);
                Object object2 = Class138.z(Double.toString(n5 - 2), 5);
                this.hjz.k((Double)object2);
            } else {
                this.hjn = false;
            }
            if (this.hjp > 255.0f) {
                this.hjp = 0.0f;
            }
            float f5 = this.hjp;
            float f6 = this.hjp + 85.0f;
            float f7 = this.hjp + 170.0f;
            if (f5 > 255.0f) {
                f5 = 0.0f;
            }
            if (f6 > 255.0f) {
                f6 -= 255.0f;
            }
            if (f7 > 255.0f) {
                f7 -= 255.0f;
            }
            Color color = Color.getHSBColor(f5 / 255.0f, 0.9f, 1.0f);
            Color color2 = Color.getHSBColor(f6 / 255.0f, 0.9f, 1.0f);
            Color color3 = Color.getHSBColor(f7 / 255.0f, 0.9f, 1.0f);
            int n6 = color.getRGB();
            int n7 = color2.getRGB();
            int n8 = color3.getRGB();
            this.hjp = (float)((double)this.hjp + 0.1);
            Class1384.toggle(f, f2, f + (float)n, f2 + (float)n, 0.5, Class1381.sl(90), Class1381.sl(0));
            Class1384.toggle(f + 1.0f, f2 + 1.0f, f + (float)n - 1.0f, f2 + (float)n - 1.0f, 1.0, Class1381.sl(90), Class1381.sl(61));
            Class1384.toggle((double)f + 2.5, (double)f2 + 2.5, (double)(f + (float)n) - 2.5, (double)(f2 + (float)n) - 2.5, 0.5, Class1381.sl(61), Class1381.sl(0));
            Class1384.toggle(f + 3.0f, f2 + 3.0f, f + (float)n - 3.0f, f2 + (float)n - 3.0f, 0.5, Class1381.sl(27), Class1381.sl(61));
            Class1384.d((double)(f + 3.0f), (double)(f2 + 3.0f), (double)(f + (float)(n / 2)), (double)f2 + 3.6, n6, n7);
            Class1384.d((double)(f + (float)(n / 2)), (double)(f2 + 3.0f), (double)(f + (float)n - 3.0f), (double)f2 + 3.6, n7, n8);
            Class1384.j((double)f + ((double)(n / 2) - 0.5), (double)f2 + 3.5, (double)f + ((double)(n / 2) + 0.5), (double)(f2 + (float)n) - 3.5, Class1381.pa(255, 80));
            Class1384.j((double)f + 3.5, (double)f2 + ((double)(n / 2) - 0.5), (double)(f + (float)n) - 3.5, (double)f2 + ((double)(n / 2) + 0.5), Class1381.pa(255, 80));
            for (EntityLivingBase EntityLivingBase : Minecraft.theWorld.lc()) {
                Entity Entity;
                if (!(EntityLivingBase instanceof Entity) || !(Entity = (Entity)EntityLivingBase).ph() || Entity == Minecraft.thePlayer || Entity.cl() || Class2183.kal.contains(Entity) || Entity.c(Minecraft.thePlayer)) continue;
                float f8 = this.pst.vhf.odc;
                float f9 = (float)((Entity.of + (Entity.of - Entity.uf) * (double)f8 - (double)f3) * this.hjv.vut());
                float f10 = (float)((Entity.og + (Entity.og - Entity.ug) * (double)f8 - (double)f4) * this.hjv.vut());
                int n9 = Class1384.aa(1000);
                if (Class1035.l(Entity)) {
                    n9 = Class1400.jfo().jfy();
                } else if (Minecraft.thePlayer.x(Entity)) {
                    n9 = Class1400.jfc().jfy();
                } else if (!Minecraft.thePlayer.x(Entity)) {
                    n9 = Class1400.jfs().jfy();
                }
                float f11 = (float)Math.cos((double)Minecraft.thePlayer.oi * 0.017453292519943295);
                float f12 = (float)Math.sin((double)Minecraft.thePlayer.oi * 0.017453292519943295);
                float f13 = -(f10 * f11 - f9 * f12);
                float f14 = -(f9 * f11 + f10 * f12);
                if (f13 > (float)(n / 2 - 5)) {
                    f13 = (float)(n / 2) - 5.0f;
                } else if (f13 < (float)(-n / 2 + 5)) {
                    f13 = -n / 2 + 5;
                }
                if (f14 > (float)(n / 2) - 5.0f) {
                    f14 = n / 2 - 5;
                } else if (f14 < (float)(-n / 2 + 5)) {
                    f14 = -((float)(n / 2)) + 5.0f;
                }
                Class1384.toggle((double)(f + (float)(n / 2) + f14) - 1.5, (double)(f2 + (float)(n / 2) + f13) - 1.5, (double)(f + (float)(n / 2) + f14) + 1.5, (double)(f2 + (float)(n / 2) + f13) + 1.5, 0.5, n9, Class1381.sl(16));
            }
        }
    }
}

