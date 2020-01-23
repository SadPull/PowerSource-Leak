/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package cn.bigskidder.BaiZhiJun.Power.package1087.package2140;

import java.util.ArrayList;
import org.lwjgl.input.Keyboard;
import cn.bigskidder.BaiZhiJun.Power.Class2525;
import cn.bigskidder.BaiZhiJun.Power.package1087.Class1818;
import cn.bigskidder.BaiZhiJun.Power.package185.Class1610;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.utils.Class169;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1609;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1611;

public class Class1634
extends Class1818 {
    public Class1634(String[] arrstring) {
        super(arrstring);
        this.e("-bind <mod> <key>");
    }

    @Override
    public void d(String[] arrstring) {
        if (arrstring.length < 3) {
            Class1386.d(this.tz(), Class1610.heq);
        } else {
            String string = arrstring[1];
            int n = Keyboard.getKeyIndex((String)arrstring[2].toUpperCase());
            for (Class1611 class1611 : Class1609.pxk) {
                if (!class1611.ce().equalsIgnoreCase(string)) continue;
                class1611.zn(n);
                Class1386.d(String.valueOf(String.valueOf(class1611.ce())) + " was bound to " + Keyboard.getKeyName((int)n), Keyboard.getKeyName((int)n).equals("NONE") ? Class1610.hec : Class1610.hej);
                Class2525.oiy.oim.jma();
                return;
            }
            Class1386.d("Cannot find Module : " + string, Class1610.hec);
        }
    }
}

