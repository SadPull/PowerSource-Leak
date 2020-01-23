/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils.package2993;

public class Class953 {
    static long hlu;
    private long hly;
    protected static long hlk;
    private long hlt;

    public Class953() {
        hlu = 0L;
        hlk = -1L;
        this.hly = System.nanoTime() / 1000000L;
    }

    public static boolean jc(float f) {
        return (float)(Class953.pqb() - hlu) >= f;
    }

    public static boolean nl(double d) {
        return (double)(Class953.pqb() - hlu) >= d;
    }

    public boolean zs(float f) {
        return (float)(Class953.pqb() - hlu) >= f;
    }

    public void jke() {
        this.hlt = Class953.jtv();
    }

    public static void npr() {
        hlu = Class953.pqb();
    }

    public static long pqb() {
        return System.nanoTime() / 1000000L;
    }

    public long jtd() {
        return System.nanoTime() / 1000000L - this.hly;
    }

    public long vol() {
        return Class953.pqb() - hlu;
    }

    public void nq(long l) {
        hlu = Class953.pqb() - l;
    }

    public boolean d(long l, boolean bl) {
        if (this.jtd() >= l) {
            if (bl) {
                Class953.npr();
            }
            return true;
        }
        return false;
    }

    public void jtn() {
        hlk = System.currentTimeMillis();
    }

    public boolean no(long l) {
        return System.currentTimeMillis() - hlk >= l;
    }

    public long jtp() {
        return System.currentTimeMillis() - hlk;
    }

    public static long jtv() {
        return System.nanoTime() / 1000000L;
    }

    public long jtj() {
        return hlk;
    }

    public static boolean nu(long l) {
        return Class953.jtv() - hlk >= l;
    }

    public void ny(long l) {
        hlk = l;
    }

    public boolean nb(double d) {
        return (double)(Class953.jtv() - hlk) >= d;
    }
}

