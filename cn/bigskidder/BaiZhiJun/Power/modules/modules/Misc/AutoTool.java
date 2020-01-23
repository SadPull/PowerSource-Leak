/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc;

import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2228;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class891;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.package520.Class1789;
import net.minecraft.net29.Class2001;
import net.minecraft.net29.Class2059;
import net.minecraft.net9.net530.Class859;
import net.minecraft.package4.Class31;
import net.minecraft.package4.Class61;

public class Class242
extends Module {
    public Class242() {
        super("AutoTool", Category.Misc);
    }

    public Class nsi() {
        return Class2228.class;
    }

    @EventTarget
    public void v(Class2228 class2228) {
        if (!(class2228.xv() instanceof C07PacketPlayerDigging) || class2228.xw() != 0) {
            return;
        }
        C07PacketPlayerDigging c07PacketPlayerDigging = (C07PacketPlayerDigging)class2228.xv();
        if (c07PacketPlayerDigging.getStatus() == C07PacketPlayerDigging.Action.START_DESTROY_BLOCK) {
            Class242.nw(c07PacketPlayerDigging.getPosition());
        }
    }

    private static void nw(Class891 class891) {
        Class1886 class1886 = Minecraft.theWorld.u(class891).xk();
        int n = Class242.z(class1886);
        if (n < 0) {
            return;
        }
        float f = Class242.d(class1886, Minecraft.thePlayer.nhl.nmc[n]);
        if (Minecraft.thePlayer.vtoggle() != null && Class242.d(class1886, Minecraft.thePlayer.vtoggle()) >= f) {
            return;
        }
        Minecraft.thePlayer.nhl.nmx = n;
        Minecraft.thePlayer.sendQueue.addToSendQueue(new C09PacketHeldItemChange(n));
    }

    private static int z(Class1886 class1886) {
        float f = Float.NEGATIVE_INFINITY;
        int n = -1;
        for (int i = 0; i < 9; ++i) {
            float f2;
            Class2059 class2059 = Minecraft.thePlayer.nhl.nmc[i];
            if (class2059 == null || class2059.vrw() == null) continue;
            float f3 = Class242.d(class1886, class2059);
            if (!(f2 > f) || f3 == 1.0f) continue;
            n = i;
            f = f3;
        }
        return n;
    }

    public static float d(Class1886 class1886, Class2059 class2059) {
        float f = class2059.v(class1886);
        if (!Class31.vo(class2059).containsKey(Class61.hin.hiu) || f == 1.0f) {
            return f;
        }
        int n = Class31.q(Class61.hin.hiu, class2059);
        return f + (float)(n * n + 1);
    }
}

