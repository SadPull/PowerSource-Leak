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
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class1390;
import client87.client86.minecraft30.Class160;
import client87.client86.minecraft30.minecraft993.Class951;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class1377;
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

public class Class547
extends Module {
    public Value<String> omj = new Value("ZoomFly", "Zoom Mode", 0);
    public Value<Double> omz = new Value<Double>("ZoomFly_Boost ", 2.0, 1.5, 2.2, 0.05);
    private Class951 omq = new Class951();
    private double omc;
    int oms;
    int omx;
    double omo;
    double omu;
    boolean omy;
    boolean omk = true;
    boolean omt = false;

    public Class547() {
        super("ZoomFly", Category.Category.World);
        this.omj.obg.add("Hypixel");
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
    public void onDisable() {
        if (this.omj.xm("Hypixel")) {
            this.pc("Hypixel");
            this.km(1);
            this.omk = true;
            new Timer().schedule((TimerTask)new Class1377(this), 260L);
            this.omx = 1;
            this.omo = 0.1;
            this.omy = true;
            this.omu = 0.0;
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
        this.omx = 1;
        this.omo = 0.1;
        this.omy = false;
        this.omu = 0.0;
    }

    @EventTarget
    public void toggle(Class2228 class2228) {
        Packet packet = class2228.xv();
        if (packet instanceof S08PacketPlayerPosLook) {
            S08PacketPlayerPosLook s08PacketPlayerPosLook = (S08PacketPlayerPosLook)class2228.xv();
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

    @EventTarget
    private void d(Class2256 class2256) {
        if (!Minecraft.vte) {
            Class1386.d("\u8bf7\u8d2d\u4e70Power\u4ed8\u8d39\u7248! ZoomFly\u4e3a\u4ed8\u8d39\u529f\u80fd!!", Class160.rqv);
            this.toggle(false);
            return;
        }
        if (this.omj.xm("Hypixel")) {
            if (this.omk) {
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
            this.omu = Math.sqrt(d * d + d2 * d2);
            ++this.oms;
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
            if (this.oms != 1 && this.oms == 2) {
                Minecraft.nmk();
                Minecraft.nmk();
                Minecraft.nmk();
                Minecraft.nmk();
                Minecraft.thePlayer.toggle(Minecraft.thePlayer.of, Minecraft.thePlayer.om + 1.0E-10, Minecraft.thePlayer.og);
                this.oms = 0;
            }
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
                                        if (this.omk) break block16;
                                        if (this.omt) {
                                            Minecraft.thePlayer.ol = 0.418;
                                            class2254.n(0.418);
                                            this.omt = false;
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
                                        if (!this.omy) break block16;
                                        if (this.omx != 1) break block17;
                                        Minecraft.nmk();
                                        if (Minecraft.thePlayer.qp != 0.0f) break block18;
                                        Minecraft.nmk();
                                        if (Minecraft.thePlayer.qn != 0.0f) break block18;
                                    }
                                    if (this.omx != 2) break block19;
                                    this.omx = 3;
                                    Minecraft.nmk();
                                    double d5 = Minecraft.thePlayer.d(Class2418.veh) ? 2.149 : 2.149;
                                    this.omo *= d5;
                                    break block20;
                                }
                                if (this.omx != 3) break block21;
                                this.omx = 4;
                                double d6 = (Minecraft.thePlayer.uw % 2 == 0 ? 0.0091 : 0.0103) * (this.omu - Class1390.jhe());
                                this.omo = this.omu - d6;
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
                        this.omx = 1;
                    }
                    this.omo = this.omu - this.omu / 159.0;
                    break block20;
                }
                this.omx = 2;
                Minecraft.nmk();
                if (Minecraft.thePlayer.d(Class2418.veh)) {
                    Minecraft.nmk();
                    n = Minecraft.thePlayer.n(Class2418.veh).nlw() + 2;
                } else {
                    n = 0;
                }
                int n2 = n;
                Minecraft.nmk();
                double d7 = Minecraft.thePlayer.d(Class2418.veh) ? 1.76 : (double)this.omz.vut().floatValue();
                this.omo = d7 * Class1390.jhe();
            }
            Minecraft.thePlayer.nrp = 0.090909086f;
            this.omo = Math.max(this.omo, Class1390.jhe());
            class2254.toggle(d2 * this.omo * Math.cos(Math.toRadians(f + 90.0f)) + d * this.omo * Math.sin(Math.toRadians(f + 90.0f)));
            class2254.v(d2 * this.omo * Math.sin(Math.toRadians(f + 90.0f)) - d * this.omo * Math.cos(Math.toRadians(f + 90.0f)));
            if (d2 == 0.0 && d == 0.0) {
                class2254.ty = 0.0;
                class2254.tt = 0.0;
            }
        }
    }

    double nse() {
        double d = 0.2873;
        if (Minecraft.thePlayer.d(Class2418.veh)) {
            int n = Minecraft.thePlayer.n(Class2418.veh).nlw();
            d *= 1.0 + 0.2 * (double)(n + 1);
        }
        return d;
    }
}

