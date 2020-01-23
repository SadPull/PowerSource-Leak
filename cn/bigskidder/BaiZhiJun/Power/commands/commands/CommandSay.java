/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package1087.package2140;

import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C01PacketChatMessage;
import cn.bigskidder.BaiZhiJun.Power.package1087.Class1818;
import cn.bigskidder.BaiZhiJun.Power.package185.Class1610;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import package3.package2.package1.Class2556;
import package3.package2.package1.package2064.Class2268;
import package3.package2.package1.package4133.Class0;

public class Class1658
extends Class1818 {
    public static boolean hhr = false;

    public Class1658(String[] arrstring) {
        super(arrstring);
        this.e("-say <text>");
    }

    @Override
    public void d(String[] arrstring) {
        String string = "";
        if (arrstring.length <= 1) {
            Class1386.d(this.tz(), Class1610.heq);
            return;
        }
        for (int i = 1; i < arrstring.length; ++i) {
            string = String.valueOf(String.valueOf(String.valueOf(string))) + arrstring[i] + " ";
        }
        Class2556.nmk();
        Class2556.vhw.jao.j(new C01PacketChatMessage(string));
        super.d(arrstring);
    }
}

