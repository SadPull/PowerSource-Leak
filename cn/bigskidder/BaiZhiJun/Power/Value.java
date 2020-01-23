/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Value<T> {
    private T obz;
    private T obq;
    private T obc;
    private double obs;
    private final T obx;
    private final String obo;
    public boolean obu = false;
    public boolean oby = false;
    public boolean obk = false;
    public boolean obt = false;
    public boolean obh;
    public boolean obr = false;
    public boolean obf = false;
    private int obm;
    public ArrayList<String> obg;
    public double oba;
    public boolean obl = false;
    public static final List<Value> obb = new ArrayList<Value>();
    public boolean obi;
    public boolean obw;
    public double obe;
    public final int oid = 4;
    public float oin = 4.0f;
    public boolean oip;
    private String oiv;

    public Value(String string, String string2, int n) {
        this.obx = this.obz;
        this.obh = true;
        this.obs = 0.1;
        this.obg = new ArrayList();
        this.obm = n;
        this.obo = String.valueOf(String.valueOf(string)) + "_" + "Mode";
        this.oiv = string2;
        obb.add(this);
    }

    public Value(String string, T t, T t2, T t3) {
        this.obx = this.obz;
        this.obo = string;
        this.obz = t;
        this.obq = t2;
        this.obc = t3;
        this.obs = 0.1;
        if (this.obz instanceof Double) {
            this.obt = true;
        }
        obb.add(this);
    }

    public Value(String string, T t, T t2, T t3, double d) {
        this.obx = t;
        this.obo = string;
        this.obz = t;
        this.obq = t2;
        this.obc = t3;
        this.obs = d;
        if (t instanceof Double) {
            this.obt = true;
        }
        obb.add(this);
    }

    public Value(String string, T t) {
        this.obx = t;
        this.obo = string;
        this.obz = t;
        if (t instanceof Boolean) {
            this.obu = true;
        } else if (t instanceof Integer) {
            this.oby = true;
        } else if (t instanceof Float) {
            this.obk = true;
        } else if (t instanceof Long) {
            this.obr = true;
        } else if (t instanceof Byte) {
            this.obf = true;
        }
        obb.add(this);
    }

    public Value(String string, String string2, String string3, T t, T t2, T t3) {
        this.obx = t;
        this.obo = string;
        this.obz = t;
        if (t instanceof Boolean) {
            this.obu = true;
        } else if (t instanceof Integer) {
            this.oby = true;
        } else if (t instanceof Float) {
            this.obk = true;
        } else if (t instanceof Double) {
            this.obt = true;
        } else if (t instanceof Long) {
            this.obr = true;
        } else if (t instanceof Byte) {
            this.obf = true;
        }
        obb.add(this);
    }

    public void xh(String string) {
        this.obg.add(string);
    }

    public void tp(int n) {
        if (n > this.obg.size() - 1) {
            System.out.println("Value is to big! Set to 0. (" + this.obg.size() + ")");
            return;
        }
        this.obm = n;
    }

    public int vuj() {
        return this.obm;
    }

    public ArrayList<String> vuz() {
        return this.obg;
    }

    public String vuq() {
        return this.oiv;
    }

    public String tv(int n) {
        return this.obg.get(n);
    }

    public String xr(String string) {
        for (int i = 0; i < this.obg.size(); ++i) {
            if (!this.obg.get(i).equalsIgnoreCase(string)) continue;
            return this.obg.get(i);
        }
        return "NULL";
    }

    public int xf(String string) {
        for (int i = 0; i < this.obg.size(); ++i) {
            if (!this.obg.get(i).equalsIgnoreCase(string)) continue;
            return i;
        }
        return 0;
    }

    public boolean xm(String string) {
        return this.tv(this.vuj()).equalsIgnoreCase(string);
    }

    public String vuc() {
        String string = "";
        for (int i = 0; i < this.obg.size(); ++i) {
            string = String.valueOf(String.valueOf(string)) + this.obg.get(i).toString();
        }
        return string;
    }

    public final String vus() {
        return this.obo;
    }

    public String vux() {
        if (this.obh) {
            return this.vuq();
        }
        return this.vus().split("_")[1];
    }

    public final T vuo() {
        if (this.obz instanceof Double) {
            return this.obq;
        }
        return null;
    }

    public final double vuu() {
        return this.obs;
    }

    public final T vuy() {
        if (this.obz instanceof Double) {
            return this.obc;
        }
        return null;
    }

    public final T vuk() {
        return this.obx;
    }

    public final T vut() {
        return this.obz;
    }

    public final void k(T t) {
        this.obz = t;
    }

    public static Value xg(String string) {
        for (Value Value : obb) {
            if (!Value.obu || !Value.vus().equalsIgnoreCase(string)) continue;
            return Value;
        }
        return null;
    }

    public static Value xa(String string) {
        for (Value Value : obb) {
            if (!Value.obt || !Value.vus().equalsIgnoreCase(string)) continue;
            return Value;
        }
        return null;
    }

    public static Value no(String string, String string2) {
        for (Value Value : obb) {
            if (!Value.obh || !Value.vus().equalsIgnoreCase(string) || !Value.vuq().equalsIgnoreCase(string2)) continue;
            return Value;
        }
        return null;
    }
}

