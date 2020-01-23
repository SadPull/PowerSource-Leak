/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2257;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1226;

public class Class1041
extends Module {
    public Class1041() {
        super("SpeedMine", Category.Category.Player);
    }

    @EventTarget
    public void d(Class2257 class2257) {
        Minecraft.vhx.pqj = 0;
        if (Minecraft.vhx.pqp >= 0.7f) {
            Minecraft.vhx.pqp = 1.0f;
        }
    }
}

