/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules;

import java.util.ArrayList;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Class1484;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc.Class223;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc.Class224;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc.Class229;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc.Class241;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc.Class242;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc.Class245;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Misc.Class247;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class536;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class543;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class547;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class550;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class553;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class558;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class561;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class564;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class567;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class568;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class571;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class574;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.World.Class577;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1031;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1032;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1033;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1034;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1035;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1036;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1037;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1038;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1039;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1040;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1041;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1043;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1044;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1045;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1046;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1048;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1049;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class922;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class122;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class124;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class125;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class126;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class127;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class130;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class131;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class132;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class135;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class140;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class145;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class146;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class147;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class148;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class149;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class151;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class154;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.net206.Class162;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2172;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2173;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2174;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2175;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2179;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2180;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2181;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2182;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2183;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat.Class2184;

public class ModuleManager {
    public static ArrayList<Module> pxk = new ArrayList();
    public static ArrayList<Module> pxt = new ArrayList();

    public ModuleManager() {
        this.d(new Class2180());
        this.d(new Class2181());
        this.d(new Class2183());
        this.d(new Class2173());
        this.d(new Class2179());
        this.d(new Class2172());
        this.d(new Class2184());
        this.d(new Class2174());
        this.d(new Class2175());
        this.d(new Class2182());
        this.d(new Class561());
        this.d(new Class568());
        this.d(new Class577());
        this.d(new Class543());
        this.d(new Class574());
        this.d(new Class536());
        this.d(new Class550());
        this.d(new Class553());
        this.d(new Class547());
        this.d(new Class567());
        this.d(new Class564());
        this.d(new Class558());
        this.d(new Class571());
        this.d(new Class1484());
        this.d(new Class154());
        this.d(new Class140());
        this.d(new Class135());
        this.d(new Class146());
        this.d(new Class125());
        this.d(new Class147());
        this.d(new Class149());
        this.d(new Class127());
        this.d(new Class1045());
        this.d(new Class130());
        this.d(new Class126());
        this.d(new Class151());
        this.d(new Class132());
        this.d(new Class1038());
        this.d(new Class162());
        this.d(new Class122());
        this.d(new Class145());
        this.d(new Class148());
        this.d(new Class131());
        this.d(new Class124());
        this.d(new Class224());
        this.d(new Class245());
        this.d(new Class229());
        this.d(new Class247());
        this.d(new Class242());
        this.d(new Class223());
        this.d(new Class241());
        this.d(new Class1043());
        this.d(new Class1039());
        this.d(new Class1044());
        this.d(new Class1036());
        this.d(new Class1035());
        this.d(new Class1031());
        this.d(new Class1033());
        this.d(new Class1034());
        this.d(new Class1048());
        this.d(new Class1040());
        this.d(new Class1037());
        this.d(new Class922());
        this.d(new Class1041());
        this.d(new Class1049());
        this.d(new Class1046());
        this.d(new Class1032());
    }

    public void d(Module Module) {
        pxk.add(Module);
    }

    public ArrayList<Module> nsetKey() {
        ArrayList<Module> arrayList = new ArrayList<Module>();
        for (Module Module : pxk) {
            if (!Module.nji()) continue;
            arrayList.add(Module);
        }
        return arrayList;
    }

    public static Module px(String string) {
        for (Module Module : pxk) {
            if (!Module.getName().equalsIgnoreCase(string)) continue;
            return Module;
        }
        return null;
    }

    public static ArrayList<Module> nzn() {
        return pxk;
    }

    public static Module z(Class<? extends Module> class_) {
        for (Module Module : pxk) {
            if (Module.getClass() != class_) continue;
            return Module;
        }
        return null;
    }
}

