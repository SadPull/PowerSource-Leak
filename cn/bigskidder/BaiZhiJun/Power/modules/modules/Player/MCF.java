/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import client87.client86.Class2525;
import client87.client86.client85.Class1610;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class1387;
import client87.client86.minecraft30.Class169;
import client87.client86.minecraft30.package4337.Class2497;
import client87.client86.minecraft30.package5073.Class1632;
import client87.client86.minecraft30.package5073.Class1639;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2206;
import net.minecraft.client.Minecraft;
import net.minecraft.client52.Class609;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.net530.Entity;

public class Class1032
extends Module {
    private Class2497 em = new Class2497(2);

    public Class1032() {
        super("MCF", Category.Category.Player);
    }

    @EventTarget
    public void n(Class2206 class2206) {
        this.setKey(Class1387.rjc.rjl);
        if (this.pst.vrr != null && this.pst.vrr.xac != null && this.pst.vrr.xac instanceof Entity) {
            String string = this.pst.vrr.xac.getName();
            if (this.em.jonDisable()) {
                if (Class1632.vg(string)) {
                    for (int i = 0; i < Class1632.nrb().size(); ++i) {
                        Class1639 class1639 = (Class1639)Class1632.nrb().get(i);
                        if (!class1639.getName().equalsIgnoreCase(string)) continue;
                        Class1632.nrb().remove(i);
                        Class1386.d("Remove MidClickFrid", Class1610.heq);
                    }
                } else {
                    Class1632.nrb().add(new Class1639(string, string));
                    Class1386.d("Add MidClickFrid", Class1610.hez);
                }
                Class2525.vuf().vug().jmm();
            }
        }
    }
}

