/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package1087.package2140;

import cn.bigskidder.BaiZhiJun.Power.Class2525;
import cn.bigskidder.BaiZhiJun.Power.package1087.Class1818;
import cn.bigskidder.BaiZhiJun.Power.package185.Class1610;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.utils.Class169;
import cn.bigskidder.BaiZhiJun.Power.package639.package638.package3206.Class151;
import package3.package2.package1.Class2556;
import package3.package2.package1.package82.Class390;
import package3.package2.package159.Class1886;

public class Class1627
extends Class1818 {
    public Class1627(String[] arrstring) {
        super(arrstring);
        this.e("-block (add | remove) <id>, (clear | list)");
    }

    @Override
    public void d(String[] arrstring) {
        if (arrstring.length > 1 && arrstring[1].equalsIgnoreCase("clear")) {
            Class151.jce().clear();
            Class1386.d("Cleared list!", Class1610.hej);
            Class2556.nmk().vha.plc();
        } else if (arrstring.length > 1 && arrstring[1].equalsIgnoreCase("list")) {
            String string = "Empty";
            for (int n : Class151.jce()) {
                String string2 = Class1886.hq(n).vkm();
                String string3 = string = string.equals("Empty") ? string2 : String.valueOf(String.valueOf(string)) + ", " + string2;
            }
            Class1386.d(string, Class1610.hez);
        } else if (arrstring.length > 2 && arrstring[1].equalsIgnoreCase("add1")) {
            try {
                int n = Integer.valueOf(arrstring[2]);
                if ((Class1886.hq(n).vhu() || n == 144 || n == 166) && !Class151.jce().contains(new Integer(n))) {
                    Class151.jce().add(new Integer(n));
                    Class1386.d("Added " + Class1886.hq(n).vkm(), Class1610.hej);
                }
                Class1386.d("Invalid Id", Class1610.heq);
            }
            catch (Exception exception) {
                try {
                    Class1886 class1886 = Class1886.xi(arrstring[2]);
                    String string = class1886.vkm();
                    if (Class151.jce().contains(new Integer(Class1886.g(class1886)))) {
                        return;
                    }
                    Class1386.d("Added " + string, Class1610.hej);
                    Class151.jce().add(new Integer(Class1886.g(class1886)));
                }
                catch (Exception exception2) {
                    Class1386.d("Invalid Id", Class1610.heq);
                }
            }
        } else if (arrstring.length > 2 && arrstring[1].equalsIgnoreCase("remove")) {
            try {
                int n = Integer.valueOf(arrstring[2]);
                this.ga(n);
                Class1386.d("Removed " + Class1886.hq(n).vkm(), Class1610.hec);
            }
            catch (Exception exception) {
                try {
                    Class1886 class1886 = Class1886.xi(arrstring[2]);
                    String string = class1886.vkm();
                    this.ga(Class1886.g(class1886));
                    Class1386.d("Removed " + string, Class1610.hec);
                }
                catch (Exception exception3) {
                    Class1386.d("Invalid Id", Class1610.heq);
                }
            }
        } else {
            Class1386.d(this.tz(), Class1610.hez);
        }
        Class2556.nmk().vha.plc();
        Class2525.oiy.oim.jmr();
    }

    private void ga(int n) {
        for (int i = 0; i < Class151.jce().size(); ++i) {
            int n2 = Class151.jce().get(i);
            if (n2 != n) continue;
            Class151.jce().remove(i);
        }
    }
}

