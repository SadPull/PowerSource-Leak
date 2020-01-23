/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.client.C0APacketAnimation;
import org.lwjgl.opengl.GL11;
import client87.client86.Value;
import client87.client86.minecraft30.Class1384;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class1390;
import client87.client86.minecraft30.Class1393;
import client87.client86.minecraft30.Class1399;
import client87.client86.minecraft30.Class160;
import client87.client86.minecraft30.net93.net92.Class1652;
import client87.client86.minecraft30.net93.net92.Class1655;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class221;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class222;
import client87.client86.package858.Class2203;
import client87.client86.package858.Class2204;
import client87.client86.package858.Class2206;
import client87.client86.package858.Class2227;
import client87.client86.package858.Class2254;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class1815;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.client03.Class1226;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.minecraft860.Class1027;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class409;
import net.minecraft.client52.Class575;
import net.minecraft.client52.Class614;
import net.minecraft.client52.Class890;
import net.minecraft.client52.Class891;
import net.minecraft.client52.Class897;
import net.minecraft.client52.Class910;
import net.minecraft.client59.Class1718;
import net.minecraft.client59.Class1721;
import net.minecraft.client59.Class1740;
import net.minecraft.client59.Class1743;
import net.minecraft.client59.Class1745;
import net.minecraft.client59.Class1752;
import net.minecraft.client59.Class1781;
import net.minecraft.client59.Class1851;
import net.minecraft.client59.Class1859;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.Class1888;
import net.minecraft.client59.Class1917;
import net.minecraft.client59.Class2054;
import net.minecraft.client59.Class2346;
import net.minecraft.client59.package520.Class1789;
import net.minecraft.net29.Class2001;
import net.minecraft.net29.Class2059;
import net.minecraft.net29.Class2110;
import net.minecraft.net579.Class2418;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.net530.Entity;
import net.minecraft.net9.net530.Class859;
import net.minecraft.net96.Class2072;
import net.minecraft.net99.Class1449;
import net.minecraft.net99.Class1467;
import net.minecraft.package9.Class2469;

public class Class550
extends Module {
    private Class222 oan;
    private Class221 oap = new Class221(this);
    private Class221 oav = new Class221(this);
    private Class221 oaj = new Class221(this);
    private Value<Boolean> oaz = new Value<Boolean>("Scaffold_Tower", true);
    private Value<Boolean> oaq = new Value<Boolean>("Scaffold_NoSwing", false);
    private Value<Boolean> oac = new Value<Boolean>("Scaffold_Silent", true);
    public static Value<Boolean> oas = new Value<Boolean>("Scaffold_Rotary animation", true);
    public static Value<Boolean> oax = new Value<Boolean>("Scaffold_MoveTower", false);
    private Value<Boolean> oao = new Value<Boolean>("Scaffold_ESP", true);
    public Value<String> oau = new Value("Scaffold", "Mode", 0);
    private double oay;
    private Class891 oak;
    private Class910 oat;
    private List<Class1886> oah;
    private List<Class1886> oar;
    private boolean oaf = false;
    private boolean oam = false;
    private double oag;
    int oaa;
    int oal;
    Class1655 oab = Class1652.jvq;

    public Class550() {
        super("Scaffold", Category.Category.World);
        this.oau.obg.add("Hypixel");
        this.psh = this.oau;
        this.pc(this.getDisplayName());
        this.oah = Arrays.asList(Class2072.opv, Class2072.opy, Class2072.opu, Class2072.opt, Class2072.opk, Class2072.ocz, Class2072.ocg, Class2072.ovr, Class2072.oxn, Class2072.oqy, Class2072.oxo, Class2072.oqu, Class2072.oju, Class2072.ozo, Class2072.oxj, Class2072.opg, Class2072.ojx, Class2072.ocm, Class2072.ojc, Class2072.ojv, Class2072.oss, Class2072.osx, Class2072.ovj, Class2072.opf, Class2072.opm, Class2072.ovd, Class2072.ozq, Class2072.ozz, Class2072.ozj, Class2072.ozp, Class2072.oso, Class2072.osu, Class2072.ozx, Class2072.osq, Class2072.ozk, Class2072.ozn, Class2072.osl, Class2072.ojw, Class2072.ovc, Class2072.ovq, Class2072.ojt, Class2072.oji, Class2072.ozf, Class2072.ozs, Class2072.ose, Class2072.oqq, Class2072.oca, Class2072.osm, Class2072.oqb, Class2072.oqg, Class2072.oql, Class2072.oqa, Class2072.oqm, Class2072.oqf, Class2072.ovp, Class2072.opx, Class2072.ovo, Class2072.ovu, Class2072.ovx, Class2072.ovf, Class2072.ovg, Class2072.ove, Class2072.ovm, Class2072.ocp, Class2072.oqr, Class2072.oxs, Class2072.osv, Class2072.osn, Class2072.ozi, Class2072.oqp);
        this.oar = Arrays.asList(Class2072.ojt, Class2072.ojc, Class2072.osx, Class2072.opv, Class2072.opy, Class2072.opu, Class2072.opt, Class2072.opk, Class2072.ocg, Class2072.ocz, Class2072.ozx, Class2072.osq, Class2072.oju, Class2072.osn);
    }

    @EventTarget
    public void toggle(Class2204 class2204) {
        Class1815 class1815 = new Class1815(this.pst);
        int n = new Color(255, 0, 0, 255).getRGB();
        if (this.voi() >= 64 && 128 > this.voi()) {
            n = new Color(255, 255, 0, 255).getRGB();
        } else if (this.voi() >= 128) {
            n = new Color(0, 255, 0, 255).getRGB();
        }
        this.oab.d(String.valueOf(this.voi()), (double)(-this.oab.jj(String.valueOf(this.voi())) / 2 + class1815.jvs() / 2 - 1), (double)(class1815.jvx() / 2 - 30), n);
    }

    @EventTarget
    public void n(Class2227 class2227) {
        if (this.oao.vut().booleanValue()) {
            this.toggle(class2227);
        }
    }

    public void toggle(Class2227 class2227) {
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        for (Object e : Minecraft.theWorld.nkp) {
            if (!(e instanceof Entity) || e != Minecraft.thePlayer) continue;
            Entity Entity = (Entity)e;
            if (this.pst.vrf.usx.vkc()) {
                Class1384.n(Entity, new Color(255, 170, 0), class2227);
                continue;
            }
            if (Entity.cg()) {
                Class1384.n(Entity, new Color(0, 255, 170), class2227);
                continue;
            }
            Class1384.n(Entity, new Color(0, 0, 0), class2227);
        }
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)3042);
    }

    @EventTarget
    public void d(Class2206 class2206) {
        Object object;
        double d = Minecraft.thePlayer.of;
        double d2 = Minecraft.thePlayer.om - 0.8;
        double d3 = Minecraft.thePlayer.og;
        double d4 = Class575.odg;
        double d5 = Class575.odm;
        float f = Minecraft.thePlayer.oi;
        this.oag = 0.1;
        Class891 class891 = new Class891(d += d4 * this.oag * Math.cos(Math.toRadians(f + 90.0f)) + d5 * this.oag * Math.sin(Math.toRadians(f + 90.0f)), d2, d3 += d4 * this.oag * Math.sin(Math.toRadians(f + 90.0f)) - d5 * this.oag * Math.cos(Math.toRadians(f + 90.0f)));
        if (Minecraft.thePlayer != null) {
            this.oan = this.d(class891, this.oar);
            if (this.oan == null) {
                this.oan = this.d(class891.vzq(), this.oar);
            }
            if (Minecraft.theWorld.u(class891 = new Class891(d, d2, d3)).xk() == Class2072.opv) {
                if (this.vob()) {
                    return;
                }
                if (this.oan != null) {
                    object = this.c(Class222.ogi, Class222.ogw);
                    float[] arrf = Class1393.ng(((Class897)object).xfy, ((Class897)object).xfk, ((Class897)object).xft);
                    class2206.tv = arrf[1];
                    class2206.tp = arrf[0];
                }
                if (this.oan != null && this.oan != null && this.pst.vrf.usx.vkc() && this.oaz.vut().booleanValue() && !Class1390.jrv() && !Minecraft.thePlayer.d(Class2418.veb) && !oax.vut().booleanValue() && this.pst.vrf.usx.vkc()) {
                    Minecraft.nmk();
                    if (!Minecraft.thePlayer.pnd() && !Minecraft.thePlayer.d(Class2418.veb)) {
                        Minecraft.thePlayer.ol = 0.4196;
                        Minecraft.thePlayer.ob = 0.0;
                        Minecraft.thePlayer.oa = 0.0;
                    }
                }
            }
        }
        object = new Class891(d, d2, d3);
        if (oax.vut().booleanValue()) {
            if (!Minecraft.vte) {
                Class1386.d("\u8bf7\u8d2d\u4e70Power\u4ed8\u8d39\u7248! MoveTower\u4e3a\u4ed8\u8d39\u529f\u80fd!!", Class160.rqv);
                Class1386.d("\u5173\u6389Scaffold\u91cc\u7684MoveTower\u5373\u53ef\u7ee7\u7eed\u4f7f\u7528", Class160.rqn);
                oax.k(false);
                this.toggle(false);
                return;
            }
            if (!this.pst.vrf.usx.vkc()) {
                if (Class1390.jrv()) {
                    if (Class1399.pd(0.76) && !Class1399.pd(0.75) && Minecraft.thePlayer.ol > 0.23 && Minecraft.thePlayer.ol < 0.25) {
                        Minecraft.thePlayer.ol = (double)Math.round(Minecraft.thePlayer.om) - Minecraft.thePlayer.om;
                    }
                    if (Class1399.pd(1.0E-4) && Minecraft.thePlayer.ol > 0.1 && Minecraft.thePlayer.om >= (double)Math.round(Minecraft.thePlayer.om) - 1.0E-4 && Minecraft.thePlayer.om <= (double)Math.round(Minecraft.thePlayer.om) + 1.0E-4) {
                        Minecraft.thePlayer.ol = 0.0;
                    }
                }
                return;
            }
            if (Class1390.jrv()) {
                if (Class1399.pd(0.76) && !Class1399.pd(0.75) && Minecraft.thePlayer.ol > 0.23 && Minecraft.thePlayer.ol < 0.25) {
                    Minecraft.thePlayer.ol = (double)Math.round(Minecraft.thePlayer.om) - Minecraft.thePlayer.om;
                }
                if (Class1399.pd(1.0E-4) && !Minecraft.thePlayer.d(Class2418.veb)) {
                    Minecraft.thePlayer.ol = 0.4196000099182129;
                } else if (Minecraft.thePlayer.om >= (double)Math.round(Minecraft.thePlayer.om) - 1.0E-4 && Minecraft.thePlayer.om <= (double)Math.round(Minecraft.thePlayer.om) + 1.0E-4) {
                    Minecraft.thePlayer.ol = 0.0;
                }
            } else {
                Minecraft.thePlayer.oa = 0.0;
                Minecraft.thePlayer.ob = 0.0;
                Minecraft.thePlayer.zt = 0.0f;
                class891 = new Class891(d, d2, d3);
                if (Minecraft.theWorld.u(class891).xk() == Class2072.opv && this.oan != null && !Minecraft.thePlayer.d(Class2418.veb)) {
                    Minecraft.thePlayer.ol = 0.4196000099182129;
                    Minecraft.thePlayer.oa *= 0.75;
                    Minecraft.thePlayer.ob *= 0.75;
                }
            }
        }
    }

    @EventTarget
    public void n(Class2203 class2203) {
        Object object;
        int n;
        if (this.oau.xm("Hypixel")) {
            this.pc("Hypixel");
        }
        if (this.vob()) {
            for (n = 9; n < 36; ++n) {
                if (!Minecraft.thePlayer.nhi.yd(n).c() || !((object = Minecraft.thePlayer.nhi.yd(n).q().vrw()) instanceof Class2110) || this.oah.contains(((Class2110)object).xk()) || ((Class2110)object).xk().vkm().toLowerCase().contains("chest")) continue;
                this.jv(n, 7);
                break;
            }
        }
        if (this.vob()) {
            return;
        }
        for (n = 36; n < 45; ++n) {
            Class2001 class2001;
            if (!Minecraft.thePlayer.nhi.yd(n).c() || !((class2001 = ((Class2059)(object = Minecraft.thePlayer.nhi.yd(n).q())).vrw()) instanceof Class2110) || this.oah.contains(((Class2110)class2001).xk()) || ((Class2110)class2001).xk().vkm().toLowerCase().contains("chest") || this.oan == null) continue;
            this.oal = this.vow();
            int n2 = Minecraft.thePlayer.nhl.nmx;
            if (this.oal == -1) {
                for (int i = 9; i < 36; ++i) {
                    Class2001 class20012;
                    if (!Minecraft.thePlayer.nhi.yd(i).c() || !((class20012 = Minecraft.thePlayer.nhi.yd(i).q().vrw()) instanceof Class2110) || this.oah.contains(((Class2110)class20012).xk()) || ((Class2110)class20012).xk().vkm().toLowerCase().contains("chest")) continue;
                    this.jv(i, 7);
                    break;
                }
                return;
            }
            Minecraft.thePlayer.sendQueue.addToSendQueue(new C09PacketHeldItemChange(this.oal));
            Minecraft.thePlayer.nhl.nmx = this.oal;
            Minecraft.vhx.nvg();
            try {
                if (Minecraft.vhx.d(Minecraft.thePlayer, Minecraft.theWorld, Minecraft.thePlayer.vtoggle(), Class222.ogi, Class222.ogw, new Class897(Class222.toggle(this.oan)).nz(0.55, 0.55, 0.55).x(new Class897(Class222.v(this.oan).vjt()).e(0.5)))) {
                    if (this.oaq.vut().booleanValue()) {
                        Minecraft.thePlayer.sendQueue.addToSendQueue(new C0APacketAnimation());
                    } else {
                        Minecraft.thePlayer.swing();
                    }
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            Minecraft.thePlayer.nhl.nmx = n2;
            Minecraft.vhx.nvg();
            return;
        }
    }

    public static float nc(long l) {
        l = System.currentTimeMillis() + l;
        return 0.3f + (float)new Random(l).nextInt(70000000) / 1.0E8f + 1.458745E-8f;
    }

    protected void jv(int n, int n2) {
        Minecraft.vhx.d(Minecraft.thePlayer.nhi.say, n, n2, 2, Minecraft.thePlayer);
    }

    private boolean vob() {
        for (int i = 36; i < 45; ++i) {
            Class2001 class2001;
            if (!Minecraft.thePlayer.nhi.yd(i).c() || !((class2001 = Minecraft.thePlayer.nhi.yd(i).q().vrw()) instanceof Class2110) || this.oah.contains(((Class2110)class2001).xk())) continue;
            return false;
        }
        return true;
    }

    private double x(double d, double d2) {
        return ThreadLocalRandom.current().nextDouble(d, d2);
    }

    private boolean n(Class0 class0, Class1224 class1224, Class2059 class2059, Class891 class891, Class910 class910, Class897 class897) {
        if (class2059.vrw() instanceof Class2110) {
            return ((Class2110)class2059.vrw()).d(class1224, class891, class910, class0, class2059);
        }
        return false;
    }

    private void pi(Class891 class891) {
        if (Minecraft.theWorld.u(class891.nc(0, -1, 0)).xk() != Class2072.opv) {
            this.oak = class891.nc(0, -1, 0);
            this.oat = Class910.xkc;
        } else if (Minecraft.theWorld.u(class891.nc(-1, 0, 0)).xk() != Class2072.opv) {
            this.oak = class891.nc(-1, 0, 0);
            this.oat = Class910.xku;
        } else if (Minecraft.theWorld.u(class891.nc(1, 0, 0)).xk() != Class2072.opv) {
            this.oak = class891.nc(1, 0, 0);
            this.oat = Class910.xko;
        } else if (Minecraft.theWorld.u(class891.nc(0, 0, -1)).xk() != Class2072.opv) {
            this.oak = class891.nc(0, 0, -1);
            this.oat = Class910.xkx;
        } else if (Minecraft.theWorld.u(class891.nc(0, 0, 1)).xk() != Class2072.opv) {
            this.oak = class891.nc(0, 0, 1);
            this.oat = Class910.xks;
        } else {
            class891 = null;
            this.oat = null;
        }
    }

    private int voi() {
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            if (!Minecraft.thePlayer.nhi.yd(i).c()) continue;
            Class2059 class2059 = Minecraft.thePlayer.nhi.yd(i).q();
            Class2001 class2001 = class2059.vrw();
            if (!(class2059.vrw() instanceof Class2110) || this.oah.contains(((Class2110)class2001).xk())) continue;
            n += class2059.yhq;
        }
        return n;
    }

    private int vow() {
        for (int i = 36; i < 45; ++i) {
            Class2059 class2059 = Minecraft.thePlayer.nhi.yd(i).q();
            if (class2059 == null || !(class2059.vrw() instanceof Class2110) || class2059.yhq <= 0 || this.oah.stream().anyMatch(class1886 -> class1886.equals(((Class2110)class2059.vrw()).xk()))) continue;
            return i - 36;
        }
        return -1;
    }

    private Class222 d(Class891 class891, List list) {
        if (!this.oar.contains(Minecraft.theWorld.u(class891.nc(0, -1, 0)).xk())) {
            return new Class222(class891.nc(0, -1, 0), Class910.xkc);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class891.nc(-1, 0, 0)).xk())) {
            return new Class222(class891.nc(-1, 0, 0), Class910.xku);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class891.nc(1, 0, 0)).xk())) {
            return new Class222(class891.nc(1, 0, 0), Class910.xko);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class891.nc(0, 0, -1)).xk())) {
            return new Class222(class891.nc(0, 0, -1), Class910.xkx);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class891.nc(0, 0, 1)).xk())) {
            return new Class222(class891.nc(0, 0, 1), Class910.xks);
        }
        Class891 class8912 = class891.nc(-1, 0, 0);
        if (!this.oar.contains(Minecraft.theWorld.u(class8912.nc(-1, 0, 0)).xk())) {
            return new Class222(class8912.nc(-1, 0, 0), Class910.xku);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8912.nc(1, 0, 0)).xk())) {
            return new Class222(class8912.nc(1, 0, 0), Class910.xko);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8912.nc(0, 0, -1)).xk())) {
            return new Class222(class8912.nc(0, 0, -1), Class910.xkx);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8912.nc(0, 0, 1)).xk())) {
            return new Class222(class8912.nc(0, 0, 1), Class910.xks);
        }
        Class891 class8913 = class891.nc(1, 0, 0);
        if (!this.oar.contains(Minecraft.theWorld.u(class8913.nc(-1, 0, 0)).xk())) {
            return new Class222(class8913.nc(-1, 0, 0), Class910.xku);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8913.nc(1, 0, 0)).xk())) {
            return new Class222(class8913.nc(1, 0, 0), Class910.xko);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8913.nc(0, 0, -1)).xk())) {
            return new Class222(class8913.nc(0, 0, -1), Class910.xkx);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8913.nc(0, 0, 1)).xk())) {
            return new Class222(class8913.nc(0, 0, 1), Class910.xks);
        }
        Class891 class8914 = class891.nc(0, 0, -1);
        if (!this.oar.contains(Minecraft.theWorld.u(class8914.nc(-1, 0, 0)).xk())) {
            return new Class222(class8914.nc(-1, 0, 0), Class910.xku);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8914.nc(1, 0, 0)).xk())) {
            return new Class222(class8914.nc(1, 0, 0), Class910.xko);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8914.nc(0, 0, -1)).xk())) {
            return new Class222(class8914.nc(0, 0, -1), Class910.xkx);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8914.nc(0, 0, 1)).xk())) {
            return new Class222(class8914.nc(0, 0, 1), Class910.xks);
        }
        Class891 class8915 = class891.nc(0, 0, 1);
        if (!this.oar.contains(Minecraft.theWorld.u(class8915.nc(-1, 0, 0)).xk())) {
            return new Class222(class8915.nc(-1, 0, 0), Class910.xku);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8915.nc(1, 0, 0)).xk())) {
            return new Class222(class8915.nc(1, 0, 0), Class910.xko);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8915.nc(0, 0, -1)).xk())) {
            return new Class222(class8915.nc(0, 0, -1), Class910.xkx);
        }
        if (!this.oar.contains(Minecraft.theWorld.u(class8915.nc(0, 0, 1)).xk())) {
            return new Class222(class8915.nc(0, 0, 1), Class910.xks);
        }
        return null;
    }

    public Class897 c(Class891 class891, Class910 class910) {
        if (class910 == Class910.xks) {
            return new Class897(class891.xl(), class891.xb(), (double)class891.xi() - 0.5);
        }
        if (class910 == Class910.xku) {
            return new Class897((double)class891.xl() + 0.5, class891.xb(), class891.xi());
        }
        if (class910 == Class910.xkx) {
            return new Class897(class891.xl(), class891.xb(), (double)class891.xi() + 0.5);
        }
        if (class910 == Class910.xko) {
            return new Class897((double)class891.xl() - 0.5, class891.xb(), class891.xi());
        }
        return new Class897(class891.xl(), class891.xb(), class891.xi());
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.oaj.npr();
    }

    @Override
    public void onEnable() {
        super.onEnable();
        Minecraft.thePlayer.sendQueue.addToSendQueue(new C09PacketHeldItemChange(Minecraft.thePlayer.nhl.nmx));
        Class409.ods = 1.0f;
    }

    @EventTarget
    public void n(Class2254 class2254) {
        double d = class2254.xc();
        double d2 = class2254.se();
        double d3 = class2254.xs();
        if (Minecraft.thePlayer.up) {
            double d4 = 0.05;
            while (d != 0.0) {
                if (!Minecraft.theWorld.d((EntityLivingBase)Minecraft.thePlayer, Minecraft.thePlayer.sy().ns(d, -1.0, 0.0)).isEmpty()) break;
                if (d < d4 && d >= -d4) {
                    d = 0.0;
                    continue;
                }
                if (d > 0.0) {
                    d -= d4;
                    continue;
                }
                d += d4;
            }
            while (d3 != 0.0) {
                if (!Minecraft.theWorld.d((EntityLivingBase)Minecraft.thePlayer, Minecraft.thePlayer.sy().ns(0.0, -1.0, d3)).isEmpty()) break;
                if (d3 < d4 && d3 >= -d4) {
                    d3 = 0.0;
                    continue;
                }
                if (d3 > 0.0) {
                    d3 -= d4;
                    continue;
                }
                d3 += d4;
            }
            while (d != 0.0 && d3 != 0.0 && Minecraft.theWorld.d((EntityLivingBase)Minecraft.thePlayer, Minecraft.thePlayer.sy().ns(d, -1.0, d3)).isEmpty()) {
                d = d < d4 && d >= -d4 ? 0.0 : (d > 0.0 ? (d -= d4) : (d += d4));
                if (d3 < d4 && d3 >= -d4) {
                    d3 = 0.0;
                    continue;
                }
                if (d3 > 0.0) {
                    d3 -= d4;
                    continue;
                }
                d3 += d4;
            }
        }
        class2254.toggle(d);
        class2254.n(d2);
        class2254.v(d3);
    }
}

