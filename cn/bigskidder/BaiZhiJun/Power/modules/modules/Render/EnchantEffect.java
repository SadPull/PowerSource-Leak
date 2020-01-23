/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;

public class Class124
extends Module {
    public static Value<Double> hne = new Value<Double>("EnchantEffect_Red", 255.0, 0.0, 255.0, 1.0);
    public static Value<Double> hpd = new Value<Double>("EnchantEffect_Green", 255.0, 0.0, 255.0, 1.0);
    public static Value<Double> hpn = new Value<Double>("EnchantEffect_Blue", 255.0, 0.0, 255.0, 1.0);
    public static Value<Boolean> hpp = new Value<Boolean>("EnchantEffect_Rainbow", true);

    public Class124() {
        super("EnchantEffect", Category.Render);
    }
}

