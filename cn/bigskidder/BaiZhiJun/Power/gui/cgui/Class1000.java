/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package184;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import cn.bigskidder.BaiZhiJun.Power.Class2525;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.Class1004;
import cn.bigskidder.BaiZhiJun.Power.package185.package184.Class997;
import cn.bigskidder.BaiZhiJun.Power.utils.Class169;
import cn.bigskidder.BaiZhiJun.Power.utils.package4337.Class2497;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1613;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;


//UIMenu.java
public class Class1000 {
    private ArrayList<Class1004> rds;
    public static int rdx = 100;
    public static int rdo = 20;
    private Class2497 rdu = new Class2497(0);
    private Class2556 rdy = Class2556.nmk();
    private String rdk;

    public Class1000() {
        this.rdk = String.valueOf(String.valueOf(this.rdy.vrg.getAbsolutePath())) + "/" + Class2525.oiz;
        this.rds = new ArrayList();
        Class1815 class1815 = new Class1815(Class2556.nmk());
        this.jti();
        try {
            this.jhd();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public void ng(int n, int n2) {
        for (Class1004 class1004 : this.rds) {
            class1004.ng(n, n2);
        }
    }

    private void jti() {
        int n = 10;
        for (Class1613 class1613 : Class1613.values()) {
            this.rds.add(new Class1004(class1613, n, 90, rdx, rdo, this.rdu));
            n += 115;
        }
    }

    public void zt(int n, int n2) {
        for (Class1004 class1004 : this.rds) {
            class1004.zt(n, n2);
        }
    }

    public void zh(int n, int n2) {
        for (Class1004 class1004 : this.rds) {
            class1004.zh(n, n2);
        }
        Class2525.oiy.oim.jmi();
        this.jte();
    }

    public ArrayList<Class1004> jtw() {
        return this.rds;
    }

    public void jte() {
        File file = new File(String.valueOf(String.valueOf(this.rdk)) + "/gui.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            for (Class1004 class1004 : this.jtw()) {
                String string = class1004.rdl.name();
                String string2 = String.valueOf(class1004.rde);
                String string3 = String.valueOf(class1004.rnd);
                String string4 = String.valueOf(class1004.rdb.rnx);
                printWriter.print(String.valueOf(String.valueOf(string)) + ":" + string2 + ":" + string3 + ":" + string4 + "\n");
            }
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void jhd() throws IOException {
        File file = new File(String.valueOf(String.valueOf(this.rdk)) + "/gui.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    String[] arrstring = string.split(":");
                    if (arrstring.length < 4) continue;
                    String string2 = arrstring[0];
                    int n = Integer.valueOf(arrstring[1]);
                    int n2 = Integer.valueOf(arrstring[2]);
                    boolean bl = Boolean.valueOf(arrstring[3]);
                    for (Class1004 class1004 : this.jtw()) {
                        String string3 = class1004.rdl.name();
                        if (!string3.equals(string2)) continue;
                        class1004.rde = n;
                        class1004.rnd = n2;
                        class1004.rdb.rnx = bl;
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            bufferedReader.close();
        }
    }
}

