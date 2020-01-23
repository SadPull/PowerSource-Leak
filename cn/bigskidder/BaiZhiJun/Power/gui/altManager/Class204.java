/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package588;

import org.lwjgl.opengl.GL11;
import package3.package2.package1.package0.Class578;
import package3.package2.package1.package0.Class960;
import package3.package2.package1.package0.Class970;
import package3.package2.package1.package82.Class387;
import package3.package2.package1.package82.Class474;
import package3.package2.package152.Class403;

public final class Class204
extends Class578 {
    private final int nwv;
    private final int nwj;
    private final Class960 nwz;
    private boolean nwq = true;
    private boolean nwc;
    private int nws;
    private boolean nwx = true;
    private String nwo = "";
    private int nwu = 32;
    private final int nwy;
    private final int nwk;
    private boolean nwt = true;
    private int nwh = 7368816;
    private int nwr = 14737632;
    private int nwf;
    private int nwm;
    private int nwg;
    private boolean nwa = true;

    public Class204(Class960 class960, int n, int n2, int n3, int n4) {
        this.nwz = class960;
        this.nwv = n;
        this.nwj = n2;
        this.nwy = n3;
        this.nwk = n4;
    }

    public void nnh() {
        if (this.nnr()) {
            if (this.nnf()) {
                Class578.z(this.nwv - 1, this.nwj - 1, this.nwv + this.nwy + 1, this.nwj + this.nwk + 1, -6250336);
                Class578.z(this.nwv, this.nwj, this.nwv + this.nwy, this.nwj + this.nwk, -16777216);
            }
            int n = this.nwa ? this.nwr : this.nwh;
            int n2 = this.nwm - this.nwg;
            int n3 = this.nwf - this.nwg;
            String string = this.nwz.r(this.nwo.substring(this.nwg), this.nnl());
            boolean bl = n2 >= 0 && n2 <= string.length();
            boolean bl2 = this.nwc && this.nws / 6 % 2 == 0 && bl;
            int n4 = this.nwx ? this.nwv + 4 : this.nwv;
            int n5 = this.nwx ? this.nwj + (this.nwk - 8) / 2 : this.nwj;
            int n6 = n4;
            if (n3 > string.length()) {
                n3 = string.length();
            }
            if (string.length() > 0) {
                String string2 = bl ? string.substring(0, n2) : string;
                n6 = this.nwz.z(string2.replaceAll(".", "*"), n4, n5, n);
            }
            boolean bl3 = this.nwm < this.nwo.length() || this.nwo.length() >= this.nnw();
            int n7 = n6;
            if (!bl) {
                n7 = n2 > 0 ? n4 + this.nwy : n4;
            } else if (bl3) {
                n7 = n6 - 1;
                --n6;
            }
            if (string.length() > 0 && bl && n2 < string.length()) {
                this.nwz.z(string.substring(n2).replaceAll(".", "*"), n6, n5, n);
            }
            if (bl2) {
                if (bl3) {
                    Class578.z(n7, n5 - 1, n7 + 1, n5 + 1 + this.nwz.tjk, -3092272);
                } else {
                    this.nwz.z("_", n7, n5, n);
                }
            }
            if (n3 != n2) {
                int n8 = n4 + this.nwz.jj(string.substring(0, n3).replaceAll(".", "*"));
                this.v(n7, n5 - 1, n8 - 1, n5 + 1 + this.nwz.tjk);
            }
        }
    }

    public void pe(int n) {
        if (this.nwo.length() != 0) {
            if (this.nwf != this.nwm) {
                this.ni("");
            } else {
                boolean bl = n < 0;
                int n2 = bl ? this.nwm + n : this.nwm;
                int n3 = bl ? this.nwm : this.nwm + n;
                String string = "";
                if (n2 >= 0) {
                    string = this.nwo.substring(0, n2);
                }
                if (n3 < this.nwo.length()) {
                    string = String.valueOf(String.valueOf(string)) + this.nwo.substring(n3);
                }
                this.nwo = string;
                if (bl) {
                    this.vn(n);
                }
            }
        }
    }

    public boolean nnr() {
        return this.nwt;
    }

    public void vd(int n) {
        if (this.nwo.length() != 0) {
            if (this.nwf != this.nwm) {
                this.ni("");
            } else {
                this.pe(this.vp(n) - this.nwm);
            }
        }
    }

    public boolean nnf() {
        return this.nwx;
    }

    public void vn(int n) {
        this.vv(this.nwf + n);
    }

    public int i(int n, int n2) {
        return this.n(n, this.nna(), true);
    }

    public void nf(boolean bl) {
        this.nwa = bl;
    }

    public void nm(boolean bl) {
        this.nwx = bl;
    }

    public int nnm() {
        return this.nwf;
    }

    public int vp(int n) {
        return this.i(n, this.nna());
    }

    private void v(int n, int n2, int n3, int n4) {
        int n5;
        if (n < n3) {
            n5 = n;
            n = n3;
            n3 = n5;
        }
        if (n2 < n4) {
            n5 = n2;
            n2 = n4;
            n4 = n5;
        }
        if (n3 > this.nwv + this.nwy) {
            n3 = this.nwv + this.nwy;
        }
        if (n > this.nwv + this.nwy) {
            n = this.nwv + this.nwy;
        }
        Class387 class387 = Class474.ssx.pwi();
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)255.0f, (float)255.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3058);
        GL11.glLogicOp((int)5387);
        GL11.glDisable((int)3058);
        GL11.glEnable((int)3553);
    }

    public void ng(boolean bl) {
        this.nwt = bl;
    }

    public void vv(int n) {
        this.nwm = n;
        int n2 = this.nwo.length();
        if (this.nwm < 0) {
            this.nwm = 0;
        }
        if (this.nwm > n2) {
            this.nwm = n2;
        }
        this.vz(this.nwm);
    }

    public void ni(String string) {
        int n;
        String string2 = "";
        String string3 = Class403.xd(string);
        int n2 = this.nwm < this.nwf ? this.nwm : this.nwf;
        int n3 = this.nwm < this.nwf ? this.nwf : this.nwm;
        int n4 = this.nwu - this.nwo.length() - (n2 - this.nwf);
        if (this.nwo.length() > 0) {
            string2 = String.valueOf(String.valueOf(string2)) + this.nwo.substring(0, n2);
        }
        if (n4 < string3.length()) {
            string2 = String.valueOf(String.valueOf(string2)) + string3.substring(0, n4);
            n = n4;
        } else {
            string2 = String.valueOf(String.valueOf(string2)) + string3;
            n = string3.length();
        }
        if (this.nwo.length() > 0 && n3 < this.nwo.length()) {
            string2 = String.valueOf(String.valueOf(string2)) + this.nwo.substring(n3);
        }
        this.nwo = string2;
        this.vn(n2 - this.nwf + n);
    }

    public void vj(int n) {
        this.nwr = n;
    }

    public void nng() {
        this.vv(0);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int n(int var1_1, int var2_2, boolean var3_3) {
        var4_4 = var2_2;
        var5_5 = var1_1 < 0;
        var6_6 = Math.abs(var1_1);
        block0 : for (var7_7 = 0; var7_7 < var6_6; ++var7_7) {
            block4 : {
                if (!var5_5) break block4;
                while (!var3_3 || --var4_4 <= 0 || this.nwo.charAt(var4_4 - 1) == ' ') {
                }
                ** GOTO lbl-1000
            }
            var8_8 = this.nwo.length();
            if ((var4_4 = this.nwo.indexOf(32, var4_4)) != -1) ** GOTO lbl19
            var4_4 = var8_8;
            continue;
            while (this.nwo.charAt(var4_4 - 1) != ' ') lbl-1000: // 2 sources:
            {
                if (--var4_4 > 0) continue;
                continue block0;
            }
            continue;
lbl-1000: // 1 sources:
            {
                ++var4_4;
lbl19: // 2 sources:
                ** while (var3_3 && var4_4 < var8_8 && this.nwo.charAt((int)var4_4) == ' ')
            }
lbl20: // 1 sources:
        }
        return var4_4;
    }

    public int nna() {
        return this.nwm;
    }

    public void vz(int n) {
        int n2 = this.nwo.length();
        if (n > n2) {
            n = n2;
        }
        if (n < 0) {
            n = 0;
        }
        this.nwf = n;
        if (this.nwz != null) {
            if (this.nwg > n2) {
                this.nwg = n2;
            }
            int n3 = this.nnl();
            String string = this.nwz.r(this.nwo.substring(this.nwg), n3);
            int n4 = string.length() + this.nwg;
            if (n == this.nwg) {
                this.nwg -= this.nwz.d(this.nwo, n3, true).length();
            }
            if (n > n4) {
                this.nwg += n - n4;
            } else if (n <= this.nwg) {
                this.nwg -= this.nwg - n;
            }
            if (this.nwg < 0) {
                this.nwg = 0;
            }
            if (this.nwg > n2) {
                this.nwg = n2;
            }
        }
    }

    public int nnl() {
        return this.nnf() ? this.nwy - 8 : this.nwy;
    }

    public void nnb() {
        this.vv(this.nwo.length());
    }

    public void vq(int n) {
        this.nwu = n;
        if (this.nwo.length() > n) {
            this.nwo = this.nwo.substring(0, n);
        }
    }

    public void vc(int n) {
        this.nwh = n;
    }

    public void na(boolean bl) {
        this.nwq = bl;
    }

    public String nni() {
        int n = this.nwm < this.nwf ? this.nwm : this.nwf;
        int n2 = this.nwm < this.nwf ? this.nwf : this.nwm;
        return this.nwo.substring(n, n2);
    }

    public int nnw() {
        return this.nwu;
    }

    public String nne() {
        return this.nwo;
    }

    public boolean npd() {
        return this.nwc;
    }

    public void d(int n, int n2, int n3) {
        boolean bl;
        boolean bl2 = bl = n >= this.nwv && n < this.nwv + this.nwy && n2 >= this.nwj && n2 < this.nwj + this.nwk;
        if (this.nwq) {
            this.nl(bl);
        }
        if (this.nwc && n3 == 0) {
            int n4 = n - this.nwv;
            if (this.nwx) {
                n4 -= 4;
            }
            String string = this.nwz.r(this.nwo.substring(this.nwg), this.nnl());
            this.vv(this.nwz.r(string, n4).length() + this.nwg);
        }
    }

    public void nl(boolean bl) {
        if (bl && !this.nwc) {
            this.nws = 0;
        }
        this.nwc = bl;
    }

    public void nw(String string) {
        this.nwo = string.length() > this.nwu ? string.substring(0, this.nwu) : string;
        this.nnb();
    }

    public boolean n(char c, int n) {
        if (!this.nwc) {
            return false;
        }
        switch (c) {
            case '\u0001': {
                this.nnb();
                this.vz(0);
                return true;
            }
            case '\u0003': {
                Class970.uq(this.nni());
                return true;
            }
            case '\u0016': {
                if (this.nwa) {
                    this.ni(Class970.jnh());
                }
                return true;
            }
            case '\u0018': {
                Class970.uq(this.nni());
                if (this.nwa) {
                    this.ni("");
                }
                return true;
            }
        }
        switch (n) {
            case 14: {
                if (Class970.jnf()) {
                    if (this.nwa) {
                        this.vd(-1);
                    }
                } else if (this.nwa) {
                    this.pe(-1);
                }
                return true;
            }
            case 199: {
                if (Class970.jnm()) {
                    this.vz(0);
                } else {
                    this.nng();
                }
                return true;
            }
            case 203: {
                if (Class970.jnm()) {
                    if (Class970.jnf()) {
                        this.vz(this.i(-1, this.nnm()));
                    } else {
                        this.vz(this.nnm() - 1);
                    }
                } else if (Class970.jnf()) {
                    this.vv(this.vp(-1));
                } else {
                    this.vn(-1);
                }
                return true;
            }
            case 205: {
                if (Class970.jnm()) {
                    if (Class970.jnf()) {
                        this.vz(this.i(1, this.nnm()));
                    } else {
                        this.vz(this.nnm() + 1);
                    }
                } else if (Class970.jnf()) {
                    this.vv(this.vp(1));
                } else {
                    this.vn(1);
                }
                return true;
            }
            case 207: {
                if (Class970.jnm()) {
                    this.vz(this.nwo.length());
                } else {
                    this.nnb();
                }
                return true;
            }
            case 211: {
                if (Class970.jnf()) {
                    if (this.nwa) {
                        this.vd(1);
                    }
                } else if (this.nwa) {
                    this.pe(1);
                }
                return true;
            }
        }
        if (Class403.d(c)) {
            if (this.nwa) {
                this.ni(Character.toString(c));
            }
            return true;
        }
        return false;
    }

    public void npn() {
        ++this.nws;
    }
}

