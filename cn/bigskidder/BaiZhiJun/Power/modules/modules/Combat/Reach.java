/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat;

import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;

public class Class2180
extends Module {
    public static Value<Double> kfe = new Value<Double>("Reach_Range", 4.5, 3.0, 10.0, 0.1);

    public Class2180() {
        super("Reach", Category.Combat);
    }
}

