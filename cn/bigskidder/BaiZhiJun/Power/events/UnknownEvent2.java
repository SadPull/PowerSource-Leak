/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package858;

import com.darkmagician6.eventapi.events.Event;
import package3.package2.package152.Class614;
import package3.package2.package152.Class891;
import package3.package2.package159.Class1886;

public class Class2258
implements Event {
    private Class1886 th;
    private Class891 tr;
    public Class614 tf;

    public Class2258(Class1886 class1886, Class891 class891, Class614 class614) {
        this.th = class1886;
        this.tr = class891;
        this.tf = class614;
    }

    public Class1886 xk() {
        return this.th;
    }

    public Class891 xt() {
        return this.tr;
    }

    public Class614 xh() {
        return this.tf;
    }

    public void d(Class1886 class1886) {
        this.th = class1886;
    }

    public void z(Class891 class891) {
        this.tr = class891;
    }

    public void p(Class614 class614) {
        this.tf = class614;
    }
}

