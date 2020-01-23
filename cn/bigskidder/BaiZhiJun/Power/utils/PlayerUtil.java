/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import cn.bigskidder.BaiZhiJun.Power.utils.Class240;
import cn.bigskidder.BaiZhiJun.Power.utils.Class246;
import package3.package2.package1.Class2556;
import package3.package2.package1.package103.Class1224;
import package3.package2.package152.Class891;
import package3.package2.package152.Class897;
import package3.package2.package159.Class1690;
import package3.package2.package159.Class1693;
import package3.package2.package159.Class1696;
import package3.package2.package159.Class1698;
import package3.package2.package159.Class1714;
import package3.package2.package159.Class1722;
import package3.package2.package159.Class1759;
import package3.package2.package159.Class1765;
import package3.package2.package159.Class1781;
import package3.package2.package159.Class1784;
import package3.package2.package159.Class1835;
import package3.package2.package159.Class1854;
import package3.package2.package159.Class1886;
import package3.package2.package159.Class2323;
import package3.package2.package159.Class2342;
import package3.package2.package159.Class2346;

public class Class1396 {
    private Class897 rpq;
    private Class897 rpc;
    private ArrayList<Class897> rps = new ArrayList();
    private ArrayList<Class240> rpx = new ArrayList();
    private ArrayList<Class240> rpo = new ArrayList();
    private double rpu = 9.0;
    private boolean rpy = true;
    private static Class897[] rpk = new Class897[]{new Class897(1.0, 0.0, 0.0), new Class897(-1.0, 0.0, 0.0), new Class897(0.0, 0.0, 1.0), new Class897(0.0, 0.0, -1.0)};

    public Class1396(Class897 class897, Class897 class8972) {
        this.rpq = class897.nz(0.0, 0.0, 0.0).vza();
        this.rpc = class8972.nz(0.0, 0.0, 0.0).vza();
    }

    public ArrayList<Class897> jho() {
        return this.rps;
    }

    public void jht() {
        this.zf(1000, 4);
    }

    public void zf(int n, int n2) {
        this.rps.clear();
        this.rpo.clear();
        ArrayList<Class897> arrayList = new ArrayList<Class897>();
        arrayList.add(this.rpq);
        this.rpo.add(new Class240(this, this.rpq, null, arrayList, this.rpq.u(this.rpc), 0.0, 0.0));
        block0 : for (int i = 0; i < n; ++i) {
            Collections.sort(this.rpo, new Class246(this));
            int n3 = 0;
            if (this.rpo.size() == 0) break;
            for (Class240 class240 : new ArrayList<Class240>(this.rpo)) {
                Class897 class897;
                Class897 class89722;
                if (++n3 > n2) continue block0;
                this.rpo.remove(class240);
                this.rpx.add(class240);
                for (Class897 class89722 : rpk) {
                    Class897 class8973 = class240.jhs().x(class89722).vza();
                    if (Class1396.d(class8973, false) && this.d(class240, class8973, 0.0)) break block0;
                }
                class89722 = class240.jhs().nz(0.0, 1.0, 0.0).vza();
                if (Class1396.d(class89722, false) && this.d(class240, class89722, 0.0) || Class1396.d(class897 = class240.jhs().nz(0.0, -1.0, 0.0).vza(), false) && this.d(class240, class897, 0.0)) break block0;
            }
        }
        if (this.rpy) {
            Collections.sort(this.rpx, new Class246(this));
            this.rps = this.rpx.get(0).jho();
        }
    }

    public static boolean d(Class897 class897, boolean bl) {
        return Class1396.p((int)class897.xc(), (int)class897.se(), (int)class897.xs(), bl);
    }

    public static boolean p(int n, int n2, int n3, boolean bl) {
        Class891 class891 = new Class891(n, n2, n3);
        Class891 class8912 = new Class891(n, n2 + 1, n3);
        Class891 class8913 = new Class891(n, n2 - 1, n3);
        return !Class1396.jn(class891) && !Class1396.jn(class8912) && (Class1396.jn(class8913) || !bl) && Class1396.jp(class8913);
    }

    private static boolean jn(Class891 class891) {
        Class2556.nmk();
        if (!Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()).vhf()) {
            Class2556.nmk();
            if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1854)) {
                Class2556.nmk();
                if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class2342)) {
                    Class2556.nmk();
                    if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class2346)) {
                        Class2556.nmk();
                        if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1781)) {
                            Class2556.nmk();
                            if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1759)) {
                                Class2556.nmk();
                                if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class2323)) {
                                    Class2556.nmk();
                                    if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1835)) {
                                        Class2556.nmk();
                                        if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1784)) {
                                            Class2556.nmk();
                                            if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1693)) {
                                                Class2556.nmk();
                                                if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1714)) {
                                                    Class2556.nmk();
                                                    if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1698)) {
                                                        Class2556.nmk();
                                                        if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1765)) {
                                                            Class2556.nmk();
                                                            if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1696)) {
                                                                Class2556.nmk();
                                                                if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1722)) {
                                                                    Class2556.nmk();
                                                                    if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1690)) {
                                                                        return false;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean jp(Class891 class891) {
        Class2556.nmk();
        if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1784)) {
            Class2556.nmk();
            if (!(Class2556.vhg.x(class891.xl(), class891.xb(), class891.xi()) instanceof Class1693)) {
                return true;
            }
        }
        return false;
    }

    public Class240 b(Class897 class897) {
        for (Class240 class240 : this.rpx) {
            if (class240.jhs().xc() != class897.xc() || class240.jhs().se() != class897.se() || class240.jhs().xs() != class897.xs()) continue;
            return class240;
        }
        for (Class240 class240 : this.rpo) {
            if (class240.jhs().xc() != class897.xc() || class240.jhs().se() != class897.se() || class240.jhs().xs() != class897.xs()) continue;
            return class240;
        }
        return null;
    }

    public boolean d(Class240 class240, Class897 class897, double d) {
        Class240 class2402 = this.b(class897);
        double d2 = d;
        if (class240 != null) {
            d2 += class240.jhk();
        }
        if (class2402 == null) {
            if (class897.xc() == this.rpc.xc() && class897.se() == this.rpc.se() && class897.xs() == this.rpc.xs() || this.rpu != 0.0 && class897.u(this.rpc) <= this.rpu) {
                this.rps.clear();
                this.rps = class240.jho();
                this.rps.add(class897);
                return true;
            }
            ArrayList<Class897> arrayList = new ArrayList<Class897>(class240.jho());
            arrayList.add(class897);
            this.rpo.add(new Class240(this, class897, class240, arrayList, class897.u(this.rpc), d, d2));
        } else if (class2402.jhy() > d) {
            ArrayList<Class897> arrayList = new ArrayList<Class897>(class240.jho());
            arrayList.add(class897);
            class2402.l(class897);
            class2402.d(class240);
            class2402.d(arrayList);
            class2402.ni(class897.u(this.rpc));
            class2402.nw(d);
            class2402.ne(d2);
        }
        return false;
    }
}

