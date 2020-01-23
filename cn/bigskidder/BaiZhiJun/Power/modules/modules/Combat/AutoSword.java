/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat;

import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import client87.client86.Value;
import client87.client86.minecraft30.Class1383;
import client87.client86.minecraft30.minecraft993.Class951;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2173;
import client87.client86.package858.Class2256;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class1821;
import net.minecraft.client.package0.Class970;
import net.minecraft.client.package0.net140.Class1059;
import net.minecraft.client.client03.Class1226;
import net.minecraft.client.package4133.Class0;
import net.minecraft.net29.Class2001;
import net.minecraft.net29.Class2059;
import net.minecraft.net29.Class2070;
import net.minecraft.net29.Class2099;
import net.minecraft.net9.Entity;
import net.minecraft.net9.net530.Entity;
import net.minecraft.net9.net530.Class859;
import net.minecraft.net99.Class1449;
import net.minecraft.net99.Class1467;
import net.minecraft.package4.Class31;
import net.minecraft.package4.Class61;

public class Class2184
extends Module {
    private Class951 klq = new Class951();
    public static Value<Double> klc = new Value<Double>("AutoSword_Slot", 1.0, 1.0, 9.0, 1.0);
    public static Value<Boolean> kls = new Value<Boolean>("AutoSword_TargetSword", true);
    public static Class1383 klx = new Class1383();
    public static int klo = 36;

    public Class2184() {
        super("AutoSword", Category.Combat);
    }

    @EventTarget
    public void d(Class2256 class2256) {
        if (Class2173.kmo != null && kls.vut().booleanValue() && Minecraft.thePlayer.nhl.nmx != klc.vut().intValue() - 1) {
            Minecraft.thePlayer.nhl.nmx = klc.vut().intValue() - 1;
            Minecraft.getNetworkManager().sendPacket(new C09PacketHeldItemChange(Minecraft.thePlayer.nhl.nmx));
            Minecraft.vhx.nvg();
        }
        if ((this.pst.vrq == null || this.pst.vrq instanceof Class1059 || this.pst.vrq instanceof Class1821) && klx.pv(100.0f) && klo >= 36) {
            if (!Minecraft.thePlayer.nhi.yd(klo + klc.vut().intValue() - 1).c()) {
                this.re(klo);
            } else if (!Class2184.vc(Minecraft.thePlayer.nhi.yd(klo + klc.vut().intValue() - 1).q())) {
                this.re(klo);
            }
        }
    }

    public static boolean vc(Class2059 class2059) {
        float f = Class2184.m(class2059);
        for (int i = 9; i < 45; ++i) {
            Class2059 class20592;
            if (!Minecraft.thePlayer.nhi.yd(i).c() || !(Class2184.m(class20592 = Minecraft.thePlayer.nhi.yd(i).q()) > f) || !(class20592.vrw() instanceof Class2070)) continue;
            return false;
        }
        return class2059.vrw() instanceof Class2070;
    }

    public void jv(int n, int n2) {
        Minecraft.vhx.d(Minecraft.thePlayer.nhi.say, n, n2, 2, Minecraft.thePlayer);
    }

    public void re(int n) {
        for (int i = 9; i < 45; ++i) {
            Class2059 class2059;
            if (!Minecraft.thePlayer.nhi.yd(i).c() || !Class2184.vc(class2059 = Minecraft.thePlayer.nhi.yd(i).q()) || !(Class2184.m(class2059) > 0.0f) || !(class2059.vrw() instanceof Class2070)) continue;
            this.jv(i, n - 36 + klc.vut().intValue() - 1);
            this.klq.npr();
            break;
        }
    }

    private static float m(Class2059 class2059) {
        Class2001 class2001;
        float f = 0.0f;
        Class2001 class20012 = class2059.vrw();
        if (class20012 instanceof Class2099) {
            class2001 = (Class2099)class20012;
            f += ((Class2099)class2001).pea();
        }
        if (class20012 instanceof Class2070) {
            class2001 = (Class2070)class20012;
            f += ((Class2070)class2001).vfr();
        }
        return f += (float)Class31.q(Class61.hbl.hiu, class2059) * 1.25f + (float)Class31.q(Class61.hbe.hiu, class2059) * 0.01f;
    }
}

