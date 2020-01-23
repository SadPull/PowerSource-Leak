/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C10PacketCreativeInventoryAction;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.package3140.Class1059;
import package3.package2.package1.package103.Class1226;
import package3.package2.package1.package2064.Class2268;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class892;
import package3.package2.package329.Class174;
import package3.package2.package329.Class2001;
import package3.package2.package329.Class2002;
import package3.package2.package329.Class2059;
import package3.package2.package329.Class2070;
import package3.package2.package39.Class1879;
import package3.package2.package39.package3530.Class858;
import package3.package2.package39.package3530.Class859;
import package3.package2.package39.package714.package3700.Class461;
import package3.package2.package399.Class1467;
import package3.package2.package4.Class31;

public class Class1379 {
    public static Class2556 rjw = Class2556.nmk();

    public void ac(int n) {
        int n2 = new Class1059((Class858)Class2556.vhw).pd.say;
        Class2556.vhx.d(n2, n, 1, 4, Class2556.vhw);
    }

    public static void jfn() {
        for (int i = 0; i < 44; ++i) {
            try {
                int n = i < 9 ? 36 : 0;
                Class2556.nmk();
                Class2556.nmk();
                Class2556.vhw.jao.j(new C10PacketCreativeInventoryAction(i + n, Class2556.vhw.nhl.nmc[i]));
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static Class2059 pu(int n) {
        return Class2556.vhw.nhl.pu(n);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean vk(Class2059 class2059) {
        try {
            Class2059 class20592;
            int n;
            Class2002 class2002;
            int n2;
            if (class2059 == null) {
                return false;
            }
            if (class2059.vrw() == null) {
                return false;
            }
            if (class2059.vrw() != null && !(class2059.vrw() instanceof Class2002)) {
                return false;
            }
            Class2002 class20022 = (Class2002)class2059.vrw();
            int n3 = Class1379.vt(class2059);
            for (n2 = 0; n2 < 4; ++n2) {
                class20592 = Class2556.vhw.nhl.nms[n2];
                if (class20592 == null) continue;
                class2002 = (Class2002)class20592.vrw();
                if (class2002.ymr != class20022.ymr || (n = Class1379.vt(class20592)) < n3) continue;
                return false;
            }
            for (n2 = 0; n2 < Class2556.vhw.nhl.wk() - 4; ++n2) {
                class20592 = Class2556.vhw.nhl.pu(n2);
                if (class20592 == null || !(class20592.vrw() instanceof Class2002)) continue;
                class2002 = (Class2002)class20592.vrw();
                if (class2002.ymr != class20022.ymr || class2002 == class20022 || (n = Class1379.vt(class20592)) < n3) continue;
                return false;
            }
            return true;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return true;
    }

    public static boolean h(Class2001 class2001) {
        for (int i = 0; i <= 36; ++i) {
            Class2556.nmk();
            Class2059 class2059 = Class2556.vhw.nhl.pu(i);
            if (class2059 == null || class2059.vrw() != class2001) continue;
            return true;
        }
        return false;
    }

    public static boolean q(Class2001 class2001, int n) {
        for (int i = 0; i <= 36; ++i) {
            Class2556.nmk();
            Class2059 class2059 = Class2556.vhw.nhl.pu(i);
            if (class2059 == null || class2059.vrw() != class2001 || Class1379.r(class2059.vrw()) != n) continue;
            return true;
        }
        return false;
    }

    public static int r(Class2001 class2001) {
        for (int i = 0; i <= 36; ++i) {
            Class2556.nmk();
            Class2059 class2059 = Class2556.vhw.nhl.pu(i);
            if (class2059 == null || class2059.vrw() != class2001) continue;
            return i;
        }
        return -1;
    }

    public static Class2059 as(int n) {
        for (int i = 0; i <= 36; ++i) {
            Class2556.nmk();
            Class2059 class2059 = Class2556.vhw.nhl.pu(i);
            if (class2059 == null || Class1379.r(class2059.vrw()) != n) continue;
            return class2059;
        }
        return null;
    }

    public static int vt(Class2059 class2059) {
        int n = -1;
        if (class2059 != null && class2059.vrw() != null && class2059.vrw() instanceof Class2002) {
            n = ((Class2002)class2059.vrw()).vgx().rh(Class1379.vh(class2059)) + Class31.d(new Class2059[]{class2059}, Class892.xmq);
        }
        return n;
    }

    public static int d(Class2059 class2059, double d) {
        for (int i = 0; i <= 36; ++i) {
            Class2556.nmk();
            Class2059 class20592 = Class2556.vhw.nhl.pu(i);
            if (class20592 == null || class20592 != class2059 || Class1379.o(class20592) != Class1379.o(class2059)) continue;
            return i;
        }
        return -1;
    }

    private static double o(Class2059 class2059) {
        double d = 0.0;
        Optional optional = class2059.vmh().values().stream().findFirst();
        if (optional.isPresent()) {
            d = ((Class461)optional.get()).pcu();
        }
        return d += (double)Class31.d(class2059, Class1879.st);
    }

    public boolean ax(int n) {
        if (Class1379.pu(n) != null && Class1379.pu(n).vrw() != null && Class1379.pu(n).vrw() instanceof Class2002) {
            Class2002 class2002;
            int n2 = ((Class2002)Class2556.vhw.nhl.pu(n).vrw()).vgx().rh(Class1379.vh(Class2556.vhw.nhl.pu(n))) + Class31.d(new Class2059[]{Class2556.vhw.nhl.pu(n)}, Class892.xmq);
            if (Class2556.vhw.nhl.nms[2] != null) {
                Class2002 class20022 = (Class2002)Class2556.vhw.nhl.nms[2].vrw();
                Class2059 class2059 = Class2556.vhw.nhl.nms[2];
                class2002 = (Class2002)Class1379.pu(n).vrw();
                int n3 = ((Class2002)class2059.vrw()).vgx().rh(Class1379.vh(class2059)) + Class31.d(new Class2059[]{class2059}, Class892.xmq);
                if (n3 > n2 || n3 == n2) {
                    return false;
                }
            }
            for (int i = 0; i < Class2556.vhw.nhl.wk(); ++i) {
                if (Class1379.pu(i) == null || !(Class2556.vhw.nhl.pu(i).vrw() instanceof Class2002)) continue;
                int n4 = ((Class2002)Class2556.vhw.nhl.pu(i).vrw()).vgx().rh(Class1379.vh(Class2556.vhw.nhl.pu(i))) + Class31.d(new Class2059[]{Class2556.vhw.nhl.pu(i)}, Class892.xmq);
                class2002 = (Class2002)Class1379.pu(n).vrw();
                Class2002 class20023 = (Class2002)Class1379.pu(i).vrw();
                if (class2002.ymr != 1 || class20023.ymr != 1 || n4 <= n2) continue;
                return false;
            }
        }
        return true;
    }

    public boolean ao(int n) {
        if (Class1379.pu(n) != null && Class1379.pu(n).vrw() != null && Class1379.pu(n).vrw() instanceof Class2002) {
            Class2002 class2002;
            int n2 = ((Class2002)Class2556.vhw.nhl.pu(n).vrw()).vgx().rh(Class1379.vh(Class2556.vhw.nhl.pu(n))) + Class31.d(new Class2059[]{Class2556.vhw.nhl.pu(n)}, Class892.xmq);
            if (Class2556.vhw.nhl.nms[3] != null) {
                Class2002 class20022 = (Class2002)Class2556.vhw.nhl.nms[3].vrw();
                Class2059 class2059 = Class2556.vhw.nhl.nms[3];
                class2002 = (Class2002)Class1379.pu(n).vrw();
                int n3 = ((Class2002)class2059.vrw()).vgx().rh(Class1379.vh(class2059)) + Class31.d(new Class2059[]{class2059}, Class892.xmq);
                if (n3 > n2 || n3 == n2) {
                    return false;
                }
            }
            for (int i = 0; i < Class2556.vhw.nhl.wk(); ++i) {
                if (Class1379.pu(i) == null || !(Class2556.vhw.nhl.pu(i).vrw() instanceof Class2002)) continue;
                int n4 = ((Class2002)Class2556.vhw.nhl.pu(i).vrw()).vgx().rh(Class1379.vh(Class2556.vhw.nhl.pu(i))) + Class31.d(new Class2059[]{Class2556.vhw.nhl.pu(i)}, Class892.xmq);
                class2002 = (Class2002)Class1379.pu(n).vrw();
                Class2002 class20023 = (Class2002)Class1379.pu(i).vrw();
                if (class2002.ymr != 0 || class20023.ymr != 0 || n4 <= n2) continue;
                return false;
            }
        }
        return true;
    }

    public boolean au(int n) {
        if (Class1379.pu(n) != null && Class1379.pu(n).vrw() != null && Class1379.pu(n).vrw() instanceof Class2002) {
            Class2002 class2002;
            int n2 = ((Class2002)Class2556.vhw.nhl.pu(n).vrw()).vgx().rh(Class1379.vh(Class2556.vhw.nhl.pu(n))) + Class31.d(new Class2059[]{Class2556.vhw.nhl.pu(n)}, Class892.xmq);
            if (Class2556.vhw.nhl.nms[1] != null) {
                Class2002 class20022 = (Class2002)Class2556.vhw.nhl.nms[1].vrw();
                Class2059 class2059 = Class2556.vhw.nhl.nms[1];
                class2002 = (Class2002)Class1379.pu(n).vrw();
                int n3 = ((Class2002)class2059.vrw()).vgx().rh(Class1379.vh(class2059)) + Class31.d(new Class2059[]{class2059}, Class892.xmq);
                if (n3 > n2 || n3 == n2) {
                    return false;
                }
            }
            for (int i = 0; i < Class2556.vhw.nhl.wk(); ++i) {
                if (Class1379.pu(i) == null || !(Class2556.vhw.nhl.pu(i).vrw() instanceof Class2002)) continue;
                int n4 = ((Class2002)Class2556.vhw.nhl.pu(i).vrw()).vgx().rh(Class1379.vh(Class2556.vhw.nhl.pu(i))) + Class31.d(new Class2059[]{Class2556.vhw.nhl.pu(i)}, Class892.xmq);
                class2002 = (Class2002)Class1379.pu(n).vrw();
                Class2002 class20023 = (Class2002)Class1379.pu(i).vrw();
                if (class2002.ymr != 2 || class20023.ymr != 2 || n4 <= n2) continue;
                return false;
            }
        }
        return true;
    }

    public boolean ay(int n) {
        if (Class1379.pu(n) != null && Class1379.pu(n).vrw() != null && Class1379.pu(n).vrw() instanceof Class2002) {
            Class2002 class2002;
            int n2 = ((Class2002)Class2556.vhw.nhl.pu(n).vrw()).vgx().rh(Class1379.vh(Class2556.vhw.nhl.pu(n))) + Class31.d(new Class2059[]{Class2556.vhw.nhl.pu(n)}, Class892.xmq);
            if (Class2556.vhw.nhl.nms[0] != null) {
                Class2002 class20022 = (Class2002)Class2556.vhw.nhl.nms[0].vrw();
                Class2059 class2059 = Class2556.vhw.nhl.nms[0];
                class2002 = (Class2002)Class1379.pu(n).vrw();
                int n3 = ((Class2002)class2059.vrw()).vgx().rh(Class1379.vh(class2059)) + Class31.d(new Class2059[]{class2059}, Class892.xmq);
                if (n3 > n2 || n3 == n2) {
                    return false;
                }
            }
            for (int i = 0; i < Class2556.vhw.nhl.wk(); ++i) {
                if (Class1379.pu(i) == null || !(Class2556.vhw.nhl.pu(i).vrw() instanceof Class2002)) continue;
                int n4 = ((Class2002)Class2556.vhw.nhl.pu(i).vrw()).vgx().rh(Class1379.vh(Class2556.vhw.nhl.pu(i))) + Class31.d(new Class2059[]{Class2556.vhw.nhl.pu(i)}, Class892.xmq);
                class2002 = (Class2002)Class1379.pu(n).vrw();
                Class2002 class20023 = (Class2002)Class1379.pu(i).vrw();
                if (class2002.ymr != 3 || class20023.ymr != 3 || n4 <= n2) continue;
                return false;
            }
        }
        return true;
    }

    public boolean ak(int n) {
        return this.jfv() == n;
    }

    public static int vh(Class2059 class2059) {
        if (class2059.vrw() instanceof Class2002) {
            Class2002 class2002 = (Class2002)class2059.vrw();
            return class2002.ymr;
        }
        return -1;
    }

    public static float vr(Class2059 class2059) {
        Iterator iterator;
        Multimap<String, Class461> multimap = class2059.vmh();
        if (!multimap.isEmpty() && (iterator = multimap.entries().iterator()).hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Class461 class461 = (Class461)entry.getValue();
            double d = class461.pco() != 1 && class461.pco() != 2 ? class461.pcu() : class461.pcu() * 100.0;
            return class461.pcu() > 1.0 ? 1.0f + (float)d : 1.0f;
        }
        return 1.0f;
    }

    public boolean at(int n) {
        boolean bl = false;
        ArrayList<Class2059> arrayList = new ArrayList<Class2059>();
        arrayList.clear();
        for (int i = 0; i < Class2556.vhw.nhl.wk(); ++i) {
            if (!arrayList.contains(Class1379.pu(i))) {
                arrayList.add(Class1379.pu(i));
                continue;
            }
            if (Class1379.pu(i) != Class1379.pu(n)) continue;
            return true;
        }
        return false;
    }

    public int jfp() {
        int n = Class2556.vhw.nhl.nmx;
        int n2 = -1;
        float f = 1.0f;
        for (int n3 = 0; n3 < 9; n3 = (int)((byte)(n3 + 1))) {
            float f2;
            Class2059 class2059 = Class2556.vhw.nhl.pu(n3);
            if (class2059 == null) continue;
            float f3 = Class1379.vr(class2059);
            f3 += Class31.d(class2059, Class1879.st);
            if (!(f2 > f)) continue;
            f = f3;
            n2 = n3;
        }
        if (n2 != -1) {
            return n2;
        }
        return n;
    }

    public int jfv() {
        int n = Class2556.vhw.nhl.nmx;
        int n2 = -1;
        float f = 1.0f;
        for (int n3 = 0; n3 < Class2556.vhw.nhl.wk(); n3 = (int)((byte)(n3 + 1))) {
            float f2;
            Class2059 class2059;
            if (Class1379.pu(n3) == null || (class2059 = Class1379.pu(n3)) == null || class2059.vrw() == null || !(class2059.vrw() instanceof Class2070)) continue;
            float f3 = Class1379.vr(class2059);
            f3 += Class31.d(class2059, Class1879.st);
            if (!(f2 > f)) continue;
            f = f3;
            n2 = n3;
        }
        if (n2 != -1) {
            return n2;
        }
        return n;
    }

    public int ah(int n) {
        int n2 = -1;
        if (Class1379.pu(n) != null && Class1379.pu(n).vrw() != null && Class1379.pu(n).vrw() instanceof Class2002) {
            n2 = ((Class2002)Class2556.vhw.nhl.pu(n).vrw()).vgx().rh(Class1379.vh(Class2556.vhw.nhl.pu(n))) + Class31.d(new Class2059[]{Class2556.vhw.nhl.pu(n)}, Class892.xmq);
        }
        return n2;
    }

    public static int f(Class2001 class2001) {
        for (int i = 0; i < Class2556.vhw.nhl.wk(); ++i) {
            if (Class1379.pu(i) == null || Class1379.pu(i).vrw() == null || Class1379.pu(i).vrw() != class2001) continue;
            return i;
        }
        return -1;
    }

    public static boolean s(Class2059 class2059, int n) {
        if (class2059 != null && class2059.vrw() instanceof Class2070) {
            for (int i = 0; i < Class2556.vhw.nhl.wk(); ++i) {
                Class2059 class20592 = Class2556.vhw.nhl.pu(i);
                if (class20592 == null || !(class20592.vrw() instanceof Class2070) || !(Class1379.vr(class20592) >= Class1379.vr(class2059)) || n == i) continue;
                return false;
            }
        }
        return true;
    }
}

