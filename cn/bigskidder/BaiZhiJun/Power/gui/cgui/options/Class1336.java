/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package184.package2276;

import java.util.ArrayList;
import cn.bigskidder.BaiZhiJun.Power.Value;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1387;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import cn.bigskidder.BaiZhiJun.Power.utils.package4337.Class2497;
import package3.package2.package1.package0.Class578;

//UIMode.java
public class Class1336 {
    private int ylr;
    public int ylf;
    private Value ylm;
    private Class2497 ylg;

    public Class1336(Value Value, Class2497 class2497, int n, int n2) {
        this.ylm = Value;
        this.ylg = class2497;
        this.ylf = n;
        this.ylr = n2;
    }

    public void nz(int n, int n2, int n3, int n4) {
        this.nq(n, n2, n3, n4);
        Class1655 class1655 = Class1652.jvo;
        String string = String.valueOf(this.ylm.vuq());
        String string2 = String.valueOf(this.ylm.tv(this.ylm.vuj()));
        String string3 = String.valueOf(String.valueOf(this.ylm.vuj() + 1)) + "/" + this.ylm.obg.size();
        Class578.z(n3 + 4, n4 + 3, n3 + this.ylf - 4, n4 + this.ylr - 3, Class1386.s(Class1387.rjv.rjl, 0.55f));
        if (this.nc(n, n2, n3, n4)) {
            Class578.z(n3 + 4, n4 + 3, n3 + this.ylf - 4, n4 + this.ylr - 3, Class1386.s(Class1387.rjv.rjl, 0.75f));
        }
        class1655.d(string, (float)n3 + (float)this.ylr / 2.0f - 6.0f, (float)n4 + (float)(this.ylr - class1655.lf()) / 2.0f - 7.0f, Class1387.rjs.rjl);
        class1655.d(string2, (float)n3 + (float)(this.ylf - class1655.jj(string2)) / 2.0f - 4.5f, (float)n4 + (float)(this.ylr - class1655.lf()) / 2.0f - 0.5f, Class1387.rjs.rjl);
        class1655.d("[" + string3 + "]", (float)(n3 + this.ylf - class1655.jj(string3) - 7) - 5.5f, (float)n4 + (float)(this.ylr - class1655.lf()) / 2.0f - 0.5f, Class1387.rjs.rjl);
    }

    private void nq(int n, int n2, int n3, int n4) {
        if (this.nc(n, n2, n3, n4) && this.ylg.jkw()) {
            if (this.ylm.vuj() < this.ylm.obg.size() - 1) {
                this.ylm.tp(this.ylm.vuj() + 1);
            } else {
                this.ylm.tp(0);
            }
        }
    }

    public boolean nc(int n, int n2, int n3, int n4) {
        return n - 4 >= n3 && n2 - 3 >= n4 && n < n3 + this.ylf - 4 && n2 < n4 + this.ylr - 3;
    }
}

