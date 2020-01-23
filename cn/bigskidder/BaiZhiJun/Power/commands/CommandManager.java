/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package1087;

import java.util.ArrayList;
import cn.bigskidder.BaiZhiJun.Power.package1087.Class1818;
import cn.bigskidder.BaiZhiJun.Power.package1087.package2140.Class1623;
import cn.bigskidder.BaiZhiJun.Power.package1087.package2140.Class1624;
import cn.bigskidder.BaiZhiJun.Power.package1087.package2140.Class1626;
import cn.bigskidder.BaiZhiJun.Power.package1087.package2140.Class1627;
import cn.bigskidder.BaiZhiJun.Power.package1087.package2140.Class1628;
import cn.bigskidder.BaiZhiJun.Power.package1087.package2140.Class1633;
import cn.bigskidder.BaiZhiJun.Power.package1087.package2140.Class1634;
import cn.bigskidder.BaiZhiJun.Power.package1087.package2140.Class1657;
import cn.bigskidder.BaiZhiJun.Power.package1087.package2140.Class1658;
import cn.bigskidder.BaiZhiJun.Power.package1087.package2140.Class1660;

public class Class1792 {
    private static ArrayList<Class1818> eg = new ArrayList();

    public Class1792() {
        this.d(new Class1634(new String[]{"bind"}));
        this.d(new Class1628(new String[]{"version", "v"}));
        this.d(new Class1660(new String[]{"toggle", "t"}));
        this.d(new Class1623(new String[]{"wdr"}));
        this.d(new Class1627(new String[]{"block"}));
        this.d(new Class1657(new String[]{"spammer"}));
        this.d(new Class1658(new String[]{"say"}));
        this.d(new Class1624(new String[]{"help"}));
        this.d(new Class1633(new String[]{"Config", "c"}));
        this.d(new Class1626(new String[]{"AutoBind", "autobind", "Autobind"}));
    }

    public void d(Class1818 class1818) {
        eg.add(class1818);
    }

    public static ArrayList<Class1818> tv() {
        return eg;
    }

    public static String w(String string) {
        String string2 = " ";
        String string3 = "  ";
        while (string.contains(string3)) {
            string = string.replace(string3, string2);
        }
        return string;
    }
}

