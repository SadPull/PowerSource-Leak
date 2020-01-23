/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc;

import com.darkmagician6.eventapi.EventTarget;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2254;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package4133.Class0;

public class Class229
extends Module {
    public Class229() {
        super("Respawn", Category.Misc);
    }

    @EventTarget
    public void d(Class2254 class2254) {
        this.setKey(-6697780);
        if (!Minecraft.thePlayer.ph()) {
            Minecraft.thePlayer.bw();
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

