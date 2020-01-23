/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.util.Random;
import org.lwjgl.opengl.GL11;
import package3.package2.package1.Class2556;
import package3.package2.package1.package2860.Class1029;
import package3.package2.package1.package474.package473.Class123;
import package3.package2.package1.package82.Class487;
import package3.package2.package1.package82.Class490;
import package3.package2.package1.package82.package356.Class2488;
import package3.package2.package1.package82.package356.Class2492;
import package3.package2.package1.package82.package356.Class2512;
import package3.package2.package1.package82.package833.Class1543;
import package3.package2.package1.package82.package833.Class2537;
import package3.package2.package152.Class421;
import package3.package2.package152.Class891;
import package3.package2.package159.Class1886;
import package3.package2.package159.package2531.Class1991;
import package3.package2.package159.package520.Class1789;
import package3.package2.package329.Class2001;
import package3.package2.package329.Class2059;
import package3.package2.package39.EntityLivingBase;
import package3.package2.package39.package1436.Class626;
import package3.package2.package9.Class2469;

public class Class1378 {
    public static Random rvv = new Random();
    public static Class2556 rvj = Class2556.nmk();
    public static Class2537 rvz = rvj.ngm();
    public static long rvq;
    public static double rvc;
    public static final Class421 rvs;

    static {
        rvs = new Class421("textures/misc/enchanted_item_glint.png");
    }

    public static void z(EntityLivingBase EntityLivingBase, double d, double d2, double d3, float f, float f2) {
        Class626 class626;
        Class2059 class2059;
        rvc = (double)(System.nanoTime() - rvq) / 3000000.0 * 0.0;
        if (!Class1378.rvj.vfp) {
            rvc = 0.0;
        }
        if ((class2059 = (class626 = (Class626)EntityLivingBase).vdm()).vrw() != null) {
            rvv.setSeed(187L);
            boolean bl = false;
            if (Class2488.hdk != null) {
                Class1378.rvj.ngf().jxa.n(Class2488.hdk);
                Class1378.rvj.ngf().jxa.w(Class2488.hdk).v(false, false);
                bl = true;
            }
            Class487.pbb();
            Class487.p(516, 0.1f);
            Class487.pbu();
            Class487.f(770, 771, 1, 0);
            Class487.pbe();
            Class123 class123 = rvz.nej().nt(class2059);
            int n = Class1378.d(class626, d, d2 - 0.10000000149011612, d3, f2, class123);
            Class891 class891 = new Class891(class626);
            if (class626.ow > 360.0f) {
                class626.ow = 0.0f;
            }
            if (!(class626 == null || Double.isNaN(class626.pv()) || Double.isNaN(class626.ci()) || Double.isNaN(class626.qt()) || class626.zl() == null)) {
                if (class626.up) {
                    if (class626.ow != 0.0f && class626.ow != 90.0f && class626.ow != 180.0f && class626.ow != 270.0f) {
                        Class626 class6262;
                        double d4 = Class1378.zo(class626.ow);
                        double d5 = Class1378.zo(class626.ow - 90.0f);
                        double d6 = Class1378.zo(class626.ow - 180.0f);
                        double d7 = Class1378.zo(class626.ow - 270.0f);
                        if (d4 <= d5 && d4 <= d6 && d4 <= d7) {
                            if (class626.ow < 0.0f) {
                                class6262 = class626;
                                class6262.ow = (float)((double)class6262.ow + rvc);
                            } else {
                                class6262 = class626;
                                class6262.ow = (float)((double)class6262.ow - rvc);
                            }
                        }
                        if (d5 < d4 && d5 <= d6 && d5 <= d7) {
                            if (class626.ow - 90.0f < 0.0f) {
                                class6262 = class626;
                                class6262.ow = (float)((double)class6262.ow + rvc);
                            } else {
                                class6262 = class626;
                                class6262.ow = (float)((double)class6262.ow - rvc);
                            }
                        }
                        if (d6 < d5 && d6 < d4 && d6 <= d7) {
                            if (class626.ow - 180.0f < 0.0f) {
                                class6262 = class626;
                                class6262.ow = (float)((double)class6262.ow + rvc);
                            } else {
                                class6262 = class626;
                                class6262.ow = (float)((double)class6262.ow - rvc);
                            }
                        }
                        if (d7 < d5 && d7 < d6 && d7 < d4) {
                            if (class626.ow - 270.0f < 0.0f) {
                                class6262 = class626;
                                class6262.ow = (float)((double)class6262.ow + rvc);
                            } else {
                                class6262 = class626;
                                class6262.ow = (float)((double)class6262.ow - rvc);
                            }
                        }
                    }
                } else {
                    Class626 class6263;
                    Class891 class8912 = new Class891(class626);
                    class8912.nv(0.0, 0.20000000298023224, 0.0);
                    Class1991 class1991 = class626.ok.u(class8912).xk().vhr();
                    Class1991 class19912 = class626.ok.u(class891).xk().vhr();
                    boolean bl2 = class626.d(Class1991.jma);
                    boolean bl3 = class626.cv();
                    if (bl2 | class1991 == Class1991.jma | class19912 == Class1991.jma | bl3) {
                        class6263 = class626;
                        class6263.ow = (float)((double)class6263.ow + rvc / 4.0);
                    } else {
                        class6263 = class626;
                        class6263.ow = (float)((double)class6263.ow + rvc * 2.0);
                    }
                }
            }
            GL11.glRotatef((float)class626.oi, (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glRotatef((float)(class626.ow + 90.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            for (int i = 0; i < n; ++i) {
                if (class123.pjs()) {
                    Class487.pbe();
                    Class487.f(0.7f, 0.7f, 0.7f);
                    rvz.d(class2059, class123);
                    Class487.pid();
                    continue;
                }
                Class487.pbe();
                if (i > 0 && Class1378.jhw()) {
                    Class487.m(0.0f, 0.0f, 0.046875f * (float)i);
                }
                rvz.d(class2059, class123);
                if (!Class1378.jhw()) {
                    Class487.m(0.0f, 0.0f, 0.046875f);
                }
                Class487.pid();
            }
            Class487.pid();
            Class487.pbi();
            Class487.pbo();
            Class1378.rvj.ngf().jxa.n(Class2488.hdk);
            if (bl) {
                Class1378.rvj.ngf().jxa.w(Class2488.hdk).pfx();
            }
        }
    }

    public static int d(Class626 class626, double d, double d2, double d3, float f, Class123 class123) {
        Class2059 class2059 = class626.vdm();
        Class2001 class2001 = class2059.vrw();
        if (class2001 == null) {
            return 0;
        }
        boolean bl = class123.pjs();
        int n = Class1378.vu(class2059);
        float f2 = 0.25f;
        float f3 = 0.0f;
        Class487.m((float)d, (float)d2 + f3 + 0.25f, (float)d3);
        float f4 = 0.0f;
        if (bl || Class1378.rvj.ngf().jxa != null && Class1378.rvj.vrf.uqt) {
            Class487.x(f4, 0.0f, 1.0f, 0.0f);
        }
        if (!bl) {
            f4 = -0.0f * (float)(n - 1) * 0.5f;
            float f5 = -0.0f * (float)(n - 1) * 0.5f;
            float f6 = -0.046875f * (float)(n - 1) * 0.5f;
            Class487.m(f4, f5, f6);
        }
        Class487.o(1.0f, 1.0f, 1.0f, 1.0f);
        return n;
    }

    public static int vu(Class2059 class2059) {
        int n = 1;
        if (class2059.yhc > 48) {
            n = 5;
        } else if (class2059.yhc > 32) {
            n = 4;
        } else if (class2059.yhc > 16) {
            n = 3;
        } else if (class2059.yhc > 1) {
            n = 2;
        }
        return n;
    }

    public static byte d(Class2059 class2059, byte by) {
        return by;
    }

    public static byte n(Class2059 class2059, byte by) {
        return by;
    }

    public static boolean jhw() {
        return true;
    }

    public static double zo(float f) {
        if (f > 0.0f) {
            return f;
        }
        return -f;
    }
}

