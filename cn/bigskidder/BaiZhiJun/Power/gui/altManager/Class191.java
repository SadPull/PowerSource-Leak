/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package588;

import java.io.IOException;
import java.util.List;
import org.lwjgl.input.Keyboard;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class190;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class204;
import cn.bigskidder.BaiZhiJun.Power.utils.Class128;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class584;
import package3.package2.package1.package0.Class946;
import package3.package2.package1.package0.Class960;
import package3.package2.package1.package0.Class970;

public class Class191
extends Class970 {
    private Class204 nen;
    private final Class970 nep;
    private Class190 nev;
    private Class946 nej;
    private Class946 nez;

    public Class191(Class970 class970) {
        this.nep = class970;
    }

    @Override
    protected void d(Class584 class584) {
        switch (class584.tdn) {
            case 1: {
                this.tqq.d(this.nep);
                break;
            }
            case 0: {
                if (this.nez.nne().isEmpty()) {
                    this.nev = new Class190(this.nej.nne(), this.nen.nne());
                } else if (!this.nez.nne().isEmpty() && this.nez.nne().contains(":")) {
                    String string = this.nez.nne().split(":")[0];
                    String string2 = this.nez.nne().split(":")[1];
                    this.nev = new Class190(string.replaceAll(" ", ""), string2.replaceAll(" ", ""));
                } else {
                    this.nev = new Class190(this.nej.nne(), this.nen.nne());
                }
                this.nev.start();
            }
        }
    }

    @Override
    public void d(int n, int n2, float f) {
        this.jds();
        this.nej.nnh();
        this.nen.nnh();
        this.nez.nnh();
        Class128.rqy.vrj.j("Alt Login", this.tqs / 2, 20.0f, -1);
        Class128.rqy.vrj.j(this.nev == null ? "\u00a7eWaiting..." : this.nev.nps(), this.tqs / 2, 29.0f, -1);
        if (this.nej.nne().isEmpty()) {
            Class128.rqy.vrj.v("Username / E-Mail", this.tqs / 2 - 96, 66.0f, -7829368);
        }
        if (this.nen.nne().isEmpty()) {
            Class128.rqy.vrj.v("Password", this.tqs / 2 - 96, 106.0f, -7829368);
        }
        if (this.nez.nne().isEmpty()) {
            Class128.rqy.vrj.v("Email:Password", this.tqs / 2 - 96, 146.0f, -7829368);
        }
        super.d(n, n2, f);
    }

    @Override
    public void n() {
        int n = this.tqx / 4 + 24;
        this.tqo.add(new Class584(0, this.tqs / 2 - 100, n + 72 + 12, "Login"));
        this.tqo.add(new Class584(1, this.tqs / 2 - 100, n + 72 + 12 + 24, "Back"));
        this.nej = new Class946(1, this.tqq.vrj, this.tqs / 2 - 100, 60, 200, 20);
        this.nen = new Class204(this.tqq.vrj, this.tqs / 2 - 100, 100, 200, 20);
        this.nez = new Class946(n, this.tqq.vrj, this.tqs / 2 - 100, 140, 200, 20);
        this.nej.nl(true);
        this.nej.fm(200);
        this.nen.vq(200);
        this.nez.fm(200);
        Keyboard.enableRepeatEvents((boolean)true);
    }

    @Override
    protected void d(char c, int n) {
        try {
            super.d(c, n);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        if (c == '\t' && (this.nej.npd() || this.nez.npd() || this.nen.npd())) {
            this.nej.nl(!this.nej.npd());
            this.nen.nl(!this.nen.npd());
            this.nez.nl(!this.nez.npd());
        }
        if (c == '\r') {
            this.d((Class584)this.tqo.get(0));
        }
        this.nej.n(c, n);
        this.nen.n(c, n);
        this.nez.n(c, n);
    }

    @Override
    protected void d(int n, int n2, int n3) {
        try {
            super.d(n, n2, n3);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        this.nej.d(n, n2, n3);
        this.nen.d(n, n2, n3);
        this.nez.d(n, n2, n3);
    }

    @Override
    public void j() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    public void p() {
        this.nej.npn();
        this.nen.npn();
        this.nez.npn();
    }
}

