/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2256;
import net.minecraft.client.Minecraft;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.net579.Class2418;
import net.minecraft.net579.Class2421;

public class Class122
extends Module {
    public Class122() {
        super("FullBright", Category.Render);
    }

    @EventTarget
    public void d(Class2256 class2256) {
        Minecraft.thePlayer.d(new Class2421(Class2418.jdj.nlt(), 5200, 1));
        this.pst.vrf.uxf = 10.0f;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.pst.vrf.uxf = 1.0f;
        Minecraft.thePlayer.u(Class2418.jdj.nlt());
    }
}

