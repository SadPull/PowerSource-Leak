/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package184;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import cn.bigskidder.BaiZhiJun.Power.Value;
import cn.bigskidder.BaiZhiJun.Power.package185.Class444;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.Class443;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.package4340.Class280;
import cn.bigskidder.BaiZhiJun.Power.utils.package4337.Class2487;
import cn.bigskidder.BaiZhiJun.Power.package639.package638.Class1484;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package0.Class584;
import package3.package2.package1.package0.Class970;
import package3.package2.package1.package103.Class1224;
import package3.package2.package1.package2860.Class1029;
import package3.package2.package1.package82.Class486;
import package3.package2.package152.Class421;

//UIClick.java
public class Class1002
extends Class970 {
    private Class2487 rdh = new Class2487();
    private Class280 rdr;
    private Class1815 rdf;
    public boolean rdm;
    private ArrayList<Class444> rdg;
    Random rda = new Random();

    @Override
    public void n() {
        this.rdg = new ArrayList();
        Class1815 class1815 = new Class1815(this.tqq);
        for (int i = 0; i < 150; ++i) {
            this.rdg.add(new Class444(this.rda.nextInt(class1815.jvs()) + 10, this.rda.nextInt(class1815.jvx())));
        }
        this.rdf = new Class1815(this.tqq);
        this.rdh = new Class2487();
        if (!this.rdm) {
            this.rdr = new Class280(10.0f, this.rdf.jvx() - 10, 6.0f, 14.0f);
            this.rdm = true;
        }
        if (Class2556.vhg != null && !this.tqq.vrf.uut) {
            this.tqq.vrs.nd(new Class421("shaders/post/blur.json"));
        }
        super.n();
    }

    public void jhn() {
        if (!this.rdm) {
            Class443 class443 = new Class443(this);
            new Thread(class443).start();
        }
    }

    @Override
    public void d(int n, int n2, float f) {
        this.rdr.ng(n, n2);
        if (Class1484.udv.vut().booleanValue()) {
            for (Class444 class444 : this.rdg) {
                class444.pd(n, n2, this.rdf.jvx());
            }
        }
    }

    @Override
    protected void d(int n, int n2, int n3) throws IOException {
        this.rdr.d(n, n2, n3);
    }

    @Override
    protected void n(int n, int n2, int n3) {
        this.rdr.jl(n, n2);
    }

    private boolean y(int n, int n2, int n3, int n4, int n5, int n6) {
        return n >= n3 && n <= n5 && n2 >= n4 && n2 <= n6;
    }

    @Override
    protected void d(Class584 class584) throws IOException {
        super.d(class584);
    }

    @Override
    public void j() {
        this.tqq.vrs.piu();
        super.j();
    }

    static void d(Class1002 class1002, Class280 class280) {
        class1002.rdr = class280;
    }
}

