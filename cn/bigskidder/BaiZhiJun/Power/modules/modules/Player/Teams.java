/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import cn.bigskidder.BaiZhiJun.Power.modules.ModuleManager;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class398;
import net.minecraft.net9.EntityLivingBase;

public class Class1035
extends Module {
    public Class1035() {
        super("Teams", Category.Category.Player);
    }

    public static boolean l(EntityLivingBase EntityLivingBase) {
        if (ModuleManager.px("Teams").nji()) {
            Minecraft.nmk();
            if (Minecraft.thePlayer.no().vql().startsWith("\u00a7")) {
                Minecraft.nmk();
                if (Minecraft.thePlayer.no().vql().length() <= 2 || EntityLivingBase.no().vql().length() <= 2) {
                    return false;
                }
                Minecraft.nmk();
                if (Minecraft.thePlayer.no().vql().substring(0, 2).equals(EntityLivingBase.no().vql().substring(0, 2))) {
                    return true;
                }
            }
        }
        return false;
    }
}

