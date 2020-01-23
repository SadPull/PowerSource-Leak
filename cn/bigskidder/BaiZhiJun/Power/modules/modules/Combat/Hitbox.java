/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat;

import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;

public class Class2181
extends Module {
    public static Value<Double> klu = new Value<Double>("Hitbox_Size", 0.5, 0.1, 1.0, 0.1);

    public Class2181() {
        super("Hitbox", Category.Combat);
    }
}

