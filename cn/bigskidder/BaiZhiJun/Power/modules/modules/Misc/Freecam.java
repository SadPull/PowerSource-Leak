/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc;

import com.darkmagician6.eventapi.EventTarget;
import com.mojang.authlib.GameProfile;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2228;
import client87.client86.package858.Class2254;
import client87.client86.package858.Class2258;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package4133.Class7;
import net.minecraft.client.package82.Class390;
import net.minecraft.client52.Class575;
import net.minecraft.client52.Class614;
import net.minecraft.net579.Class2418;
import net.minecraft.net579.Class2421;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.net530.Class851;
import net.minecraft.net9.net530.Entity;
import net.minecraft.package9.Class2469;

public class Class247
extends Module {
    private Class7 ptw;
    public Value<Double> pte = new Value<Double>("Freecam_Speed", 1.0, 1.0, 10.0, 1.0);
    private double phd;
    private double phn;
    private double php;

    public Class247() {
        super("Freecam", Category.Misc);
    }

    @EventTarget
    public void d(Class2258 class2258) {
        class2258.toggle(null);
    }

    @EventTarget
    public void j(Class2228 class2228) {
        if (class2228.xv() instanceof C03PacketPlayer) {
            C03PacketPlayer c03PacketPlayer = (C03PacketPlayer)class2228.xv();
            c03PacketPlayer.yaw = this.ptw.oi;
            c03PacketPlayer.pitch = this.ptw.ow;
            c03PacketPlayer.x = this.ptw.of;
            c03PacketPlayer.y = this.ptw.om;
            c03PacketPlayer.z = this.ptw.og;
            c03PacketPlayer.onGround = this.ptw.up;
        } else if (class2228.xv() instanceof C03PacketPlayer.C04PacketPlayerPosition) {
            C03PacketPlayer.C04PacketPlayerPosition c04PacketPlayerPosition = (C03PacketPlayer.C04PacketPlayerPosition)class2228.xv();
            c04PacketPlayerPosition.yaw = this.ptw.oi;
            c04PacketPlayerPosition.pitch = this.ptw.ow;
            c04PacketPlayerPosition.x = this.ptw.of;
            c04PacketPlayerPosition.y = this.ptw.om;
            c04PacketPlayerPosition.z = this.ptw.og;
            c04PacketPlayerPosition.onGround = this.ptw.up;
        } else if (class2228.xv() instanceof C03PacketPlayer.C05PacketPlayerLook) {
            C03PacketPlayer.C05PacketPlayerLook c05PacketPlayerLook = (C03PacketPlayer.C05PacketPlayerLook)class2228.xv();
            c05PacketPlayerLook.yaw = this.ptw.oi;
            c05PacketPlayerLook.pitch = this.ptw.ow;
            c05PacketPlayerLook.x = this.ptw.of;
            c05PacketPlayerLook.y = this.ptw.om;
            c05PacketPlayerLook.z = this.ptw.og;
            c05PacketPlayerLook.onGround = this.ptw.up;
        }
    }

    @EventTarget
    public void n(Class2254 class2254) {
        Minecraft.thePlayer.ul = true;
        float f = this.pte.vut().floatValue();
        if (Minecraft.thePlayer.jab.oda) {
            Minecraft.thePlayer.ol = f;
            class2254.n(Minecraft.thePlayer.ol);
        } else if (Minecraft.thePlayer.jab.odl) {
            Minecraft.thePlayer.ol = -f;
            class2254.n(Minecraft.thePlayer.ol);
        } else {
            Minecraft.thePlayer.ol = 0.0;
            class2254.n(0.0);
        }
        f = (float)Math.max((double)f, Class247.nse());
        double d = Class575.odg;
        double d2 = Class575.odm;
        float f2 = Minecraft.thePlayer.oi;
        if (d == 0.0 && d2 == 0.0) {
            class2254.toggle(0.0);
            class2254.v(0.0);
        } else {
            if (d != 0.0) {
                if (d2 > 0.0) {
                    d2 = 1.0;
                    f2 += (float)(d > 0.0 ? -45 : 45);
                } else if (d2 < 0.0) {
                    f2 += (float)(d > 0.0 ? 45 : -45);
                }
                d2 = 0.0;
                d = d > 0.0 ? 1.0 : -1.0;
            }
            class2254.toggle(d * (double)f * Math.cos(Math.toRadians(f2 + 90.0f)) + d2 * (double)f * Math.sin(Math.toRadians(f2 + 90.0f)));
            class2254.v(d * (double)f * Math.sin(Math.toRadians(f2 + 90.0f)) - d2 * (double)f * Math.cos(Math.toRadians(f2 + 90.0f)));
        }
    }

    public static double nse() {
        double d = 0.2873;
        Minecraft.nmk();
        if (Minecraft.thePlayer.d(Class2418.veh)) {
            Minecraft.nmk();
            int n = Minecraft.thePlayer.n(Class2418.veh).nlw();
            d *= 1.0 + 0.2 * (double)(n + 1);
        }
        return d;
    }

    @Override
    public void onDisable() {
        this.ptw = new Class7(Minecraft.theWorld, Minecraft.thePlayer.id());
        this.ptw.d(Minecraft.thePlayer, true);
        this.ptw.n(Minecraft.thePlayer.of, Minecraft.thePlayer.om, Minecraft.thePlayer.og, Minecraft.thePlayer.oi, Minecraft.thePlayer.ow);
        this.ptw.zy = Minecraft.thePlayer.zy;
        this.ptw.nn(-1337);
        this.ptw.s(Minecraft.thePlayer.cg());
        Minecraft.theWorld.d(this.ptw.qt(), this.ptw);
        this.phd = Minecraft.thePlayer.of;
        this.phn = Minecraft.thePlayer.om;
        this.php = Minecraft.thePlayer.og;
    }

    @Override
    public void onEnable() {
        Minecraft.thePlayer.m(0.0);
        Minecraft.thePlayer.n(this.ptw.of, this.ptw.om, this.ptw.og, this.ptw.oi, this.ptw.ow);
        Minecraft.thePlayer.zy = this.ptw.zy;
        Minecraft.theWorld.ji(this.ptw.qt());
        Minecraft.thePlayer.s(this.ptw.cg());
        this.ptw = null;
        this.pst.vha.plc();
        Minecraft.thePlayer.toggle(this.phd, this.phn, this.php);
        Minecraft.getNetworkManager().sendPacket(new C03PacketPlayer.C04PacketPlayerPosition(Minecraft.thePlayer.of, Minecraft.thePlayer.om + 0.01, Minecraft.thePlayer.og, Minecraft.thePlayer.up));
        Minecraft.thePlayer.nrg.nhn = false;
        Minecraft.thePlayer.ul = false;
        Minecraft.theWorld.ji(-1);
        super.onEnable();
    }
}

