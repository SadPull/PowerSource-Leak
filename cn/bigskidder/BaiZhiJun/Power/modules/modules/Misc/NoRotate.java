/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc;

import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2228;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package4133.Class0;

public class Class223
extends Module {
    public Class223() {
        super("NoRotate", Category.Misc);
    }

    @EventTarget
    public void toggle(Class2228 class2228) {
        if (class2228.xv() instanceof S08PacketPlayerPosLook) {
            S08PacketPlayerPosLook s08PacketPlayerPosLook = (S08PacketPlayerPosLook)class2228.xv();
            if (Minecraft.thePlayer.oi > -90.0f && Minecraft.thePlayer.ow < 90.0f) {
                s08PacketPlayerPosLook.yaw = Minecraft.thePlayer.oi;
                s08PacketPlayerPosLook.pitch = Minecraft.thePlayer.ow;
            }
        }
    }
}

