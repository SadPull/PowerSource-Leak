/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package1087.package2140;

import cn.bigskidder.BaiZhiJun.Power.package1087.Class1818;
import cn.bigskidder.BaiZhiJun.Power.package185.Class1610;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import package3.package2.package1.Class2556;
import package3.package2.package1.package4133.Class0;

public class Class1623
extends Class1818 {
    public Class1623(String[] arrstring) {
        super(arrstring);
        this.e("-wdr <Playername>");
    }

    @Override
    public void d(String[] arrstring) {
        if (arrstring.length < 2) {
            Class1386.d(this.tz(), Class1610.heq);
        } else {
            Class1386.d("Reported " + arrstring[1], Class1610.hej);
            Class2556.nmk();
            Class2556.vhw.zn("/wdr " + arrstring[1] + " Fly KillAura AutoClicker Speed AntiKnockBack Reach Dolphin");
        }
    }
}

