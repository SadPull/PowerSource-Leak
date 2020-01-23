/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import client87.client86.Value;
import client87.client86.minecraft30.Class1384;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2227;
import client87.client86.package858.Class2252;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.package82.Class390;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client52.Class891;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.package520.Class1789;

public class Class151
extends Module {
    private static ArrayList<Integer> hzg = new ArrayList();
    private ArrayList<Class891> hza = new ArrayList();
    public Value<Double> hzl = new Value<Double>("BlockESP_BlockLimit", 250.0, 10.0, 1000.0, 1.0);

    public Class151() {
        super("BlockESP", Category.Render);
    }

    @Override
    public void onDisable() {
        this.pst.vha.plc();
        this.hza.clear();
        super.onDisable();
    }

    @EventTarget
    public void d(Class2252 class2252) {
        Class891 class891 = new Class891(class2252.xl(), class2252.xb(), class2252.xi());
        if ((double)this.hza.size() < (double)this.hzl.vut().intValue() && !this.hza.contains(class891) && hzg.contains(new Integer(Class1886.g(class2252.xk())))) {
            this.hza.add(class891);
        }
        for (int i = 0; i < this.hza.size(); ++i) {
            Class891 class8912 = this.hza.get(i);
            int n = Class1886.g(Minecraft.theWorld.u(class8912).xk());
            if (hzg.contains(n)) continue;
            this.hza.remove(i);
        }
    }

    @EventTarget
    public void n(Class2227 class2227) {
        for (Class891 class891 : this.hza) {
            this.vx(class891);
        }
    }

    private void vx(Class891 class891) {
        this.pst.ngf();
        this.pst.ngf();
        double d = (double)class891.xl() - Class1543.jxf;
        this.pst.ngf();
        this.pst.ngf();
        double d2 = (double)class891.xb() - Class1543.jxm;
        this.pst.ngf();
        this.pst.ngf();
        double d3 = (double)class891.xi() - Class1543.jxg;
        Class1384.d(d, d2, d3, 0.0f, 0.5f, 1.0f, 0.25f);
    }

    public static ArrayList<Integer> jgetName() {
        return hzg;
    }
}

