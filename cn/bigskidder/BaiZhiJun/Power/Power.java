/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.Display
 */
package cn.bigskidder.BaiZhiJun.Power;

import com.darkmagician6.eventapi.EventManager;
import java.awt.HeadlessException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;
import org.lwjgl.opengl.Display;
import cn.bigskidder.BaiZhiJun.Power.package1087.Class1792;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.Class1002;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class203;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1392;
import cn.bigskidder.BaiZhiJun.Power.utils.Class169;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.package639.ModuleManager;
import package3.package2.package1.Class2556;

public class Power {
    public EventManager oij;
    public static String Client_Name = "Power";
    public static String Client_Name = "Power";
    public static String fuckingnoti;
    public static boolean ois;
    public static String oix;
    public static String oio;
    public static boolean oiu;
    public static Class2525 oiy;
    public static Logger oik;
    public boolean isHwidVerified = false;
    private Class203 oih;
    public Class169 oir;
    public ModuleManager oif;
    public Class169 oim;
    public static Class1652 oig;
    public static int oia;
    public Class1002 oil;
    public static Class1792 oib;

    static {
        ois = false;
        oix = "15";
        oio = "你妈妈被我杀了";
        oik = Logger.getLogger(Client_Name);
    }

    public Class2525() {
        oiy = this;
        oiu = true;
    }

    public void vuh() throws IOException {
        try {
            if (Minecraft.hwid.contains(Class1392.jrw())) {
                this.isHwidVerified = true;
                fuckingnoti = "You_is_666";
                Display.setTitle((String)(String.valueOf(Client_Name) + " B" + oix + " | " + "\u4ed8\u8d39 User!"));
            } else {
                this.isHwidVerified = Class1392.c(Class2556.vmm, "MF[", "]").contains("OJBK");
                fuckingnoti = "You_is_LLL";
                Display.setTitle((String)(String.valueOf(Client_Name) + " B" + oix + " | " + "Power\u514d\u8d39Client\u8bf7\u52a0\u7fa4708703593"));
            }
        }
        catch (HeadlessException headlessException) {
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            // empty catch block
        }
        this.oif = new ModuleManager();
        this.oim = new Class169();
        this.oil = new Class1002();
        oib = new Class1792();
        this.oih = new Class203();
        Class203.ry();
        Class203.npv();
        Class169.ry();
        oiu = false;
        if (ModuleManager.getModule("Freecam").isEnabled()) {
            ModuleManager.getModule("Freecam").set(false);
        }
        if (!ModuleManager.getModule("Commands").isEnabled()) {
            ModuleManager.getModule("Commands").set(true);
        }
    }

    public void vur() {
    }

    public static Class2525 vuf() {
        return oiy;
    }

    public Class1002 vum() {
        return this.oil;
    }

    public Class169 vug() {
        return this.oir;
    }

    public Class203 vua() {
        return this.oih;
    }
}

