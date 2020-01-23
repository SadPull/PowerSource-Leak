/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package1087.package2140;

import cn.bigskidder.BaiZhiJun.Power.package1087.Class1818;
import cn.bigskidder.BaiZhiJun.Power.package185.Class1610;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1609;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1611;

public class Class1660
extends Class1818 {
    public Class1660(String[] arrstring) {
        super(arrstring);
        this.e("-toggle <module>");
    }

    @Override
    public void d(String[] arrstring) {
        if (arrstring.length < 2) {
            Class1386.d(this.tz(), Class1610.heq);
        } else {
            String string = arrstring[1];
            for (Class1611 class1611 : Class1609.nzn()) {
                if (!class1611.ce().equalsIgnoreCase(string)) continue;
                class1611.ni(class1611.nji());
                Class1386.d("Module " + class1611.ce() + " toggled", Class1610.hej);
                return;
            }
        }
    }
}

