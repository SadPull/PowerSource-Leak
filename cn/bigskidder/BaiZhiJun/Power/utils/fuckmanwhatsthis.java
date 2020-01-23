/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector3f
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.util.vector.Vector3f;
import package3.package2.package1.Class2556;
import package3.package2.package1.package103.Class1224;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class614;
import package3.package2.package39.EntityLivingBase;
import package3.package2.package39.Class1839;

public class Class1389 {
    protected Class2556 rpg = Class2556.nmk();
    private float rpa;
    private float rpl;
    private float rpb;
    private float rpi;
    private float rpw;
    private float rpe;
    private static final float rvd = 0.1f;
    private ArrayList<Vector3f> rvn = new ArrayList();
    private Class1839 rvp;

    public Class1389(Class1839 class1839) {
        this.rpa = (float)Class2556.vhw.of;
        this.rpl = (float)Class2556.vhw.om + 1.0f;
        this.rpb = (float)Class2556.vhw.og;
        this.rpi = (float)class1839.of;
        this.rpw = (float)class1839.om + class1839.uu / 2.0f;
        this.rpe = (float)class1839.og;
        this.rvp = class1839;
        this.rvn.clear();
        this.jhf();
    }

    private void jhf() {
        float f = this.rpi - this.rpa;
        float f2 = this.rpw - this.rpl;
        float f3 = this.rpe - this.rpb;
        float f4 = 0.0f;
        float f5 = 1.0f;
        float f6 = 0.0f;
        int n = (int)Math.max(Math.abs(f) / 0.1f, Math.max(Math.abs(f2) / 0.1f, Math.abs(f3) / 0.1f));
        for (int i = 0; i <= n; ++i) {
            this.rvn.add(new Vector3f(f4, f5, f6));
            f4 += f / (float)n;
            f5 += f2 / (float)n;
            f6 += f3 / (float)n;
        }
    }

    private boolean d(Vector3f vector3f, Class1839 class1839) {
        Class614 class614 = class1839.sy();
        double d = Class2556.vhw.of + (double)vector3f.x;
        double d2 = Class2556.vhw.om + (double)vector3f.y;
        double d3 = Class2556.vhw.og + (double)vector3f.z;
        boolean bl = d >= class614.xas - 0.25 && d <= class614.xau + 0.25;
        boolean bl2 = d2 >= class614.xax && d2 <= class614.xay;
        boolean bl3 = d3 >= class614.xao - 0.25 && d3 <= class614.xak + 0.25;
        boolean bl4 = bl3;
        return bl && bl3 && bl2;
    }

    public ArrayList<Vector3f> jhm() {
        return this.rvn;
    }

    public Class1839 jhg() {
        ArrayList arrayList = new ArrayList();
        double d = Class2556.vhw.u(this.rvp);
        Class1839 class1839 = this.rvp;
        for (Object e : Class2556.vhg.nkp) {
            Class1839 class18392;
            if (!(e instanceof Class1839) || (double)Class2556.vhw.u(class18392 = (Class1839)e) >= d || Class2556.vhw == class18392) continue;
            for (Vector3f vector3f : this.jhm()) {
                if (!this.d(vector3f, class18392) || Class2556.vhw.u(class18392) >= Class2556.vhw.u(class1839)) continue;
                class1839 = class18392;
            }
        }
        return class1839;
    }
}

