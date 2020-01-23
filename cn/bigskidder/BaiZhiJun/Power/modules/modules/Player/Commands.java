/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import client87.client86.client087.Class1792;
import client87.client86.client087.Class1818;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2200;

public class Class1033
extends Module {
    public Class1033() {
        super("Commands", Category.Category.Player);
    }

    @EventTarget
    public void d(Class2200 class2200) {
        String string = Class1792.w(class2200.xz());
        if (!class2200.xz().startsWith("-")) {
            return;
        }
        class2200.h(true);
        if (class2200.xz().startsWith("-")) {
            for (Class1818 class1818 : Class1792.tv()) {
                for (int i = 0; i < class1818.tj().length; ++i) {
                    if (!string.split(" ")[0].equals("-" + class1818.tj()[i])) continue;
                    class1818.d(string.split(" "));
                    return;
                }
            }
            return;
        }
    }

    @Override
    public void onDisable() {
        Runtime.getRuntime();
        Runtime.getRuntime();
        super.onDisable();
    }
}

