/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render;

import java.util.ArrayList;
import client87.client86.Class2525;
import client87.client86.Value;
import client87.client86.client85.client84.Class1002;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class970;

public class Class1484
extends Module {
    public static Value<Boolean> udv = new Value<Boolean>("ClickGui_snowflake", true);
    public static Value<Boolean> udj = new Value<Boolean>("ClickGui_Sound", true);
    public static Value<Boolean> udz = new Value<Boolean>("ClickGui_Cape", true);
    public static Value<String> udq = new Value("ClickGui", "Color", 0);

    public Class1484() {
        super("ClickGui", Category.Render);
        this.zn(54);
        Class1484.udq.obg.add("White");
        Class1484.udq.obg.add("Red");
        Class1484.udq.obg.add("Yellow");
        Class1484.udq.obg.add("Green");
        Class1484.udq.obg.add("Blue");
        Class1484.udq.obg.add("Purple");
        Class1484.udq.obg.add("Cyan");
        Class1484.udq.obg.add("Rainbow");
    }

    @Override
    public void onDisable() {
        this.pst.d(Class2525.oiy.vum());
        this.toggle(false);
    }
}

