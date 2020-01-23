/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C00PacketKeepAlive;
import client87.client86.Value;
import client87.client86.minecraft30.Class128;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2228;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;

public class Class922
extends Module {
    public Value<Double> wb = new Value<Double>("PingSpoof_delay", 200.0, 0.0, 2000.0, 10.0);
    public List wi = new ArrayList();

    public Class922() {
        super("PingSpoof", Category.Category.Player);
    }

    @EventTarget
    public void toggle(Class2228 class2228) {
        if (class2228.xv() instanceof C00PacketKeepAlive) {
            if (this.wi.contains(class2228.xv())) {
                return;
            }
            class2228.h(true);
            Packet packet = class2228.xv();
            this.wi.add(class2228.xv());
            new Thread(() -> {
                try {
                    Thread.sleetoggle(this.wb.vut().intValue());
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTragetName();
                }
                try {
                    Class128.jmz().sendQueue.addToSendQueue(packet);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.wi.remove(packet);
            }, "KeepAlive-Delay").start();
        }
    }
}

