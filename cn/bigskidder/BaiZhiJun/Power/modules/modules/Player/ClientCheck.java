/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S02PacketChat;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class160;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2228;
import net.minecraft.client52.Class398;

public class Class1047
extends Module {
    public static ArrayList er = new ArrayList();
    public static ArrayList ef = new ArrayList();

    public Class1047() {
        super("ClientCheck", Category.Category.Player);
    }

    @EventTarget
    public void d(Class2228 class2228) {
        S02PacketChat s02PacketChat = (S02PacketChat)class2228.xv();
        String string = s02PacketChat.getChatComponent().vql();
        String string2 = "";
        if (string.contains(": [Power]") && !ef.contains(string2 = Class1047.n(string, "] ", ": [Power]"))) {
            ef.add(string2);
            Class1386.d("hnbi-Add" + string2, Class160.rqn);
        }
        if (string.contains(" [AzureWare]") && !ef.contains(string2 = Class1047.n(string, "<", "> [AzureWare]"))) {
            ef.add(string2);
            Class1386.d("Add|" + string2, Class160.rqn);
        }
        if (string.contains(": [AzureWare]") && !er.contains(string2 = Class1047.n(string, "] ", ": [AzureWare]"))) {
            er.add(string2);
            Class1386.d("AW-Add" + string2, Class160.rqn);
        }
    }

    public static String n(String string, String string2, String string3) {
        int n;
        String string4 = "";
        n = string2 == null || string2.isEmpty() ? 0 : ((n = string.indexOf(string2)) > -1 ? (n += string2.length()) : 0);
        int n2 = string.indexOf(string3, n);
        if (n2 < 0 || string3 == null || string3.isEmpty()) {
            n2 = string.length();
        }
        string4 = string.substring(n, n2);
        return string4;
    }
}

