/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat;

import com.darkmagician6.eventapi.EventTarget;
import java.util.Random;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer;
import client87.client86.Value;
import client87.client86.minecraft30.minecraft993.Class964;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2254;
import net.minecraft.client.Minecraft;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;

public class Class2172
extends Module {
    public static Value kff = new Value("Criticals", "Mode", 0);
    public Value kfm = new Value<Double>("Criticals_Delay", 50.0, 50.0, 1000.0, 10.0);
    public Class964 kfg = new Class964();
    public int kfa = 0;

    public Class2172() {
        super("Criticals", Category.Combat);
        kff.xh("Packet");
    }

    private boolean vwe() {
        return Minecraft.thePlayer.up;
    }

    public static double y(double d, double d2) {
        Random random = new Random();
        return d + random.nextDouble() * (d2 - d);
    }

    private boolean ved() {
        if (!Minecraft.thePlayer.up) {
            return false;
        }
        return !Minecraft.thePlayer.cv();
    }

    @EventTarget
    public void n(Class2254 class2254) {
        C02PacketUseEntity c02PacketUseEntity = class2254.xy();
        if (kff.xm("Packet")) {
            this.pc("Packet");
            if (c02PacketUseEntity.getAction() == C02PacketUseEntity.Action.ATTACK) {
                if (!this.ved()) {
                    return;
                }
                for (double d : new double[]{0.06142999976873398, 0.0, 0.012511000037193298, 0.0}) {
                    Minecraft.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(Minecraft.thePlayer.of, Minecraft.thePlayer.om + d, Minecraft.thePlayer.og, true));
                }
            }
        }
    }

    public static double k(double d, double d2) {
        Random random = new Random();
        return d + random.nextDouble() * (d2 - d);
    }
}

