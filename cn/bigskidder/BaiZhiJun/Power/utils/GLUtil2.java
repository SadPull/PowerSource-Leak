/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.awt.Color;

public class Class1382 {
    public static Color n(long l, float f) {
        float f2 = (float)(System.nanoTime() + l) / 1.0E10f % 1.0f;
        long l2 = Long.parseLong(Integer.toHexString(Color.HSBtoRGB(f2, 1.0f, 1.0f)), 16);
        Color color = new Color((int)l2);
        return new Color((float)color.getRed() / 255.0f * f, (float)color.getGreen() / 255.0f * f, (float)color.getBlue() / 255.0f * f, (float)color.getAlpha() / 255.0f);
    }
}

