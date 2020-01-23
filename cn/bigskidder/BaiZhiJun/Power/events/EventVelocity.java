/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package858;

import com.darkmagician6.eventapi.events.Event;
import net.minecraft.network.Packet;

public class Class2228
implements Event {
    public Packet hm;
    private boolean hg;
    public byte ha;
    private boolean hl;
    public boolean hb;

    public Class2228(Packet packet) {
        this.hm = packet;
    }

    public Packet xv() {
        return this.hm;
    }

    public void h(boolean bl) {
        this.hg = bl;
    }

    public boolean xq() {
        return this.hg;
    }

    public void p(Packet packet) {
        this.hm = packet;
    }

    public byte xw() {
        return this.ha;
    }

    public void n(byte by) {
        this.ha = by;
    }

    public boolean xe() {
        return !this.hl;
    }

    public boolean od() {
        return this.hl;
    }
}

