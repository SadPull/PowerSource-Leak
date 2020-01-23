/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import org.lwjgl.opengl.GL11;
import client87.client86.Value;
import client87.client86.minecraft30.Class1383;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class1387;
import client87.client86.minecraft30.Class1388;
import client87.client86.minecraft30.Class1396;
import client87.client86.minecraft30.Class160;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2206;
import client87.client86.package858.Class2227;
import client87.client86.package858.Class2228;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package82.Class486;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client52.Class409;
import net.minecraft.client52.Class890;
import net.minecraft.client52.Class891;
import net.minecraft.client52.Class897;
import net.minecraft.client52.Class910;
import net.minecraft.client59.Class1721;
import net.minecraft.client59.Class1886;
import net.minecraft.client59.Class1888;
import net.minecraft.client59.Class2332;
import net.minecraft.client59.minecraft531.Class1991;
import net.minecraft.client59.package520.Class1789;
import net.minecraft.net29.Class2059;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.Entity;
import net.minecraft.net96.Class2072;

public class Class1043
extends Module {
    public static Class1383 wx = new Class1383();
    private ArrayList<Class897> wo = new ArrayList();
    public Value<Boolean> wu = new Value<Boolean>("ReachBlock_Path", true);
    public static Value<Boolean> wy = new Value<Boolean>("ReachBlock_Toggle", true);

    public Class1043() {
        super("ReachBlock", Category.Misc);
    }

    @EventTarget
    public void d(Class2227 class2227) {
        if (!Minecraft.vte) {
            Class1386.d("\u8bf7\u8d2d\u4e70Power\u4ed8\u8d39\u7248! ReachBlock\u4e3a\u4ed8\u8d39\u529f\u80fd!!", Class160.rqv);
            this.toggleNotSet();
        }
        if (!this.wo.isEmpty() && !wx.jc(1000.0f) && this.wu.vut().booleanValue()) {
            for (Class897 class897 : this.wo) {
                this.d(class897);
            }
            if (wy.vut().booleanValue()) {
                this.toggleNotSet();
            }
        }
    }

    @EventTarget
    public void n(Class2228 class2228) {
        double d;
        Packet<INetHandlerPlayServer> packet;
        Class897 class897;
        Object object2;
        Object object;
        Class897 class8972;
        Packet packet2 = class2228.xv();
        if (packet2 instanceof C08PacketPlayerBlockPlacement) {
            packet = (C08PacketPlayerBlockPlacement)packet2;
            object = ((C08PacketPlayerBlockPlacement)packet).getPosition();
            int n = ((C08PacketPlayerBlockPlacement)packet).getPlacedBlockDirection();
            object2 = ((C08PacketPlayerBlockPlacement)packet).getStack();
            d = Math.sqrt(Minecraft.thePlayer.toggle((Class891)object));
            if (d > 6.0 && ((Class890)object).xb() != -1 && (object2 != null || Minecraft.theWorld.u((Class891)object).xk() instanceof Class2332)) {
                class8972 = new Class897(Minecraft.thePlayer.of, Minecraft.thePlayer.om, Minecraft.thePlayer.og);
                class897 = new Class897(((Class890)object).xl(), ((Class890)object).xb(), ((Class890)object).xi());
                this.wo = this.d(class8972, class897);
                for (Class897 class8973 : this.wo) {
                    Minecraft.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(class8973.xc(), class8973.se(), class8973.xs(), true));
                }
                wx.npr();
                Minecraft.thePlayer.sendQueue.we().sendPacketNoEvent(packet2);
                Collections.reverse(this.wo);
                for (Class897 class8974 : this.wo) {
                    Minecraft.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(class8974.xc(), class8974.se(), class8974.xs(), true));
                }
                class2228.h(true);
            }
        }
        if (packet2 instanceof C07PacketPlayerDigging) {
            packet = (C07PacketPlayerDigging)packet2;
            object = ((C07PacketPlayerDigging)packet).getStatus();
            Class891 class891 = ((C07PacketPlayerDigging)packet).getPosition();
            object2 = ((C07PacketPlayerDigging)packet).getFacing();
            d = Math.sqrt(Minecraft.thePlayer.toggle(class891));
            if (d > 6.0 && object == C07PacketPlayerDigging.Action.START_DESTROY_BLOCK) {
                class8972 = new Class897(Minecraft.thePlayer.of, Minecraft.thePlayer.om, Minecraft.thePlayer.og);
                class897 = new Class897(class891.xl(), class891.xb(), class891.xi());
                this.wo = this.d(class8972, class897);
                for (Class897 class8975 : this.wo) {
                    Minecraft.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(class8975.xc(), class8975.se(), class8975.xs(), true));
                }
                wx.npr();
                C07PacketPlayerDigging c07PacketPlayerDigging = new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.STOP_DESTROY_BLOCK, class891, (Class910)object2);
                Minecraft.thePlayer.sendQueue.we().sendPacketNoEvent(packet2);
                Minecraft.thePlayer.sendQueue.we().sendPacketNoEvent(c07PacketPlayerDigging);
                Collections.reverse(this.wo);
                for (Class897 class8976 : this.wo) {
                    Minecraft.thePlayer.sendQueue.addToSendQueue(new C03PacketPlayer.C04PacketPlayerPosition(class8976.xc(), class8976.se(), class8976.xs(), true));
                }
                class2228.h(true);
            } else if (object == C07PacketPlayerDigging.Action.ABORT_DESTROY_BLOCK) {
                class2228.h(true);
            }
        }
    }

    @EventTarget
    public void d(Class2206 class2206) {
    }

    @Override
    public void onDisable() {
        wx.npr();
        this.wo.clear();
    }

    @Override
    public void onEnable() {
    }

    public static void n(double d, float f) {
        Minecraft.thePlayer.oa = d * Math.cos(Math.toRadians(f + 83.45f));
        Minecraft.thePlayer.ob = d * Math.sin(Math.toRadians(f + 83.45f));
    }

    private Entity c(double d) {
        ArrayList<Entity> arrayList = new ArrayList<Entity>();
        for (Object e : Minecraft.theWorld.nkp) {
            Entity Entity3;
            if (!(e instanceof Entity) || !((double)(Entity3 = (Entity)e).u(Minecraft.thePlayer) < d) || Entity3 == Minecraft.thePlayer) continue;
            arrayList.add(Entity3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort((Entity, Entity2) -> (int)(Entity.u(Minecraft.thePlayer) * 1000.0f - Entity2.u(Minecraft.thePlayer) * 1000.0f));
        return (Entity)arrayList.get(0);
    }

    private ArrayList<Class897> d(Class897 class897, Class897 class8972) {
        if (!this.q(new Class891(class897.vzl()))) {
            class897 = class897.nz(0.0, 1.0, 0.0);
        }
        Class1396 class1396 = new Class1396(class897, class8972);
        class1396.jht();
        int n = 0;
        Class897 class8973 = null;
        Class897 class8974 = null;
        ArrayList<Class897> arrayList = new ArrayList<Class897>();
        ArrayList<Class897> arrayList2 = class1396.jho();
        for (Class897 class8975 : arrayList2) {
            if (n == 0 || n == arrayList2.size() - 1) {
                if (class8973 != null) {
                    arrayList.add(class8973.nz(0.5, 0.0, 0.5));
                }
                arrayList.add(class8975.nz(0.5, 0.0, 0.5));
                class8974 = class8975;
            } else {
                boolean bl = true;
                if (class8975.u(class8974) > 25.0) {
                    bl = false;
                } else {
                    double d = Math.min(class8974.xc(), class8975.xc());
                    double d2 = Math.min(class8974.se(), class8975.se());
                    double d3 = Math.min(class8974.xs(), class8975.xs());
                    double d4 = Math.max(class8974.xc(), class8975.xc());
                    double d5 = Math.max(class8974.se(), class8975.se());
                    double d6 = Math.max(class8974.xs(), class8975.xs());
                    int n2 = (int)d;
                    block1 : while ((double)n2 <= d4) {
                        int n3 = (int)d2;
                        while ((double)n3 <= d5) {
                            int n4 = (int)d3;
                            while ((double)n4 <= d6) {
                                if (!Class1396.toggle(n2, n3, n4, false)) {
                                    bl = false;
                                    break block1;
                                }
                                ++n4;
                            }
                            ++n3;
                        }
                        ++n2;
                    }
                }
                if (!bl) {
                    arrayList.add(class8973.nz(0.5, 0.0, 0.5));
                    class8974 = class8973;
                }
            }
            class8973 = class8975;
            ++n;
        }
        return arrayList;
    }

    private boolean q(Class891 class891) {
        Minecraft.nmk();
        Class1886 class1886 = Minecraft.theWorld.u(new Class891(class891.xl(), class891.xb(), class891.xi())).xk();
        return class1886.vhr() == Class1991.jmk || class1886.vhr() == Class1991.jmi || class1886.vhr() == Class1991.jmw || class1886 == Class2072.oji || class1886 == Class2072.opy || class1886 == Class2072.opu || class1886 == Class2072.ozd || class1886 == Class2072.ojr;
    }

    public void d(Class897 class897) {
        double d = class897.xc() - Class1543.jxf;
        double d2 = class897.se() - Class1543.jxm;
        double d3 = class897.xs() - Class1543.jxg;
        double d4 = 0.3;
        double d5 = Minecraft.thePlayer.nk();
        Class1388.jrb();
        GL11.glLoadIdentity();
        this.pst.vrs.z(this.pst.vhf.odc, 2);
        int[] arrn = new int[]{Class1387.d(Color.BLUE), Class1387.d(Color.CYAN)};
        for (int i = 0; i < 2; ++i) {
            Class1388.az(arrn[i]);
            GL11.glLineWidth((float)(3 - i * 2));
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)(d - d4), (double)d2, (double)(d3 - d4));
            GL11.glVertex3d((double)(d - d4), (double)d2, (double)(d3 - d4));
            GL11.glVertex3d((double)(d - d4), (double)(d2 + d5), (double)(d3 - d4));
            GL11.glVertex3d((double)(d + d4), (double)(d2 + d5), (double)(d3 - d4));
            GL11.glVertex3d((double)(d + d4), (double)d2, (double)(d3 - d4));
            GL11.glVertex3d((double)(d - d4), (double)d2, (double)(d3 - d4));
            GL11.glVertex3d((double)(d - d4), (double)d2, (double)(d3 + d4));
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)(d + d4), (double)d2, (double)(d3 + d4));
            GL11.glVertex3d((double)(d + d4), (double)(d2 + d5), (double)(d3 + d4));
            GL11.glVertex3d((double)(d - d4), (double)(d2 + d5), (double)(d3 + d4));
            GL11.glVertex3d((double)(d - d4), (double)d2, (double)(d3 + d4));
            GL11.glVertex3d((double)(d + d4), (double)d2, (double)(d3 + d4));
            GL11.glVertex3d((double)(d + d4), (double)d2, (double)(d3 - d4));
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)(d + d4), (double)(d2 + d5), (double)(d3 + d4));
            GL11.glVertex3d((double)(d + d4), (double)(d2 + d5), (double)(d3 - d4));
            GL11.glEnd();
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)(d - d4), (double)(d2 + d5), (double)(d3 + d4));
            GL11.glVertex3d((double)(d - d4), (double)(d2 + d5), (double)(d3 - d4));
            GL11.glEnd();
        }
        Class1388.jri();
    }
}

