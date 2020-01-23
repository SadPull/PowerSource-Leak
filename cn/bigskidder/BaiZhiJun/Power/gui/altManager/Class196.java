/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package588;

import java.io.IOException;
import java.util.List;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class193;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class200;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class204;
import cn.bigskidder.BaiZhiJun.Power.utils.Class128;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class584;
import package3.package2.package1.package0.Class946;
import package3.package2.package1.package0.Class960;
import package3.package2.package1.package0.Class970;

public class Class196
extends Class970 {
    private final Class193 nwl;
    private Class946 nwb;
    private String nwi = "\u00a7eWaiting...";
    private Class204 nww;

    public Class196(Class193 class193) {
        this.nwl = class193;
    }

    @Override
    public void d(Class584 class584) {
        switch (class584.tdn) {
            case 1: {
                this.tqq.d(this.nwl);
                break;
            }
            case 0: {
                this.nwl.ney.ne(this.nwb.nne());
                if (!this.nww.nne().isEmpty()) {
                    this.nwl.ney.pd(this.nww.nne());
                }
                this.nwi = "\u00a7aEdited!";
            }
        }
    }

    @Override
    public void d(int n, int n2, float f) {
        this.jds();
        Class128.rqy.vrj.j("Edit Alt", this.tqs / 2, 10.0f, -1);
        Class128.rqy.vrj.j(this.nwi, this.tqs / 2, 20.0f, -1);
        this.nwb.nnh();
        this.nww.nnh();
        if (this.nwb.nne().isEmpty()) {
            Class128.rqy.vrj.v("New E-Mail", this.tqs / 2 - 96, 66.0f, -7829368);
        }
        if (this.nww.nne().isEmpty()) {
            Class128.rqy.vrj.v("New Password", this.tqs / 2 - 96, 106.0f, -7829368);
        }
        super.d(n, n2, f);
    }

    @Override
    public void n() {
        this.tqo.add(new Class584(0, this.tqs / 2 - 100, this.tqx / 4 + 92 + 12, "Edit"));
        this.tqo.add(new Class584(1, this.tqs / 2 - 100, this.tqx / 4 + 116 + 12, "Cancel"));
        this.nwb = new Class946(this.tqh, this.tqq.vrj, this.tqs / 2 - 100, 60, 200, 20);
        this.nww = new Class204(this.tqq.vrj, this.tqs / 2 - 100, 100, 200, 20);
    }

    @Override
    protected void d(char c, int n) {
        this.nwb.n(c, n);
        this.nww.n(c, n);
        if (c == '\t' && (this.nwb.npd() || this.nww.npd())) {
            this.nwb.nl(!this.nwb.npd());
            this.nww.nl(!this.nww.npd());
        }
        if (c == '\r') {
            this.d((Class584)this.tqo.get(0));
        }
    }

    @Override
    protected void d(int n, int n2, int n3) {
        try {
            super.d(n, n2, n3);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.nwb.d(n, n2, n3);
        this.nww.d(n, n2, n3);
    }
}

