/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import com.mojang.authlib.GameProfile;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import java.util.UUID;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.Value;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1388;
import cn.bigskidder.BaiZhiJun.Power.utils.Class158;
import cn.bigskidder.BaiZhiJun.Power.package639.package638.package3206.Class135;
import cn.bigskidder.BaiZhiJun.Power.package858.Class2227;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package0.Class578;
import package3.package2.package1.package103.Class1224;
import package3.package2.package1.package108.Class807;
import package3.package2.package1.package2064.Class2265;
import package3.package2.package1.package2860.Class1029;
import package3.package2.package1.package82.Class387;
import package3.package2.package1.package82.Class468;
import package3.package2.package1.package82.Class474;
import package3.package2.package1.package82.Class487;
import package3.package2.package1.package82.package1245.Class1527;
import package3.package2.package1.package82.package1245.Class1531;
import package3.package2.package1.package82.package356.Class2512;
import package3.package2.package1.package82.package833.Class1543;
import package3.package2.package152.Class409;
import package3.package2.package152.Class421;
import package3.package2.package152.Class614;
import package3.package2.package152.Class897;
import package3.package2.package39.EntityLivingBase;
import package3.package2.package39.Class1839;
import package3.package2.package39.package3530.Class858;

public enum Class1384 {
    rzk;
    
    public static Class2556 rzt;
    public static float rzh;

    static {
        rzt = Class2556.nmk();
    }

    public static void zh(float f) {
        GL11.glDisable((int)3008);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glEnable((int)2884);
        GL11.glEnable((int)2848);
        GL11.glHint((int)3154, (int)4354);
        GL11.glHint((int)3155, (int)4354);
        GL11.glLineWidth((float)f);
    }

    public static void d(EntityLivingBase EntityLivingBase, Color color, Class2227 class2227) {
        Class2556.nmk().ngf();
        double d = EntityLivingBase.uf + (EntityLivingBase.of - EntityLivingBase.uf) * (double)class2227.on() - Class1543.jxf;
        Class2556.nmk().ngf();
        double d2 = EntityLivingBase.um + (EntityLivingBase.om - EntityLivingBase.um) * (double)class2227.on() - Class1543.jxm;
        Class2556.nmk().ngf();
        double d3 = EntityLivingBase.ug + (EntityLivingBase.og - EntityLivingBase.ug) * (double)class2227.on() - Class1543.jxg;
        Class614 class614 = Class614.p(d - (double)EntityLivingBase.uo, d2, d3 - (double)EntityLivingBase.uo, d + (double)EntityLivingBase.uo, d2 + (double)EntityLivingBase.uu + 0.2, d3 + (double)EntityLivingBase.uo);
        Class614 class6142 = Class614.p(d - (double)EntityLivingBase.uo, d2, d3 - (double)EntityLivingBase.uo, d + (double)EntityLivingBase.uo, d2 + (double)EntityLivingBase.uu + 0.2, d3 + (double)EntityLivingBase.uo);
        Class614 class6143 = Class614.p(d - (double)EntityLivingBase.uo, d2, d3 - (double)EntityLivingBase.uo, d + (double)EntityLivingBase.uo, d2 + (double)EntityLivingBase.uu + 0.2, d3 + (double)EntityLivingBase.uo);
        if (EntityLivingBase instanceof Class1839) {
            class614 = Class614.p(d - (double)EntityLivingBase.uo + 0.2, d2, d3 - (double)EntityLivingBase.uo + 0.2, d + (double)EntityLivingBase.uo - 0.2, d2 + (double)EntityLivingBase.uu + (EntityLivingBase.cg() ? 0.02 : 0.2), d3 + (double)EntityLivingBase.uo - 0.2);
            class6142 = Class614.p(d - (double)EntityLivingBase.uo + 0.2, d2, d3 - (double)EntityLivingBase.uo + 0.2, d + (double)EntityLivingBase.uo - 0.2, d2 + (double)EntityLivingBase.uu + (EntityLivingBase.cg() ? 0.02 : 0.2), d3 + (double)EntityLivingBase.uo - 0.2);
        }
        Class1388.jrb();
        GL11.glTranslated((double)d, (double)d2, (double)d3);
        GL11.glRotated((double)(-EntityLivingBase.oi % 360.0f), (double)0.0, (double)1.0, (double)0.0);
        GL11.glTranslated((double)(-d), (double)(-d2), (double)(-d3));
        if (Class135.hzy.xm("3DBox")) {
            GL11.glLineWidth((float)3.0f);
            GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            Class1384.h(class614);
        }
        GL11.glLineWidth((float)1.0f);
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)1.0f);
        Class1384.h(class6142);
        Class1388.jri();
    }

    public static int aa(int n) {
        double d = Math.ceil((double)(System.currentTimeMillis() + (long)n) / 5.0);
        return Color.getHSBColor((float)((d %= 360.0) / 360.0), 0.5f, 1.0f).getRGB();
    }

    public static void jfk() {
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glDepthMask((boolean)true);
        GL11.glCullFace((int)1029);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glHint((int)3155, (int)4352);
    }

    public static void d(double d, double d2, double d3, int n) {
        float f = (float)(n >> 24 & 255) / 255.0f;
        float f2 = (float)(n >> 16 & 255) / 255.0f;
        float f3 = (float)(n >> 8 & 255) / 255.0f;
        float f4 = (float)(n & 255) / 255.0f;
        Class487.p(516, 0.001f);
        Class487.o(f2, f3, f4, f);
        Class487.pbv();
        Class487.pbu();
        Class487.nrp();
        Class487.f(770, 771, 1, 0);
        Class474 class474 = Class474.pwl();
        for (double d4 = 0.0; d4 < 360.0; d4 += 1.0) {
            double d5 = Math.sin(d4 * 3.141592653589793 / 180.0) * d3;
            double d6 = Math.cos(d4 * 3.141592653589793 / 180.0) * d3;
            GL11.glVertex2d((double)((double)f3 + d), (double)((double)f4 + d2));
        }
        Class487.pbo();
        Class487.pbp();
        Class487.nrn();
        Class487.p(516, 0.1f);
    }

    public static void d(double d, double d2, double d3, int n, int n2) {
        float f = (float)(n >> 24 & 255) / 255.0f;
        float f2 = (float)(n >> 16 & 255) / 255.0f;
        float f3 = (float)(n >> 8 & 255) / 255.0f;
        float f4 = (float)(n & 255) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glBegin((int)9);
        if (n2 == 1) {
            GL11.glVertex2d((double)d, (double)d2);
            for (int i = 0; i <= 90; ++i) {
                double d4 = Math.sin((double)i * 3.141526 / 180.0) * d3;
                double d5 = Math.cos((double)i * 3.141526 / 180.0) * d3;
                GL11.glVertex2d((double)(d - d4), (double)(d2 - d5));
            }
        } else if (n2 == 2) {
            GL11.glVertex2d((double)d, (double)d2);
            for (int i = 90; i <= 180; ++i) {
                double d6 = Math.sin((double)i * 3.141526 / 180.0) * d3;
                double d7 = Math.cos((double)i * 3.141526 / 180.0) * d3;
                GL11.glVertex2d((double)(d - d6), (double)(d2 - d7));
            }
        } else if (n2 == 3) {
            GL11.glVertex2d((double)d, (double)d2);
            for (int i = 270; i <= 360; ++i) {
                double d8 = Math.sin((double)i * 3.141526 / 180.0) * d3;
                double d9 = Math.cos((double)i * 3.141526 / 180.0) * d3;
                GL11.glVertex2d((double)(d - d8), (double)(d2 - d9));
            }
        } else if (n2 == 4) {
            GL11.glVertex2d((double)d, (double)d2);
            for (int i = 180; i <= 270; ++i) {
                double d10 = Math.sin((double)i * 3.141526 / 180.0) * d3;
                double d11 = Math.cos((double)i * 3.141526 / 180.0) * d3;
                GL11.glVertex2d((double)(d - d10), (double)(d2 - d11));
            }
        } else {
            for (int i = 0; i <= 360; ++i) {
                double d12 = Math.sin((double)i * 3.141526 / 180.0) * d3;
                double d13 = Math.cos((double)i * 3.141526 / 180.0) * d3;
                GL11.glVertex2f((float)((float)(d - d12)), (float)((float)(d2 - d13)));
            }
        }
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void j(double d, double d2, double d3, double d4, int n) {
        double d5;
        if (d < d3) {
            d5 = d;
            d = d3;
            d3 = d5;
        }
        if (d2 < d4) {
            d5 = d2;
            d2 = d4;
            d4 = d5;
        }
        float f = (float)(n >> 24 & 255) / 255.0f;
        float f2 = (float)(n >> 16 & 255) / 255.0f;
        float f3 = (float)(n >> 8 & 255) / 255.0f;
        float f4 = (float)(n & 255) / 255.0f;
        Class474 class474 = Class474.pwl();
        Class387 class387 = class474.pwi();
        Class487.pbu();
        Class487.nrp();
        Class487.f(770, 771, 1, 0);
        Class487.o(f2, f3, f4, f);
        class387.d(7, Class1527.jrp);
        class387.a(d, d4, 0.0).paf();
        class387.a(d3, d4, 0.0).paf();
        class387.a(d3, d2, 0.0).paf();
        class387.a(d, d2, 0.0).paf();
        class474.pwb();
        Class487.nrn();
        Class487.pbo();
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
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
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glShadeModel((int)7424);
    }

    public static void p(double d, double d2, double d3, double d4, double d5, int n, int n2) {
        Class1384.j(d + d5, d2 + d5, d3 - d5, d4 - d5, n);
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
        Class1384.j(d + d5, d2, d3 - d5, d2 + d5, n2);
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
        Class1384.j(d, d2, d + d5, d4, n2);
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
        Class1384.j(d3 - d5, d2, d3, d4, n2);
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
        Class1384.j(d + d5, d4 - d5, d3 - d5, d4, n2);
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
    }

    public static void d(int n, int n2, double d, int n3, float f, int n4, int n5) {
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        d *= 2.0;
        n *= 2;
        n2 *= 2;
        float f2 = (float)(n5 >> 24 & 255) / 255.0f;
        float f3 = (float)(n5 >> 16 & 255) / 255.0f;
        float f4 = (float)(n5 >> 8 & 255) / 255.0f;
        float f5 = (float)(n5 & 255) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glLineWidth((float)f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)f3, (float)f4, (float)f5, (float)f2);
        GL11.glBegin((int)3);
        for (int i = n3 - n4; i <= n3; ++i) {
            double d2 = Math.sin((double)i * 3.141592653589793 / 180.0) * d;
            double d3 = Math.cos((double)i * 3.141592653589793 / 180.0) * d;
            GL11.glVertex2d((double)((double)n + d2), (double)((double)n2 + d3));
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
    }

    public static void d(Class158 class158) {
        if (class158 == null) {
            return;
        }
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rcf);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rcf);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rct);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rct);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rcf);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rct);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rcf);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rct);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rct);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rct);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rct);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rct);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rct);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rct);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rcf);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rct);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rct);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rcr, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rch, (double)class158.rcr, (double)class158.rcf);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rcf);
        GL11.glEnd();
        GL11.glBegin((int)7);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rct);
        GL11.glVertex3d((double)class158.rcy, (double)class158.rck, (double)class158.rcf);
        GL11.glVertex3d((double)class158.rch, (double)class158.rck, (double)class158.rcf);
        GL11.glEnd();
    }

    public static void az(int n) {
        float f = (float)(n >> 24 & 255) / 255.0f;
        float f2 = (float)(n >> 16 & 255) / 255.0f;
        float f3 = (float)(n >> 8 & 255) / 255.0f;
        float f4 = (float)(n & 255) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static double r(double d, double d2) {
        return d2 + (d - d2) * (double)Class2556.nmk().vhf.odc;
    }

    public static Color al(int n) {
        float f = (float)(System.nanoTime() + (long)n) / 2.0E10f % 1.0f;
        Color color = new Color((int)Long.parseLong(Integer.toHexString(Color.HSBtoRGB(f, 1.0f, 1.0f)), 16));
        return new Color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
    }

    public static void nh(Class421 class421) {
        Class1815 class1815 = new Class1815(Class2556.nmk());
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        Class468.l(770, 771, 1, 0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3008);
        Class2556.nmk().ngv().n(class421);
        Class578.d(0, 0, 0.0f, 0.0f, class1815.jvs(), class1815.jvx(), class1815.jvs(), class1815.jvx());
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3008);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    public static void p(String string, int n, int n2, int n3, int n4) {
        Class2556.nmk();
        for (EntityLivingBase EntityLivingBase : Class2556.vhg.lc()) {
            Class858 class858;
            if (!(EntityLivingBase instanceof Class858) || !string.equalsIgnoreCase((class858 = (Class858)EntityLivingBase).ce())) continue;
            GameProfile gameProfile = new GameProfile(class858.sq(), class858.ce());
            Class2265 class2265 = new Class2265(gameProfile);
            Class1815 class1815 = new Class1815(Class2556.nmk());
            GL11.glDisable((int)2929);
            GL11.glEnable((int)3042);
            GL11.glDepthMask((boolean)false);
            Class468.l(770, 771, 1, 0);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            Class2556.nmk().ngv().n(class2265.em());
            Class578.d(n, n2, 0.0f, 0.0f, n3, n4, n3, n4);
            GL11.glDepthMask((boolean)true);
            GL11.glDisable((int)3042);
            GL11.glEnable((int)2929);
        }
    }

    public static double nl(double d, double d2, double d3) {
        float f = (float)((double)rzh * d3);
        d = d < d2 ? (d + (double)f < d2 ? (d = d + (double)f) : d2) : (d - (double)f > d2 ? (d = d - (double)f) : d2);
        return d;
    }

    public static String d(InputStreamReader inputStreamReader) {
        String string = "";
        try {
            String string2;
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while ((string2 = bufferedReader.readLine()) != null) {
                string = String.valueOf(String.valueOf(string)) + string2 + "\n";
            }
            bufferedReader.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            System.exit(-1);
        }
        return string.toString();
    }

    public static void d(Class421 class421, int n, int n2, int n3, int n4) {
        Class1815 class1815 = new Class1815(Class2556.nmk());
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        Class468.l(770, 771, 1, 0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        Class2556.nmk().ngv().n(class421);
        Class578.d(n, n2, 0.0f, 0.0f, n3, n4, n3, n4);
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
    }

    public static void d(int n, int n2, int n3, int n4, int n5, Color color, Color color2) {
        Class1384.d(n, (float)n2, (float)n3, (float)n4, color2.getRGB());
        Class1384.d(n, (float)n2, (float)n3, (float)(n2 + n5), color.getRGB());
        Class1384.d(n, (float)(n4 - n5), (float)n3, (float)n4, color.getRGB());
        Class1384.d(n, (float)(n2 + n5), (float)(n + n5), (float)(n4 - n5), color.getRGB());
        Class1384.d(n3 - n5, (float)(n2 + n5), (float)n3, (float)(n4 - n5), color.getRGB());
    }

    public static void d(Class421 class421, int n, int n2, int n3, int n4, Color color) {
        Class1815 class1815 = new Class1815(Class2556.nmk());
        GL11.glDisable((int)2929);
        GL11.glEnable((int)3042);
        GL11.glDepthMask((boolean)false);
        Class468.l(770, 771, 1, 0);
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getRed() / 255.0f), (float)1.0f);
        Class2556.nmk().ngv().n(class421);
        Class578.d(n, n2, 0.0f, 0.0f, n3, n4, n3, n4);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2929);
    }

    public static void ni(int n, int n2, int n3, int n4) {
        Class2556 class2556 = Class2556.nmk();
        int n5 = 1;
        int n6 = class2556.vrf.uxg;
        if (n6 == 0) {
            n6 = 1000;
        }
        while (n5 < n6 && class2556.vht / (n5 + 1) >= 320 && class2556.vhh / (n5 + 1) >= 240) {
            ++n5;
        }
        GL11.glScissor((int)(n * n5), (int)(class2556.vhh - (n2 + n4) * n5), (int)(n3 * n5), (int)(n4 * n5));
    }

    public static void d(float f, float f2, float f3, float f4, int n) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        Class1384.ab(n);
        GL11.glBegin((int)7);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glPopMatrix();
    }

    public static void ab(int n) {
        float f = (float)(n >> 24 & 255) / 255.0f;
        float f2 = (float)(n >> 16 & 255) / 255.0f;
        float f3 = (float)(n >> 8 & 255) / 255.0f;
        float f4 = (float)(n & 255) / 255.0f;
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
    }

    public static int i(String string, int n) throws Exception {
        int n2 = 0;
        try {
            n2 = ARBShaderObjects.glCreateShaderObjectARB((int)n);
            if (n2 == 0) {
                return 0;
            }
        }
        catch (Exception exception) {
            ARBShaderObjects.glDeleteObjectARB((int)n2);
            throw exception;
        }
        ARBShaderObjects.glShaderSourceARB((int)n2, (CharSequence)string);
        ARBShaderObjects.glCompileShaderARB((int)n2);
        if (ARBShaderObjects.glGetObjectParameteriARB((int)n2, (int)35713) == 0) {
            throw new RuntimeException("Error creating shader:");
        }
        return n2;
    }

    public void d(int n, int n2, float f, int n3) {
        float f2 = (float)(n3 >> 24 & 255) / 255.0f;
        float f3 = (float)(n3 >> 16 & 255) / 255.0f;
        float f4 = (float)(n3 >> 8 & 255) / 255.0f;
        float f5 = (float)(n3 & 255) / 255.0f;
        boolean bl = GL11.glIsEnabled((int)3042);
        boolean bl2 = GL11.glIsEnabled((int)2848);
        boolean bl3 = GL11.glIsEnabled((int)3553);
        if (!bl) {
            GL11.glEnable((int)3042);
        }
        if (!bl2) {
            GL11.glEnable((int)2848);
        }
        if (bl3) {
            GL11.glDisable((int)3553);
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glColor4f((float)f3, (float)f4, (float)f5, (float)f2);
        GL11.glBegin((int)9);
        for (int i = 0; i <= 360; ++i) {
            GL11.glVertex2d((double)((double)n + Math.sin((double)i * 3.141526 / 180.0) * (double)f), (double)((double)n2 + Math.cos((double)i * 3.141526 / 180.0) * (double)f));
        }
        GL11.glEnd();
        if (bl3) {
            GL11.glEnable((int)3553);
        }
        if (!bl2) {
            GL11.glDisable((int)2848);
        }
        if (!bl) {
            GL11.glDisable((int)3042);
        }
    }

    public static void zr(float f) {
        Class1384.jry();
        GL11.glPushAttrib((int)1048575);
        GL11.glDisable((int)3008);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)f);
        GL11.glEnable((int)2848);
        GL11.glEnable((int)2960);
        GL11.glClear((int)1024);
        GL11.glClearStencil((int)15);
        GL11.glStencilFunc((int)512, (int)1, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public static void jft() {
        GL11.glStencilFunc((int)512, (int)0, (int)15);
        GL11.glStencilOp((int)7681, (int)7681, (int)7681);
        GL11.glPolygonMode((int)1032, (int)6914);
    }

    public static void jfh() {
        GL11.glStencilFunc((int)514, (int)1, (int)15);
        GL11.glStencilOp((int)7680, (int)7680, (int)7680);
        GL11.glPolygonMode((int)1032, (int)6913);
    }

    public static void jfr() {
        Class1384.v(new Color(255, 255, 255));
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)2929);
        GL11.glEnable((int)10754);
        GL11.glPolygonOffset((float)1.0f, (float)-2000000.0f);
        Class468.n(Class468.sxz, 240.0f, 240.0f);
    }

    public static void jff() {
        GL11.glPolygonOffset((float)1.0f, (float)2000000.0f);
        GL11.glDisable((int)10754);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)2960);
        GL11.glDisable((int)2848);
        GL11.glHint((int)3154, (int)4352);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)3008);
        GL11.glPopAttrib();
    }

    public static void v(Color color) {
        GL11.glColor4d((double)((float)color.getRed() / 255.0f), (double)((float)color.getGreen() / 255.0f), (double)((float)color.getBlue() / 255.0f), (double)((float)color.getAlpha() / 255.0f));
    }

    public static void jry() {
        Class807 class807 = Class2556.nmk().nfc();
        if (class807 != null && class807.jjt > -1) {
            Class1384.d(class807);
            class807.jjt = -1;
        }
    }

    public static void d(Class807 class807) {
        EXTFramebufferObject.glDeleteRenderbuffersEXT((int)class807.jjt);
        int n = EXTFramebufferObject.glGenRenderbuffersEXT();
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)n);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)Class2556.nmk().vht, (int)Class2556.nmk().vhh);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)n);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36096, (int)36161, (int)n);
    }

    public static void h(Class614 class614) {
        Class474 class474 = Class474.pwl();
        Class387 class387 = class474.pwi();
        class387.d(3, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class474.pwb();
        class387.d(3, Class1527.jrp);
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class474.pwb();
        class387.d(1, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class474.pwb();
    }

    public static void r(Class614 class614) {
        Class474 class474 = Class474.pwl();
        Class387 class387 = class474.pwi();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xay, class614.xak).paf();
        class387.a(class614.xas, class614.xax, class614.xak).paf();
        class387.a(class614.xas, class614.xay, class614.xao).paf();
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xao).paf();
        class387.a(class614.xau, class614.xax, class614.xao).paf();
        class387.a(class614.xau, class614.xay, class614.xak).paf();
        class387.a(class614.xau, class614.xax, class614.xak).paf();
        class474.pwb();
    }

    public static void n(double d, double d2, double d3, float f, float f2, float f3, float f4, float f5) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glLineWidth((float)f5);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Class1384.h(new Class614(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void d(double d, double d2, double d3, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Class1384.r(new Class614(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0));
        GL11.glLineWidth((float)f9);
        GL11.glColor4f((float)f5, (float)f6, (float)f7, (float)f8);
        Class1384.h(new Class614(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void d(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Class1384.r(new Class614(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0));
        GL11.glColor3f((float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void d(double d, double d2, double d3, double d4, double d5, float f, float f2, float f3, float f4) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Class1384.h(new Class614(d - d4, d2, d3 - d4, d + d4, d2 + d5, d3 + d4));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void n(double d, double d2, double d3, double d4, double d5, float f, float f2, float f3, float f4) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Class1384.r(new Class614(d - d4, d2, d3 - d4, d + d4, d2 + d5, d3 + d4));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void d(double d, double d2, double d3, double d4, double d5, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Class1384.r(new Class614(d - d4, d2, d3 - d4, d + d4, d2 + d5, d3 + d4));
        GL11.glLineWidth((float)f9);
        GL11.glColor4f((float)f5, (float)f6, (float)f7, (float)f8);
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    public static void p(double d, double d2, double d3, double d4, double d5, float f, float f2, float f3, float f4) {
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        GL11.glColor4f((float)f, (float)f2, (float)f3, (float)f4);
        Class1384.r(new Class614(d - d4, d2, d3 - d4, d + d4, d2 + d5, d3 + d4));
        GL11.glDisable((int)2848);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDepthMask((boolean)true);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    private static void n(Color color) {
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)((float)color.getAlpha() / 255.0f));
    }

    public static void m(Class614 class614) {
        Class474 class474 = Class474.pwl();
        Class387 class387 = class474.pwi();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao).paf();
        class387.a(class614.xas, class614.xay, class614.xao);
        class387.a(class614.xau, class614.xax, class614.xao);
        class387.a(class614.xau, class614.xay, class614.xao);
        class387.a(class614.xau, class614.xax, class614.xak);
        class387.a(class614.xau, class614.xay, class614.xak);
        class387.a(class614.xas, class614.xax, class614.xak);
        class387.a(class614.xas, class614.xay, class614.xak);
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xau, class614.xay, class614.xao);
        class387.a(class614.xau, class614.xax, class614.xao);
        class387.a(class614.xas, class614.xay, class614.xao);
        class387.a(class614.xas, class614.xax, class614.xao);
        class387.a(class614.xas, class614.xay, class614.xak);
        class387.a(class614.xas, class614.xax, class614.xak);
        class387.a(class614.xau, class614.xay, class614.xak);
        class387.a(class614.xau, class614.xax, class614.xak);
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xay, class614.xao);
        class387.a(class614.xau, class614.xay, class614.xao);
        class387.a(class614.xau, class614.xay, class614.xak);
        class387.a(class614.xas, class614.xay, class614.xak);
        class387.a(class614.xas, class614.xay, class614.xao);
        class387.a(class614.xas, class614.xay, class614.xak);
        class387.a(class614.xau, class614.xay, class614.xak);
        class387.a(class614.xau, class614.xay, class614.xao);
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao);
        class387.a(class614.xau, class614.xax, class614.xao);
        class387.a(class614.xau, class614.xax, class614.xak);
        class387.a(class614.xas, class614.xax, class614.xak);
        class387.a(class614.xas, class614.xax, class614.xao);
        class387.a(class614.xas, class614.xax, class614.xak);
        class387.a(class614.xau, class614.xax, class614.xak);
        class387.a(class614.xau, class614.xax, class614.xao);
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xax, class614.xao);
        class387.a(class614.xas, class614.xay, class614.xao);
        class387.a(class614.xas, class614.xax, class614.xak);
        class387.a(class614.xas, class614.xay, class614.xak);
        class387.a(class614.xau, class614.xax, class614.xak);
        class387.a(class614.xau, class614.xay, class614.xak);
        class387.a(class614.xau, class614.xax, class614.xao);
        class387.a(class614.xau, class614.xay, class614.xao);
        class474.pwb();
        class387.d(7, Class1527.jrp);
        class387.a(class614.xas, class614.xay, class614.xak);
        class387.a(class614.xas, class614.xax, class614.xak);
        class387.a(class614.xas, class614.xay, class614.xao);
        class387.a(class614.xas, class614.xax, class614.xao);
        class387.a(class614.xau, class614.xay, class614.xao);
        class387.a(class614.xau, class614.xax, class614.xao);
        class387.a(class614.xau, class614.xay, class614.xak);
        class387.a(class614.xau, class614.xax, class614.xak);
        class474.pwb();
    }

    public static void p(float f, float f2, float f3, float f4, float f5, int n) {
        Class578.z((int)(f += (float)((double)(f5 / 2.0f) + 0.5)), (int)(f2 += (float)((double)(f5 / 2.0f) + 0.5)), (int)(f3 -= (float)((double)(f5 / 2.0f) + 0.5)), (int)(f4 -= (float)((double)(f5 / 2.0f) + 0.5)), n);
        Class1384.p(f3 - f5 / 2.0f, f2 + f5 / 2.0f, f5, n);
        Class1384.p(f + f5 / 2.0f, f4 - f5 / 2.0f, f5, n);
        Class1384.p(f + f5 / 2.0f, f2 + f5 / 2.0f, f5, n);
        Class1384.p(f3 - f5 / 2.0f, f4 - f5 / 2.0f, f5, n);
        Class578.z((int)(f - f5 / 2.0f - 0.5f), (int)(f2 + f5 / 2.0f), (int)f3, (int)(f4 - f5 / 2.0f), n);
        Class578.z((int)f, (int)(f2 + f5 / 2.0f), (int)(f3 + f5 / 2.0f + 0.5f), (int)(f4 - f5 / 2.0f), n);
        Class578.z((int)(f + f5 / 2.0f), (int)(f2 - f5 / 2.0f - 0.5f), (int)(f3 - f5 / 2.0f), (int)(f4 - f5 / 2.0f), n);
        Class578.z((int)(f + f5 / 2.0f), (int)f2, (int)(f3 - f5 / 2.0f), (int)(f4 + f5 / 2.0f + 0.5f), n);
    }

    public static void p(float f, float f2, float f3, int n) {
        Class1384.d(f, f2, 0.0f, 360.0f, f3, n);
    }

    public static void d(float f, float f2, float f3, Color color) {
        Class1384.d(f, f2, 0.0f, 360.0f, f3, color);
    }

    public static void d(float f, float f2, float f3, float f4, float f5, int n) {
        Class1384.d(f, f2, f3, f4, f5, f5, n);
    }

    public static void d(float f, float f2, float f3, float f4, float f5, Color color) {
        Class1384.d(f, f2, f3, f4, f5, f5, color);
    }

    public static void d(float f, float f2, float f3, float f4, float f5, float f6, int n) {
        float f7;
        float f8;
        float f9;
        Class487.g(0.0f, 0.0f, 0.0f);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        float f10 = 0.0f;
        if (f3 > f4) {
            f10 = f4;
            f4 = f3;
            f3 = f10;
        }
        float f11 = (float)(n >> 24 & 255) / 255.0f;
        float f12 = (float)(n >> 16 & 255) / 255.0f;
        float f13 = (float)(n >> 8 & 255) / 255.0f;
        float f14 = (float)(n & 255) / 255.0f;
        Class474 class474 = Class474.pwl();
        Class387 class387 = class474.pwi();
        Class487.pbu();
        Class487.nrp();
        Class487.f(770, 771, 1, 0);
        Class487.o(f12, f13, f14, f11);
        if (f11 > 0.5f) {
            GL11.glEnable((int)2848);
            GL11.glLineWidth((float)2.0f);
            GL11.glBegin((int)3);
            for (f7 = f4; f7 >= f3; f7 -= 4.0f) {
                f9 = (float)Math.cos((double)f7 * 3.141592653589793 / 180.0) * f5 * 1.001f;
                f8 = (float)Math.sin((double)f7 * 3.141592653589793 / 180.0) * f6 * 1.001f;
                GL11.glVertex2f((float)(f + f9), (float)(f2 + f8));
            }
            GL11.glEnd();
            GL11.glDisable((int)2848);
        }
        GL11.glBegin((int)6);
        for (f7 = f4; f7 >= f3; f7 -= 4.0f) {
            f9 = (float)Math.cos((double)f7 * 3.141592653589793 / 180.0) * f5;
            f8 = (float)Math.sin((double)f7 * 3.141592653589793 / 180.0) * f6;
            GL11.glVertex2f((float)(f + f9), (float)(f2 + f8));
        }
        GL11.glEnd();
        Class487.nrn();
        Class487.pbo();
    }

    public static void d(float f, float f2, float f3, float f4, float f5, float f6, Color color) {
        float f7;
        float f8;
        float f9;
        Class487.g(0.0f, 0.0f, 0.0f);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        float f10 = 0.0f;
        if (f3 > f4) {
            f10 = f4;
            f4 = f3;
            f3 = f10;
        }
        Class474 class474 = Class474.pwl();
        Class387 class387 = class474.pwi();
        Class487.pbu();
        Class487.nrp();
        Class487.f(770, 771, 1, 0);
        Class487.o((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getAlpha() / 255.0f);
        if ((float)color.getAlpha() > 0.5f) {
            GL11.glEnable((int)2848);
            GL11.glLineWidth((float)2.0f);
            GL11.glBegin((int)3);
            for (f7 = f4; f7 >= f3; f7 -= 4.0f) {
                f8 = (float)Math.cos((double)f7 * 3.141592653589793 / 180.0) * f5 * 1.001f;
                f9 = (float)Math.sin((double)f7 * 3.141592653589793 / 180.0) * f6 * 1.001f;
                GL11.glVertex2f((float)(f + f8), (float)(f2 + f9));
            }
            GL11.glEnd();
            GL11.glDisable((int)2848);
        }
        GL11.glBegin((int)6);
        for (f7 = f4; f7 >= f3; f7 -= 4.0f) {
            f8 = (float)Math.cos((double)f7 * 3.141592653589793 / 180.0) * f5;
            f9 = (float)Math.sin((double)f7 * 3.141592653589793 / 180.0) * f6;
            GL11.glVertex2f((float)(f + f8), (float)(f2 + f9));
        }
        GL11.glEnd();
        Class487.nrn();
        Class487.pbo();
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

    public static void d(float f, float f2, float f3, float f4, float f5, int n, int n2) {
        Class578.d(f, f2, f3, f4, n2);
        float f6 = (float)(n >> 24 & 255) / 255.0f;
        float f7 = (float)(n >> 16 & 255) / 255.0f;
        float f8 = (float)(n >> 8 & 255) / 255.0f;
        float f9 = (float)(n & 255) / 255.0f;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glEnable((int)2848);
        GL11.glPushMatrix();
        GL11.glColor4f((float)f7, (float)f8, (float)f9, (float)f6);
        GL11.glLineWidth((float)f5);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glVertex2d((double)f3, (double)f2);
        GL11.glVertex2d((double)f, (double)f4);
        GL11.glVertex2d((double)f3, (double)f4);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
    }

    public static void qt(boolean bl) {
        if (bl) {
            Class487.pbu();
            GL11.glEnable((int)2848);
            Class487.pbs();
            Class487.nrp();
            Class487.vz(770, 771);
            GL11.glHint((int)3154, (int)4354);
        } else {
            Class487.pbo();
            Class487.nrn();
            GL11.glDisable((int)2848);
            Class487.pbx();
        }
        Class487.jt(!bl);
    }

    public static Class897 ny(Class858 class858) {
        float f = Class2556.nmk().vhf.odc;
        double d = class858.uf + (class858.of - class858.uf) * (double)f;
        double d2 = class858.um + (class858.om - class858.um) * (double)f;
        double d3 = class858.ug + (class858.og - class858.ug) * (double)f;
        return new Class897(d, d2, d3);
    }

    public static void n(EntityLivingBase EntityLivingBase, Color color, Class2227 class2227) {
        Class2556.nmk().ngf();
        double d = EntityLivingBase.uf + (EntityLivingBase.of - EntityLivingBase.uf) * (double)class2227.on() - Class1543.jxf;
        Class2556.nmk().ngf();
        double d2 = EntityLivingBase.um + (EntityLivingBase.om - EntityLivingBase.um) * (double)class2227.on() - Class1543.jxm;
        Class2556.nmk().ngf();
        double d3 = EntityLivingBase.ug + (EntityLivingBase.og - EntityLivingBase.ug) * (double)class2227.on() - Class1543.jxg;
        Class614 class614 = Class614.p(d - (double)EntityLivingBase.uo, d2, d3 - (double)EntityLivingBase.uo, d + (double)EntityLivingBase.uo, d2 + (double)EntityLivingBase.uu + 0.2, d3 + (double)EntityLivingBase.uo);
        Class614 class6142 = Class614.p(d - (double)EntityLivingBase.uo, d2, d3 - (double)EntityLivingBase.uo, d + (double)EntityLivingBase.uo, d2 + (double)EntityLivingBase.uu + 0.2, d3 + (double)EntityLivingBase.uo);
        if (EntityLivingBase instanceof Class1839) {
            class614 = Class614.p(d - (double)EntityLivingBase.uo + 0.11, d2 + 0.05, d3 - (double)EntityLivingBase.uo + 0.11, d + (double)EntityLivingBase.uo - 0.11, d2 + (double)EntityLivingBase.uu + -1.75, d3 + (double)EntityLivingBase.uo - 0.11);
            class6142 = Class614.p(d - (double)EntityLivingBase.uo + 0.0, d2 + 0.05, d3 - (double)EntityLivingBase.uo + 0.0, d + (double)EntityLivingBase.uo - 0.0, d2 + (double)EntityLivingBase.uu + -1.75, d3 + (double)EntityLivingBase.uo - 0.0);
        }
        GL11.glLineWidth((float)2.0f);
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
        Class1384.h(class614);
        GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)1.0f);
        Class1384.h(class6142);
    }
}

