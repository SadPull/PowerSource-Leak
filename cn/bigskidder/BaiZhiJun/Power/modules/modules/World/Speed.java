/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import client87.client86.Value;
import client87.client86.client85.Class1610;
import client87.client86.minecraft30.Class133;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class1390;
import client87.client86.minecraft30.minecraft993.Class951;
import client87.client86.minecraft30.minecraft993.Class964;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2206;
import client87.client86.package858.Class2228;
import client87.client86.package858.Class2254;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class409;
import net.minecraft.client52.Class575;
import net.minecraft.client52.Class614;
import net.minecraft.client52.Class891;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.minecraft531.Class1991;
import net.minecraft.client59.package520.Class1789;
import net.minecraft.net579.Class2418;
import net.minecraft.net579.Class2421;
import net.minecraft.net9.EntityLivingBase;

public class Class568
extends Module {
    Class964 omb = new Class964();
    Class964 omi = new Class964();
    public static Value omw = new Value("Speed", "Mode", 0);
    public Value<Boolean> ome = new Value<Boolean>("Speed_Sound", false);
    public Value<Boolean> ogd = new Value<Boolean>("Speed_Lagback", false);
    private int ogn;
    private double ogp;
    private boolean ogv;
    private int ogj;
    private double ogz;
    private Class951 ogq = new Class951();
    private Class133 ogc = new Class133();
    private double[] ogs = new double[]{0.08, 0.09316090325960147, 1.6, 2.049, 0.66, 1.5};
    private int ogx = 1;

    public Class568() {
        super("Speed", Category.Category.World);
        Class568.omw.obg.add("Hypixel");
        this.psh = omw;
    }

    @EventTarget
    public void n(Class2206 class2206) {
        double d = Minecraft.thePlayer.of - Minecraft.thePlayer.ot;
        double d2 = Minecraft.thePlayer.og - Minecraft.thePlayer.or;
        this.ogz = Math.sqrt(d * d + d2 * d2);
    }

    @EventTarget
    public void toggle(Class2228 class2228) {
        Packet packet = class2228.xv();
        if (packet instanceof S08PacketPlayerPosLook) {
            S08PacketPlayerPosLook s08PacketPlayerPosLook = (S08PacketPlayerPosLook)class2228.xv();
            if (this.ogd.vut().booleanValue()) {
                Class1386.d("Lagback checks!", Class1610.heq);
                Minecraft.thePlayer.up = false;
                Minecraft.thePlayer.oa *= 0.0;
                Minecraft.thePlayer.ob *= 0.0;
                Minecraft.thePlayer.zt = 0.0f;
                this.toggleNotSet();
            } else if (this.ogc.jc(300.0f)) {
                s08PacketPlayerPosLook.yaw = Minecraft.thePlayer.oi;
                s08PacketPlayerPosLook.pitch = Minecraft.thePlayer.ow;
            }
            this.ogj = -4;
            this.ogc.npr();
        }
    }

    public boolean n(Class1991 class1991) {
        return Minecraft.theWorld.u(this.vot()).xk().vhr() == class1991;
    }

    public Class891 vot() {
        return new Class891(Minecraft.thePlayer.of, Minecraft.thePlayer.sy().xax - 1.0, Minecraft.thePlayer.og);
    }

    private boolean voh() {
        return Minecraft.thePlayer.pde() && Minecraft.thePlayer.up;
    }

    @EventTarget
    public void n(Class2254 class2254) {
        if (omw.xm("Hypixel")) {
            this.pc("Hypixel");
            double d = Class575.odg;
            double d2 = Class575.odm;
            float f = Minecraft.thePlayer.oi;
            switch (this.ogj) {
                case 0: {
                    ++this.ogj;
                    this.ogz = 0.0;
                    break;
                }
                case 2: {
                    double d3 = 0.40123128;
                    if (Minecraft.thePlayer.qp == 0.0f && Minecraft.thePlayer.qn == 0.0f || !Minecraft.thePlayer.up) break;
                    if (Minecraft.thePlayer.d(Class2418.veb)) {
                        d3 += (double)((float)(Minecraft.thePlayer.n(Class2418.veb).nlw() + 1) * 0.1f);
                    }
                    Minecraft.thePlayer.ol = d3;
                    class2254.n(Minecraft.thePlayer.ol);
                    this.ogp *= 2.149;
                    break;
                }
                case 3: {
                    this.ogp = this.ogz - 0.7095 * (this.ogz - this.vor());
                    break;
                }
                default: {
                    if ((Minecraft.theWorld.d((EntityLivingBase)Minecraft.thePlayer, Minecraft.thePlayer.sy().ns(0.0, Minecraft.thePlayer.ol, 0.0)).size() > 0 || Minecraft.thePlayer.uj) && this.ogj > 0) {
                        this.ogj = Minecraft.thePlayer.qp == 0.0f && Minecraft.thePlayer.qn == 0.0f ? 0 : 1;
                    }
                    this.ogp = this.ogz - this.ogz / 159.0;
                }
            }
            this.ogp = Math.max(this.ogp, this.vor());
            if (d == 0.0 && d2 == 0.0) {
                class2254.toggle(0.0);
                class2254.v(0.0);
            }
            if (d != 0.0 && d2 != 0.0) {
                d *= Math.sin(0.7853981633974483);
                d2 *= Math.cos(0.7853981633974483);
            }
            class2254.toggle((d * this.ogp * -Math.sin(Math.toRadians(f)) + d2 * this.ogp * Math.cos(Math.toRadians(f))) * 0.99);
            class2254.v((d * this.ogp * Math.cos(Math.toRadians(f)) - d2 * this.ogp * -Math.sin(Math.toRadians(f))) * 0.99);
            ++this.ogj;
        }
    }

    private double vor() {
        double d = 0.272;
        if (Minecraft.thePlayer.d(Class2418.veh)) {
            int n = Minecraft.thePlayer.n(Class2418.veh).nlw();
            d *= 1.0 + 0.2 * (double)n;
        }
        return d;
    }

    @EventTarget
    public void toggle(Class2254 class2254) {
        if (omw.xm("HypixelDuel")) {
            this.pc("HypixelDuel");
            if (!Minecraft.thePlayer.cv() && Class1390.jrd()) {
                if (this.voh()) {
                    this.ogp = Class1390.jhe();
                }
                if (this.ogj == 1 && Minecraft.thePlayer.uj && this.voh()) {
                    this.ogp = 1.5 + Class1390.jhe() - 0.01;
                }
                if (this.voh() && this.ogj == 2) {
                    double d = 0.418;
                    if (Minecraft.thePlayer.d(Class2418.veb)) {
                        d += (double)((float)(Minecraft.thePlayer.n(Class2418.veb).nlw() + 1) * 0.1f);
                    }
                    Minecraft.thePlayer.ol = d;
                    class2254.n(Minecraft.thePlayer.ol);
                    this.ogp *= 2.08;
                } else if (this.ogj == 3) {
                    double d = 0.66 * (this.ogz - Class1390.jhe());
                    this.ogp = this.ogz - d;
                } else {
                    List<Class614> list = Minecraft.theWorld.d((EntityLivingBase)Minecraft.thePlayer, Minecraft.thePlayer.un.ns(0.0, Minecraft.thePlayer.ol, 0.0));
                    if ((list.size() > 0 || Minecraft.thePlayer.uj) && this.ogj > 0) {
                        this.ogj = Minecraft.thePlayer.pde() ? 1 : 0;
                    }
                    this.ogp = Class1390.jhe() * 1.00000011920929;
                    this.ogp = this.ogz - this.ogz / 159.0;
                }
                this.ogp = Math.max(this.ogp, Class1390.jhe());
                Minecraft.thePlayer.d(class2254, this.ogp);
                if (this.ogj > 0) {
                    this.n(class2254, this.ogp);
                }
                float f = Class575.odg;
                float f2 = Class575.odm;
                float f3 = Minecraft.thePlayer.oi;
                if (f == 0.0f && f2 == 0.0f) {
                    Minecraft.thePlayer.oa *= (Minecraft.thePlayer.ob *= 0.0);
                    class2254.ty = 0.0;
                    class2254.tt = 0.0;
                } else if (f != 0.0f) {
                    if (f2 >= 1.0f) {
                        f3 += f > 0.0f ? -45.0f : 45.0f;
                        f2 = 0.0f;
                    } else if (f2 <= -1.0f) {
                        f3 += f > 0.0f ? 45.0f : -45.0f;
                        f2 = 0.0f;
                    }
                    if (f > 0.0f) {
                        f = 1.0f;
                    } else if (f < 0.0f) {
                        f = -1.0f;
                    }
                }
                double d = Math.cos(Math.toRadians(f3 + 90.0f));
                double d2 = Math.sin(Math.toRadians(f3 + 90.0f));
                class2254.ty = (double)f * this.ogp * d + (double)f2 * this.ogp * d2;
                class2254.tt = (double)f * this.ogp * d2 - (double)f2 * this.ogp * d;
                if (f == 0.0f && f2 == 0.0f) {
                    class2254.ty = 0.0;
                    class2254.tt = 0.0;
                } else if (f != 0.0f) {
                    if (f2 >= 1.0f) {
                        float f4 = f3 + (f > 0.0f ? -45.0f : 45.0f);
                        f2 = 0.0f;
                    } else if (f2 <= -1.0f) {
                        float f5 = f3 + (f > 0.0f ? 45.0f : -45.0f);
                        f2 = 0.0f;
                    }
                    if (f > 0.0f) {
                        f = 1.0f;
                    } else if (f < 0.0f) {
                        f = -1.0f;
                    }
                }
                ++this.ogj;
            }
            Class1390.m(Class1390.pvc());
        }
        if (Class1390.jrd()) {
            double[] arrd = new double[]{0.368, 0.55, 0.249, 0.171, 0.427};
        }
    }

    private double nse() {
        double d = 0.2873;
        if (Minecraft.thePlayer.d(Class2418.veh)) {
            int n = Minecraft.thePlayer.n(Class2418.veh).nlw();
            d *= 1.0 + 0.2 * (double)(n + 1);
        }
        return d;
    }

    private void n(Class2254 class2254, double d) {
        double d2 = Class575.odg;
        double d3 = Class575.odm;
        float f = Minecraft.thePlayer.oi;
        if (d2 == 0.0 && d3 == 0.0) {
            class2254.toggle(0.0);
            class2254.v(0.0);
        } else {
            if (d2 != 0.0) {
                if (d3 > 0.0) {
                    f += (float)(d2 > 0.0 ? -45 : 45);
                } else if (d3 < 0.0) {
                    f += (float)(d2 > 0.0 ? 45 : -45);
                }
                d3 = 0.0;
                if (d2 > 0.0) {
                    d2 = 1.0;
                } else if (d2 < 0.0) {
                    d2 = -1.0;
                }
            }
            class2254.toggle(d2 * d * Math.cos(Math.toRadians(f + 90.0f)) + d3 * d * Math.sin(Math.toRadians(f + 90.0f)));
            class2254.v(d2 * d * Math.sin(Math.toRadians(f + 90.0f)) - d3 * d * Math.cos(Math.toRadians(f + 90.0f)));
        }
    }

    public static double n(double d, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public double toggle(double d, int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal bigDecimal = new BigDecimal(d);
        bigDecimal = bigDecimal.setScale(n, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    @Override
    public void onEnable() {
        Minecraft.thePlayer.oa *= 1.0;
        Minecraft.thePlayer.ol *= 1.0;
        Minecraft.thePlayer.ob *= 1.0;
        Class409.ods = 1.0f;
        Minecraft.thePlayer.nfn = 0.02f;
        super.onEnable();
    }

    @Override
    public void onDisable() {
        Minecraft.thePlayer.oa *= 0.0;
        Minecraft.thePlayer.ob *= 0.0;
        super.onDisable();
    }
}

