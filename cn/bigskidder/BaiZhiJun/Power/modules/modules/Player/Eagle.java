/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2256;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft860.Class1027;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class891;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.Class2315;
import net.minecraft.client59.package520.Class1789;
import net.minecraft.net9.net530.Entity;

public class Class1044
extends Module {
    public Class1044() {
        super("Eagle", Category.Category.Player);
    }

    public Class1886 c(Class891 class891) {
        return Minecraft.theWorld.u(class891).xk();
    }

    public Class1886 x(Entity Entity) {
        return this.c(new Class891(Entity.of, Entity.om - 1.0, Entity.og));
    }

    @EventTarget
    public void d(Class2256 class2256) {
        if (this.x(Minecraft.thePlayer) instanceof Class2315) {
            if (Minecraft.thePlayer.up) {
                Class1027.x(this.pst.vrf.uso.vkq(), true);
            }
        } else if (Minecraft.thePlayer.up) {
            Class1027.x(this.pst.vrf.uso.vkq(), false);
        }
    }

    @Override
    public void onDisable() {
        Minecraft.thePlayer.s(false);
        super.onDisable();
    }

    @Override
    public void onEnable() {
        Class1027.x(this.pst.vrf.uso.vkq(), false);
        super.onEnable();
    }
}

