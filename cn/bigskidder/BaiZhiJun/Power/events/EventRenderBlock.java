/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package858;

import com.darkmagician6.eventapi.events.Event;
import net.minecraft.network.play.client.C02PacketUseEntity;
import package3.package2.package39.EntityLivingBase;

public class Class2254
implements Event {
    public double ty;
    public double tk;
    public double tt;

    public Class2254(double d, double d2, double d3) {
        this.ty = d;
        this.tk = d2;
        this.tt = d3;
    }

    public double xc() {
        return this.ty;
    }

    public void p(double d) {
        this.ty = d;
    }

    public double se() {
        return this.tk;
    }

    public void n(double d) {
        this.tk = d;
    }

    public double xs() {
        return this.tt;
    }

    public void v(double d) {
        this.tt = d;
    }

    public EntityLivingBase xu() {
        return null;
    }

    public C02PacketUseEntity xy() {
        return null;
    }
}

