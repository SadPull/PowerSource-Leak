/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package1087.package2140;

import cn.bigskidder.BaiZhiJun.Power.package1087.Class1792;
import cn.bigskidder.BaiZhiJun.Power.package1087.Class1818;
import package3.package2.package1.Class2556;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class397;
import package3.package2.package152.Class398;

public class Class1624
extends Class1818 {
    public Class1624(String[] arrstring) {
        super(arrstring);
        this.e("Shows all commands");
    }

    @Override
    public void d(String[] arrstring) {
        for (Class1818 class1818 : Class1792.tv()) {
            String string = class1818.tj()[0];
            for (int i = 1; i < class1818.tj().length; ++i) {
                string = String.valueOf(string) + (i != class1818.tj().length ? ", " : "") + class1818.tj()[i];
            }
            Class2556.nmk();
            Class2556.vhw.n(new Class397("\u00a7c[Power] \u00a7e" + string + "\u00a7f | " + class1818.tz()));
        }
    }
}

