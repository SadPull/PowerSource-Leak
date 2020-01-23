/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.lwjgl.opengl.GL11;
import client87.client86.Value;
import client87.client86.minecraft30.Class1384;
import client87.client86.minecraft30.package5073.Class1632;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1035;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2183;
import client87.client86.package858.Class2227;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.client078.Class1156;
import net.minecraft.client.client078.Class1233;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package82.Class487;
import net.minecraft.client.package82.package833.Class1543;
import net.minecraft.client52.Class409;
import net.minecraft.client52.Class897;
import net.minecraft.net9.net530.Entity;

public class Class130
extends Module {
    private static final Map<Entity, float[][]> hjf = new HashMap<Entity, float[][]>();
    public Value<Boolean> hjm = new Value<Boolean>("Skeletal_Invisibles", true);
    public Value<Boolean> hjg = new Value<Boolean>("Skeletal_Antibot", true);

    public Class130() {
        super("Skeletal", Category.Render);
    }

    @EventTarget
    public void n(Class2227 class2227) {
        this.jcg();
    }

    private void jcg() {
        Class1384.qt(true);
        GL11.glDisable((int)2848);
        Class487.pbz();
        hjf.keySet().removeIf(Entity -> !Minecraft.theWorld.loadedEntity.contains(Entity));
        Minecraft.theWorld.loadedEntity.forEach(Entity -> {
            if (Entity == Minecraft.thePlayer) {
                return;
            }
            if (Entity.cl() && !this.hjm.vut().booleanValue()) {
                return;
            }
            if (Class2183.kal.contains(Entity) && !this.hjg.vut().booleanValue()) {
                return;
            }
            float[][] arrf = hjf.get(Entity);
            if (arrf == null) {
                return;
            }
            GL11.glEnable((int)2848);
            GL11.glPushMatrix();
            GL11.glLineWidth((float)1.5f);
            if (Class1632.w(Entity)) {
                GL11.glColor4f((float)0.0f, (float)255.0f, (float)255.0f, (float)1.0f);
            } else if (Class1035.l(Entity)) {
                GL11.glColor4f((float)0.0f, (float)255.0f, (float)0.0f, (float)1.0f);
            } else if (Class2183.kal.contains(Entity)) {
                GL11.glColor4f((float)1.0f, (float)0.0f, (float)1.0f, (float)1.0f);
            } else if (Entity.jb > 0) {
                GL11.glColor4f((float)255.0f, (float)0.0f, (float)0.0f, (float)1.0f);
            } else if (Entity.cl()) {
                GL11.glColor4f((float)255.0f, (float)255.0f, (float)0.0f, (float)1.0f);
            } else {
                GL11.glColor4f((float)255.0f, (float)255.0f, (float)255.0f, (float)1.0f);
            }
            Class897 class897 = Class1384.ny(Entity);
            double d = class897.xc() - Class1543.jxf;
            double d2 = class897.se() - Class1543.jxm;
            double d3 = class897.xs() - Class1543.jxg;
            GL11.glTranslated((double)d, (double)d2, (double)d3);
            float f = Entity.zu + (Entity.zo - Entity.zu) * this.pst.vhf.odc;
            GL11.glRotatef((float)(-f), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glTranslated((double)0.0, (double)0.0, (double)(Entity.cg() ? -0.235 : 0.0));
            float f2 = Entity.cg() ? 0.6f : 0.75f;
            GL11.glPushMatrix();
            GL11.glTranslated((double)-0.125, (double)f2, (double)0.0);
            if (arrf[3][0] != 0.0f) {
                GL11.glRotatef((float)(arrf[3][0] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (arrf[3][1] != 0.0f) {
                GL11.glRotatef((float)(arrf[3][1] * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (arrf[3][2] != 0.0f) {
                GL11.glRotatef((float)(arrf[3][2] * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)(-f2), (double)0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslated((double)0.125, (double)f2, (double)0.0);
            if (arrf[4][0] != 0.0f) {
                GL11.glRotatef((float)(arrf[4][0] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (arrf[4][1] != 0.0f) {
                GL11.glRotatef((float)(arrf[4][1] * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (arrf[4][2] != 0.0f) {
                GL11.glRotatef((float)(arrf[4][2] * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)(-f2), (double)0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glTranslated((double)0.0, (double)0.0, (double)(Entity.cg() ? 0.25 : 0.0));
            GL11.glPushMatrix();
            GL11.glTranslated((double)0.0, (double)(Entity.cg() ? -0.05 : 0.0), (double)(Entity.cg() ? -0.01725 : 0.0));
            GL11.glPushMatrix();
            GL11.glTranslated((double)-0.375, (double)((double)f2 + 0.55), (double)0.0);
            if (arrf[1][0] != 0.0f) {
                GL11.glRotatef((float)(arrf[1][0] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (arrf[1][1] != 0.0f) {
                GL11.glRotatef((float)(arrf[1][1] * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (arrf[1][2] != 0.0f) {
                GL11.glRotatef((float)(-arrf[1][2] * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)-0.5, (double)0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslated((double)0.375, (double)((double)f2 + 0.55), (double)0.0);
            if (arrf[2][0] != 0.0f) {
                GL11.glRotatef((float)(arrf[2][0] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            if (arrf[2][1] != 0.0f) {
                GL11.glRotatef((float)(arrf[2][1] * 57.295776f), (float)0.0f, (float)1.0f, (float)0.0f);
            }
            if (arrf[2][2] != 0.0f) {
                GL11.glRotatef((float)(-arrf[2][2] * 57.295776f), (float)0.0f, (float)0.0f, (float)1.0f);
            }
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)-0.5, (double)0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glRotatef((float)(f - Entity.zy), (float)0.0f, (float)1.0f, (float)0.0f);
            GL11.glPushMatrix();
            GL11.glTranslated((double)0.0, (double)((double)f2 + 0.55), (double)0.0);
            if (arrf[0][0] != 0.0f) {
                GL11.glRotatef((float)(arrf[0][0] * 57.295776f), (float)1.0f, (float)0.0f, (float)0.0f);
            }
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)0.3, (double)0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPopMatrix();
            GL11.glRotatef((float)(Entity.cg() ? 25.0f : 0.0f), (float)1.0f, (float)0.0f, (float)0.0f);
            GL11.glTranslated((double)0.0, (double)(Entity.cg() ? -0.16175 : 0.0), (double)(Entity.cg() ? -0.48025 : 0.0));
            GL11.glPushMatrix();
            GL11.glTranslated((double)0.0, (double)f2, (double)0.0);
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)-0.125, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.125, (double)0.0, (double)0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslated((double)0.0, (double)f2, (double)0.0);
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)0.0, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.0, (double)0.55, (double)0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslated((double)0.0, (double)((double)f2 + 0.55), (double)0.0);
            GL11.glBegin((int)3);
            GL11.glVertex3d((double)-0.375, (double)0.0, (double)0.0);
            GL11.glVertex3d((double)0.375, (double)0.0, (double)0.0);
            GL11.glEnd();
            GL11.glPopMatrix();
            GL11.glPopMatrix();
        });
        Class1384.qt(false);
    }

    public static void d(Entity Entity, Class1233 class1233) {
        hjf.put(Entity, new float[][]{{class1233.xqm.xjj, class1233.xqm.xjz, class1233.xqm.xjq}, {class1233.xql.xjj, class1233.xql.xjz, class1233.xql.xjq}, {class1233.xqb.xjj, class1233.xqb.xjz, class1233.xqb.xjq}, {class1233.xqi.xjj, class1233.xqi.xjz, class1233.xqi.xjq}, {class1233.xqw.xjj, class1233.xqw.xjz, class1233.xqw.xjq}});
    }
}

