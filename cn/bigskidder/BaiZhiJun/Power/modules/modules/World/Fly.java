/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import client87.client86.Value;
import client87.client86.client85.Class1610;
import client87.client86.minecraft30.Class133;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class1390;
import client87.client86.minecraft30.Class160;
import client87.client86.minecraft30.minecraft993.Class951;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class1905;
import client87.client86.package858.Class2206;
import client87.client86.package858.Class2228;
import client87.client86.package858.Class2254;
import client87.client86.package858.Class2256;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft860.Class1027;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class409;
import net.minecraft.client52.Class575;
import net.minecraft.client52.Class608;
import net.minecraft.client52.Class614;
import net.minecraft.net579.Class2418;
import net.minecraft.net579.Class2421;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.net530.Class851;

public class Class561
extends Module {
    private Class951 ofy = new Class951();
    private double ofk;
    int oft;
    int ofh;
    double ofr;
    double off;
    boolean ofm;
    boolean ofg = true;
    boolean ofa = false;
    private int ofl;
    private Class133 ofb = new Class133();
    public int ofi = 0;
    public Value<String> ofw = new Value("Fly", "Mode", 0);
    public Value<Double> ofe = new Value<Double>("Fly_Speed", 1.0, 1.0, 20.0, 1.0);
    public Value<Double> omd = new Value<Double>("Fly_HypixelZooM-Boost ", 1.9, 1.5, 2.2, 0.05);

    public Class561() {
        super("Fly", Category.Category.World);
        this.ofw.obg.add("Hypixel");
        this.ofw.obg.add("Vanilla");
        this.ofw.obg.add("Motion");
        this.ofw.obg.add("HypixelZooM");
    }

    @EventTarget
    public void toggle(Class2228 class2228) {
        Packet packet = class2228.xv();
        if (packet instanceof S08PacketPlayerPosLook) {
            S08PacketPlayerPosLook s08PacketPlayerPosLook = (S08PacketPlayerPosLook)class2228.xv();
            if (this.ofw.xm("HypixelZooM")) {
                Class1386.d("Lagback checks!", Class1610.heq);
                Minecraft.thePlayer.up = false;
                Minecraft.thePlayer.oa *= 0.0;
                Minecraft.thePlayer.ob *= 0.0;
                Minecraft.thePlayer.zt = 0.0f;
                this.toggleNotSet();
                s08PacketPlayerPosLook.yaw = Minecraft.thePlayer.oi;
                s08PacketPlayerPosLook.pitch = Minecraft.thePlayer.ow;
            }
        }
    }

    @Override
    public void onDisable() {
        if (this.ofw.xm("Hypixel")) {
            Minecraft.thePlayer.toggle(Minecraft.thePlayer.of, Minecraft.thePlayer.om + 0.0, Minecraft.thePlayer.og);
        }
        if (this.ofw.xm("HypixelZooM") && Minecraft.vte) {
            this.pc("HypixelZooM");
            this.km(1);
            this.ofg = true;
            new Timer().schedule((TimerTask)new Class1905(this), 260L);
            this.ofh = 1;
            this.ofr = 0.1;
            this.ofm = true;
            this.off = 0.0;
        }
        super.onDisable();
    }

    @EventTarget
    public void d(Class2206 class2206) {
        if (this.ofw.xm("Motion")) {
            this.pc("Motion");
            Minecraft.thePlayer.up = true;
            double d = Math.max((double)this.ofe.vut().floatValue(), Class561.nse());
            Minecraft.thePlayer.ol = Minecraft.thePlayer.jab.oda ? d * 0.6 : (Minecraft.thePlayer.jab.odl ? -d * 0.6 : 0.0);
        }
    }

    public static double nse() {
        double d = 0.2873;
        if (Minecraft.thePlayer.d(Class2418.veh)) {
            int n = Minecraft.thePlayer.n(Class2418.veh).nlw();
            d *= 1.0 + 0.2 * (double)(n + 1);
        }
        return d;
    }

    @EventTarget
    private void d(Class2256 class2256) {
        if (this.ofw.xm("HypixelZooM")) {
            if (!Minecraft.vte) {
                Class1386.d("\u8bf7\u8d2d\u4e70Power\u4ed8\u8d39\u7248! HypixelZooM\u4e3a\u4ed8\u8d39\u529f\u80fd!!", Class160.rqv);
                this.ofw.ttoggle(0);
                this.toggle(false);
                return;
            }
            if (this.ofg) {
                Minecraft.thePlayer.oa = 0.0;
                Minecraft.thePlayer.ob = 0.0;
                Minecraft.thePlayer.zt = 0.0f;
            }
            Minecraft.nmk();
            Minecraft.nmk();
            double d = Minecraft.thePlayer.of - Minecraft.thePlayer.ot;
            Minecraft.nmk();
            Minecraft.nmk();
            double d2 = Minecraft.thePlayer.og - Minecraft.thePlayer.or;
            this.off = Math.sqrt(d * d + d2 * d2);
            ++this.oft;
            Minecraft.nmk();
            if (Minecraft.thePlayer.qp == 0.0f) {
                Minecraft.nmk();
                if (Minecraft.thePlayer.qn == 0.0f) {
                    Minecraft.nmk();
                    Minecraft.nmk();
                    Minecraft.nmk();
                    Minecraft.nmk();
                    Minecraft.thePlayer.toggle(Minecraft.thePlayer.of + 1.0, Minecraft.thePlayer.om + 1.0, Minecraft.thePlayer.og + 1.0);
                    Minecraft.nmk();
                    Minecraft.nmk();
                    Minecraft.nmk();
                    Minecraft.nmk();
                    Minecraft.thePlayer.toggle(Minecraft.thePlayer.ot, Minecraft.thePlayer.oh, Minecraft.thePlayer.or);
                    Minecraft.nmk();
                    Minecraft.thePlayer.oa = 0.0;
                    Minecraft.nmk();
                    Minecraft.thePlayer.ob = 0.0;
                }
            }
            Minecraft.nmk();
            Minecraft.thePlayer.ol = 0.0;
            if (Minecraft.nmk().vrf.usx.ukj) {
                Minecraft.nmk();
                Minecraft.thePlayer.ol += 0.5;
            }
            if (Minecraft.nmk().vrf.uso.ukj) {
                Minecraft.nmk();
                Minecraft.thePlayer.ol -= 0.5;
            }
            if (this.oft != 1 && this.oft == 2) {
                Minecraft.nmk();
                Minecraft.nmk();
                Minecraft.nmk();
                Minecraft.nmk();
                Minecraft.thePlayer.toggle(Minecraft.thePlayer.of, Minecraft.thePlayer.om + 1.0E-10, Minecraft.thePlayer.og);
                this.oft = 0;
            }
        }
    }

    @EventTarget
    public void toggle(Class2254 class2254) {
        if (this.ofw.xm("Hypixel")) {
            this.pc("Hypixel");
            Minecraft.thePlayer.up = false;
            Minecraft.thePlayer.nrg.nhn = false;
            if (this.pst.vrf.uso.vkd()) {
                Minecraft.thePlayer.ol *= 0.0;
            } else if (this.pst.vrf.usx.vkd()) {
                Minecraft.thePlayer.ol *= 0.0;
            }
            if (Class1390.jrd()) {
                this.m(Class1390.jhe() - 0.05);
            } else {
                this.m(0.0);
            }
            ++this.ofi;
            if (Class1390.jrd()) {
                this.m(Class1390.jhe());
            } else {
                Minecraft.thePlayer.oa *= 0.0;
                Minecraft.thePlayer.ob *= 0.0;
                Class409.ods = 1.0f;
            }
            Minecraft.thePlayer.toggle(Minecraft.thePlayer.of, Minecraft.thePlayer.om, Minecraft.thePlayer.og);
            switch (this.ofi) {
                case 1: {
                    break;
                }
                case 2: {
                    Minecraft.thePlayer.toggle(Minecraft.thePlayer.of, Minecraft.thePlayer.om + 1.0E-5, Minecraft.thePlayer.og);
                    this.ofi = 0;
                    break;
                }
                case 3: {
                    Minecraft.thePlayer.toggle(Minecraft.thePlayer.of, Minecraft.thePlayer.om - 1.0E-5, Minecraft.thePlayer.og);
                    this.ofi = 0;
                }
            }
            Minecraft.thePlayer.ol = 0.0;
            class2254.tk = 0.0;
        }
    }

    @EventTarget
    private void n(Class2254 class2254) {
        block16 : {
            float f;
            double d;
            double d2;
            block20 : {
                int n;
                block18 : {
                    block23 : {
                        block22 : {
                            block21 : {
                                block19 : {
                                    block17 : {
                                        if (!this.ofw.xm("HypixelZooM") || !Minecraft.vte || this.ofg) break block16;
                                        if (this.ofa) {
                                            Minecraft.thePlayer.ol = 0.418;
                                            class2254.n(0.418);
                                            this.ofa = false;
                                        }
                                        d2 = Class575.odg;
                                        d = Class575.odm;
                                        f = Minecraft.thePlayer.oi;
                                        double d3 = Math.cos(Math.toRadians(f + 90.0f));
                                        double d4 = Math.sin(Math.toRadians(f + 90.0f));
                                        if (d2 == 0.0 && d == 0.0) {
                                            class2254.ty = 0.0;
                                            class2254.tt = 0.0;
                                        } else if (d2 != 0.0) {
                                            if (d >= 1.0) {
                                                f += (float)(d2 > 0.0 ? -45 : 45);
                                                d = 0.0;
                                            } else if (d <= -1.0) {
                                                f += (float)(d2 > 0.0 ? 45 : -45);
                                                d = 0.0;
                                            }
                                            if (d2 > 0.0) {
                                                d2 = 1.0;
                                            } else if (d2 < 0.0) {
                                                d2 = -1.0;
                                            }
                                        }
                                        if (!this.ofm) break block16;
                                        if (this.ofh != 1) break block17;
                                        Minecraft.nmk();
                                        if (Minecraft.thePlayer.qp != 0.0f) break block18;
                                        Minecraft.nmk();
                                        if (Minecraft.thePlayer.qn != 0.0f) break block18;
                                    }
                                    if (this.ofh != 2) break block19;
                                    this.ofh = 3;
                                    Minecraft.nmk();
                                    double d5 = Minecraft.thePlayer.d(Class2418.veh) ? 2.149 : 2.149;
                                    this.ofr *= d5;
                                    break block20;
                                }
                                if (this.ofh != 3) break block21;
                                this.ofh = 4;
                                double d6 = (Minecraft.thePlayer.uw % 2 == 0 ? 0.0091 : 0.0103) * (this.off - Class1390.jhe());
                                this.ofr = this.off - d6;
                                break block20;
                            }
                            Minecraft.nmk();
                            Minecraft.nmk();
                            Minecraft.nmk();
                            Minecraft.nmk();
                            if (Minecraft.theWorld.d((EntityLivingBase)Minecraft.thePlayer, Minecraft.thePlayer.un.ns(0.0, Minecraft.thePlayer.ol, 0.0)).size() > 0) break block22;
                            Minecraft.nmk();
                            if (!Minecraft.thePlayer.uj) break block23;
                        }
                        this.ofh = 1;
                    }
                    this.ofr = this.off - this.off / 159.0;
                    break block20;
                }
                this.ofh = 2;
                Minecraft.nmk();
                if (Minecraft.thePlayer.d(Class2418.veh)) {
                    Minecraft.nmk();
                    n = Minecraft.thePlayer.n(Class2418.veh).nlw() + 2;
                } else {
                    n = 0;
                }
                int n2 = n;
                Minecraft.nmk();
                double d7 = Minecraft.thePlayer.d(Class2418.veh) ? 1.76 : (double)this.omd.vut().floatValue();
                this.ofr = d7 * Class1390.jhe();
            }
            Minecraft.thePlayer.nrp = 0.090909086f;
            this.ofr = Math.max(this.ofr, Class1390.jhe());
            class2254.toggle(d2 * this.ofr * Math.cos(Math.toRadians(f + 90.0f)) + d * this.ofr * Math.sin(Math.toRadians(f + 90.0f)));
            class2254.v(d2 * this.ofr * Math.sin(Math.toRadians(f + 90.0f)) - d * this.ofr * Math.cos(Math.toRadians(f + 90.0f)));
            if (d2 == 0.0 && d == 0.0) {
                class2254.ty = 0.0;
                class2254.tt = 0.0;
            }
        }
    }

    @EventTarget
    public void v(Class2254 class2254) {
        int n = this.ofe.vut().intValue();
        if (this.ofw.xm("Vanilla")) {
            this.pc("Vanilla");
            double d = Minecraft.thePlayer.jab.oda ? 1.0 : (Minecraft.thePlayer.ol = Minecraft.thePlayer.jab.odl ? -1.0 : 0.0);
            if (Minecraft.thePlayer.pde()) {
                Minecraft.thePlayer.m(n);
            } else {
                Minecraft.thePlayer.m(0.0);
            }
            class2254.tk = Minecraft.thePlayer.ol;
        }
        if (this.ofw.xm("Motion")) {
            double d = this.ofe.vut().floatValue();
            if (this.ofb.jc(10000.0f)) {
                this.ofb.npr();
            }
            float f = this.ofe.vut().floatValue();
            if (this.ofl > 0 && f > 0.0f && !this.ofb.jc(5000.0f)) {
                Class409.ods = 1.0f + f;
                if (this.ofl < 10) {
                    float f2 = this.ofl / 10;
                    if ((double)f2 > 1.0) {
                        f2 = 1.0f;
                    }
                    Class409.ods = 1.0f + f * f2;
                }
            } else {
                Class409.ods = 1.0f;
            }
            --this.ofl;
            double d2 = Class575.odg;
            double d3 = Class575.odm;
            float f3 = Minecraft.thePlayer.oi;
            if (d2 == 0.0 && d3 == 0.0) {
                class2254.toggle(0.0);
                class2254.v(0.0);
            } else {
                if (d2 != 0.0) {
                    if (d3 > 0.0) {
                        f3 += (float)(d2 > 0.0 ? -45 : 45);
                    } else if (d3 < 0.0) {
                        f3 += (float)(d2 > 0.0 ? 45 : -45);
                    }
                    d3 = 0.0;
                    if (d2 > 0.0) {
                        d2 = 1.0;
                    } else if (d2 < 0.0) {
                        d2 = -1.0;
                    }
                }
                double d4 = Math.max((double)this.ofe.vut().floatValue(), Class561.nse());
                class2254.toggle(d2 * d4 * Math.cos(Math.toRadians(f3 + 90.0f)) + d3 * d4 * Math.sin(Math.toRadians(f3 + 90.0f)));
                class2254.v(d2 * d4 * Math.sin(Math.toRadians(f3 + 90.0f)) - d3 * d4 * Math.cos(Math.toRadians(f3 + 90.0f)));
            }
        }
    }

    public void m(double d) {
        Minecraft.thePlayer.oa = (double)(-Class608.vb(Class1390.pdw())) * d;
        Minecraft.thePlayer.ob = (double)Class608.vi(Class1390.pdw()) * d;
    }

    public void km(int n) {
        if (n < 1) {
            n = 1;
        }
        if (n > Class608.ntoggle(Minecraft.thePlayer.pa())) {
            n = Class608.ntoggle(Minecraft.thePlayer.pa());
        }
        double d = 0.0625;
        if (Minecraft.thePlayer != null && Minecraft.getNetworkManager() != null && Minecraft.thePlayer.up) {
            int n2 = 0;
            while ((double)n2 <= (double)(3 + n) / d) {
                Minecraft.getNetworkManager().sendPacket(new C03PacketPlayer.C06PacketPlayerPosLook(Minecraft.thePlayer.of, Minecraft.thePlayer.om + d, Minecraft.thePlayer.og, Minecraft.thePlayer.oi, Minecraft.thePlayer.ow, false));
                Minecraft.getNetworkManager().sendPacket(new C03PacketPlayer.C06PacketPlayerPosLook(Minecraft.thePlayer.of, Minecraft.thePlayer.om, Minecraft.thePlayer.og, Minecraft.thePlayer.oi, Minecraft.thePlayer.ow, (double)n2 == (double)(3 + n) / d));
                ++n2;
            }
        }
    }

    @Override
    public void onEnable() {
        if (!Minecraft.thePlayer.nrg.nhv) {
            Minecraft.thePlayer.nrg.nhn = false;
            Minecraft.thePlayer.up = false;
            Minecraft.thePlayer.nrg.nhp = false;
            Minecraft.thePlayer.nrg.nx(0.0f);
        }
        Class409.ods = 1.0f;
        Minecraft.thePlayer.nfn = 0.02f;
        this.ofh = 1;
        this.ofr = 0.1;
        this.ofm = false;
        this.off = 0.0;
        super.onEnable();
    }
}

