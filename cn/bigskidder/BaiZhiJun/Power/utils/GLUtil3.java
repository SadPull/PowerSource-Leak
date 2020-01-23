/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.awt.Color;
import org.lwjgl.opengl.GL11;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class578;
import package3.package2.package1.package82.Class487;
import package3.package2.package1.package82.package4387.Class1469;
import package3.package2.package152.Class409;
import package3.package2.package152.Class614;
import package3.package2.package39.EntityLivingBase;

public class Class1388 {
    private static final Class1469 rjn = new Class1469();

    public static double r(double d, double d2) {
        return d2 + (d - d2) * (double)Class2556.nmk().vhf.odc;
    }

    public static boolean pt(EntityLivingBase EntityLivingBase) {
        EntityLivingBase EntityLivingBase2 = Class2556.nmk().ngh();
        double d = Class1388.r(EntityLivingBase2.of, EntityLivingBase2.uf);
        double d2 = Class1388.r(EntityLivingBase2.om, EntityLivingBase2.um);
        double d3 = Class1388.r(EntityLivingBase2.og, EntityLivingBase2.ug);
        rjn.p(d, d2, d3);
        return rjn.t(EntityLivingBase.sy()) || EntityLivingBase.yh;
    }

    public static void jci() {
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
    }

    public static void jcw() {
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glColor3d((double)1.0, (double)1.0, (double)1.0);
    }

    public static int aq(int n) {
        return -16777216 | n;
    }

    public static void n(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        Class578.d(d, d2, d + d3, d2 + d4, n);
        Class578.d(d, d2, d, d2, n2);
    }

    public static int o(int n, float f) {
        float f2 = (float)(n >> 16 & 255) / 255.0f;
        float f3 = (float)(n >> 8 & 255) / 255.0f;
        float f4 = (float)(n >> 0 & 255) / 255.0f;
        return new Color(f2, f3, f4, f).getRGB();
    }

    public static void v(double d, double d2, double d3, double d4, int n) {
        Class1388.p(d + 0.5, d2, d3 - 0.5, d2 + 0.5, n);
        Class1388.p(d + 0.5, d4 - 0.5, d3 - 0.5, d4, n);
        Class1388.p(d, d2 + 0.5, d3, d4 - 0.5, n);
    }

    public static void d(double d, double d2, double d3, double d4, int n) {
        Class578.d(d, d2, d3, d4, n);
    }

    public static void z(int n, int n2, int n3, int n4, int n5) {
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
        Class578.z(n, n2, n3, n4, n5);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glHint((int)3155, (int)4352);
    }

    public static void jrb() {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glShadeModel((int)7425);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)2896);
        GL11.glDepthMask((boolean)false);
        GL11.glHint((int)3154, (int)4354);
    }

    public static void jri() {
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void n(float f, int n, int n2, int n3) {
        float f2 = 0.003921569f * (float)n;
        float f3 = 0.003921569f * (float)n2;
        float f4 = 0.003921569f * (float)n3;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static void az(int n) {
        float f = (float)(n >> 24 & 255) / 255.0f;
        float f2 = (float)(n >> 16 & 255) / 255.0f;
        float f3 = (float)(n >> 8 & 255) / 255.0f;
        float f4 = (float)(n & 255) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static void d(double d, double d2, double d3, double d4, int n, int n2, int n3) {
        Class578.d(d + (double)n, d2 + (double)n, d3 - (double)n, d4 - (double)n, n2);
        Class578.d(d, d2, d + (double)n, d4, n3);
        Class578.d(d + (double)n, d2, d3, d2 + (double)n, n3);
        Class578.d(d + (double)n, d4 - (double)n, d3, d4, n3);
        Class578.d(d3 - (double)n, d2 + (double)n, d3, d4 - (double)n, n3);
    }

    public static void d(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        double d6 = 0.0;
        if (d5 < 1.0) {
            d6 = 1.0;
        }
        Class1388.d(d + d5, d2 + d5, d3 - d5, d4 - d5, n);
        Class1388.d(d, d2 + 1.0 - d6, d + d5, d4, n2);
        Class1388.d(d, d2, d3 - 1.0 + d6, d2 + d5, n2);
        Class1388.d(d3 - d5, d2, d3, d4 - 1.0 + d6, n2);
        Class1388.d(d + 1.0 - d6, d4 - d5, d3, d4, n2);
    }

    public static void p(double d, double d2, double d3, double d4, int n) {
        Class578.d(d, d2, d3, d4, n);
    }

    public static void d(double d, double d2, double d3, double d4, int n, int n2) {
        float f = (float)(n >> 24 & 255) / 255.0f;
        float f2 = (float)(n >> 16 & 255) / 255.0f;
        float f3 = (float)(n >> 8 & 255) / 255.0f;
        float f4 = (float)(n & 255) / 255.0f;
        float f5 = (float)(n2 >> 24 & 255) / 255.0f;
        float f6 = (float)(n2 >> 16 & 255) / 255.0f;
        float f7 = (float)(n2 >> 8 & 255) / 255.0f;
        float f8 = (float)(n2 & 255) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glShadeModel((int)7425);
        GL11.glPushMatrix();
        GL11.glBegin((int)7);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d, (double)d4);
        GL11.glColor4f((float)f6, (float)f7, (float)f8, (float)f5);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glVertex2d((double)d3, (double)d2);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glShadeModel((int)7424);
        GL11.glColor4d((double)255.0, (double)255.0, (double)255.0, (double)255.0);
    }

    public static void p(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        Class1388.p(d + d5, d2 + d5, d3 - d5, d4 - d5, n);
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
        Class1388.p(d + d5, d2, d3 - d5, d2 + d5, n2);
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
        Class1388.p(d, d2, d + d5, d4, n2);
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
        Class1388.p(d3 - d5, d2, d3, d4, n2);
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
        Class1388.p(d + d5, d4 - d5, d3 - d5, d4, n2);
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
    }
}

