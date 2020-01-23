/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import client87.client86.Value;
import client87.client86.minecraft30.Class1399;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2206;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class409;

public class Class558
extends Module {
    private float ogo;
    private float ogu;
    private int ogy;
    public static Value<Boolean> ogk = new Value<Boolean>("LongJump_Toggle", true);
    public Value<Double> ogt = new Value<Double>("LongJump_Boost", 1.75, 1.0, 7.0, 0.05);
    public Value<String> ogh = new Value("LongJump", "Mode", 0);
    public static Value<Boolean> ogr = new Value<Boolean>("LongJump_Glide", false);

    public Class558() {
        super("LongJump", Category.Category.World);
        this.ogh.obg.add("Hypixel");
    }

    @Override
    public void onDisable() {
        this.ogo = 0.0f;
        this.ogy = 0;
        this.ogu = 0.0f;
    }

    @Override
    public void onEnable() {
        Minecraft.thePlayer.oa *= 0.0;
        Minecraft.thePlayer.ob *= 0.0;
        Minecraft.thePlayer.zt = 0.0f;
        Class409.ods = 1.0f;
    }

    @EventTarget
    public void n(Class2206 class2206) {
        if (this.ogh.xm("Hypixel")) {
            this.pc("Hypixel");
            float f = 0.7f + (float)Class1399.jhl() * 0.45f;
            if ((Minecraft.thePlayer.qp != 0.0f || Minecraft.thePlayer.qn != 0.0f) && Minecraft.thePlayer.up) {
                if (ogk.vut().booleanValue() && this.ogu > 0.0f) {
                    this.ogu = 0.0f;
                    this.toggleNotSet();
                    return;
                }
                this.ogu += 1.0f;
                Class1399.pn(0.15);
                Minecraft.thePlayer.vx();
                this.ogy = 1;
            }
            if (Class1399.pd(0.001)) {
                this.ogo = 0.0f;
            } else {
                if (Minecraft.thePlayer.uj) {
                    this.ogy = 0;
                }
                if (this.ogy > 0 && this.ogy <= 3 && ogr.vut().booleanValue()) {
                    Minecraft.thePlayer.up = true;
                }
                double d = 0.95 + (double)Class1399.jhl() * 0.2 - (double)(this.ogo / 25.0f);
                if (ogr.vut().booleanValue()) {
                    d = 1.1 + (double)((float)Class1399.jhl() * 0.2f) - (double)(this.ogo / 20.0f);
                }
                if (d < Class1399.jhb() - 0.05) {
                    d = Class1399.jhb() - 0.05;
                }
                if (this.ogy < 4 && ogr.vut().booleanValue()) {
                    d = Class1399.jhb();
                }
                Class1399.pn(d);
                Minecraft.thePlayer.ol = ogr.vut() != false ? this.kg(this.ogy) : this.ka(this.ogy);
                if (this.ogy > 0) {
                    ++this.ogy;
                }
                this.ogo += f;
            }
        }
    }

    double kg(int n) {
        boolean bl = Minecraft.thePlayer.qn != 0.0f || Minecraft.thePlayer.qp != 0.0f;
        double[] arrd = new double[]{0.396, -0.122, -0.1, 0.423, 0.35, 0.28, 0.217, 0.15, 0.025, -0.00625, -0.038, -0.0693, -0.102, -0.13, -0.018, -0.1, -0.117, -0.14532, -0.1334, -0.1581, -0.183141, -0.170695, -0.195653, -0.221, -0.209, -0.233, -0.25767, -0.314917, -0.371019, -0.426};
        if (--n >= 0 && n < arrd.length) {
            double d = arrd[n];
            return d;
        }
        return Minecraft.thePlayer.ol;
    }

    double ka(int n) {
        boolean bl = Minecraft.thePlayer.qn != 0.0f || Minecraft.thePlayer.qp != 0.0f;
        double[] arrd = new double[]{0.345, 0.2699, 0.183, 0.103, 0.024, -0.008, -0.04, -0.072, -0.104, -0.13, -0.019, -0.097};
        double[] arrd2 = new double[]{0.345, 0.2699, 0.183, 0.103, 0.024, -0.008, -0.04, -0.072, -0.14, -0.17, -0.019, -0.13};
        if (--n >= 0 && n < arrd.length) {
            if (Minecraft.thePlayer.qn == 0.0f && Minecraft.thePlayer.qp == 0.0f || Minecraft.thePlayer.uv) {
                return arrd2[n];
            }
            return arrd[n];
        }
        return Minecraft.thePlayer.ol;
    }
}

