/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import java.util.List;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2254;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class614;
import net.minecraft.net9.EntityLivingBase;

public class Class571
extends Module {
    public Class571() {
        super("Safewalk", Category.Category.World);
    }

    @EventTarget
    public void n(Class2254 class2254) {
        double d = class2254.xc();
        double d2 = class2254.se();
        double d3 = class2254.xs();
        if (Minecraft.thePlayer.up) {
            double d4 = 0.05;
            while (d != 0.0) {
                if (!Minecraft.theWorld.d((EntityLivingBase)Minecraft.thePlayer, Minecraft.thePlayer.sy().ns(d, -1.0, 0.0)).isEmpty()) break;
                if (d < d4 && d >= -d4) {
                    d = 0.0;
                    continue;
                }
                if (d > 0.0) {
                    d -= d4;
                    continue;
                }
                d += d4;
            }
            while (d3 != 0.0) {
                if (!Minecraft.theWorld.d((EntityLivingBase)Minecraft.thePlayer, Minecraft.thePlayer.sy().ns(0.0, -1.0, d3)).isEmpty()) break;
                if (d3 < d4 && d3 >= -d4) {
                    d3 = 0.0;
                    continue;
                }
                if (d3 > 0.0) {
                    d3 -= d4;
                    continue;
                }
                d3 += d4;
            }
            while (d != 0.0 && d3 != 0.0 && Minecraft.theWorld.d((EntityLivingBase)Minecraft.thePlayer, Minecraft.thePlayer.sy().ns(d, -1.0, d3)).isEmpty()) {
                d = d < d4 && d >= -d4 ? 0.0 : (d > 0.0 ? (d -= d4) : (d += d4));
                if (d3 < d4 && d3 >= -d4) {
                    d3 = 0.0;
                    continue;
                }
                if (d3 > 0.0) {
                    d3 -= d4;
                    continue;
                }
                d3 += d4;
            }
        }
        class2254.toggle(d);
        class2254.n(d2);
        class2254.v(d3);
    }
}

