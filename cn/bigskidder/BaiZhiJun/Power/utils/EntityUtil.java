/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.http.util.EntityUtils
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.minecraft.network.Packet;
import org.apache.http.util.EntityUtils;
import cn.bigskidder.BaiZhiJun.Power.utils.Class726;
import cn.bigskidder.BaiZhiJun.Power.utils.Class757;
import cn.bigskidder.BaiZhiJun.Power.utils.Class758;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package103.Class1224;
import package3.package2.package1.package103.Class1242;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class891;
import package3.package2.package159.Class1886;
import package3.package2.package329.Class2059;
import package3.package2.package39.EntityLivingBase;
import package3.package2.package39.package3530.Class858;
import package3.package2.package39.package3530.Class859;

public class Class128 {
    public static Class2556 rqy = Class2556.nmk();
    private static EntityUtils rqk;
    private static Class726 rqt;
    private static Class758 rqh;
    private static Class757 rqr;
    public static boolean rqf;
    public static Boolean rqm;
    public static HashSet rqg;
    public static int rqa;
    public static Boolean rql;
    public static List<Class1886> rqb;
    public static ArrayList<Class891> rqi;

    static {
        rqf = false;
        rqg = new HashSet();
        rql = true;
        rqb = new ArrayList<Class1886>();
        rqi = new ArrayList();
        rqt = new Class726();
        rqh = new Class758();
        rqr = new Class757();
    }

    protected static List<EntityLivingBase> jmv() {
        Class2556.nmk();
        return Class2556.vhg.nkp;
    }

    public static boolean nk(Class858 class858) {
        if (class858.nhl == null) {
            return false;
        }
        Class2059 class2059 = class858.nhl.nms[0];
        Class2059 class20592 = class858.nhl.nms[1];
        Class2059 class20593 = class858.nhl.nms[2];
        Class2059 class20594 = class858.nhl.nms[3];
        return class2059 != null || class20592 != null || class20593 != null || class20594 != null;
    }

    public static Class2556 jmj() {
        return Class2556.nmk();
    }

    public static Class0 jmz() {
        Class128.jmj();
        return Class2556.vhw;
    }

    public static Class1224 jmq() {
        Class128.jmj();
        return Class2556.vhg;
    }

    public static EntityUtils jmc() {
        return rqk;
    }

    public static Class1815 jms() {
        return new Class1815(Class128.jmj());
    }

    public static Class726 jmx() {
        return rqt;
    }

    public static Class758 jmo() {
        return rqh;
    }

    public static Class757 jmu() {
        return rqr;
    }

    public static void q(Packet packet) {
        Class128.jmj();
        Class2556.nms().j(packet);
    }

    public static boolean kv(String string) {
        return !rqy.nmg() && Class128.rqy.nmf().pco.toLowerCase().contains(string);
    }

    public static boolean lp(int n) {
        return rqg.contains(n);
    }
}

