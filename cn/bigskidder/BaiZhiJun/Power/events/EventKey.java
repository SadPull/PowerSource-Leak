/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package858;

import com.darkmagician6.eventapi.events.Event;
import package3.package2.package152.Class614;
import package3.package2.package152.Class891;
import package3.package2.package159.Class1886;

public class Class2214
implements Event {
    protected boolean hj;
    private Class1886 hz;
    private Class891 hq;
    private Class614 hc;

    public void d(Class1886 class1886, Class891 class891, Class614 class614) {
        this.hz = class1886;
        this.hq = class891;
        this.hc = class614;
    }

    public Class614 xa() {
        return this.hc;
    }

    public void v(Class614 class614) {
        this.hc = class614;
    }

    public Class891 xt() {
        return this.hq;
    }

    public Class1886 xk() {
        return this.hz;
    }

    public boolean xq() {
        return this.hj;
    }

    public void h(boolean bl) {
        this.hj = bl;
    }
}

