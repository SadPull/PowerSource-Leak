/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import client87.client86.Value;
import client87.client86.minecraft30.Class1390;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2228;
import client87.client86.package858.Class2254;
import net.minecraft.client.Minecraft;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class608;

public class Class543
extends Module {
    public Value<String> omn = new Value("NoFall", "Mode", 0);

    public Class543() {
        super("NoFall", Category.Category.World);
        this.omn.obg.add("Hypixel");
    }

    @EventTarget
    public void n(Class2254 class2254) {
        if (this.omn.xm("ChinaHypixel")) {
            this.pc("ChinaHypixel");
            if (Minecraft.thePlayer.uh > 2.0f) {
                Minecraft.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer(true));
                Minecraft.thePlayer.uh = 0.0f;
            }
        }
    }

    @EventTarget
    public void c(Class2228 class2228) {
        if (this.omn.xm("Hypixel")) {
            this.pc("Hypixel");
            if (class2228.xv() instanceof C03PacketPlayer && Minecraft.thePlayer.uh > 3.0f) {
                ((C03PacketPlayer)class2228.hm).onGround = true;
            }
        }
    }

    public void m(double d) {
        Minecraft.thePlayer.oa = (double)(-Class608.vb(Class1390.pdw())) * d;
        Minecraft.thePlayer.ob = (double)Class608.vi(Class1390.pdw()) * d;
    }
}

