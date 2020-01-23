/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.util.vector.Vector3f
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc;

import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import net.minecraft.network.play.client.C09PacketHeldItemChange;
import net.minecraft.network.play.server.S08PacketPlayerPosLook;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Vector3f;
import client87.client86.client85.Class1610;
import client87.client86.minecraft30.Class1384;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class161;
import client87.client86.minecraft30.minecraft993.Class964;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2227;
import client87.client86.package858.Class2228;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.minecraft860.Class1027;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package4133.Class7;
import net.minecraft.client.package82.Class486;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client52.Class409;
import net.minecraft.client52.Class575;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.net530.Class859;
import net.minecraft.net99.Class1467;
import net.minecraft.package9.Class2469;

public class Class224
extends Module {
    Class964 phv = new Class964();
    private ArrayList phj = new ArrayList();
    private ArrayList phz = new ArrayList();

    public Class224() {
        super("Blink", Category.Misc);
    }

    @Override
    public void onDisable() {
        EventManager.register(this);
        if (Minecraft.thePlayer != null && Minecraft.theWorld != null) {
            double d = Minecraft.thePlayer.of;
            double d2 = Minecraft.thePlayer.om;
            double d3 = Minecraft.thePlayer.og;
            float f = Minecraft.thePlayer.oi;
            float f2 = Minecraft.thePlayer.ow;
            java.lang.Object var9_6 = null;
            Class7 class7 = new Class7(Minecraft.theWorld, Minecraft.thePlayer.id());
            class7.nhl = Minecraft.thePlayer.nhl;
            class7.nhi = Minecraft.thePlayer.nhi;
            class7.d(d, d2, d3, f, f2);
            class7.zy = Minecraft.thePlayer.zy;
            Minecraft.theWorld.d(-1, class7);
        }
        this.phj.clear();
        this.phz.clear();
        super.onDisable();
    }

    @Override
    public void onEnable() {
        EventManager.unregister(this);
        Minecraft.theWorld.ji(-1);
        for (Packet packet : this.phj) {
            Minecraft.thePlayer.sendQueue.addToSendQueue(packet);
            this.phv.npr();
        }
        this.phj.clear();
        super.onEnable();
        Class1386.d("Blink Disable", Class1610.hec);
    }

    @EventTarget
    public void z(Class2228 class2228) {
        if (class2228.xv() instanceof C03PacketPlayer) {
            this.phj.add(class2228.xv());
            class2228.h(true);
        } else if (class2228.xv() instanceof C08PacketPlayerBlockPlacement || class2228.xv() instanceof C07PacketPlayerDigging || class2228.xv() instanceof C09PacketHeldItemChange || class2228.xv() instanceof C02PacketUseEntity) {
            this.phj.add(class2228.xv());
            class2228.h(true);
        }
    }

    @EventTarget
    public void q(Class2228 class2228) {
        if (class2228.xv() instanceof S08PacketPlayerPosLook && Minecraft.vtw) {
            class2228.h(true);
        }
    }

    @EventTarget
    public void n(Class2227 class2227) {
        this.nxd();
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)2.0f);
        Class1384.ab(Class161.rcl.rsk);
        GL11.glLoadIdentity();
        boolean bl = this.pst.vrf.uqx;
        this.pst.vrf.uqx = false;
        this.pst.vrs.pa(this.pst.vhf.odc);
        GL11.glBegin((int)3);
        for (Vector3f vector3f : this.phz) {
            this.pst.ngf();
            this.pst.ngf();
            this.pst.ngf();
            GL11.glVertex3d((double)((double)vector3f.x - Class1543.jxf), (double)((double)vector3f.y - Class1543.jxm), (double)((double)vector3f.z - Class1543.jxg));
        }
        GL11.glEnd();
        this.pst.vrf.uqx = bl;
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }

    private void nxd() {
        block3 : {
            Vector3f vector3f;
            block2 : {
                double d = Minecraft.thePlayer.of;
                double d2 = Minecraft.thePlayer.om;
                double d3 = Minecraft.thePlayer.og;
                vector3f = new Vector3f((float)d, (float)d2, (float)d3);
                if (Class575.odg != 0.0f || this.pst.vrf.usx.ukj) break block2;
                if (Class575.odm == 0.0f) break block3;
            }
            this.phz.add(vector3f);
        }
    }
}

