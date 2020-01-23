/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import client87.client86.Value;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class1390;
import client87.client86.minecraft30.Class1399;
import client87.client86.minecraft30.Class160;
import client87.client86.minecraft30.minecraft993.Class964;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2206;
import client87.client86.package858.Class2214;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft860.Class1027;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class608;
import net.minecraft.client52.Class614;
import net.minecraft.client52.Class891;
import net.minecraft.client59.Class1761;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.Class2315;
import net.minecraft.client59.minecraft531.Class1991;
import net.minecraft.client59.minecraft760.Class705;
import net.minecraft.client59.minecraft760.Class712;
import net.minecraft.client59.package520.Class1789;

public class Class553
extends Module {
    int ogf;
    int ogm;
    Class964 ogg = new Class964();
    private int oga;
    private Value<String> ogl = new Value("Jesus", "Mode", 0);

    public Class553() {
        super("Jesus", Category.Category.World);
        this.ogl.obg.add("Dolphin");
        this.psh = this.ogl;
    }

    @Override
    public void onDisable() {
        this.ogf = 0;
        this.ogm = 0;
    }

    @EventTarget
    public void n(Class2206 class2206) {
        double d;
        if (!Minecraft.vte) {
            Class1386.d("\u8bf7\u8d2d\u4e70Power\u4ed8\u8d39\u7248! Jesus\u4e3a\u4ed8\u8d39\u529f\u80fd!!", Class160.rqv);
            this.toggle(false);
            return;
        }
        boolean bl = this.vom();
        if (Minecraft.thePlayer.cv() && !Minecraft.thePlayer.cg() && bl && !this.ogl.xm("AAC")) {
            Minecraft.thePlayer.ol = 0.09;
        }
        if (this.ogl.xm("Dolphin")) {
            this.pc("Dolphin");
            if (Minecraft.thePlayer.up && !Minecraft.thePlayer.cv() && bl) {
                this.ogf = 1;
                this.ogg.npr();
            }
            if (this.ogf > 0 && !this.ogg.nl(2500.0)) {
                if (Minecraft.thePlayer.uj && !Class1399.pd(0.001) || Minecraft.thePlayer.cg()) {
                    this.ogf = -1;
                }
                Minecraft.thePlayer.oa *= 0.0;
                Minecraft.thePlayer.ob *= 0.0;
                if (!Class1390.jsk() && !Minecraft.thePlayer.cv()) {
                    Class1399.pn(0.25 + (double)Class1399.jhl() * 0.05);
                }
                if ((d = this.nt(this.ogf)) != -999.0) {
                    Minecraft.thePlayer.ol = d;
                }
                ++this.ogf;
            }
        }
        if (this.ogl.xm("AAC")) {
            this.pc("AAC");
            if (Minecraft.thePlayer.cv() && Class553.nk(-1.0)) {
                if (this.ogm == 1) {
                    ++this.ogf;
                    d = -0.021;
                    if (this.ogf >= 2) {
                        if (this.ogf == 2) {
                            d = -0.004;
                        } else {
                            this.ogf = 0;
                            d = 0.025;
                        }
                    }
                    Minecraft.thePlayer.oa *= 1.17;
                    Minecraft.thePlayer.ob *= 1.17;
                    Minecraft.thePlayer.ol = 0.0;
                    double d2 = Minecraft.thePlayer.of;
                    double d3 = Minecraft.thePlayer.og;
                    double d4 = Minecraft.thePlayer.om;
                    if (!this.pst.vrf.usx.vktoggle()) {
                        Minecraft.thePlayer.toggle(d2, d4 + d, d3);
                    }
                }
                this.ogm = 1;
            } else {
                this.ogm = 0;
            }
        }
    }

    @EventTarget
    public void d(Class2214 class2214) {
        int n = -1;
        if (this.ogl.xm("AAC")) {
            return;
        }
        if ((double)class2214.xt().xb() + 0.9 < Minecraft.thePlayer.un.xax) {
            if (Minecraft.theWorld.u(class2214.xt()).vpv().get((Object)Class1761.yul) instanceof Integer) {
                n = (Integer)((Comparable)Minecraft.theWorld.u(class2214.xt()).vpv().get((Object)Class1761.yul));
            }
            if (n <= 4) {
                class2214.v(new Class614(class2214.xt().xl(), class2214.xt().xb(), class2214.xt().xi(), class2214.xt().xl() + 1, (double)class2214.xt().xb() + (this.ogl.xm("Basic") ? 1.0 : 0.999), class2214.xt().xi() + 1));
                class2214.h(this.vog());
            }
        }
    }

    public static boolean vof() {
        if (Minecraft.thePlayer == null) {
            return false;
        }
        boolean bl = false;
        int n = (int)Minecraft.thePlayer.sy().ns((double)0.0, (double)-0.01, (double)0.0).xax;
        for (int i = Class608.ntoggle((double)Minecraft.thePlayer.sy().xas); i < Class608.ntoggle(Minecraft.thePlayer.sy().xau) + 1; ++i) {
            for (int j = Class608.ntoggle((double)Minecraft.thePlayer.sy().xao); j < Class608.ntoggle(Minecraft.thePlayer.sy().xak) + 1; ++j) {
                Class1886 class1886 = Minecraft.theWorld.u(new Class891(i, n, j)).xk();
                if (class1886 == null || class1886.vhr() == Class1991.jmk) continue;
                if (!(class1886 instanceof Class1761)) {
                    return false;
                }
                bl = true;
            }
        }
        return bl;
    }

    public static boolean ny(double d) {
        boolean bl = false;
        if (Minecraft.theWorld.u(new Class891(Minecraft.thePlayer.of, Minecraft.thePlayer.om - d, Minecraft.thePlayer.og)).xk().vhr().pdtoggle()) {
            bl = true;
        }
        return bl;
    }

    public static boolean nk(double d) {
        for (double d2 = Minecraft.thePlayer.un.xas; d2 < Minecraft.thePlayer.un.xau; d2 += 0.009999999776482582) {
            for (double d3 = Minecraft.thePlayer.un.xao; d3 < Minecraft.thePlayer.un.xak; d3 += 0.009999999776482582) {
                Class1886 class1886 = Minecraft.theWorld.u(new Class891(d2, Minecraft.thePlayer.om - d, d3)).xk();
                if (class1886 instanceof Class1761 || class1886 instanceof Class2315) continue;
                return false;
            }
        }
        return true;
    }

    boolean vom() {
        double d = Minecraft.thePlayer.of;
        double d2 = Minecraft.thePlayer.om;
        double d3 = Minecraft.thePlayer.og;
        ArrayList<Class891> arrayList = new ArrayList<Class891>(Arrays.asList(new Class891(d + 0.3, d2, d3 + 0.3), new Class891(d - 0.3, d2, d3 + 0.3), new Class891(d + 0.3, d2, d3 - 0.3), new Class891(d - 0.3, d2, d3 - 0.3)));
        for (Class891 class891 : arrayList) {
            if (!(Minecraft.theWorld.u(class891).xk() instanceof Class1761) || !(Minecraft.theWorld.u(class891).vpv().get((Object)Class1761.yul) instanceof Integer) || (Integer)((Comparable)Minecraft.theWorld.u(class891).vpv().get((Object)Class1761.yul)) > 4) continue;
            return true;
        }
        return false;
    }

    public double nt(double d) {
        d -= 1.0;
        double[] arrd = new double[]{0.5, 0.484, 0.468, 0.436, 0.404, 0.372, 0.34, 0.308, 0.276, 0.244, 0.212, 0.18, 0.166, 0.166, 0.156, 0.123, 0.135, 0.111, 0.086, 0.098, 0.073, 0.048, 0.06, 0.036, 0.0106, 0.015, 0.004, 0.004, 0.004, 0.004, -0.013, -0.045, -0.077, -0.109};
        double[] arrd2 = arrd;
        if (d < (double)arrd2.length && d >= 0.0) {
            return arrd2[(int)d];
        }
        return -999.0;
    }

    private boolean vog() {
        return !Minecraft.thePlayer.cg() && Minecraft.thePlayer.uh < 12.0f;
    }
}

