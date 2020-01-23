/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package cn.bigskidder.BaiZhiJun.Power.utils.package4337;

import org.lwjgl.input.Mouse;

public class Class2497 {
    public boolean hlx;
    private int hlo;

    public Class2497(int n) {
        this.hlo = n;
    }

    public boolean jkw() {
        if (Mouse.isButtonDown((int)this.hlo)) {
            if (!this.hlx) {
                this.hlx = true;
                return true;
            }
        } else {
            this.hlx = false;
        }
        return false;
    }
}

