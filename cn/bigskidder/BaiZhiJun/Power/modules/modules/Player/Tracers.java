/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import java.util.List;
import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2227;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package82.Class486;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client52.Class409;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.net530.Entity;

public class Class1045
extends Module {
    public Class1045() {
        super("Tracers", Category.Render);
    }

    @EventTarget
    public void n(Class2227 class2227) {
        for (Entity Entity : Minecraft.theWorld.loadedEntity) {
            if (Minecraft.thePlayer == Entity || Entity.cl()) continue;
            double d = Entity.of;
            double d2 = Entity.om;
            double d3 = Entity.og;
            this.s(Entity);
        }
    }

    private void s(Entity Entity) {
        this.pst.ngf();
        double d = Entity.uf + (Entity.of - Entity.uf) * (double)this.pst.vhf.odc - Class1543.jxf;
        this.pst.ngf();
        double d2 = Entity.um + (Entity.om - Entity.um) * (double)this.pst.vhf.odc - Class1543.jxm;
        this.pst.ngf();
        double d3 = Entity.ug + (Entity.og - Entity.ug) * (double)this.pst.vhf.odc - Class1543.jxg;
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        float f = Minecraft.thePlayer.u(Entity);
        if (f <= 200.0f) {
            GL11.glColor3f((float)1.0f, (float)(f / 40.0f), (float)0.0f);
        }
        GL11.glLoadIdentity();
        boolean bl = this.pst.vrf.uqx;
        this.pst.vrf.uqx = false;
        this.pst.vrs.pa(this.pst.vhf.odc);
        GL11.glBegin((int)3);
        GL11.glVertex3d((double)0.0, (double)Minecraft.thePlayer.nk(), (double)0.0);
        GL11.glVertex3d((double)d, (double)d2, (double)d3);
        GL11.glVertex3d((double)d, (double)(d2 + (double)Entity.nk()), (double)d3);
        GL11.glEnd();
        this.pst.vrf.uqx = bl;
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2929);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
    }
}

