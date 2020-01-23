/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2204;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class420;

public class Class574
extends Module {
    public Value<Boolean> oma = new Value<Boolean>("Sprint_Omni", false);

    public Class574() {
        super("Sprint", Category.Category.World);
    }

    @EventTarget
    public void n(Class2204 class2204) {
        if (this.vok()) {
            Minecraft.thePlayer.toggle(true);
        }
    }

    private boolean voy() {
        if (Minecraft.thePlayer.qp == 0.0f) {
            return false;
        }
        if (Minecraft.thePlayer.cg()) {
            return false;
        }
        if (Minecraft.thePlayer.ix().vsw() < 6) {
            return false;
        }
        return !Minecraft.thePlayer.uv;
    }

    private boolean vok() {
        return this.oma.vut() != false ? Minecraft.thePlayer.pde() : Minecraft.thePlayer.qp > 0.0f && !Minecraft.thePlayer.cg() && Minecraft.thePlayer.ix().vsw() >= 6 && !Minecraft.thePlayer.uv;
    }

    @Override
    public void onEnable() {
        Minecraft.thePlayer.toggle(false);
        super.onEnable();
    }
}

