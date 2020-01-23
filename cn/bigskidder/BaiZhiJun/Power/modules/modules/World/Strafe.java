/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import client87.client86.Value;
import client87.client86.minecraft30.Class1390;
import cn.bigskidder.BaiZhiJun.Power.modules.ModuleManager;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2206;
import net.minecraft.client.Minecraft;
import net.minecraft.client.minecraft860.Class1027;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;

public class Class577
extends Module {
    public static Value<String> omp = new Value("Strafe", "Mode", 0);

    public Class577() {
        super("Strafe", Category.Category.World);
        Class577.omp.obg.add("NCP");
        this.psh = omp;
    }

    @EventTarget
    public void d(Class2206 class2206) {
        this.psh = omp;
        if (Class1390.jrd() && !ModuleManager.px("Speed").nji()) {
            if (this.pst.vrf.usx.ukj) {
                Minecraft.thePlayer.m(omp.xm("NCP") ? 0.26 : 0.23);
            } else {
                Minecraft.thePlayer.m(omp.xm("AAC") ? 0.17 : 0.135);
            }
        }
    }
}

