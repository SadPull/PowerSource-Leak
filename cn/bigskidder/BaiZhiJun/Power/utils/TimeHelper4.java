/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import org.lwjgl.input.Keyboard;

public class Class165 {
    public boolean rze;
    private int rqd;

    public Class165(int n) {
        this.rqd = n;
    }

    public boolean jkw() {
        if (Keyboard.isKeyDown((int)this.rqd)) {
            if (!this.rze) {
                this.rze = true;
                return true;
            }
        } else {
            this.rze = false;
        }
        return false;
    }
}

