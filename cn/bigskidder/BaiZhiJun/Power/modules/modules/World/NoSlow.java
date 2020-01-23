/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import client87.client86.Value;
import client87.client86.minecraft30.Class1390;
import client87.client86.minecraft30.Class1399;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2173;
import client87.client86.package858.Class2203;
import client87.client86.package858.Class2206;
import net.minecraft.client.Minecraft;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class426;
import net.minecraft.client52.Class891;
import net.minecraft.client52.Class910;
import net.minecraft.net29.Class2059;
import net.minecraft.net9.Entity;
import net.minecraft.net9.net530.Class859;

public class Class536
extends Module {
    public static Value<String> ogb = new Value("NoSlow", "Mode", 0);

    public Class536() {
        super("NoSlow", Category.Category.World);
        ogb.xh("Hypixel");
        ogb.xh("HPacket");
    }

    @EventTarget
    public void d(Class2206 class2206) {
        if (ogb.xm("Hypixel")) {
            this.pc("Hypixel");
        }
        if (ogb.xm("HPacket")) {
            this.pc("HPacket");
        }
        if (Minecraft.thePlayer.bf() && Class1390.pnd() && Class1399.pd(0.42) && Class2173.kmo == null && ogb.xm("HPacket")) {
            Minecraft.thePlayer.sendQueue.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, Class891.xrk, Class910.xkq));
        }
    }

    @EventTarget
    public void d(Class2203 class2203) {
        if (Minecraft.thePlayer.bf() && Class1390.pnd() && Class1399.pd(0.42) && Class2173.kmo == null && ogb.xm("HPacket")) {
            Minecraft.thePlayer.sendQueue.addToSendQueue(new C08PacketPlayerBlockPlacement(Class1390.yw(this.pst.nme().npc()), 255, Minecraft.thePlayer.nhl.wx(), 0.0f, 0.0f, 0.0f));
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

