/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.net206;

import com.darkmagician6.eventapi.EventTarget;
import java.awt.Color;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.UUID;
import org.lwjgl.opengl.GL11;
import client87.client86.Class2525;
import client87.client86.Value;
import client87.client86.client85.Class1610;
import client87.client86.minecraft30.Class1384;
import client87.client86.minecraft30.Class1386;
import client87.client86.minecraft30.Class1387;
import client87.client86.minecraft30.Class1388;
import client87.client86.minecraft30.Class1392;
import client87.client86.minecraft30.Class161;
import client87.client86.minecraft30.Class726;
import client87.client86.minecraft30.minecraft993.Class964;
import client87.client86.minecraft30.net93.net92.Class1652;
import client87.client86.minecraft30.net93.net92.Class1655;
import cn.bigskidder.BaiZhiJun.Power.modules.ModuleManager;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Class1484;
import client87.client86.package858.Class2200;
import client87.client86.package858.Class2204;
import client87.client86.package858.Class2217;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class1797;
import net.minecraft.client.package0.Class1815;
import net.minecraft.client.package0.Class559;
import net.minecraft.client.package0.Class960;
import net.minecraft.client.client03.Class1224;
import net.minecraft.client.client03.Class1226;
import net.minecraft.client.minecraft064.Class2265;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client.package474.Class1934;
import net.minecraft.client.package82.Class391;
import net.minecraft.client.package82.Class487;
import net.minecraft.client.package82.package833.Class2537;
import net.minecraft.client52.Class398;
import net.minecraft.client52.Class423;
import net.minecraft.client52.Class608;
import net.minecraft.client59.minecraft531.Class1991;
import net.minecraft.minecraft311.Class1368;
import net.minecraft.net29.Class2059;
import net.minecraft.net579.Class2418;
import net.minecraft.net579.Class2421;
import net.minecraft.net9.minecraft380.Class1172;
import net.minecraft.net9.net530.Class859;

public class Class140
extends Module {
    public static String hpy = "\u7f51\u7edc\u8fde\u63a5\u5931\u8d25";
    private Value<String> hpk = new Value("HUD", "Logo", 0);
    private static Value<String> hpt = new Value("HUD", "Array", 0);
    private Value<String> hph = new Value("HUD", "Effect", 1);
    public static Value<Double> hpr = new Value<Double>("HUD_rainbow", 200.0, 0.0, 2000.0, 100.0);
    public Value<Double> hpf = new Value<Double>("HUD_background", 100.0, 0.0, 255.0, 1.0);
    public Value<Boolean> hpm = new Value<Boolean>("HUD_Logo", true);
    public static Value<Boolean> hpg = new Value<Boolean>("HUD_Hotbar", false);
    public Value<Boolean> hpa = new Value<Boolean>("HUD_ArrayList", true);
    public Value<Boolean> hpl = new Value<Boolean>("HUD_ArrayListRainbow", false);
    public static Value<Boolean> hpb = new Value<Boolean>("HUD_ArmorHUD", true);
    public Value<Boolean> hpi = new Value<Boolean>("HUD_TabGui", true);
    public static Value<Boolean> hpw = new Value<Boolean>("HUD_info", true);
    public static Value<Boolean> hpe = new Value<Boolean>("HUD_No score", false);
    public static Value<Boolean> hvd = new Value<Boolean>("HUD_Timer", false);
    public static Value<Boolean> hvn = new Value<Boolean>("HUD_Health", true);
    Class964 hvp = new Class964();
    public int hvv;
    public Minecraft hvj = Minecraft.nmk();
    Class1655 hvz = Class1652.jvx;
    Class1655 hvq = Class1652.jvn;
    Class1655 hvc = Class1652.jvx;
    Class1655 hvs = Class1652.jvj;
    Class1655 hvx = Class1652.jvd;
    private int hvo = 0;
    int hvu = 0;
    public static float hvy;
    public ArrayList hvk = new ArrayList();
    public int hvt = 0;
    public int hvh = 0;
    public int hvr = 0;
    public int hvf = 0;
    public int hvm = new Color(105, 180, 255).getRGB();
    Class960 hvg;
    boolean hva;
    public static boolean hvl;
    static int hvb;

    static {
        hvl = false;
        hvb = hpr.vut().intValue();
    }

    public Class140() {
        super("HUD", Category.Render);
        this.hvg = this.hvj.vrj;
        this.hva = false;
        this.hvk.addAll(Arrays.asList(Category.values()));
        this.hpk.obg.add("Power");
        Class140.hpt.obg.add("Power");
        Class140.hpt.obg.add("Parke");
        Class140.hpt.obg.add("MC");
        this.hph.obg.add("NONE");
        this.hph.obg.add("Power");
    }

    @EventTarget
    public void d(Class2200 class2200) {
        String string = class2200.xz();
        string = " [CHAT] " + string;
        Object var3_3 = null;
        System.out.println(string);
        if (!string.contains("[CHAT]")) {
            return;
        }
        if (string.contains("[Power]")) {
            return;
        }
        if (string.contains("@" + Minecraft.thePlayer.no().vql() + " \u674e\u4f73\u4e50\u7684\u5988\u5988\u662f\u4e0d\u662f\u6b7b\u4e86\uff1f") || string.contains("\u674e\u4f73\u4e50\u4ed6\u5988\u5988\u662f\u4e0d\u662f\u6b7b\u4e86\uff1f")) {
            String string2 = "/ac \u5bf9 \u674e\u4f73\u4e50\u4f60\u5988\u5988\u6b7b\u4e86\uff01";
            Minecraft.thePlayer.zn(string2);
            Minecraft.thePlayer.zn(string2);
            Minecraft.thePlayer.zn(string2);
            return;
        }
        if (string.contains("@" + Minecraft.thePlayer.no().vql() + " " + Class1392.c(Minecraft.vmm, "BD[", "]"))) {
            System.exit(0);
            return;
        }
        if (string.contains(Class1392.c(Minecraft.vmm, "SP[", "]"))) {
            Minecraft.thePlayer.zn("/ac \u514d\u8d39\u5ba2\u6237\u7aefPower>Aw ");
            Minecraft.thePlayer.zn("-spammer \u514d\u8d39\u5ba2\u6237\u7aefPower\u6bb4\u6253\u674e\u4f73\u4e50\u9020\u8c23\u4e00\u54e5-Aw\u7a7a\u5200\u4e4b\u738bSlowly\u2014\u2014base");
            ModuleManager.px("spammer").toggle(true);
            return;
        }
    }

    @EventTarget
    public void toggle(Class2204 class2204) {
        int n;
        Class1815 class1815 = new Class1815(this.hvj);
        if (Minecraft.thePlayer.po() < 6.0f && !this.hva) {
            Class1386.d("Your Health is Low!", Class1610.heq);
            this.hva = true;
        }
        if (Minecraft.thePlayer.po() > 6.0f && this.hva) {
            this.hva = false;
        }
        this.x(class1815);
        if (this.hpi.vut().booleanValue()) {
            this.jcq();
        }
        if (this.hpm.vut().booleanValue()) {
            this.jcz();
        }
        String string = "\u00a7bX: \u00a7r" + (int)Minecraft.thePlayer.of + " " + "\u00a7bY: \u00a7r" + (int)Minecraft.thePlayer.om + " " + "\u00a7bZ: \u00a7r" + (int)Minecraft.thePlayer.og;
        String string2 = "\u00a7bFPS: \u00a7r" + Minecraft.nga() + (this.hvj.nmg() ? " \u00a7bPing: \u00a7r0ms" : " \u00a7bPing: \u00a7r" + Minecraft.getNetworkManager().toggle(Minecraft.thePlayer.sq()).eh() + "ms");
        String string3 = " X\u00a77: " + (Object)((Object)Class423.xeo) + Class608.ntoggle(Minecraft.thePlayer.of);
        String string4 = " Y\u00a77: " + (Object)((Object)Class423.xeo) + Class608.ntoggle(Minecraft.thePlayer.om);
        String string5 = " Z\u00a77: " + (Object)((Object)Class423.xeo) + Class608.ntoggle(Minecraft.thePlayer.og);
        String string6 = String.valueOf(string3) + string4 + string5;
        String string7 = "FPS\u00a77: " + (Object)((Object)Class423.xeo) + Minecraft.nga();
        String string8 = "PING\u00a77: " + (Object)((Object)Class423.xeo) + Minecraft.getNetworkManager().toggle(Minecraft.thePlayer.sq()).eh() + "ms";
        int n2 = n = Class1172.olx != null && Class1172.ols > 0 ? 20 : 3;
        if (hpw.vut().booleanValue()) {
            int n3 = this.hvj.vrt.jdv().jjv() ? 22 : 8;
            int n4 = this.hvj.vrt.jdv().jjv() ? 12 : 8;
            this.hvx.n(string3, (double)(new Class1815(this.hvj).jvs() / 2 - this.hvx.jj(string6) / 2), (double)n, Class140.jcj());
            this.hvx.n(string4, (double)(new Class1815(this.hvj).jvs() / 2 - this.hvx.jj(string6) / 2 + this.hvx.jj(string3)), (double)n, Class140.jcj());
            this.hvx.n(string5, (double)(new Class1815(this.hvj).jvs() / 2 - this.hvx.jj(string6) / 2 + this.hvx.jj(string3) + this.hvx.jj(string4)), (double)n, Class140.jcj());
            this.hvc.n(string8, 1.0, (double)(this.hpi.vut().booleanValue() ? (hvd.vut().booleanValue() ? 94 : 80) : (hvd.vut() != false ? 38 : 24)), Class140.jcj());
            this.hvc.n(string7, 1.0, (double)(this.hpi.vut().booleanValue() ? (hvd.vut().booleanValue() ? 104 : 90) : (hvd.vut() != false ? 48 : 34)), Class140.jcj());
            try {
                hpy = Minecraft.vma.contains(Class1392.jrw()) ? "\u00a77Power build - \u00a7f" + Class2525.oio + " \u00a77- User - " + "\u00a7a" + Class1392.jre() : "\u00a77Power build - \u00a7f" + Class2525.oio + " \u00a77- User - " + "\u00a7a" + "\u514d\u8d39\u7528\u6237";
            }
            catch (UnsupportedEncodingException | NoSuchAlgorithmException exception) {
                exception.printStackTragetName();
            }
            if (!this.hvj.vrf.uxb) {
                this.hvg.v(hpy, class1815.jvs() - this.hvg.jj(hpy), class1815.jvx() - 10, -1);
            } else {
                this.hvg.v(hpy, class1815.jvs() - this.hvg.jj(hpy) - 9, class1815.jvx() - 10, -1);
            }
        }
        Class487.g(1.0f, 1.0f, 1.0f);
    }

    public static int jcj() {
        if (Class1484.udq.xm("White")) {
            return Class1386.s(Class161.rsn.rsk, 1.0f);
        }
        if (Class1484.udq.xm("Red")) {
            return Class1387.d(Color.red);
        }
        if (Class1484.udq.xm("Yellow")) {
            return Class1387.d(Color.yellow);
        }
        if (Class1484.udq.xm("Green")) {
            return Class1387.d(Color.green);
        }
        if (Class1484.udq.xm("Blue")) {
            return new Color(0, 133, 242).getRGB();
        }
        if (Class1484.udq.xm("Purple")) {
            return Class1387.d(Color.magenta);
        }
        if (Class1484.udq.xm("Cyan")) {
            return new Color(0, 226, 207).getRGB();
        }
        if (Class1484.udq.xm("Rainbow")) {
            return Class1384.aa(hvb);
        }
        return hvb;
    }

    public void jcz() {
        if (this.hpk.xm("Power")) {
            hvy = (float)this.hvq.lf() + 7.0f;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = Calendar.getInstangetName().getTime();
            String string = simpleDateFormat.format(date);
            if (hvd.vut().booleanValue()) {
                this.hvq.d(string, 0.0, (double)(this.hpi.vut() != false ? 80 : 24), Class140.jcj());
            }
            Class1388.v(1.0, 1.0, (float)this.hvq.jj(Class2525.oiz) + 9.0f, 19.0, new Color(10, 10, 10, 150).getRGB());
            this.hvq.toggle(Class2525.oiz.substring(1, 5), 30.5f, 7.0f, -1);
            this.hvq.toggle(Class2525.oiz.substring(0, 1), 8.0f, 7.0f, Class140.jcj());
            Class1652.jvj.toggle("B" + Class2525.oix, (float)this.hvq.jj(Class2525.oiz) + 14.0f - (float)Class1652.jvj.jj("B" + Class2525.oix), 2.0f, Class140.jcj());
            Class1388.v(1.3, 1.3, 3.0, 18.3, Class140.jcj());
        }
    }

    private void x(Class1815 class1815) {
        int n = hpr.vut().intValue();
        int n2 = this.hpf.vut().intValue();
        if (this.hpa.vut().booleanValue()) {
            ArrayList<Module> arrayList = new ArrayList<Module>(Class2525.oiy.oif.nsetKey());
            int[] arrn = new int[1];
            if (hpt.xm("Parke")) {
                arrayList.sort((Module, Module2) -> this.hvz.jj(String.valueOf(String.valueOf(Module2.getName())) + Module2.tl()) - this.hvz.jj(String.valueOf(String.valueOf(Module.getName())) + Module.tl()));
            }
            if (hpt.xm("Power")) {
                arrayList.sort((Module, Module2) -> this.hvs.jj(String.valueOf(String.valueOf(Module2.getName())) + Module2.tl()) - this.hvs.jj(String.valueOf(String.valueOf(Module.getName())) + Module.tl()));
            }
            if (hpt.xm("MC")) {
                arrayList.sort((Module, Module2) -> this.hvg.jj(String.valueOf(String.valueOf(Module2.getName())) + Module2.tl()) - this.hvg.jj(String.valueOf(String.valueOf(Module.getName())) + Module.tl()));
            }
            int n3 = 0;
            int n4 = class1815.jvs();
            for (Module Module3 : arrayList) {
                int n5;
                if (Module3.getName() == "HUD" || Module3.getName() == "Commands" || Module3.getName() == "Animation" || Module3.getName() == "ItemPhysic") continue;
                String string = Module3.tl().isEmpty() ? Module3.getName() : String.format("%s %s", Module3.getName(), Module3.tl());
                int n6 = n5 = Class140.d(System.nanoTime(), arrn[0], 1.0f).getRGB();
                Color color = new Color(n6);
                int n7 = new Color((float)color.getBlue() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getBlue() / 255.0f).getRGB();
                if (Class1484.udq.xm("White")) {
                    n7 = new Color((float)color.getBlue() / 255.0f, (float)color.getBlue() / 255.0f, (float)color.getBlue() / 255.0f).getRGB();
                } else if (Class1484.udq.xm("Red")) {
                    n7 = new Color((float)color.getRed() / 255.0f, 0.0f, 0.0f).getRGB();
                } else if (Class1484.udq.xm("Yellow")) {
                    n7 = new Color((float)color.getRed() / 255.0f, (float)color.getRed() / 255.0f, 0.0f).getRGB();
                } else if (Class1484.udq.xm("Green")) {
                    n7 = new Color(0.0f, (float)color.getGreen() / 255.0f, 0.0f).getRGB();
                } else if (Class1484.udq.xm("Blue")) {
                    n7 = new Color(0, color.getGreen() / 3 + 40, color.getGreen() / 2 + 100).getRGB();
                } else if (Class1484.udq.xm("Purple")) {
                    n7 = new Color(color.getRed() / 2 + 100, 0, color.getRed() / 2 + 100).getRGB();
                } else if (Class1484.udq.xm("Cyan")) {
                    n7 = new Color(0, color.getRed() / 2 + 110, color.getRed() / 2 + 90).getRGB();
                } else if (Class1484.udq.xm("Rainbow")) {
                    n7 = new Color((float)color.getRed() / 255.0f, (float)color.getGreen() / 255.0f, (float)color.getBlue() / 255.0f).getRGB();
                }
                if (hpt.xm("Parke")) {
                    Class1388.z(class1815.jvs() - 1, n3 - 2, class1815.jvs(), n3 + 9, this.hpl.vut() != false ? Class1384.aa(arrn[0] * n) : new Color(n7).getRGB());
                    Class1388.z(class1815.jvs() - this.hvz.jj(String.valueOf(Module3.tl()) + Module3.getName()) - 3 + Module3.nje(), n3, class1815.jvs() - 1 + Module3.nje(), n3 + 9, new Color(0, 0, 0, n2).getRGB());
                    this.hvz.d(string, (double)(n4 - this.hvz.jj(String.valueOf(Module3.getName()) + Module3.tl()) - 2 + Module3.nje()), (double)((float)((double)n3 + 2.0)), this.hpl.vut() != false ? Class1384.aa(arrn[0] * n) : new Color(n7).getRGB());
                }
                if (hpt.xm("MC")) {
                    Class1388.toggle((double)(class1815.jvs() - this.hvg.jj(String.valueOf(Module3.tl()) + Module3.getName())) - 2.5 + (double)Module3.nje(), n3, class1815.jvs() + Module3.nje(), n3 + 9, new Color(0, 0, 0, n2).getRGB());
                    Class1388.toggle((double)(class1815.jvs() - this.hvg.jj(String.valueOf(Module3.tl()) + Module3.getName())) - 2.5 + (double)Module3.nje(), n3, (double)(class1815.jvs() - this.hvg.jj(String.valueOf(Module3.tl()) + Module3.getName())) - 3.5 + (double)Module3.nje(), n3 + 9, this.hpl.vut() != false ? Class1384.aa(arrn[0] * n) : new Color(n7).getRGB());
                    this.hvg.v(string, n4 - this.hvg.jj(String.valueOf(Module3.getName()) + Module3.tl()) - 1 + Module3.nje(), (float)((double)n3 + 0.5), this.hpl.vut() != false ? Class1384.aa(arrn[0] * n) : new Color(n7).getRGB());
                }
                if (hpt.xm("Power")) {
                    Class1388.v(class1815.jvs() - this.hvs.jj(String.valueOf(Module3.tl()) + Module3.getName()) - 3 + Module3.nje(), n3, class1815.jvs() + 2, n3 + 8, new Color(0, 0, 0, n2).getRGB());
                    this.hvs.n(string, (double)(n4 - this.hvs.jj(String.valueOf(Module3.getName()) + Module3.tl()) - 2 + Module3.nje()), (double)((float)((double)n3 + 1.5)), this.hpl.vut() != false ? Class1384.aa(arrn[0] * n) : new Color(n7).getRGB());
                    Class1388.d(class1815.jvs() + Module3.nje(), n3, class1815.jvs() - 1 + Module3.nje(), n3 + 8, this.hpl.vut() != false ? Class1384.aa(arrn[0] * n) : new Color(n7).getRGB());
                }
                if (Module3.nje() > 0) {
                    Module3.ztoggle(Module3.nje() - 1);
                    ++Class2525.oia;
                }
                n3 += hpt.xm("Power") ? 8 : 9;
                int[] arrn2 = arrn;
                arrn2[0] = arrn2[0] + 1;
            }
        }
    }

    public void jcq() {
        int[] arrn = new int[1];
        boolean bl = false;
        int n = 1;
        int n2 = (int)hvy + 2;
        Class1388.d((double)n, (double)n2, (double)(n + this.jck() + 3), (double)(n2 + this.hvk.size() * 11), 0.10000000149011612, Integer.MIN_VALUE, new Color(0, 0, 0, 255).getRGB());
        for (Category Category : this.hvk) {
            int n3 = -1;
            if (this.jco().equals((Object)Category)) {
                Class1388.d((double)n + 0.3, (double)n2 + 0.3, (double)(n + this.jck() + 3) - 0.3, (double)(n2 + 9 + 2) - 0.3, Class1386.s(Class140.jcj(), 0.8f), Class1386.s(Class140.jcj(), 0.2f));
            }
            Object object = Category.name();
            Class1652.jvq.n(String.valueOf(((String)object).substring(0, 1).toUpperCase()) + ((String)object).substring(1, ((String)object).length()).toLowerCase(), (double)(n + 2), (double)((float)n2 + (float)bl * 1.5f) + 1.5, n3);
            n2 += 11;
            int[] arrn2 = arrn;
            arrn2[0] = arrn2[0] + 1;
        }
        if (this.hvf == 1 || this.hvf == 2) {
            int n4 = n + this.jck() + 6;
            int n5 = 21 + this.hvt * 11;
            Class1388.d((double)n4, (double)n5, (double)(n4 + this.jct() + 3), (double)(n5 + this.jcy().size() * 11), 0.10000000149011612, Integer.MIN_VALUE, new Color(0, 0, 0, 50).getRGB());
            for (Object object : this.jcy()) {
                if (this.jcu().equals(object)) {
                    Class1388.d((double)n4 + 0.3, (double)n5 + 0.3, (double)(n4 + this.jct() + 3) - 0.3, (double)(n5 + 9 + 2) - 0.3, Class1386.s(Class140.jcj(), 0.8f), Class1386.s(Class140.jcj(), 0.2f));
                }
                Class1652.jvq.n(((Module)object).getName(), (double)(n4 + 1), (double)((float)n5 + (float)bl * 1.5f) + 1.5, ((Module)object).nji() ? -1 : 11184810);
                n5 += 11;
            }
        }
    }

    @EventTarget
    public void d(Class2217 class2217) {
        switch (class2217.xj()) {
            case 200: {
                this.jcc();
                break;
            }
            case 208: {
                this.jcs();
                break;
            }
            case 205: {
                this.me(205);
                break;
            }
            case 203: {
                this.jcx();
                break;
            }
            case 28: {
                this.gd(28);
            }
        }
    }

    public void jcc() {
        if (this.hvt > 0 && this.hvf == 0) {
            --this.hvt;
        } else if (this.hvt == 0 && this.hvf == 0) {
            this.hvt = this.hvk.size() - 1;
        } else if (this.hvh > 0 && this.hvf == 1) {
            --this.hvh;
        } else if (this.hvh == 0 && this.hvf == 1) {
            this.hvh = this.jcy().size() - 1;
        } else if (this.hvr > 0 && this.hvf == 2) {
            --this.hvr;
        }
    }

    public void jcs() {
        if (this.hvt < this.hvk.size() - 1 && this.hvf == 0) {
            ++this.hvt;
        } else if (this.hvt == this.hvk.size() - 1 && this.hvf == 0) {
            this.hvt = 0;
        } else if (this.hvh < this.jcy().size() - 1 && this.hvf == 1) {
            ++this.hvh;
        } else if (this.hvh == this.jcy().size() - 1 && this.hvf == 1) {
            this.hvh = 0;
        }
    }

    public void me(int n) {
        if (this.hvf == 0) {
            this.hvf = 1;
        }
    }

    public void gd(int n) {
        if (this.hvf == 1 && this.jcu() != null) {
            this.jcu().toggleNotSet();
        }
    }

    public void jcx() {
        if (this.hvf == 1) {
            this.hvf = 0;
            this.hvh = 0;
        } else if (this.hvf == 2) {
            this.hvf = 1;
            this.hvr = 0;
        }
    }

    public Category jco() {
        return (Category)((Object)this.hvk.get(this.hvt));
    }

    public Module jcu() {
        return (Module)this.jcy().get(this.hvh);
    }

    public ArrayList jcy() {
        ArrayList<Module> arrayList = new ArrayList<Module>();
        Category Category = this.jco();
        for (Module Module : ModuleManager.nzn()) {
            if (!Module.njb().equals((Object)Category)) continue;
            arrayList.add(Module);
        }
        return arrayList;
    }

    public int jck() {
        int n = 0;
        for (Category Category : this.hvk) {
            String string = Category.name();
            String string2 = ">";
            string2 = this.hvf == 1 || this.hvf == 2 ? "<" : ">";
            int n2 = Class1652.jvq.jj(String.valueOf(string.substring(0, 1).toUpperCase()) + string.substring(1, string.length()).toLowerCase()) + 3;
            if (n2 <= n) continue;
            n = n2;
        }
        return n + 2;
    }

    public int jct() {
        int n = 0;
        for (Module Module : ModuleManager.nzn()) {
            int n2 = Class1652.jvq.jj(Module.getName());
            if (n2 <= n) continue;
            n = n2;
        }
        return n;
    }

    @EventTarget
    public void j(Class2204 class2204) {
        Class1815 class1815;
        if (hvn.vut().booleanValue()) {
            class1815 = new Class1815(this.hvj);
            this.y(class1815);
        }
        if (hpb.vut().booleanValue()) {
            class1815 = new Class1815(this.hvj);
            this.u(class1815);
        }
        class1815 = new Class1815(this.hvj);
        this.o(class1815);
    }

    public void o(Class1815 class1815) {
        if (this.hph.xm("NONE")) {
            return;
        }
        Class960 class960 = this.hvj.vrj;
        ArrayList<Class2421> arrayList = new ArrayList<Class2421>();
        for (Class2421 class24212 : Minecraft.thePlayer.ps()) {
            arrayList.add(class24212);
        }
        arrayList.sort(Comparator.comparingDouble(class2421 -> -class960.jj(Class1934.toggle(Class2418.vey[class2421.nli()].getName(), new Object[0]))));
        float f = hpw.vut() == false ? -2.0f : -11.0f;
        for (Class2421 class24213 : arrayList) {
            Class2418 class2418 = Class2418.vey[class24213.nli()];
            String string = Class1934.toggle(class2418.getName(), new Object[0]);
            String string2 = "";
            if (class24213.nlw() == 1) {
                string = String.valueOf(string) + " II";
            } else if (class24213.nlw() == 2) {
                string = String.valueOf(string) + " III";
            } else if (class24213.nlw() == 3) {
                string = String.valueOf(string) + " IV";
            }
            if (class24213.nstoggle() < 600 && class24213.nstoggle() > 300) {
                string2 = String.valueOf(string2) + "\u00a76 " + Class2418.z(class24213);
            } else if (class24213.nstoggle() < 300) {
                string2 = String.valueOf(string2) + "\u00a7c " + Class2418.z(class24213);
            } else if (class24213.nstoggle() > 600) {
                string2 = String.valueOf(string2) + "\u00a77 " + Class2418.z(class24213);
            }
            Color color = new Color(class2418.nll());
            class960.v(string, (float)class1815.jvs() - (float)class960.jj(String.valueOf(string) + string2), (float)(class1815.jvx() - 9) + f, Class1387.pn(color.getRed(), color.getGreen(), color.getBlue()));
            class960.v(string2, (float)class1815.jvs() - (float)class960.jj(string2) - 1.0f, (float)(class1815.jvx() - 9) + f, -1);
            f -= 9.0f;
        }
    }

    private void u(Class1815 class1815) {
        GL11.glPushMatrix();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        boolean bl = Minecraft.thePlayer.ph() && Minecraft.thePlayer.d(Class1991.jma);
        int n = class1815.jvs() / 2 - 6;
        int n2 = class1815.jvx();
        for (int i = 3; i >= 0; --i) {
            Class2059 class2059 = Minecraft.thePlayer.nhl.getNetworkManager[i];
            if (class2059 == null) continue;
            arrayList.add(class2059);
        }
        if (Minecraft.thePlayer.bb() != null) {
            arrayList.add(Minecraft.thePlayer.bb());
        }
        for (Class2059 class2059 : arrayList) {
            if (Minecraft.theWorld != null) {
                Class391.pwn();
                n += 16;
            }
            Class487.pbe();
            Class487.pbtoggle();
            Class487.ok(256);
            this.hvj.ngm().jto = -150.0f;
            this.hvj.ngm().toggle(class2059, n, n2 - (bl ? 65 : (Minecraft.vhx.nvr() ? 55 : 40)));
            this.hvj.ngm().d(this.hvj.vrj, class2059, n, n2 - (bl ? 65 : (Minecraft.vhx.nvr() ? 55 : 40)));
            this.hvj.ngm().jto = 0.0f;
            Class487.pbo();
            Class487.i(0.5, 0.5, 0.5);
            Class487.pbs();
            Class487.pbz();
            Class487.pbx();
            Class487.f(2.0f, 2.0f, 2.0f);
            Class487.pbv();
            Class487.pid();
            class2059.vmj();
        }
        GL11.glPopMatrix();
    }

    private void y(Class1815 class1815) {
        int n = class1815.jvs() / 2;
        int n2 = class1815.jvx() / 2;
        String string = "" + (int)Minecraft.thePlayer.po();
        int n3 = this.hvj.vrj.jj(string);
        float f = Minecraft.thePlayer.po();
        if (f > 20.0f) {
            f = 20.0f;
        }
        int n4 = (int)Math.abs(f * 5.0f * 0.01f * 0.0f + (1.0f - f * 5.0f * 0.01f) * 255.0f);
        int n5 = (int)Math.abs(f * 5.0f * 0.01f * 255.0f + (1.0f - f * 5.0f * 0.01f) * 0.0f);
        Color color = new Color(n4, n5, 0).brighter();
        this.hvj.vrj.v(string, -n3 / 2 + n, n2 - 17, color.getRGB());
    }

    public void d(int n, int n2, double d, int n3) {
        d *= 2.0;
        n *= 2;
        n2 *= 2;
        float f = (float)(n3 >> 24 & 255) / 255.0f;
        float f2 = (float)(n3 >> 16 & 255) / 255.0f;
        float f3 = (float)(n3 >> 8 & 255) / 255.0f;
        float f4 = (float)(n3 & 255) / 255.0f;
        Class726.jrq();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glBegin((int)6);
        for (int i = 0; i <= 360; ++i) {
            double d2 = Math.sin((double)i * 3.141592653589793 / 180.0) * d;
            double d3 = Math.cos((double)i * 3.141592653589793 / 180.0) * d;
            GL11.glVertex2d((double)((double)n + d2), (double)((double)n2 + d3));
        }
        GL11.glEnd();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        Class726.jrc();
    }

    public void d(float f, float f2, double d, int n, int n2, double d2, int n3) {
        d *= 2.0;
        f *= 2.0f;
        f2 *= 2.0f;
        float f3 = (float)(n >> 24 & 255) / 255.0f;
        float f4 = (float)(n >> 16 & 255) / 255.0f;
        float f5 = (float)(n >> 8 & 255) / 255.0f;
        float f6 = (float)(n & 255) / 255.0f;
        Class726.jrq();
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        GL11.glLineWidth((float)n3);
        GL11.glEnable((int)2848);
        GL11.glColor4f((float)f4, (float)f5, (float)f6, (float)f3);
        GL11.glBegin((int)3);
        int n4 = n2;
        while ((double)n4 <= d2) {
            double d3 = Math.sin((double)n4 * 3.141592653589793 / 180.0) * d;
            double d4 = Math.cos((double)n4 * 3.141592653589793 / 180.0) * d;
            GL11.glVertex2d((double)((double)f + d3), (double)((double)f2 + d4));
            ++n4;
        }
        GL11.glEnd();
        GL11.glDisable((int)2848);
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        Class726.jrc();
    }

    public int zo(int n, int n2) {
        int n3;
        if (n < n2 && Minecraft.nga() >= 60) {
            for (n3 = 0; n3 < 3; ++n3) {
                ++n;
            }
        }
        if (n > n2 && Minecraft.nga() >= 60) {
            for (n3 = 0; n3 < 3; ++n3) {
                --n;
            }
        }
        if (n < n2 && Minecraft.nga() >= 40 && Minecraft.nga() <= 59) {
            for (n3 = 0; n3 < 4; ++n3) {
                ++n;
            }
        }
        if (n > n2 && Minecraft.nga() >= 40 && Minecraft.nga() <= 59) {
            for (n3 = 0; n3 < 4; ++n3) {
                --n;
            }
        }
        if (n < n2 && Minecraft.nga() >= 0 && Minecraft.nga() <= 39) {
            for (n3 = 0; n3 < 6; ++n3) {
                ++n;
            }
        }
        if (n > n2 && Minecraft.nga() >= 0 && Minecraft.nga() <= 39) {
            for (n3 = 0; n3 < 6; ++n3) {
                --n;
            }
        }
        return n;
    }

    private int zu(int n, int n2) {
        float f = (System.currentTimeMillis() + (long)n2) % (long)n;
        return Color.getHSBColor(f /= (float)n, 1.0f, 1.0f).getRGB();
    }

    public static Color d(long l, float f, float f2) {
        float f3 = ((float)l + (1.0E-9f + f) * 4.0E8f) / 1.75000003E10f * 3.0f;
        long l2 = Long.parseLong(Integer.toHexString(Color.HSBtoRGB(f3, 0.5f, 1.0f)), 16);
        Color color = new Color((int)l2);
        return new Color((float)color.getRed() / 255.0f * f2, (float)color.getGreen() / 255.0f * f2, (float)color.getBlue() / 255.0f * f2, (float)color.getAlpha() / 255.0f);
    }
}

