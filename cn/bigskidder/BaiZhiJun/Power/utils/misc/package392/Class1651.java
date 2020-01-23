/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.utils.package393.package392;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class2445;
import package3.package2.package1.package82.package356.Class2489;

public class Class1651 {
    private final float jpf = 512.0f;
    protected Class2445[] jpm = new Class2445[256];
    protected Font jpg;
    protected boolean jpa;
    protected boolean jpl;
    protected int jpb = -1;
    protected int jpi = 0;
    protected Class2489 jpw;

    public Class1651(Font font, boolean bl, boolean bl2) {
        this.jpg = font;
        this.jpa = bl;
        this.jpl = bl2;
        this.jpw = this.d(font, bl, bl2, this.jpm);
    }

    protected Class2489 d(Font font, boolean bl, boolean bl2, Class2445[] arrclass2445) {
        BufferedImage bufferedImage = this.n(font, bl, bl2, arrclass2445);
        try {
            return new Class2489(bufferedImage);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    protected BufferedImage n(Font font, boolean bl, boolean bl2, Class2445[] arrclass2445) {
        int n = 512;
        BufferedImage bufferedImage = new BufferedImage(512, 512, 2);
        Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
        graphics2D.setFont(font);
        graphics2D.setColor(new Color(255, 255, 255, 0));
        graphics2D.fillRect(0, 0, 512, 512);
        graphics2D.setColor(Color.WHITE);
        graphics2D.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, bl2 ? RenderingHints.VALUE_FRACTIONALMETRICS_ON : RenderingHints.VALUE_FRACTIONALMETRICS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, bl ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, bl ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
        FontMetrics fontMetrics = graphics2D.getFontMetrics();
        int n2 = 0;
        int n3 = 0;
        int n4 = 1;
        for (int i = 0; i < arrclass2445.length; ++i) {
            char c = (char)i;
            Class2445 class2445 = new Class2445(this);
            Rectangle2D rectangle2D = fontMetrics.getStringBounds(String.valueOf(c), graphics2D);
            class2445.jpy = rectangle2D.getBounds().width + 8;
            class2445.jpk = rectangle2D.getBounds().height;
            if (n3 + class2445.jpy >= 512) {
                n3 = 0;
                n4 += n2;
                n2 = 0;
            }
            if (class2445.jpk > n2) {
                n2 = class2445.jpk;
            }
            class2445.jpt = n3;
            class2445.jph = n4;
            if (class2445.jpk > this.jpb) {
                this.jpb = class2445.jpk;
            }
            arrclass2445[i] = class2445;
            graphics2D.drawString(String.valueOf(c), n3 + 2, n4 + fontMetrics.getAscent());
            n3 += class2445.jpy;
        }
        return bufferedImage;
    }

    public void d(Class2445[] arrclass2445, char c, float f, float f2) throws ArrayIndexOutOfBoundsException {
        try {
            this.d(f, f2, arrclass2445[c].jpy, arrclass2445[c].jpk, arrclass2445[c].jpt, arrclass2445[c].jph, arrclass2445[c].jpy, arrclass2445[c].jpk);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    protected void d(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f5 / 512.0f;
        float f10 = f6 / 512.0f;
        float f11 = f7 / 512.0f;
        float f12 = f8 / 512.0f;
        GL11.glTexCoord2f((float)(f9 + f11), (float)f10);
        GL11.glVertex2d((double)(f + f3), (double)f2);
        GL11.glTexCoord2f((float)f9, (float)f10);
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glTexCoord2f((float)f9, (float)(f10 + f12));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)f9, (float)(f10 + f12));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f9 + f11), (float)(f10 + f12));
        GL11.glVertex2d((double)(f + f3), (double)(f2 + f4));
        GL11.glTexCoord2f((float)(f9 + f11), (float)f10);
        GL11.glVertex2d((double)(f + f3), (double)f2);
    }

    public int jz(String string) {
        return this.lf();
    }

    public int lf() {
        return (this.jpb - 8) / 2;
    }

    public int jj(String string) {
        int n = 0;
        for (char c : string.toCharArray()) {
            if (c >= this.jpm.length || c < '\u0000') continue;
            n += this.jpm[c].jpy - 8 + this.jpi;
        }
        return n / 2;
    }

    public boolean nbc() {
        return this.jpa;
    }

    public void vs(boolean bl) {
        if (this.jpa != bl) {
            this.jpa = bl;
            this.jpw = this.d(this.jpg, bl, this.jpl, this.jpm);
        }
    }

    public boolean nbs() {
        return this.jpl;
    }

    public void vx(boolean bl) {
        if (this.jpl != bl) {
            this.jpl = bl;
            this.jpw = this.d(this.jpg, this.jpa, bl, this.jpm);
        }
    }

    public Font nbx() {
        return this.jpg;
    }

    public void d(Font font) {
        this.jpg = font;
        this.jpw = this.d(font, this.jpa, this.jpl, this.jpm);
    }
}

