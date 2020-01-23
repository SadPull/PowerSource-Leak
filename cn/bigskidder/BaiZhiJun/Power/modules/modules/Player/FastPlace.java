/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2256;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package4133.Class0;
import net.minecraft.net29.Class2001;
import net.minecraft.net29.Class2059;
import net.minecraft.net29.Class2110;
import net.minecraft.net9.net530.Class859;

public class Class1034
extends Module {
    public Class1034() {
        super("FastPlace", Category.Category.Player);
    }

    @EventTarget
    public void d(Class2256 class2256) {
        if (Minecraft.thePlayer.nhl.wx() != null && Minecraft.thePlayer.bb().vrw() instanceof Class2110) {
            this.pst.vre = 0;
        }
    }

    @Override
    public void onEnable() {
        this.pst.vre = 4;
        super.onEnable();
    }
}

