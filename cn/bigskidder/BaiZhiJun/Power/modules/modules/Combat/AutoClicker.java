/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat;

import com.darkmagician6.eventapi.EventTarget;
import java.util.Random;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import org.lwjgl.input.Mouse;
import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2256;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class970;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class609;
import net.minecraft.net9.EntityLivingBase;

public class Class2182
extends Module {
    private Value<Double> kfl = new Value<Double>("AutoClicker_APS", 8.0, 0.0, 20.0, 1.0);
    private Value<Boolean> kfb = new Value<Boolean>("AutoClicker_Random", true);
    private Random kfi = new Random();
    private long kfw;

    public Class2182() {
        super("AutoClicker", Category.Combat);
    }

    @EventTarget
    public void d(Class2256 class2256) {
        int n = this.kfl.vut().intValue();
        int n2 = 1000 / n;
        if (this.kfb.vut().booleanValue()) {
            n2 += this.kfi.nextInt(80) - 40;
        }
        if (System.currentTimeMillis() - this.kfw >= (long)n2) {
            if (Mouse.isButtonDown((int)0) && this.pst.vrq == null) {
                if (this.pst.vrr != null && this.pst.vrr.xac != null) {
                    Minecraft.thePlayer.swing();
                    Minecraft.thePlayer.sendQueue.addToSendQueue(new C02PacketUseEntity(this.pst.vrr.xac, C02PacketUseEntity.Action.ATTACK));
                } else {
                    Minecraft.thePlayer.swing();
                }
                this.kfw = System.currentTimeMillis();
            }
            if (Mouse.isButtonDown((int)1) && this.pst.vrq == null) {
                this.pst.nmn();
                this.kfw = System.currentTimeMillis();
            }
        }
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }

    @Override
    public void onDisable() {
        super.nji();
    }
}

