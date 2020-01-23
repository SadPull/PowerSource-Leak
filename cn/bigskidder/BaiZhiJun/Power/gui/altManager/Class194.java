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
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class193;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class204;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class856;
import cn.bigskidder.BaiZhiJun.Power.utils.Class128;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class584;
import package3.package2.package1.package0.Class946;
import package3.package2.package1.package0.Class960;
import package3.package2.package1.package0.Class970;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class194
extends Class970 {
    private final Class193 nea;
    private Class204 nel;
    private String neb = "\u00a7eWaiting...";
    private Class946 nei;
    private Class946 new;

    public Class194(Class193 class193) {
        this.nea = class193;
    }

    @Override
    protected void d(Class584 class584) {
        switch (class584.tdn) {
            case 0: {
                Class856 class856;
                if (this.new.nne().isEmpty()) {
                    class856 = new Class856(this, this.nei.nne(), this.nel.nne());
                } else if (!this.new.nne().isEmpty() && this.new.nne().contains(":")) {
                    String string = this.new.nne().split(":")[0];
                    String string2 = this.new.nne().split(":")[1];
                    class856 = new Class856(this, string.replaceAll(" ", ""), string2.replaceAll(" ", ""));
                } else {
                    class856 = new Class856(this, this.nei.nne(), this.nel.nne());
                }
                class856.start();
                break;
            }
            case 1: {
                this.tqq.d(this.nea);
            }
        }
    }

    @Override
    public void d(int n, int n2, float f) {
        this.jds();
        Class128.rqy.vrj.j("Add Alt", this.tqs / 2, 20.0f, -1);
        this.nei.nnh();
        this.nel.nnh();
        this.new.nnh();
        if (this.nei.nne().isEmpty()) {
            Class128.rqy.vrj.v("Username / E-Mail", this.tqs / 2 - 96, 66.0f, -7829368);
        }
        if (this.nel.nne().isEmpty()) {
            Class128.rqy.vrj.v("Password", this.tqs / 2 - 96, 106.0f, -7829368);
        }
        if (this.new.nne().isEmpty()) {
            Class128.rqy.vrj.v("Email:Password", this.tqs / 2 - 96, 146.0f, -7829368);
        }
        Class128.rqy.vrj.j(this.neb, this.tqs / 2, 30.0f, -1);
        super.d(n, n2, f);
    }

    @Override
    public void n() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.tqo.clear();
        this.tqo.add(new Class584(0, this.tqs / 2 - 100, this.tqx / 4 + 92 + 12, "Login"));
        this.tqo.add(new Class584(1, this.tqs / 2 - 100, this.tqx / 4 + 116 + 12, "Back"));
        this.nei = new Class946(1, this.tqq.vrj, this.tqs / 2 - 100, 60, 200, 20);
        this.nel = new Class204(this.tqq.vrj, this.tqs / 2 - 100, 100, 200, 20);
        this.new = new Class946(this.tqh, this.tqq.vrj, this.tqs / 2 - 100, 140, 200, 20);
        this.new.fm(200);
    }

    @Override
    protected void d(char c, int n) {
        this.nei.n(c, n);
        this.nel.n(c, n);
        this.new.n(c, n);
        if (c == '\t' && (this.nei.npd() || this.new.npd() || this.nel.npd())) {
            this.nei.nl(!this.nei.npd());
            this.nel.nl(!this.nel.npd());
            this.new.nl(!this.new.npd());
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
        this.nei.d(n, n2, n3);
        this.nel.d(n, n2, n3);
        this.new.d(n, n2, n3);
    }

    static void d(Class194 class194, String string) {
        class194.neb = string;
    }
}

