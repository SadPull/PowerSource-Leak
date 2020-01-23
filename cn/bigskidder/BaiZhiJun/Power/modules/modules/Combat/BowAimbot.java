/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat;

import com.darkmagician6.eventapi.EventTarget;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import client87.client86.Value;
import client87.client86.minecraft30.Class134;
import client87.client86.minecraft30.package5073.Class1632;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2183;
import client87.client86.package858.Class2206;
import net.minecraft.client.Minecraft;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.package4133.Class0;
import net.minecraft.net29.Class2001;
import net.minecraft.net29.Class2052;
import net.minecraft.net29.Class2059;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.Entity;
import net.minecraft.net9.net530.Entity;
import net.minecraft.net9.net530.Class859;

public class Class2174
extends Module {
    public Value<Boolean> klp = new Value<Boolean>("BowAimbot_Silent", true);
    boolean klv;
    boolean klj;
    public static Entity klz;

    public Class2174() {
        super("BowAimbot", Category.Combat);
    }

    @Override
    public void onEnable() {
        klz = null;
        super.onEnable();
    }

    @EventTarget
    public void d(Class2206 class2206) {
        klz = this.ves();
        if (Class2174.vec() && klz != null) {
            float[] arrf = Class134.pm(klz);
            boolean bl = this.klp.vut();
            if (bl) {
                class2206.r(arrf[0]);
                class2206.f(arrf[1]);
            } else {
                Minecraft.thePlayer.oi = arrf[0];
                Minecraft.thePlayer.ow = arrf[1];
            }
        }
    }

    public static boolean vec() {
        if (Minecraft.thePlayer.nhl.wx() == null || !(Minecraft.thePlayer.nhl.wx().vrw() instanceof Class2052)) {
            return false;
        }
        return Minecraft.thePlayer.bk();
    }

    private Entity ves() {
        EntityLivingBase EntityLivingBase2;
        ArrayList<Entity> arrayList = new ArrayList<Entity>();
        for (EntityLivingBase EntityLivingBase2 : Minecraft.theWorld.lc()) {
            Entity Entity3;
            if (!(EntityLivingBase2 instanceof Entity) || !((Entity3 = (Entity)EntityLivingBase2) instanceof Entity) || Entity3 == Minecraft.thePlayer || !Minecraft.thePlayer.x(Entity3) || !(Minecraft.thePlayer.u(Entity3) < 65.0f) || Class2183.kal.contains(Entity3) || Class1632.vg(Entity3.getName())) continue;
            arrayList.add(Entity3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.sort((Entity, Entity2) -> {
            float[] arrf = Class134.nq(Entity);
            float[] arrf2 = Class134.nq(Entity2);
            return (int)(Class134.nj(Minecraft.thePlayer.oi, arrf[0]) + Class134.nj(Minecraft.thePlayer.ow, arrf[1]) - (Class134.nj(Minecraft.thePlayer.oi, arrf2[0]) + Class134.nj(Minecraft.thePlayer.ow, arrf2[1])));
        });
        EntityLivingBase2 = (Entity)arrayList.get(0);
        return EntityLivingBase2;
    }
}

