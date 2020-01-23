/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Vector2f
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package4926;

import java.util.ArrayList;
import java.util.Random;
import org.lwjgl.util.vector.Vector2f;
import cn.bigskidder.BaiZhiJun.Power.package185.package4926.Class491;
import cn.bigskidder.BaiZhiJun.Power.package185.package4926.Class496;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;

//ParticleManager.java
public class Class492 {
    private Class496 nib;
    private int nii;
    public ArrayList<Class496> niw = new ArrayList();
    private Random nie = new Random();

    public Class492(Class496 class496, int n) {
        this.nib = class496;
        this.nii = n;
        this.ry();
    }

    private void ry() {
        this.niw.clear();
        Class1815 class1815 = new Class1815(Class2556.nmk());
        for (int i = 0; i < this.nii; ++i) {
            Class491 class491 = new Class491();
            if (class491 instanceof Class491) {
                class491 = new Class491();
            }
            class491.nwd.x = this.nie.nextInt(class1815.jvs() + 1);
            class491.nwd.y = this.nie.nextInt(class1815.jvx() + 1);
            this.niw.add(class491);
        }
    }

    public void pi(int n) {
        for (Class496 class496 : this.niw) {
            class496.pi(n);
        }
    }
}

