/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import java.util.List;
import client87.client86.Value;
import client87.client86.minecraft30.minecraft993.Class953;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2206;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class970;
import net.minecraft.client.package0.net140.Class1060;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.client03.Class1226;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class398;
import net.minecraft.client52.Class609;
import net.minecraft.client52.Class891;
import net.minecraft.client52.Class897;
import net.minecraft.client52.Class908;
import net.minecraft.client52.Class910;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.package520.Class1789;
import net.minecraft.net29.Class2001;
import net.minecraft.net29.Class2059;
import net.minecraft.net29.Class2065;
import net.minecraft.net29.Class2070;
import net.minecraft.net29.Class2099;
import net.minecraft.net29.Class2139;
import net.minecraft.net29.Class2149;
import net.minecraft.net579.Class2418;
import net.minecraft.net579.Class2421;
import net.minecraft.net9.net530.Entity;
import net.minecraft.net9.net530.Class859;
import net.minecraft.net99.Class1444;
import net.minecraft.net99.Class1449;
import net.minecraft.net99.Class1467;
import net.minecraft.package4.Class31;
import net.minecraft.package4.Class61;

public class Class1046
extends Module {
    private Class953 en = new Class953();
    private Class953 ep = new Class953();
    private boolean ev;
    public Value<Double> ej = new Value<Double>("Cheststealer_Delay", 2.0, 1.0, 10.0, 1.0);
    public Value<Boolean> ez = new Value<Boolean>("Cheststealer_Drop", false);
    public Value<Boolean> eq = new Value<Boolean>("Cheststealer_Close", true);
    public Value<Boolean> ec = new Value<Boolean>("Cheststealer_Hypixel", true);

    public Class1046() {
        super("ChestStealer", Category.Category.Player);
    }

    @EventTarget
    public void n(Class2206 class2206) {
        if (this.pst.vrq instanceof Class1060) {
            Class1060 class1060 = (Class1060)this.pst.vrq;
            String string = class1060.g.no().vql().toLowerCase();
            String string2 = class1060.g.no().vql();
            if (this.ec.vut().booleanValue() && Class908.sb("container.chest").equalsIgnoreCase(string2) || Class908.sb("container.chestDouble").equalsIgnoreCase(string2)) {
                String[] arrstring;
                for (String string3 : arrstring = new String[]{"menu", "selector", "game", "gui", "server", "inventory", "play", "teleporter", "shop", "melee", "armor", "block", "castle", "mini", "warp", "teleport", "user", "team", "tool", "sure", "trade", "cancel", "accept", "soul", "book", "recipe", "profile", "tele", "port", "map", "onEnablet", "select", "lobby", "vault", "lock"}) {
                    if (!string.contains(string3)) continue;
                    return;
                }
                this.ev = true;
                boolean bl = true;
                for (Class2059 class2059 : Minecraft.thePlayer.nhl.nmc) {
                    if (class2059 != null) continue;
                    bl = false;
                    break;
                }
                int n = 0;
                if (!bl) {
                    Class2059 class2059;
                    int n2;
                    for (n2 = 0; n2 < class1060.g.wk(); ++n2) {
                        class2059 = class1060.g.pu(n2);
                        if (class2059 == null || this.r(class2059)) continue;
                        n = 1;
                        break;
                    }
                    if (n != 0) {
                        for (n2 = 0; n2 < class1060.g.wk(); ++n2) {
                            class2059 = class1060.g.pu(n2);
                            if (class2059 == null || !Class953.jc(1 * ((Number)this.ej.vut()).intValue()) || this.r(class2059)) continue;
                            Minecraft.vhx.d(class1060.pd.say, n2, 0, this.ez.vut() != false ? 0 : 1, Minecraft.thePlayer);
                            if (this.ez.vut().booleanValue()) {
                                Minecraft.vhx.d(class1060.pd.say, -999, 0, 0, Minecraft.thePlayer);
                            }
                            Class953.npr();
                        }
                    } else if (this.eq.vut().booleanValue()) {
                        Minecraft.thePlayer.bg();
                        this.ev = false;
                    }
                } else if (this.eq.vut().booleanValue()) {
                    Minecraft.thePlayer.bg();
                    this.ev = false;
                }
            } else {
                this.ev = false;
            }
        }
    }

    private Class910 s(Class891 class891) {
        Class609 class609;
        Class910 class910 = null;
        if (!Minecraft.theWorld.u(class891.nc(0, 1, 0)).xk().vhf()) {
            class910 = Class910.xkc;
        }
        if ((class609 = Minecraft.theWorld.n(new Class897(Minecraft.thePlayer.of, Minecraft.thePlayer.om + (double)Minecraft.thePlayer.nk(), Minecraft.thePlayer.og), new Class897((double)class891.xl() + 0.5, class891.xb(), (double)class891.xi() + 0.5))) != null) {
            return class609.xaz;
        }
        return class910;
    }

    private boolean r(Class2059 class2059) {
        if (!this.ec.vut().booleanValue()) {
            return false;
        }
        Class2059 class20592 = null;
        float f = -1.0f;
        for (int i = 9; i < 45; ++i) {
            Class2059 class20593;
            if (!Minecraft.thePlayer.nhi.yd(i).c() || !((class20593 = Minecraft.thePlayer.nhi.yd(i).q()).vrw() instanceof Class2070) || !(class2059.vrw() instanceof Class2070) || !(f < this.m(class20593))) continue;
            f = this.m(class20593);
            class20592 = class20593;
        }
        if (class20592 != null && class20592.vrw() instanceof Class2070 && class2059.vrw() instanceof Class2070) {
            float f2 = this.m(class20592);
            float f3 = this.m(class2059);
            if (f3 > f2) {
                return false;
            }
        }
        return class2059 != null && (class2059.vrw().vkb().contains("tnt") || class2059.vrw().vkb().contains("stick") || class2059.vrw().vkb().contains("egg") && !class2059.vrw().vkb().contains("leg") || class2059.vrw().vkb().contains("string") || class2059.vrw().vkb().contains("flint") || class2059.vrw().vkb().contains("compass") || class2059.vrw().vkb().contains("feather") || class2059.vrw().vkb().contains("bucket") || class2059.vrw().vkb().contains("snow") || class2059.vrw().vkb().contains("fish") || class2059.vrw().vkb().contains("enchant") || class2059.vrw().vkb().contains("exp") || class2059.vrw().vkb().contains("shears") || class2059.vrw().vkb().contains("anvil") || class2059.vrw().vkb().contains("torch") || class2059.vrw().vkb().contains("seeds") || class2059.vrw().vkb().contains("leather") || class2059.vrw() instanceof Class2149 || class2059.vrw() instanceof Class2139 || class2059.vrw() instanceof Class2099 || class2059.vrw().vkb().contains("piston") || class2059.vrw().vkb().contains("potion") && this.f(class2059));
    }

    private boolean f(Class2059 class2059) {
        if (class2059 != null && class2059.vrw() instanceof Class2065) {
            Class2065 class2065 = (Class2065)class2059.vrw();
            if (Class2065.rtoggle(class2059.vfw())) {
                for (Class2421 class2421 : class2065.po(class2059)) {
                    Class2421 class24212 = class2421;
                    if (class24212.nli() != Class2418.jdc.nlt() && class24212.nli() != Class2418.vel.nlt() && class24212.nli() != Class2418.ver.nlt() && class24212.nli() != Class2418.jdq.nlt()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    private float m(Class2059 class2059) {
        if (!(class2059.vrw() instanceof Class2070)) {
            return 0.0f;
        }
        return (float)Class31.q(Class61.hbl.hiu, class2059) * 1.25f + ((Class2070)class2059.vrw()).vft();
    }
}

