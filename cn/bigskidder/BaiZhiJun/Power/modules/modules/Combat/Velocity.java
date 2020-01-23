/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat;

import com.darkmagician6.eventapi.EventTarget;
import net.minecraft.network.Packet;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import net.minecraft.network.play.server.S27PacketExplosion;
import client87.client86.Value;
import client87.client86.minecraft30.Class1387;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2206;
import client87.client86.package858.Class2228;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package4133.Class0;

public class Class2179
extends Module {
    private static final boolean kad = false;
    private double kan;
    private double kap;
    private double kav;
    private Value<String> kaj = new Value("Velocity", "Mode", 0);
    private Value<Double> kaz = new Value<Double>("Velocity_Vertical", 0.0, 0.0, 1.0, 0.01);
    private Value<Double> kaq = new Value<Double>("Velocity_Horizontal", 0.0, 0.0, 1.0, 0.01);
    private Value<Double> kac = new Value<Double>("Velocity_X/Z", 0.0, 0.0, 1.0, 0.01);
    private Value<Double> kas = new Value<Double>("Velocity_Y", 0.0, 0.0, 1.0, 0.01);
    private String kax;

    public Class2179() {
        super("Velocity", Category.Combat);
        this.kaj.xh("Simple");
        this.kaj.xh("AAC1");
        this.kaj.xh("AAC2");
    }

    @EventTarget
    public void z(Class2206 class2206) {
        this.psh = null;
        this.setKey(Class1387.rjx.rjl);
        if (this.kaj.xm("AAC1")) {
            this.pc("AAC1");
            if (Minecraft.thePlayer.jb == 1 || Minecraft.thePlayer.jb == 2 || Minecraft.thePlayer.jb == 3 || Minecraft.thePlayer.jb == 4 || Minecraft.thePlayer.jb == 5 || Minecraft.thePlayer.jb == 6 || Minecraft.thePlayer.jb == 7 || Minecraft.thePlayer.jb == 8) {
                if (Minecraft.thePlayer.up) {
                    return;
                }
                double d = Minecraft.thePlayer.zy;
                d = Math.toRadians(d);
                double d2 = -Math.sin(d) * 0.08;
                double d3 = Math.cos(d) * 0.08;
                if (Minecraft.thePlayer.po() >= 6.0f) {
                    Minecraft.thePlayer.oa = d2;
                    Minecraft.thePlayer.ob = d3;
                }
            }
        } else if (this.kaj.xm("AAC2")) {
            this.pc("AAC2");
            if (Minecraft.thePlayer.jb > 0 && Minecraft.thePlayer.uh < 3.0f) {
                if (Minecraft.thePlayer.qp == 0.0f && Minecraft.thePlayer.qn == 0.0f) {
                    Minecraft.thePlayer.ol -= this.kas.vut().doubleValue();
                    Minecraft.thePlayer.oa *= this.kac.vut().doubleValue();
                    Minecraft.thePlayer.ob *= this.kac.vut().doubleValue();
                    Minecraft.thePlayer.ol += this.kas.vut().doubleValue();
                } else {
                    Minecraft.thePlayer.ol -= this.kas.vut().doubleValue();
                    Minecraft.thePlayer.oa *= this.kac.vut() + 0.2;
                    Minecraft.thePlayer.ob *= this.kac.vut() + 0.2;
                    Minecraft.thePlayer.ol += this.kas.vut().doubleValue();
                }
            }
        }
    }

    @EventTarget
    public void x(Class2228 class2228) {
        if (this.kaj.xm("Simple")) {
            Packet<INetHandlerPlayClient> packet;
            this.pc("Simple");
            if (class2228.xv() instanceof S12PacketEntityVelocity) {
                packet = (S12PacketEntityVelocity)class2228.xv();
                if (packet.entityID == Minecraft.thePlayer.qt()) {
                    if (this.kaz.vut() == 0.0 && this.kaq.vut() == 0.0) {
                        class2228.h(true);
                    } else {
                        packet.motionX = (int)((double)packet.motionX * this.kaq.vut());
                        packet.motionZ = (int)((double)packet.motionZ * this.kaq.vut());
                        packet.motionY = (int)((double)packet.motionY * this.kaz.vut());
                    }
                }
            }
            if (class2228.xv() instanceof S27PacketExplosion) {
                packet = (S27PacketExplosion)class2228.xv();
                if (this.kaz.vut() == 0.0 && this.kaq.vut() == 0.0) {
                    class2228.h(true);
                } else {
                    ((S27PacketExplosion)packet).field_149152_f = (float)((double)((S27PacketExplosion)packet).field_149152_f * this.kaq.vut());
                    ((S27PacketExplosion)packet).field_149153_g = (float)((double)((S27PacketExplosion)packet).field_149153_g * this.kaq.vut());
                    ((S27PacketExplosion)packet).field_149159_h = (float)((double)((S27PacketExplosion)packet).field_149159_h * this.kaz.vut());
                }
            }
        }
    }
}

