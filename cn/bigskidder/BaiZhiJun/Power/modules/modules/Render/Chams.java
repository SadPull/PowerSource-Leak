/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import org.lwjgl.opengl.GL11;
import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2208;
import client87.client86.package858.Class2211;

public class Class125
extends Module {
    public static Value<Double> hjk = new Value<Double>("Chams_Alpha", 0.5, 0.1, 1.0, 0.1);
    public static Value<Boolean> hjt = new Value<Boolean>("Chams_Colored", true);
    public static Value<Boolean> hjh = new Value<Boolean>("Chams_Flat", false);
    public static Value<Boolean> hjr = new Value<Boolean>("Chams_Hand", true);

    public Class125() {
        super("Chams", Category.Render);
    }

    @EventTarget
    private void d(Class2208 class2208) {
        GL11.glEnable((int)32823);
        GL11.glPolygonOffset((float)0.0f, (float)-1100000.0f);
    }

    @EventTarget
    private void d(Class2211 class2211) {
        GL11.glDisable((int)32823);
        GL11.glPolygonOffset((float)1.0f, (float)1100000.0f);
    }
}

