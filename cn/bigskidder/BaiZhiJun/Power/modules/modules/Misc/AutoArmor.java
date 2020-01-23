/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C16PacketClientStatus;
import client87.client86.Value;
import client87.client86.minecraft30.package4614.Class1654;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2257;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class1821;
import net.minecraft.client.package0.Class970;
import net.minecraft.client.package0.net140.Class1059;
import net.minecraft.client.client03.Class1226;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;
import net.minecraft.net29.Class2001;
import net.minecraft.net29.Class2002;
import net.minecraft.net29.Class2059;
import net.minecraft.net9.net530.Entity;
import net.minecraft.net99.Class1449;
import net.minecraft.net99.Class1467;
import net.minecraft.package4.Class31;
import net.minecraft.package4.Class61;

public class Class241
extends Module {
    private Class1654 ptl = new Class1654();
    public static Value<String> ptb = new Value("AutoArmor", "Mode", 0);
    public static Value<Double> pti = new Value<Double>("AutoArmor_Delay", 1.0, 1.0, 10.0, 1.0);

    public Class241() {
        super("AutoArmor", Category.Misc);
        Class241.ptb.obg.add("Vanilla");
        Class241.ptb.obg.add("OpenInv");
        Class241.ptb.obg.add("FakeInv");
    }

    @EventTarget
    public void d(Class2257 class2257) {
        long l = pti.vut().longValue() * 50L;
        if (ptb.xm("OpenInv") && !(this.pst.vrq instanceof Class1059)) {
            return;
        }
        if ((this.pst.vrq == null || this.pst.vrq instanceof Class1059 || this.pst.vrq instanceof Class1821) && this.ptl.pv(l)) {
            this.nsw();
        }
    }

    public void nsw() {
        for (int i = 1; i < 5; ++i) {
            Object object;
            if (Minecraft.thePlayer.nhi.yd(4 + i).c()) {
                Class2059 class2059 = Minecraft.thePlayer.nhi.yd(4 + i).q();
                if (Class241.v(class2059, i)) continue;
                if (ptb.xm("FakeInv")) {
                    object = new C16PacketClientStatus(C16PacketClientStatus.EnumState.OPEN_INVENTORY_ACHIEVEMENT);
                    Minecraft.thePlayer.sendQueue.addToSendQueue((Packet)object);
                }
                this.zt(4 + i);
            }
            for (int j = 9; j < 45; ++j) {
                if (!Minecraft.thePlayer.nhi.yd(j).c() || !Class241.v((Class2059)(object = Minecraft.thePlayer.nhi.yd(j).q()), i) || !(Class241.nj((Class2059)object) > 0.0f)) continue;
                this.zk(j);
                this.ptl.npr();
                if (pti.vut().longValue() <= 0L) continue;
                return;
            }
        }
    }

    public static boolean v(Class2059 class2059, int n) {
        float f = Class241.nj(class2059);
        String string = "";
        if (n == 1) {
            string = "helmet";
        } else if (n == 2) {
            string = "chestplate";
        } else if (n == 3) {
            string = "leggings";
        } else if (n == 4) {
            string = "boots";
        }
        if (!class2059.vkb().contains(string)) {
            return false;
        }
        for (int i = 5; i < 45; ++i) {
            Class2059 class20592;
            if (!Minecraft.thePlayer.nhi.yd(i).c() || !(Class241.nj(class20592 = Minecraft.thePlayer.nhi.yd(i).q()) > f) || !class20592.vkb().contains(string)) continue;
            return false;
        }
        return true;
    }

    public void zk(int n) {
        Minecraft.vhx.d(Minecraft.thePlayer.nhi.say, n, 0, 1, Minecraft.thePlayer);
    }

    public void zt(int n) {
        Minecraft.vhx.d(Minecraft.thePlayer.nhi.say, n, 1, 4, Minecraft.thePlayer);
    }

    public static float nj(Class2059 class2059) {
        float f = 0.0f;
        if (class2059.vrw() instanceof Class2002) {
            Class2002 class2002 = (Class2002)class2059.vrw();
            f = (float)((double)f + ((double)class2002.ymf + (double)((100 - class2002.ymf) * Class31.q(Class61.hby.hiu, class2059)) * 0.0075));
            f = (float)((double)f + (double)Class31.q(Class61.hbh.hiu, class2059) / 100.0);
            f = (float)((double)f + (double)Class31.q(Class61.hbk.hiu, class2059) / 100.0);
            f = (float)((double)f + (double)Class31.q(Class61.hbg.hiu, class2059) / 100.0);
            f = (float)((double)f + (double)Class31.q(Class61.hiv.hiu, class2059) / 50.0);
            f = (float)((double)f + (double)Class31.q(Class61.hbr.hiu, class2059) / 100.0);
        }
        return f;
    }
}

