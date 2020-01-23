/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules;

import com.darkmagician6.eventapi.EventManager;
import java.util.List;
import client87.client86.Class2525;
import client87.client86.Value;
import client87.client86.client85.Class1610;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class169;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class960;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class415;
import net.minecraft.client52.Class423;

public class Module {
    public Minecraft pst = Minecraft.nmk();
    public Value psh;
    private String name;
    private int key;
    private int psm;
    private Category Category;
    private boolean psa;
    private String psl;
    public boolean psb;
    public double psi = 0.0;
    public double psw = 0.0;
    public double pse = 0.0;
    public float pxd;
    public boolean pxn;
    public int[] pxp;
    public boolean pxv;
    public String pxj = "";
    public static boolean pxz = false;
    private int pxq;

    public Module(String string, Category Category) {
        this.name = string;
        this.psm = -1;
        this.Category = Category;
        this.pxp = new int[2];
    }

    public String tl() {
        return this.pxj;
    }

    public void pc(String string) {
        String string2 = string.toString();
        this.pxj = string2.isEmpty() ? string2 : String.format("\u00a77\u00a7f%s\u00a77", (Object)((Object)Class423.xep) + string + " ");
    }

    public void onDisable() {
    }

    public void onEnable() {
    }

    public void njf() {
    }

    public void njm() {
    }

    public void toggleNotSet() {
        try {
            if (this.nji()) {
                this.toggle(false);
            } else {
                this.toggle(true);
            }
        }
        catch (Exception exception) {
            exception.printStackTragetName();
        }
    }

    public String getDisplayName() {
        if (this.psh == null) {
            return "";
        }
        return this.psh.obh ? this.psh.tv(this.psh.vuj()) : String.valueOf(this.psh.vut());
    }

    public void toggle(boolean bl) {
        this.toggle(bl, false);
        Class2525.oiy.oim.jmb();
    }

    public void toggle(boolean bl, boolean bl2) {
        this.psa = bl;
        this.njf();
        if (bl) {
            if (Minecraft.theWorld != null) {
                if (!Class2525.oiu && !pxz) {
                    Class1386.d(String.valueOf(this.getName()) + "\u00a7a Enabled", Class1610.hej);
                }
                this.onDisable();
            }
            EventManager.register(this);
            this.pxq = this.pst.vrj.jj(Class415.xq(this.getName())) + 5;
        } else {
            if (Minecraft.theWorld != null) {
                if (!Class2525.oiu && !pxz) {
                    Class1386.d(String.valueOf(this.getName()) + "\u00a7c Disabled", Class1610.hec);
                }
                this.onEnable();
            }
            EventManager.unregister(this);
            this.pxq = this.pst.vrj.jj(Class415.xq(this.getName())) + 5;
        }
        if (bl2) {
            Class2525.oiy.oim.jmb();
        }
    }

    public String getName() {
        return this.name;
    }

    public void setKey(int n) {
        this.key = n;
    }

    public int xj() {
        return this.psm;
    }

    public String njl() {
        return this.psl;
    }

    public void ps(String string) {
        this.psl = string;
    }

    public Category njb() {
        return this.Category;
    }

    public boolean nji() {
        return this.psa;
    }

    public void zn(int n) {
        this.psm = n;
    }

    public boolean getValue() {
        for (Value Value : Value.obb) {
            String string = Value.vus().split("_")[0];
            if (!string.equalsIgnoreCase(this.getName())) continue;
            return true;
        }
        return false;
    }

    public void v(float f, float f2, float f3) {
        double d = -Math.sin(Math.toRadians(f)) * (double)f2;
        double d2 = Math.cos(Math.toRadians(f)) * (double)f2;
        double d3 = f3;
        Minecraft.thePlayer.toggle(d + Minecraft.thePlayer.of, d3 + Minecraft.thePlayer.om, d2 + Minecraft.thePlayer.og);
    }

    public void j(float f, float f2, float f3) {
        double d = -Math.sin(Math.toRadians(f)) * (double)f2;
        double d2 = Math.cos(Math.toRadians(f)) * (double)f2;
        Minecraft.thePlayer.oa = d;
        Minecraft.thePlayer.ol = f3;
        Minecraft.thePlayer.ob = d2;
    }

    public void u(float f, float f2) {
        double d = -Math.sin(Math.toRadians(f)) * (double)f2;
        double d2 = Math.cos(Math.toRadians(f)) * (double)f2;
        Minecraft.thePlayer.oa = d;
        Minecraft.thePlayer.ob = d2;
    }

    public int nje() {
        return this.pxq;
    }

    public void ztoggle(int n) {
        this.pxq = n;
    }
}

