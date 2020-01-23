/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package858;

import com.darkmagician6.eventapi.events.Event;
import net.minecraft.network.Packet;

public class Class2200
implements Event {
    public Packet kl;
    public String kb;
    public boolean ki;

    public Class2200(Packet packet) {
        this.kl = packet;
    }

    public Class2200(String string) {
        this.kb = string;
    }

    public String xz() {
        return this.kb;
    }

    public void h(boolean bl) {
        this.ki = bl;
    }

    public boolean xq() {
        return this.ki;
    }

    public Packet xv() {
        return this.kl;
    }
}

