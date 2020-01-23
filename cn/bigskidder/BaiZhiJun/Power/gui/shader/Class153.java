/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.ARBShaderObjects
 *  org.lwjgl.opengl.EXTFramebufferObject
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package4516;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1384;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;

//SlowlyShaderLoader.java
public class Class153 {
    private int pho;
    private int phu;
    private int phy;
    private int phk;
    private int pht;
    private int phh;
    private String phr;
    private String phf;
    private int phm;
    private int phg;
    private int pha;
    private int phl;
    private int phb;
    private int phi;
    private float phw = 0.0f;

    public Class153(String string, int n) {
        this.npr();
        this.phr = "vertex.shader";
        this.phf = string;
        this.phb = n;
        this.nxj();
        this.nxq();
    }

    private void nxj() {
        this.pht = EXTFramebufferObject.glGenFramebuffersEXT();
        this.phk = GL11.glGenTextures();
        this.phh = EXTFramebufferObject.glGenRenderbuffersEXT();
        GL11.glBindTexture((int)3553, (int)this.phk);
        GL11.glTexParameterf((int)3553, (int)10241, (float)9729.0f);
        GL11.glTexParameterf((int)3553, (int)10240, (float)9729.0f);
        GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
        GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
        GL11.glBindTexture((int)3553, (int)0);
        GL11.glBindTexture((int)3553, (int)this.phk);
        GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)Class2556.nmk().vht, (int)Class2556.nmk().vhh, (int)0, (int)6408, (int)5121, null);
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)this.pht);
        EXTFramebufferObject.glFramebufferTexture2DEXT((int)36160, (int)36064, (int)3553, (int)this.phk, (int)0);
        EXTFramebufferObject.glBindRenderbufferEXT((int)36161, (int)this.phh);
        EXTFramebufferObject.glRenderbufferStorageEXT((int)36161, (int)34041, (int)Class2556.nmk().vht, (int)Class2556.nmk().vhh);
        EXTFramebufferObject.glFramebufferRenderbufferEXT((int)36160, (int)36128, (int)36161, (int)this.phh);
    }

    public int nxz() {
        return this.phk;
    }

    public void nxq() {
        if (this.phy == -1) {
            this.phy = ARBShaderObjects.glCreateProgramObjectARB();
            try {
                InputStream inputStream;
                String string;
                if (this.pho == -1) {
                    inputStream = this.getClass().getResourceAsStream(this.phr);
                    string = Class1384.d(new InputStreamReader(inputStream));
                    this.pho = Class1384.i(string, 35633);
                }
                if (this.phu == -1) {
                    inputStream = this.getClass().getResourceAsStream("fragment/" + this.phf);
                    string = Class1384.d(new InputStreamReader(inputStream));
                    this.phu = Class1384.i(string, 35632);
                }
            }
            catch (Exception exception) {
                this.phy = -1;
                this.pho = -1;
                this.phu = -1;
                exception.printStackTrace();
            }
            if (this.phy != -1) {
                ARBShaderObjects.glAttachObjectARB((int)this.phy, (int)this.pho);
                ARBShaderObjects.glAttachObjectARB((int)this.phy, (int)this.phu);
                ARBShaderObjects.glLinkProgramARB((int)this.phy);
                if (ARBShaderObjects.glGetObjectParameteriARB((int)this.phy, (int)35714) == 0) {
                    System.err.println(this.phy);
                    return;
                }
                ARBShaderObjects.glValidateProgramARB((int)this.phy);
                if (ARBShaderObjects.glGetObjectParameteriARB((int)this.phy, (int)35715) == 0) {
                    System.err.println(this.phy);
                    return;
                }
                ARBShaderObjects.glUseProgramObjectARB((int)0);
                this.phm = ARBShaderObjects.glGetUniformLocationARB((int)this.phy, (CharSequence)"resolution");
                this.phg = ARBShaderObjects.glGetUniformLocationARB((int)this.phy, (CharSequence)"timeHelper");
                this.pha = ARBShaderObjects.glGetUniformLocationARB((int)this.phy, (CharSequence)"mouse");
                this.phi = ARBShaderObjects.glGetUniformLocationARB((int)this.phy, (CharSequence)"diffuseSamper");
                this.phl = ARBShaderObjects.glGetUniformLocationARB((int)this.phy, (CharSequence)"texel");
            }
        }
    }

    public Class153 nxc() {
        if (this.pht == -1 || this.phh == -1 || this.phy == -1) {
            throw new RuntimeException("Invalid IDs!");
        }
        EXTFramebufferObject.glBindFramebufferEXT((int)36160, (int)this.pht);
        int n = Math.max(Class2556.nga(), 30);
        GL11.glClear((int)16640);
        ARBShaderObjects.glUseProgramObjectARB((int)this.phy);
        ARBShaderObjects.glUniform1iARB((int)this.phi, (int)0);
        GL13.glActiveTexture((int)33984);
        GL11.glEnable((int)3553);
        GL11.glBindTexture((int)3553, (int)this.phb);
        Class1815 class1815 = new Class1815(Class2556.nmk());
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)2);
        floatBuffer.position(0);
        floatBuffer.put(Class2556.nmk().vht / 2);
        floatBuffer.put(Class2556.nmk().vhh / 2);
        floatBuffer.flip();
        ARBShaderObjects.glUniform2ARB((int)this.phm, (FloatBuffer)floatBuffer);
        FloatBuffer floatBuffer2 = BufferUtils.createFloatBuffer((int)2);
        floatBuffer2.position(0);
        floatBuffer2.put(1.0f / (float)Class2556.nmk().vht * 2.0f);
        floatBuffer2.put(1.0f / (float)Class2556.nmk().vhh * 2.0f);
        floatBuffer2.flip();
        ARBShaderObjects.glUniform2ARB((int)this.phl, (FloatBuffer)floatBuffer2);
        float f = (float)Mouse.getX() / (float)Class2556.nmk().vht;
        float f2 = (float)Mouse.getY() / (float)Class2556.nmk().vhh;
        FloatBuffer floatBuffer3 = BufferUtils.createFloatBuffer((int)2);
        floatBuffer3.position(0);
        floatBuffer3.put(f);
        floatBuffer3.put(f2);
        floatBuffer3.flip();
        ARBShaderObjects.glUniform2ARB((int)this.pha, (FloatBuffer)floatBuffer3);
        this.phw = (float)((double)this.phw + (double)Class1384.rzh * 0.7);
        ARBShaderObjects.glUniform1fARB((int)this.phg, (float)this.phw);
        double d = class1815.jvs();
        double d2 = class1815.jvx();
        GL11.glDisable((int)3553);
        GL11.glBegin((int)4);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)0.0);
        GL11.glVertex2d((double)0.0, (double)(d2 / 2.0));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)(d / 2.0), (double)(d2 / 2.0));
        GL11.glTexCoord2d((double)1.0, (double)0.0);
        GL11.glVertex2d((double)(d / 2.0), (double)(d2 / 2.0));
        GL11.glTexCoord2d((double)1.0, (double)1.0);
        GL11.glVertex2d((double)(d / 2.0), (double)0.0);
        GL11.glTexCoord2d((double)0.0, (double)1.0);
        GL11.glVertex2d((double)0.0, (double)0.0);
        GL11.glEnd();
        ARBShaderObjects.glUseProgramObjectARB((int)0);
        return this;
    }

    private void npr() {
        this.pho = -1;
        this.phu = -1;
        this.phy = -1;
        this.phk = -1;
        this.pht = -1;
        this.phh = -1;
    }

    public void nxs() {
        if (this.phh > -1) {
            EXTFramebufferObject.glDeleteRenderbuffersEXT((int)this.phh);
        }
        if (this.pht > -1) {
            EXTFramebufferObject.glDeleteFramebuffersEXT((int)this.pht);
        }
        if (this.phk > -1) {
            GL11.glDeleteTextures((int)this.phk);
        }
    }
}

