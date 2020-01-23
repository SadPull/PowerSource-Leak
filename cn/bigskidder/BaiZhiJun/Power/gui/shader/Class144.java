/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package4516;

import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.package185.package4516.Class153;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package0.Class970;
import package3.package2.package1.package108.Class807;
import package3.package2.package1.package2860.Class1029;
import package3.package2.package1.package82.Class391;

//SlowlyShader.java
public class Class144 {
    private Class807 phq;
    private Class153 phc;
    private static Class2556 phs = Class2556.nmk();
    private String phx;

    public Class144(String string) {
        this.phx = string;
    }

    public void nxn() {
        Class1815 class1815;
        if (Class144.phs.vrf.uxg != 2 && Class144.phs.vrq == null) {
            Class144.phs.vrf.uxg = 2;
        }
        if (this.phq == null) {
            this.phq = new Class807(Class2556.nmk().vht, Class2556.nmk().vhh, false);
        } else if (this.phq.jjx != Class2556.nmk().vht || this.phq.jjo != Class2556.nmk().vhh) {
            this.phq.nip();
            this.phq = new Class807(Class2556.nmk().vht, Class2556.nmk().vhh, false);
            if (this.phc != null) {
                this.phc.nxs();
                class1815 = new Class1815(phs);
                this.phc = new Class153(this.phx, this.phq.jjk);
            }
        }
        if (this.phc == null) {
            class1815 = new Class1815(phs);
            this.phc = new Class153(this.phx, this.phq.jjk);
        }
        GL11.glMatrixMode((int)5888);
        Class391.pwd();
        this.phq.vo(false);
        GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glClear((int)16640);
    }

    public void nxp() {
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        this.phc.nxc();
        Class2556.nmk().nfc().vo(true);
        Class1815 class1815 = new Class1815(phs);
        GL11.glEnable((int)3553);
        GL11.glBindTexture((int)3553, (int)this.phc.nxz());
        GL11.glBegin((int)4);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        double d = 0.0;
        double d2 = 0.0;
        double d3 = class1815.jvs();
        double d4 = class1815.jvx();
        GL11.glVertex2d((double)d, (double)(d2 + d4 * 2.0));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)(d + d3 * 2.0), (double)(d2 + d4 * 2.0));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)(d + d3 * 2.0), (double)(d2 + d4 * 2.0));
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)(d + d3 * 2.0), (double)d2);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glEnd();
    }

    public void nxv() {
        try {
            this.phc.nxs();
            this.phq.nip();
            this.phq.nin();
            this.phc = null;
            this.phq = null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

