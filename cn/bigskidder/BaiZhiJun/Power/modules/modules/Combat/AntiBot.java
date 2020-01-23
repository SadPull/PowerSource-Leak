/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 *  com.mojang.authlib.GameProfile
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat;

import com.darkmagician6.eventapi.EventTarget;
import com.google.common.collect.Ordering;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.EntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class559;
import net.minecraft.client.package0.Class959;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.minecraft064.Class2265;
import net.minecraft.client.minecraft064.Class2268;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class398;
import net.minecraft.net9.EntityLivingBase;
import net.minecraft.net9.net530.Entity;

public class Class2183
extends Module {
    public static ArrayList<EntityLivingBase> kaa = new ArrayList();
    public static final List<Entity> kal = new ArrayList<Entity>();
    private static ArrayList kab = new ArrayList();
    private static List<Entity> kai = new ArrayList<Entity>();
    public Class964 kaw = new Class964();
    Class133 kae = new Class133();
    public Value<String> kld = new Value("Antibot", "Mode", 0);
    public Value<Boolean> kln = new Value<Boolean>("Antibot_RemoveDog", true);

    public Class2183() {
        super("AntiBot", Category.Combat);
        this.kld.obg.add("Hypixel");
        this.kld.obg.add("Hypixel2");
    }

    @Override
    public void onEnable() {
        if (!kaa.isEmpty()) {
            kaa.clear();
        }
        if (!kal.isEmpty()) {
            kal.clear();
        }
        super.onEnable();
    }

    public List<Entity> vez() {
        Class2268 class2268 = Minecraft.thePlayer.sendQueue;
        ArrayList<Entity> arrayList = new ArrayList<Entity>();
        new net.minecraft.client.package0.Class959(this.pst, this.pst.vrt);
        List list = Class959.tzg.sortedCopy(class2268.ed());
        for (Object e : list) {
            Class2265 class2265 = (Class2265)e;
            if (class2265 == null) continue;
            arrayList.add(Minecraft.theWorld.na(class2265.id().getName()));
        }
        return arrayList;
    }

    @EventTarget
    public void q(Class2206 class2206) {
        boolean bl = this.kln.vut();
        if (this.kld.xm("Hypixel")) {
            this.pc("Hypixel");
            if (bl && !kai.isEmpty() && this.kae.jc(1000.0f)) {
                if (kai.size() == 1) {
                    Class1386.d("Antibot-Remove" + kai.size() + " bot has been", Class1610.hez);
                } else {
                    Class1386.d("Antibot-Remove" + kai.size() + " bots have been", Class1610.hez);
                }
                this.kae.npr();
                kai.clear();
            }
            if (!kal.isEmpty() && this.kaw.nl(1000.0)) {
                kal.clear();
                this.kaw.npr();
            }
            for (EntityLivingBase EntityLivingBase : Minecraft.theWorld.lc()) {
                Entity Entity;
                if (!(EntityLivingBase instanceof Entity) || (Entity = (Entity)EntityLivingBase) == Minecraft.thePlayer || kal.contains(Entity) || !this.kld.xm("Hypixel")) continue;
                String string = Entity.no().vqb();
                String string2 = Entity.ss();
                String string3 = Entity.getName();
                if (Entity.cl() && !string.startsWith("\u00a7c") && string.endsWith("\u00a7r") && string2.equals(string3)) {
                    List<Entity> list;
                    double d = Math.abs(Entity.of - Minecraft.thePlayer.of);
                    double d2 = Math.abs(Entity.om - Minecraft.thePlayer.om);
                    double d3 = Math.abs(Entity.og - Minecraft.thePlayer.og);
                    double d4 = Math.sqrt(d * d + d3 * d3);
                    if (d2 < 13.0 && d2 > 10.0 && d4 < 3.0 && !(list = this.vez()).contains(Entity)) {
                        if (bl) {
                            this.kae.npr();
                            kai.add(Entity);
                            Minecraft.theWorld.nn(Entity);
                        }
                        kal.add(Entity);
                    }
                }
                if (!string.startsWith("\u00a7") && string.endsWith("\u00a7r")) {
                    kal.add(Entity);
                }
                if (Entity.cl() && !string2.equalsIgnoreCase("") && string2.toLowerCase().contains("\u00a7c\u00a7c") && string3.contains("\u00a7c")) {
                    if (bl) {
                        this.kae.npr();
                        kai.add(Entity);
                        Minecraft.theWorld.nn(Entity);
                    }
                    kal.add(Entity);
                }
                if (!string2.equalsIgnoreCase("") && string2.toLowerCase().contains("\u00a7c") && string2.toLowerCase().contains("\u00a7r")) {
                    if (bl) {
                        this.kae.npr();
                        kai.add(Entity);
                        Minecraft.theWorld.nn(Entity);
                    }
                    kal.add(Entity);
                }
                if (string.contains("\u00a78[NPC]")) {
                    kal.add(Entity);
                }
                if (string.contains("\u00a7c") || string2.equalsIgnoreCase("")) continue;
                kal.add(Entity);
            }
        }
    }

    @EventTarget
    public void toggle(Class2256 class2256) {
        if (this.kld.xm("Hypixel2")) {
            if (Minecraft.thePlayer.uw % 100 == 0) {
                kal.clear();
            }
            this.pc("Hypixel2");
            for (Object e : Minecraft.theWorld.loadedEntity) {
                Entity Entity = (Entity)e;
                if (Entity.no().vqb().startsWith("\u00a7") && this.vez().contains(Entity) && !Entity.no().vqb().toLowerCase().contains("npc]")) continue;
                kal.add(Entity);
            }
        }
    }

    private void veq() {
        for (int i = 0; i < kab.size(); ++i) {
            EntityPlayer EntityPlayer = (EntityPlayer)kab.get(i);
            boolean bl = false;
            for (Entity Entity : Minecraft.theWorld.loadedEntity) {
                if (!Entity.getName().equalsIgnoreCase(EntityPlayer.kao.getName())) continue;
                bl = true;
            }
            if (bl) continue;
            kab.remove(i);
        }
    }
}

