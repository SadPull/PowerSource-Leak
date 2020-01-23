/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.lwjgl.opengl.GL11;

public class Class159 {
    private static final Map<Integer, Boolean> rqu = new HashMap<Integer, Boolean>();

    public static void y(int n, boolean bl) {
        rqu.put(n, GL11.glGetBoolean((int)n));
        if (bl) {
            GL11.glEnable((int)n);
        } else {
            GL11.glDisable((int)n);
        }
    }

    private static void ae(int n) {
        Boolean bl = rqu.get(n);
        if (bl != null) {
            if (bl.booleanValue()) {
                GL11.glEnable((int)n);
            } else {
                GL11.glDisable((int)n);
            }
        }
    }

    public static void ld(int n) {
        Class159.y(n, true);
    }

    public static void ln(int n) {
        Class159.y(n, false);
    }

    public static void jmp() {
        for (Integer n : rqu.keySet()) {
            Class159.ae(n);
        }
    }
}

