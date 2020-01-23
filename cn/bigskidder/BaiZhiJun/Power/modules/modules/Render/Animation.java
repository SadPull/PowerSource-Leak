/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import java.util.ArrayList;
import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;

public class Class162
extends Module {
    public static Value<String> hja = new Value("Animation", "Mode", 0);
    public static Value<Boolean> hjl = new Value<Boolean>("Animation_SwingAnimation", true);

    public Class162() {
        super("Animation", Category.Render);
        Class162.hja.obg.add("None");
        Class162.hja.obg.add("Polaris");
        Class162.hja.obg.add("Vanilla");
        Class162.hja.obg.add("Swing");
        Class162.hja.obg.add("Swank");
        Class162.hja.obg.add("Gay");
        Class162.hja.obg.add("ETB");
        Class162.hja.obg.add("Sigma");
        Class162.hja.obg.add("Power");
        Class162.hja.obg.add("Power2");
        Class162.hja.obg.add("Exhibition");
        Class162.hja.obg.add("Avatar");
    }
}

