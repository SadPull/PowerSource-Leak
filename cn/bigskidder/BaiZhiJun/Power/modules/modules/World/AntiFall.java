/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import client87.client86.Value;
import client87.client86.minecraft30.minecraft993.Class964;
import cn.bigskidder.BaiZhiJun.Power.modules.ModuleManager;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2228;
import client87.client86.package858.Class2254;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class891;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.Class2315;
import net.minecraft.client59.package520.Class1789;
import net.minecraft.net9.net530.Class851;
import net.minecraft.net96.Class2072;

public class Class564
extends Module {
    private Class964 omh = new Class964();
    private boolean omr;
    public static Value<Boolean> omf = new Value<Boolean>("AntiFall_Void", true);
    public Value<Double> omm = new Value<Double>("AntiFall_distance", 15.0, 1.0, 20.0, 1.0);
    public Value<String> omg = new Value("AntiFall", "Mode", 0);

    public Class564() {
        super("AntiFall", Category.Category.World);
        this.omg.obg.add("Hypixel");
    }

    @EventTarget
    public void j(Class2254 class2254) {
        this.pc("Hypixel");
        if (this.vou() && !this.omr && ModuleManager.px("NoFall").nji()) {
            return;
        }
        if (Minecraft.thePlayer.nrg.nhn) {
            return;
        }
        if (this.omr && this.omh.nl(350.0) || Minecraft.thePlayer.uj) {
            this.omr = false;
            this.omh.npr();
            return;
        }
        int n = this.omm.vut().intValue();
        if (!(Minecraft.thePlayer.uh < (float)n || ModuleManager.px("Fly").nji() || ModuleManager.px("ZoomFly").nji() || Minecraft.theWorld.u(new Class891(Minecraft.thePlayer.of, Minecraft.thePlayer.om - 1.0, Minecraft.thePlayer.og)).xk() != Class2072.opv || Boolean.valueOf(omf.vut()).booleanValue() && this.vou() || !this.omh.nl(900.0))) {
            if (this.omh.nl(400.0)) {
                Minecraft.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(Minecraft.thePlayer.of, Minecraft.thePlayer.om + (double)n, Minecraft.thePlayer.og, false));
            }
            this.omh.npr();
        }
    }

    @EventTarget
    public void s(Class2228 class2228) {
        if (!class2228.xe()) {
            return;
        }
        if (!(class2228.xv() instanceof S08PacketPlayerPosLook)) {
            return;
        }
        if (Minecraft.thePlayer.uh > 0.0f) {
            Minecraft.thePlayer.uh = 0.0f;
        }
        Minecraft.thePlayer.ob = 0.0;
        Minecraft.thePlayer.oa = 0.0;
        this.omr = false;
        this.omh.npr();
    }

    private boolean vou() {
        for (int i = (int)Minecraft.thePlayer.om; i > 0; --i) {
            Class891 class891 = new Class891(Minecraft.thePlayer.of, (double)i, Minecraft.thePlayer.og);
            if (Minecraft.theWorld.u(class891).xk() instanceof Class2315) continue;
            return true;
        }
        return false;
    }
}

