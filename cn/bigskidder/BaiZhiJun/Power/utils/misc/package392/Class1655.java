/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package cn.bigskidder.BaiZhiJun.Power.utils.package393.package392;

import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1651;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class2445;
import package3.package2.package1.package82.Class487;
import package3.package2.package1.package82.package356.Class2489;

public class Class1655
extends Class1651 {
    protected Class2445[] jpj = new Class2445[256];
    protected Class2445[] jpz = new Class2445[256];
    protected Class2445[] jpq = new Class2445[256];
    private final int[] jpc = new int[32];
    private final String jps = "0123456789abcdefklmnor";
    protected Class2489 jpx;
    protected Class2489 jpo;
    protected Class2489 jpu;

    public Class1655(Font font, boolean bl, boolean bl2) {
        super(font, bl, bl2);
        this.nbq();
        this.nbz();
    }

    public float d(String string, double d, double d2, int n) {
        float f = this.d(string, d + 0.5, d2 + 0.5, n, true);
        return Math.max(f, this.d(string, d, d2, n, false));
    }

    public float n(String string, double d, double d2, int n) {
        float f = this.d(string, d + 1.0, d2 + 1.0, n, true);
        return Math.max(f, this.d(string, d, d2, n, false));
    }

    public float d(String string, float f, float f2, int n) {
        return this.d(string, (double)f, (double)f2, n, false);
    }

    public float n(String string, float f, float f2, int n) {
        return this.d(string, (double)(f - (float)(this.jj(string) / 2)), (double)f2, n);
    }

    public float p(String string, float f, float f2, int n) {
        return this.d(string, f - (float)(this.jj(string) / 2), f2, n);
    }

    public float d(String string, double d, double d2, int n, boolean bl) {
        d -= 1.0;
        d2 -= 2.0;
        if (string == null) {
            return 0.0f;
        }
        if (n == 553648127) {
            n = 16777215;
        }
        if ((n & -67108864) == 0) {
            n |= -16777216;
        }
        if (bl) {
            n = (n & 16579836) >> 2 | n & -16777216;
        }
        Class2445[] arrclass2445 = this.jpm;
        float f = (float)(n >> 24 & 255) / 255.0f;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = true;
        d *= 2.0;
        d2 *= 2.0;
        if (bl7) {
            GL11.glPushMatrix();
            Class487.i(0.5, 0.5, 0.5);
            Class487.pbu();
            Class487.vz(770, 771);
            Class487.o((float)(n >> 16 & 255) / 255.0f, (float)(n >> 8 & 255) / 255.0f, (float)(n & 255) / 255.0f, f);
            int n2 = string.length();
            Class487.nrn();
            Class487.xx(this.jpw.pfs());
            GL11.glBindTexture((int)3553, (int)this.jpw.pfs());
            for (int i = 0; i < n2; ++i) {
                char c = string.charAt(i);
                if (c == '\u00a7' && i < n2) {
                    int n3 = 21;
                    try {
                        n3 = "0123456789abcdefklmnor".indexOf(string.charAt(i + 1));
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                    }
                    if (n3 < 16) {
                        bl3 = false;
                        bl4 = false;
                        bl2 = false;
                        bl6 = false;
                        bl5 = false;
                        Class487.xx(this.jpw.pfs());
                        arrclass2445 = this.jpm;
                        if (n3 < 0 || n3 > 15) {
                            n3 = 15;
                        }
                        if (bl) {
                            n3 += 16;
                        }
                        int n4 = this.jpc[n3];
                        Class487.o((float)(n4 >> 16 & 255) / 255.0f, (float)(n4 >> 8 & 255) / 255.0f, (float)(n4 & 255) / 255.0f, f);
                    } else if (n3 == 16) {
                        bl2 = true;
                    } else if (n3 == 17) {
                        bl3 = true;
                        if (bl4) {
                            Class487.xx(this.jpu.pfs());
                            arrclass2445 = this.jpq;
                        } else {
                            Class487.xx(this.jpx.pfs());
                            arrclass2445 = this.jpj;
                        }
                    } else if (n3 == 18) {
                        bl5 = true;
                    } else if (n3 == 19) {
                        bl6 = true;
                    } else if (n3 == 20) {
                        bl4 = true;
                        if (bl3) {
                            Class487.xx(this.jpu.pfs());
                            arrclass2445 = this.jpq;
                        } else {
                            Class487.xx(this.jpo.pfs());
                            arrclass2445 = this.jpz;
                        }
                    } else if (n3 == 21) {
                        bl3 = false;
                        bl4 = false;
                        bl2 = false;
                        bl6 = false;
                        bl5 = false;
                        Class487.o((float)(n >> 16 & 255) / 255.0f, (float)(n >> 8 & 255) / 255.0f, (float)(n & 255) / 255.0f, f);
                        Class487.xx(this.jpw.pfs());
                        arrclass2445 = this.jpm;
                    }
                    ++i;
                    continue;
                }
                if (c >= arrclass2445.length || c < '\u0000') continue;
                GL11.glBegin((int)4);
                this.d(arrclass2445, c, (float)d, (float)d2);
                GL11.glEnd();
                if (bl5) {
                    this.d(d, d2 + (double)(arrclass2445[c].jpk / 2), d + (double)arrclass2445[c].jpy - 8.0, d2 + (double)(arrclass2445[c].jpk / 2), 1.0f);
                }
                if (bl6) {
                    this.d(d, d2 + (double)arrclass2445[c].jpk - 2.0, d + (double)arrclass2445[c].jpy - 8.0, d2 + (double)arrclass2445[c].jpk - 2.0, 1.0f);
                }
                d += (double)(arrclass2445[c].jpy - 8 + this.jpi);
            }
            GL11.glHint((int)3155, (int)4352);
            GL11.glPopMatrix();
        }
        return (float)d / 2.0f;
    }

    @Override
    public int jj(String string) {
        if (string == null) {
            return 0;
        }
        int n = 0;
        Class2445[] arrclass2445 = this.jpm;
        boolean bl = false;
        boolean bl2 = false;
        int n2 = string.length();
        for (int i = 0; i < n2; ++i) {
            char c = string.charAt(i);
            if (c == '\u00a7' && i < n2) {
                int n3 = "0123456789abcdefklmnor".indexOf(c);
                if (n3 < 16) {
                    bl = false;
                    bl2 = false;
                } else if (n3 == 17) {
                    bl = true;
                    arrclass2445 = bl2 ? this.jpq : this.jpj;
                } else if (n3 == 20) {
                    bl2 = true;
                    arrclass2445 = bl ? this.jpq : this.jpz;
                } else if (n3 == 21) {
                    bl = false;
                    bl2 = false;
                    arrclass2445 = this.jpm;
                }
                ++i;
                continue;
            }
            if (c >= arrclass2445.length || c < '\u0000') continue;
            n += arrclass2445[c].jpy - 8 + this.jpi;
        }
        return n / 2;
    }

    @Override
    public void d(Font font) {
        super.d(font);
        this.nbz();
    }

    @Override
    public void vs(boolean bl) {
        super.vs(bl);
        this.nbz();
    }

    @Override
    public void vx(boolean bl) {
        super.vx(bl);
        this.nbz();
    }

    private void nbz() {
        this.jpx = this.d(this.jpg.deriveFont(1), this.jpa, this.jpl, this.jpj);
        this.jpo = this.d(this.jpg.deriveFont(2), this.jpa, this.jpl, this.jpz);
        this.jpu = this.d(this.jpg.deriveFont(3), this.jpa, this.jpl, this.jpq);
    }

    private void d(double d, double d2, double d3, double d4, float f) {
        GL11.glDisable((int)3553);
        GL11.glLineWidth((float)f);
        GL11.glBegin((int)1);
        GL11.glVertex2d((double)d, (double)d2);
        GL11.glVertex2d((double)d3, (double)d4);
        GL11.glEnd();
        GL11.glEnable((int)3553);
    }

    public List<String> d(String string, double d) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if ((double)this.jj(string) > d) {
            String[] arrstring = string.split(" ");
            String string2 = "";
            char c = '\uffff';
            for (String string3 : arrstring) {
                for (int i = 0; i < string3.toCharArray().length; ++i) {
                    char c2 = string3.toCharArray()[i];
                    if (c2 != '\u00a7' || i >= string3.toCharArray().length - 1) continue;
                    c = string3.toCharArray()[i + 1];
                }
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(String.valueOf(string2)));
                if ((double)this.jj(stringBuilder.append(string3).append(" ").toString()) < d) {
                    string2 = String.valueOf(String.valueOf(string2)) + string3 + " ";
                    continue;
                }
                arrayList.add(string2);
                string2 = "\u00a7" + c + string3 + " ";
            }
            if (string2.length() > 0) {
                if ((double)this.jj(string2) < d) {
                    arrayList.add("\u00a7" + c + string2 + " ");
                    string2 = "";
                } else {
                    for (String string3 : this.n(string2, d)) {
                        arrayList.add(string3);
                    }
                }
            }
        } else {
            arrayList.add(string);
        }
        return arrayList;
    }

    public List<String> n(String string, double d) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = "";
        char c = '\uffff';
        char[] arrc = string.toCharArray();
        for (int i = 0; i < arrc.length; ++i) {
            char c2 = arrc[i];
            if (c2 == '\u00a7' && i < arrc.length - 1) {
                c = arrc[i + 1];
            }
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(String.valueOf(string2)));
            if ((double)this.jj(stringBuilder.append(c2).toString()) < d) {
                string2 = String.valueOf(String.valueOf(string2)) + c2;
                continue;
            }
            arrayList.add(string2);
            string2 = "\u00a7" + c + String.valueOf(c2);
        }
        if (string2.length() > 0) {
            arrayList.add(string2);
        }
        return arrayList;
    }

    private void nbq() {
        for (int i = 0; i < 32; ++i) {
            int n = (i >> 3 & 1) * 85;
            int n2 = (i >> 2 & 1) * 170 + n;
            int n3 = (i >> 1 & 1) * 170 + n;
            int n4 = (i >> 0 & 1) * 170 + n;
            if (i == 6) {
                n2 += 85;
            }
            if (i >= 16) {
                n2 /= 4;
                n3 /= 4;
                n4 /= 4;
            }
            this.jpc[i] = (n2 & 255) << 16 | (n3 & 255) << 8 | n4 & 255;
        }
    }
}

