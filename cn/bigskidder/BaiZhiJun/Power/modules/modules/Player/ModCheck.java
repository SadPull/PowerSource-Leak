/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S02PacketChat;
import client87.client86.Value;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class160;
import client87.client86.minecraft30.minecraft993.Class964;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class140;
import client87.client86.package858.Class2204;
import client87.client86.package858.Class2228;
import client87.client86.package858.Class2256;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class960;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class398;

public class Class1037
extends Module {
    private String[] wk = new String[]{"StartOver_", "hefew", "\u65f6\u5149\u6613\u8001\u4e0d\u5fd8\u521d\u5fc3", "mxu", "zofia", "\u9b42\u9b44\u5996\u68a6", "heav3ns", "chrisan", "\u5c0f\u963f\u72f8", "chen_xixi", "tanker_01", "bingmo", "crazyforlove", "SnowDay", "\u9020\u5316\u949f\u795e\u79c0", "OwenonEnablell", "chen_duxiu", "Lyra2REv2"};
    private String wt;
    private Class964 wh = new Class964();
    private List<String> wr = new ArrayList<String>();
    private List<String> wf = new ArrayList<String>();
    private Value<Boolean> wm = new Value<Boolean>("ModCheck_ShowOffline", true);
    private Value<Boolean> wg = new Value<Boolean>("ModCheck_ShowOnline", true);
    private int wa;
    private boolean wl;

    public Class1037() {
        super("ModCheck", Category.Category.Player);
    }

    @EventTarget
    public void d(Class2204 class2204) {
        Class960 class960 = this.pst.vrj;
        List<String> list = Arrays.asList(this.wk);
        list.sort((string, string2) -> class960.jj((String)string2) - class960.jj((String)string));
        int n = 0;
        for (String string3 : list) {
            if (this.wr.contains(string3) && this.wm.vut().booleanValue()) {
                class960.v(string3, 2.0f, (Class140.hvd.vut() != false ? 115 : 100) + n * 10, Color.RED.getRGB());
                ++n;
            }
            if (!this.wf.contains(string3) || !this.wg.vut().booleanValue()) continue;
            class960.v(string3, 2.0f, (Class140.hvd.vut() != false ? 115 : 100) + n * 10, Color.GREEN.getRGB());
            ++n;
        }
    }

    @EventTarget
    public void d(Class2228 class2228) {
        S02PacketChat s02PacketChat = (S02PacketChat)class2228.xv();
        String string = s02PacketChat.getChatComponent().vql();
        if (string.contains("\u8fd9\u540d\u73a9\u5bb6\u4e0d\u5728\u7ebf\uff01") || string.contains("That player is not online!")) {
            class2228.h(true);
            if (this.wf.contains(this.wt)) {
                Class1386.d("\u00a7b" + this.wt + "\u00a7a \u5df2\u4e0b\u7ebf\uff01", Class160.rqn);
                this.wf.remove(this.wt);
                this.wr.add(this.wt);
                return;
            }
            if (!this.wr.contains(this.wt)) {
                Class1386.d("\u00a7b" + this.wt + "\u00a7c \u4e0d\u5728\u7ebf\uff01", Class160.rqn);
                this.wr.add(this.wt);
            }
        }
        if (string.contains("You cannot message this player.")) {
            class2228.h(true);
            if (this.wr.contains(this.wt)) {
                Class1386.d("\u00a7b" + this.wt + "\u00a7a \u5df2\u4e0a\u7ebf\uff01", Class160.rqp);
                this.wr.remove(this.wt);
                this.wf.add(this.wt);
                return;
            }
            if (!this.wf.contains(this.wt)) {
                Class1386.d("\u00a7b" + this.wt + "\u00a7a \u5728\u7ebf\uff01", Class160.rqp);
                this.wf.add(this.wt);
            }
        }
        if (string.contains("Unknown command. Try /help for a list of commands")) {
            class2228.h(true);
            Class1386.d("\u68c0\u6d4b\u4f60\u4e0d\u5728hypixel\u5df2\u7ecf\u81ea\u52a8\u5173\u95edmod\u68c0\u6d4b", Class160.rqv);
            this.toggle(false);
        }
        if (s02PacketChat.getChatComponent().vql().contains("\u627e\u4e0d\u5230\u540d\u4e3a \"" + this.wt + "\" \u7684\u73a9\u5bb6")) {
            class2228.h(true);
        }
    }

    @EventTarget
    public void d(Class2256 class2256) {
        if (this.wh.no(this.wl ? 10000L : 2000L)) {
            if (this.wa >= this.wk.length) {
                this.wa = -1;
                if (!this.wl) {
                    this.wl = true;
                }
            }
            ++this.wa;
            this.wt = this.wk[this.wa];
            Minecraft.thePlayer.zn("/message " + this.wt + " hi");
            this.wh.npr();
        }
    }
}

