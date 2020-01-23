/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package1087.package2140;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import cn.bigskidder.BaiZhiJun.Power.package1087.Class1818;
import cn.bigskidder.BaiZhiJun.Power.package185.Class1610;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.package639.package638.package2875.Class1048;
import package3.package2.package1.Class2556;

public class Class1657
extends Class1818 {
    private static String hhm = String.valueOf(String.valueOf(Class2556.nmk().vrg.getAbsolutePath())) + "/" + "Power";

    public Class1657(String[] arrstring) {
        super(arrstring);
        this.e("-spammer <Text>");
    }

    @Override
    public void d(String[] arrstring) {
        if (arrstring.length != 2) {
            Class1386.d(this.tz(), Class1610.heq);
            return;
        }
        Class1048.ed = arrstring[1];
        Class1657.jyp();
        Class1386.d("Changed message " + arrstring[1], Class1610.hej);
        super.d(arrstring);
    }

    public static void jyp() {
        File file = new File(String.valueOf(String.valueOf(hhm)) + "/spammer.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print(Class1048.ed);
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void jyv() throws IOException {
        File file = new File(String.valueOf(String.valueOf(hhm)) + "/spammer.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    String string2;
                    Class1048.ed = string2 = String.valueOf(string);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }
}

