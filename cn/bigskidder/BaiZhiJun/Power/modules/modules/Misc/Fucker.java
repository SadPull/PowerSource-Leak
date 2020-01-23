/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import org.lwjgl.util.vector.Vector3f;
import client87.client86.Value;
import client87.client86.minecraft30.Class1387;
import client87.client86.minecraft30.Class1393;
import client87.client86.minecraft30.minecraft993.Class964;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2206;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class890;
import net.minecraft.client52.Class891;
import net.minecraft.client52.Class910;
import net.minecraft.client59.Class1841;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.Class2321;
import net.minecraft.client59.Class2331;
import net.minecraft.client59.package520.Class1789;

public class Class245
extends Module {
    ArrayList<Vector3f> pth = null;
    private Class964 ptr = new Class964();
    public static Value<String> ptf = new Value("Fucker", "Mode", 0);
    private Value<Double> ptm = new Value<Double>("Fucker_Reach", 6.0, 1.0, 6.0, 0.1);
    private Value<Double> ptg = new Value<Double>("Fucker_Delay", 120.0, 0.0, 1000.0, 10.0);
    private Value<Boolean> pta = new Value<Boolean>("Fucker_Teleport", false);

    public Class245() {
        super("Fucker", Category.Misc);
        Class245.ptf.obg.add("Bed");
        Class245.ptf.obg.add("Egg");
        Class245.ptf.obg.add("Cake");
    }

    @EventTarget
    public void d(Class2206 class2206) {
        this.setKey(Class1387.rju.rjl);
        this.toggle(class2206);
    }

    private void toggle(Class2206 class2206) {
        Iterator<Class891> iterator = Class891.v(Minecraft.thePlayer.zl().z(new Class890(this.ptm.vut(), this.ptm.vut(), this.ptm.vut())), Minecraft.thePlayer.zl().j(new Class890(this.ptm.vut(), this.ptm.vut(), this.ptm.vut()))).iterator();
        Class891 class891 = null;
        while ((class891 = iterator.next()) != null) {
            if (Minecraft.theWorld.u(class891).xk() instanceof Class2321 && ptf.xm("Bed") || Minecraft.theWorld.u(class891).xk() instanceof Class1841 && ptf.xm("Egg") || Minecraft.theWorld.u(class891).xk() instanceof Class2331 && ptf.xm("Cake")) break;
        }
        if (!(class891 instanceof Class891)) {
            return;
        }
        float[] arrf = Class1393.ng(class891.xl(), class891.xb(), class891.xi());
        class2206.tp = arrf[0];
        class2206.tv = arrf[1];
        if (this.ptr.no(this.ptg.vut().intValue())) {
            Minecraft.thePlayer.sendQueue.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.START_DESTROY_BLOCK, class891, Class910.xkq));
            Minecraft.thePlayer.sendQueue.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK, class891, Class910.xkq));
            Minecraft.thePlayer.sendQueue.addToSendQueue(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.START_DESTROY_BLOCK, class891, Class910.xkq));
            Minecraft.thePlayer.swing();
            if (this.pta.vut().booleanValue()) {
                Minecraft.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(class891.xl(), class891.xb() + 1, class891.xi(), true));
            }
            this.ptr.npr();
        }
    }
}

