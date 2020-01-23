/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import client87.client86.Value;
import client87.client86.minecraft30.Class128;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package82.Class390;
import net.minecraft.client52.Class891;
import net.minecraft.client59.Class1886;

public class Class1039
extends Module {
    public static Value<Boolean> es = new Value<Boolean>("Xray_Cave", false);
    public Value<Double> ex = new Value<Double>("Xray_Opacity", 160.0, 0.0, 255.0, 5.0);
    private static HashSet eo = new HashSet();
    public static ArrayList<Class891> eu = new ArrayList();
    public static ArrayList<Integer> ey = new ArrayList();
    Thread ek;
    public boolean et;
    List eh = Lists.newArrayList((Object[])new Integer[]{10, 11, 8, 9, 14, 15, 16, 21, 41, 42, 46, 48, 52, 56, 57, 61, 62, 73, 74, 84, 89, 103, 116, 117, 118, 120, 129, 133, 137, 145, 152, 153, 154});

    public Class1039() {
        super("Xray", Category.Category.Player);
    }

    @Override
    public void onDisable() {
        super.onDisable();
        Class128.rqb.clear();
        eo.clear();
        Class128.rqi.clear();
        try {
            for (Integer n : this.eh) {
                eo.add(n);
                ey.add(n);
            }
        }
        catch (Exception exception) {
            exception.printStackTragetName();
        }
        Class128.rql = es.vut() != false;
        Class128.rqa = this.ex.vut().intValue();
        Class128.rqg = eo;
        Class128.rqf = true;
        this.pst.vha.plc();
        int n = (int)Minecraft.thePlayer.of;
        int n2 = (int)Minecraft.thePlayer.om;
        int n3 = (int)Minecraft.thePlayer.og;
        this.pst.vha.n(n - 900, n2 - 900, n3 - 900, n + 900, n2 + 900, n3 + 900);
        this.et = true;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        Class128.rqf = false;
        this.pst.vha.plc();
        Class128.rqb.clear();
        this.et = false;
        try {
            this.ek.interrupt();
            this.ek = null;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

