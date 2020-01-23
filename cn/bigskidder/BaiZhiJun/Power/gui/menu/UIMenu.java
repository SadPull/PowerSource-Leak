/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package4102;

import java.awt.Color;
import java.util.ArrayList;
import cn.bigskidder.BaiZhiJun.Power.Class2525;
import cn.bigskidder.BaiZhiJun.Power.package185.package4102.Class1123;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1384;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.utils.Class161;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import cn.bigskidder.BaiZhiJun.Power.utils.package4337.Class2497;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package0.Class578;
import package3.package2.package152.Class421;

public class Class1130 {
    private Class2497 vgf = new Class2497(0);
    public float vgm;
    private int vgg;
    private int vga;
    private ArrayList vgl;

    public Class1130(ArrayList arrayList) {
        this.vgl = arrayList;
        this.vgm = 0.0f;
        this.vgg = 200;
    }

    public void ng(int n, int n2) {
        this.vgg = 150;
        Class1815 class1815 = new Class1815(Class2556.nmk());
        Class1655 class1655 = Class1652.jvc;
        this.vga = class1815.jvx();
        Class578.d((int)this.vgm, 0, (int)this.vgm + this.vgg + 1, this.vga, Integer.MAX_VALUE, 0.8f);
        Class578.d(this.vgm, 0.0f, this.vgm + (float)this.vgg, (float)this.vga, Class1386.s(Class161.rcg.rsk, 0.8f));
        if (this.vgm == (float)(-this.vgg)) {
            Class1384.d(new Class421("Power/slidermenu_icon.png"), (int)this.vgm + this.vgg + 5, class1815.jvx() / 2 - 3, 6, 6);
        }
        float f = this.na(n, n2) ? 0 : -this.vgg;
        this.vgm = (float)Class1384.nl(this.vgm, f, this.na(n, n2) ? (100.0f - this.vgm + 1.0f) * 10.0f : (Math.abs(this.vgm) + 1.0f) * 30.0f);
        Class578.d((int)this.vgm + this.vgg / 2 + 1, 36, 15, new Color(0, 255, 255));
        class1655.d(Class2525.oiz.substring(0, 1), this.vgm + (float)((this.vgg - class1655.jj(Class2525.oiz.substring(0, 1))) / 2) + 1.0f, 16.0f, -800000);
        int n3 = 20;
        int n4 = class1815.jvx() / 2 - this.vgl.size() / 2 * n3 - 5;
        class1655 = Class1652.jvs;
        for (Class1123 class1123 : this.vgl) {
            boolean bl = this.na(n, n2) && n2 >= n4 && n2 < n4 + n3;
            class1123.vgr = Class1384.nl(class1123.vgr, bl ? 1.0f : 0.0f, 25.0 * class1123.vgr + 1.0);
            if (bl) {
                class1655.d(class1123.vgt, this.vgm + (float)((this.vgg - class1655.jj(class1123.vgt)) / 2), n4, Class1386.s(Class161.rso.rsk, 1.0f));
            } else {
                class1655.d(class1123.vgt, this.vgm + (float)((this.vgg - class1655.jj(class1123.vgt)) / 2), n4, -1);
            }
            Class578.d(this.vgm + (float)((this.vgg - class1655.jj(class1123.vgt)) / 2), (float)(n4 + class1655.lf()) + 1.5f, this.vgm + (float)((this.vgg - class1655.jj(class1123.vgt)) / 2) + (float)((int)((double)class1655.jj(class1123.vgt) * class1123.vgr)), (float)(n4 + class1655.lf() + 2), -7748364);
            if (bl && this.vgf.jkw()) {
                class1123.nre();
            }
            n4 += 21;
        }
    }

    public boolean na(int n, int n2) {
        return (float)n <= this.vgm + (float)this.vgg + 12.0f;
    }
}

