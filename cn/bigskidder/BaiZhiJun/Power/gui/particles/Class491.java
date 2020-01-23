/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector2f
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package4926;

import java.util.Random;
import org.lwjgl.util.vector.Vector2f;
import cn.bigskidder.BaiZhiJun.Power.package185.package4926.Class496;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1387;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package0.Class578;


//ParticleSnow.java
public class Class491
extends Class496 {
    private Random nwn = new Random();
    private Class1815 nwp;

    @Override
    public void pi(int n) {
        this.nny();
        this.nnk();
        this.pw(n);
        this.nnt();
    }

    private void nny() {
        this.nwp = new Class1815(Class2556.nmk());
    }

    private void pw(int n) {
        float f = 10.0f;
        for (int i = 0; i < 10; ++i) {
            int n2 = Math.min(0, 1 - i / 10);
            Class578.v(this.nwd.x, this.nwd.y, f + (1.0f + (float)i * 0.2f), Class1386.s(Class1387.rjs.rjl, n2));
        }
        Class578.v(this.nwd.x + (float)n, this.nwd.y, 1.1f, Class1386.s(-1, 0.2f));
        Class578.v(this.nwd.x + (float)n, this.nwd.y, 0.8f, Class1386.s(-1, 0.4f));
        Class578.v(this.nwd.x + (float)n, this.nwd.y, 0.5f, Class1386.s(-1, 0.6f));
        Class578.v(this.nwd.x + (float)n, this.nwd.y, 0.3f, Class1386.s(Class1387.rjs.rjl, 1.0f));
    }

    private void nnk() {
        float f = 100.0f;
        this.nwd.y += this.nwn.nextFloat() * 0.25f;
        this.nwd.x -= this.nwn.nextFloat();
    }

    private void nnt() {
        if (this.nwd.x < 0.0f) {
            this.nwd.x = this.nwp.jvs();
        }
        if (this.nwd.y > (float)this.nwp.jvx()) {
            this.nwd.y = 0.0f;
        }
    }
}

