/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.awt.Color;
import package3.package2.package1.Class2556;
import package3.package2.package1.package82.Class391;
import package3.package2.package1.package82.Class468;
import package3.package2.package1.package82.Class487;
import package3.package2.package1.package82.package833.Class1543;
import package3.package2.package39.EntityLivingBase;
import package3.package2.package39.Class1839;

public class Class163 {
    public static Color al(int n) {
        float f = (float)(System.nanoTime() + (long)n) / 2.0E10f % 1.0f;
        Color color = new Color((int)Long.parseLong(Integer.toHexString(Color.HSBtoRGB(f, 1.0f, 1.0f)), 16));
        return new Color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
    }

    public static void d(int n, int n2, int n3, float f, float f2, Class1839 class1839) {
        Class487.pbq();
        Class487.pbe();
        Class487.m(n, n2, 40.0f);
        Class487.f(-n3, n3, n3);
        Class487.x(180.0f, 0.0f, 0.0f, 1.0f);
        float f3 = class1839.zo;
        float f4 = class1839.oi;
        float f5 = class1839.ow;
        float f6 = class1839.zk;
        float f7 = class1839.zy;
        Class391.pwd();
        Class487.x(class1839.zo % 360.0f, 0.0f, 1.0f, 0.0f);
        Class487.x(-((float)Math.atan(f2 / 40.0f)) * 20.0f, 1.0f, 0.0f, 0.0f);
        class1839.zo = (float)Math.atan(f / 40.0f) * -14.0f;
        class1839.oi = (float)Math.atan(f / 40.0f) * -14.0f;
        class1839.ow = -((float)Math.atan(f2 / 40.0f)) * 15.0f;
        class1839.zy = class1839.oi;
        class1839.zk = class1839.oi;
        Class487.m(0.0f, 0.0f, 0.0f);
        Class1543 class1543 = Class2556.nmk().ngf();
        class1543.pn(180.0f);
        class1543.vy(false);
        class1543.n(class1839, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        class1543.vy(true);
        class1839.zo = f3;
        class1839.oi = f4;
        class1839.ow = f5;
        class1839.zk = f6;
        class1839.zy = f7;
        Class487.pid();
        Class391.pie();
        Class487.pbi();
        Class487.oo(Class468.sxz);
        Class487.nrp();
        Class487.oo(Class468.sxj);
    }
}

