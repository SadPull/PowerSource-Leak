/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package588;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.Class2525;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class190;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class191;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class194;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class196;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class200;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class203;
import cn.bigskidder.BaiZhiJun.Power.utils.Class128;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1384;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1387;
import cn.bigskidder.BaiZhiJun.Power.utils.Class169;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1813;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package0.Class584;
import package3.package2.package1.package0.Class960;
import package3.package2.package1.package0.Class970;
import package3.package2.package1.package82.Class468;
import package3.package2.package1.package82.Class474;
import package3.package2.package152.Class426;

public class Class193
extends Class970 {
    private static Class2556 neq = Class2556.nmk();
    private Class584 nec;
    private Class584 nes;
    private Class584 nex;
    private Class190 neo;
    private int neu;
    public Class200 ney = null;
    private String nek = "\u00a7eWaiting...";

    public Class193(Class970 class970) {
        Class169.jmh();
    }

    @Override
    public void d(Class584 class584) {
        switch (class584.tdn) {
            case 0: {
                if (this.neo == null) {
                    neq.d((Class970)null);
                    break;
                }
                if (!this.neo.nps().equals("Logging in...") && !this.neo.nps().equals("Do not hit back! Logging in...")) {
                    neq.d((Class970)null);
                    break;
                }
                this.neo.pn("Do not hit back! Logging in...");
                break;
            }
            case 1: {
                String string = this.ney.npc();
                String string2 = this.ney.npq();
                this.neo = new Class190(string, string2);
                this.neo.start();
                break;
            }
            case 2: {
                if (this.neo != null) {
                    this.neo = null;
                }
                Class2525.oiy.vua();
                Class203.npj().remove(this.ney);
                this.nek = "\u00a7cRemoved.";
                this.ney = null;
                Class169.jmh();
                break;
            }
            case 3: {
                neq.d(new Class194(this));
                break;
            }
            case 4: {
                neq.d(new Class191(this));
                break;
            }
            case 5: {
                Class2525.oiy.vua();
                Class2525.oiy.vua();
                Class200 class200 = Class203.nwe.get(new Random().nextInt(Class203.nwe.size()));
                String string = class200.npc();
                String string3 = class200.npq();
                this.neo = new Class190(string, string3);
                this.neo.start();
                break;
            }
            case 6: {
                neq.d(new Class196(this));
                break;
            }
            case 8: {
                neq.d(new Class1813(this));
                break;
            }
            case 7: {
                Class2525.oiy.vua();
                Class200 class200 = Class203.ned;
                if (class200 == null) {
                    if (this.neo == null) {
                        this.nek = "?cThere is no last used alt!";
                        break;
                    }
                    this.neo.pn("?cThere is no last used alt!");
                    break;
                }
                String string = class200.npc();
                String string4 = class200.npq();
                this.neo = new Class190(string, string4);
                this.neo.start();
            }
        }
    }

    @Override
    public void d(int n, int n2, float f) {
        int n3;
        this.jds();
        if (Mouse.hasWheel()) {
            n3 = Mouse.getDWheel();
            if (n3 < 0) {
                this.neu += 26;
                if (this.neu < 0) {
                    this.neu = 0;
                }
            } else if (n3 > 0) {
                this.neu -= 26;
                if (this.neu < 0) {
                    this.neu = 0;
                }
            }
        }
        this.jds();
        Class128.rqy.vrj.v(Class193.neq.vrp.npc(), 8.0f, 10.0f, 3407871);
        Class2525.oiy.vua();
        Class128.rqy.vrj.j(String.valueOf(Class203.npj().size()) + " alts", this.tqs / 2, 10.0f, -1);
        Class128.rqy.vrj.j(this.neo == null ? this.nek : this.neo.nps(), this.tqs / 2, 20.0f, -1);
        Class1384.p(50.0, 33.0, this.tqs - 50, this.tqx - 50, 1.0, Class1387.y(25, 25, 25, 100), Class1387.y(5, 5, 5, 200));
        GL11.glPushMatrix();
        this.d(0.0f, 33.0f, this.tqs, this.tqx - 50);
        GL11.glEnable((int)3089);
        n3 = 38;
        Class2525.oiy.vua();
        for (Class200 class200 : Class203.npj()) {
            String string;
            if (!this.vs(n3)) continue;
            String string2 = class200.npz().equals("") ? class200.npc() : class200.npz();
            String string3 = string = class200.npq().equals("") ? "\u00a7cCracked" : class200.npq().replaceAll(".", "*");
            if (class200 == this.ney) {
                if (this.k(n, n2, n3 - this.neu) && Mouse.isButtonDown((int)0)) {
                    Class1384.d(52.0f, (float)(n3 - this.neu - 4), (float)(this.tqs - 52), (float)(n3 - this.neu + 20), 1.0f, -16777216, -2142943931);
                } else if (this.k(n, n2, n3 - this.neu)) {
                    Class1384.d(52.0f, (float)(n3 - this.neu - 4), (float)(this.tqs - 52), (float)(n3 - this.neu + 20), 1.0f, -16777216, -2142088622);
                } else {
                    Class1384.d(52.0f, (float)(n3 - this.neu - 4), (float)(this.tqs - 52), (float)(n3 - this.neu + 20), 1.0f, -16777216, -2144259791);
                }
            } else if (this.k(n, n2, n3 - this.neu) && Mouse.isButtonDown((int)0)) {
                Class1384.d(52.0f, (float)(n3 - this.neu - 4), (float)(this.tqs - 52), (float)(n3 - this.neu + 20), 1.0f, -16777216, -2146101995);
            } else if (this.k(n, n2, n3 - this.neu)) {
                Class1384.d(52.0f, (float)(n3 - this.neu - 4), (float)(this.tqs - 52), (float)(n3 - this.neu + 20), 1.0f, -16777216, -2145180893);
            }
            Class128.rqy.vrj.j(string2, this.tqs / 2, n3 - this.neu, -1);
            Class128.rqy.vrj.j(string, this.tqs / 2, n3 - this.neu + 10, 5592405);
            n3 += 26;
        }
        GL11.glDisable((int)3089);
        GL11.glPopMatrix();
        super.d(n, n2, f);
        if (this.ney == null) {
            this.nec.tdp = false;
            this.nes.tdp = false;
            this.nex.tdp = false;
        } else {
            this.nec.tdp = true;
            this.nes.tdp = true;
            this.nex.tdp = true;
        }
        if (Keyboard.isKeyDown((int)200)) {
            this.neu -= 26;
            if (this.neu < 0) {
                this.neu = 0;
            }
        } else if (Keyboard.isKeyDown((int)208)) {
            this.neu += 26;
            if (this.neu < 0) {
                this.neu = 0;
            }
        }
    }

    @Override
    public void n() {
        this.tqo.add(new Class584(0, this.tqs / 2 + 116, this.tqx - 24, 75, 20, "Cancel"));
        this.nec = new Class584(1, this.tqs / 2 - 122, this.tqx - 48, 100, 20, "Login");
        this.tqo.add(this.nec);
        this.nes = new Class584(2, this.tqs / 2 - 40, this.tqx - 24, 70, 20, "Remove");
        this.tqo.add(this.nes);
        this.tqo.add(new Class584(3, this.tqs / 2 + 4 + 86, this.tqx - 48, 100, 20, "Add"));
        this.tqo.add(new Class584(4, this.tqs / 2 - 16, this.tqx - 48, 100, 20, "Direct Login"));
        this.tqo.add(new Class584(5, this.tqs / 2 - 122, this.tqx - 24, 78, 20, "Random"));
        this.nex = new Class584(6, this.tqs / 2 + 38, this.tqx - 24, 70, 20, "Edit");
        this.tqo.add(this.nex);
        this.tqo.add(new Class584(7, this.tqs / 2 - 190, this.tqx - 48, 60, 20, "Last Alt"));
        this.tqo.add(new Class584(8, this.tqs / 2 - 190, this.tqx - 24, 60, 20, "Multi"));
        this.nec.tdp = false;
        this.nes.tdp = false;
        this.nex.tdp = false;
    }

    private boolean vs(int n) {
        return n - this.neu <= this.tqx - 50;
    }

    private boolean k(int n, int n2, int n3) {
        return n >= 52 && n2 >= n3 - 4 && n <= this.tqs - 52 && n2 <= n3 + 20 && n >= 0 && n2 >= 33 && n <= this.tqs && n2 <= this.tqx - 50;
    }

    @Override
    protected void d(int n, int n2, int n3) {
        if (this.neu < 0) {
            this.neu = 0;
        }
        int n4 = 38 - this.neu;
        Class2525.oiy.vua();
        for (Class200 class200 : Class203.npj()) {
            if (this.k(n, n2, n4)) {
                if (class200 == this.ney) {
                    this.d((Class584)this.tqo.get(1));
                    return;
                }
                this.ney = class200;
            }
            n4 += 26;
        }
        try {
            super.d(n, n2, n3);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void d(float f, float f2, float f3, float f4) {
        int n = new Class1815(neq).jvy();
        GL11.glScissor((int)((int)(f * (float)n)), (int)((int)(((float)new Class1815(neq).jvx() - f4) * (float)n)), (int)((int)((f3 - f) * (float)n)), (int)((int)((f4 - f2) * (float)n)));
    }

    public void w(int n, int n2) {
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        Class468.l(770, 771, 1, 0);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)3008);
        this.jds();
        Class474 class474 = Class474.ssx;
        class474.pwb();
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3008);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }
}

