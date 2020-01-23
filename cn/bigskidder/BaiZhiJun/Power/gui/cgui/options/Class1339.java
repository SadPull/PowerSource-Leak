/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package184.package2276;

import cn.bigskidder.BaiZhiJun.Power.Value;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1384;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1387;
import cn.bigskidder.BaiZhiJun.Power.utils.Class161;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import cn.bigskidder.BaiZhiJun.Power.utils.package4337.Class2497;
import cn.bigskidder.BaiZhiJun.Power.package639.package638.package3206.Class140;
import package3.package2.package1.package0.Class578;

//UIToggleButton.java
public class Class1339 {
    private Value ylo;
    private Class2497 ylu;
    public int yly;
    private int ylk;
    private int ylt;
    private float ylh = 2.14748365E9f;

    public Class1339(Value Value, Class2497 class2497, int n, int n2) {
        this.ylo = Value;
        this.ylu = class2497;
        this.yly = n;
        this.ylk = n2;
    }

    public void nz(int n, int n2, int n3, int n4) {
        Class1655 class1655 = Class1652.jvo;
        int n5 = 4;
        String string = this.ylo.vus().split("_")[1];
        boolean bl = (Boolean)this.ylo.vut();
        int n6 = bl ? Class140.jcj() : Class1387.rju.rjl;
        this.n(n3, n2, n5, bl);
        this.v(n, n2, n3, n4, n5);
        this.d(n3, n4, n5, n6, bl);
        class1655.d(string, (float)(n3 + 14) + 0.5f, (float)n4 + (float)(this.ylk - class1655.lf()) / 2.0f + 0.5f, Class1387.rjv.rjl);
        class1655.d(string, n3 + 14, (float)n4 + (float)(this.ylk - class1655.lf()) / 2.0f, bl ? -1 : Class161.rso.rsk);
        this.ylt = n3;
    }

    private void d(int n, int n2, int n3, int n4, boolean bl) {
        float f = n + this.ylk - n3 * 2 - 3;
        float f2 = (float)n2 + (float)(this.ylk - n3) / 2.0f + 2.0f;
        Class578.d(f + (float)n3 - 3.0f, f2 - (float)n3 + 1.0f, f - (float)n3 - 1.0f, f2 + (float)n3 - 1.0f, n4);
    }

    private void n(int n, int n2, int n3, boolean bl) {
        float f = n + this.yly - n3 * 2 - 3;
        float f2 = (float)n2 + (float)(this.ylk - n3) / 2.0f - 3.0f;
        float f3 = !bl ? f - (float)n3 + 0.25f : f + (float)n3 - 0.25f;
        float f4 = f3;
        if (this.ylt != n) {
            this.ylh = f3;
        }
        this.ylh = this.ylh == 2.14748365E9f ? f3 : (float)Class1384.nl(this.ylh, f3, 50.0);
    }

    private void v(int n, int n2, int n3, int n4, int n5) {
        if (this.j(n, n2, n3, n4, n5) && this.ylu.jkw()) {
            this.ylo.k((Boolean)this.ylo.vut() == false);
        }
    }

    public boolean j(int n, int n2, int n3, int n4, int n5) {
        float f = (float)n3 + (float)(this.yly - n5) / 2.0f;
        float f2 = (float)n4 + (float)(this.ylk - n5) / 2.0f;
        return n >= n3 + 3 && n2 - 6 >= n4 && n <= n3 + this.ylk - 10 && n2 + 5 < n4 + this.ylk;
    }
}

