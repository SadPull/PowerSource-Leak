/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package858;

import com.darkmagician6.eventapi.events.Event;
import net.minecraft.network.Packet;

public class Class2206
implements Event {
    private double ke;
    public double td;
    private double tn;
    public float tp;
    public float tv;
    public boolean tj;
    public boolean tz;
    private Packet tq;
    public static float tc;
    public static float ts;
    public static float tx;
    public static float to;
    public static boolean tu;

    public Class2206(double d, double d2, double d3, float f, float f2, boolean bl) {
        this.td = d2;
        this.ke = d;
        this.tn = d3;
        this.tp = f;
        this.tv = f2;
        this.tj = bl;
    }

    public void sa() {
        tx = tc;
        to = ts;
        tc = this.tp;
        ts = this.tv;
    }

    public double xc() {
        return this.ke;
    }

    public double se() {
        return this.td;
    }

    public double xs() {
        return this.tn;
    }

    public float si() {
        return this.tp;
    }

    public void r(float f) {
        this.tp = f;
    }

    public float sw() {
        return this.tv;
    }

    public void f(float f) {
        this.tv = f;
    }

    public boolean xx() {
        return this.tj;
    }

    public void f(boolean bl) {
        this.tj = bl;
    }

    public boolean xo() {
        return this.tz;
    }

    public void m(boolean bl) {
        this.tz = bl;
    }

    public void p(double d) {
        this.ke = d;
    }

    public void n(double d) {
        this.td = d;
    }

    public void v(double d) {
        this.tn = d;
    }

    public boolean xq() {
        return this.tz;
    }

    public void h(boolean bl) {
        this.tz = bl;
    }

    public void c(float f, float f2) {
        this.tp = f;
        this.tv = f2;
    }

    public Packet xv() {
        return this.tq;
    }

    public void p(Packet packet) {
        this.tq = packet;
    }
}

