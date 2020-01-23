/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.List;
import org.lwjgl.input.Keyboard;
import cn.bigskidder.BaiZhiJun.Power.Class2525;
import cn.bigskidder.BaiZhiJun.Power.Value;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class200;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class203;
import cn.bigskidder.BaiZhiJun.Power.utils.package5073.Class1632;
import cn.bigskidder.BaiZhiJun.Power.utils.package5073.Class1639;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1609;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1611;
import cn.bigskidder.BaiZhiJun.Power.package639.package638.package3206.Class151;
import package3.package2.package1.Class2556;

public class Class169 {
    private Class2556 rqw = Class2556.nmk();
    public static String rqe;
    private static File rcd;
    private static final File rcn;
    private static final File rcp;

    static {
        File file = Class2556.nmk().vrg;
        Class2525.oiy.getClass();
        rcd = new File(file, "Power");
        rcn = Class169.kj("Alts");
        rcp = Class169.kj("LastAlt");
    }

    public Class169() {
        rqe = String.valueOf(String.valueOf(this.rqw.vrg.getAbsolutePath())) + "/" + Class2525.oiz;
        File file = new File(rqe);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            this.jml();
            this.jyn();
            this.jyd();
            this.jmf();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static File kj(String string) {
        File file = new File(rcd, String.format("%s.txt", string));
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return file;
    }

    public static void jmy() {
        try {
            PrintWriter printWriter = new PrintWriter(rcp);
            Class200 class200 = Class2525.oiy.vua().npp();
            if (class200 != null) {
                if (class200.npz().equals("")) {
                    printWriter.println(String.valueOf(String.valueOf(class200.npc())) + ":" + class200.npq());
                } else {
                    printWriter.println(String.valueOf(String.valueOf(class200.npz())) + "    " + class200.npc() + ":" + class200.npq());
                }
            }
            printWriter.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public static void jmk() {
        try {
            if (!rcp.exists()) {
                PrintWriter printWriter = new PrintWriter(new FileWriter(rcp));
                printWriter.println();
                printWriter.close();
            } else if (rcp.exists()) {
                String string;
                BufferedReader bufferedReader = new BufferedReader(new FileReader(rcp));
                while ((string = bufferedReader.readLine()) != null) {
                    Object object;
                    String[] arrstring;
                    if (string.contains("\t")) {
                        string = string.replace("\t", "    ");
                    }
                    if (string.contains("    ")) {
                        arrstring = string.split("    ");
                        object = arrstring[1].split(":");
                        if (((String[])object).length == 2) {
                            Class2525.oiy.vua().d(new Class200(object[0], object[1], arrstring[0]));
                            continue;
                        }
                        String string2 = object[1];
                        for (int i = 2; i < ((String[])object).length; ++i) {
                            string2 = String.valueOf(String.valueOf(string2)) + ":" + object[i];
                        }
                        Class2525.oiy.vua().d(new Class200(object[0], string2, arrstring[0]));
                        continue;
                    }
                    arrstring = string.split(":");
                    if (arrstring.length == 1) {
                        Class2525.oiy.vua().d(new Class200(arrstring[0], ""));
                        continue;
                    }
                    if (arrstring.length == 2) {
                        Class2525.oiy.vua().d(new Class200(arrstring[0], arrstring[1]));
                        continue;
                    }
                    object = arrstring[1];
                    for (int i = 2; i < arrstring.length; ++i) {
                        object = String.valueOf(String.valueOf(object)) + ":" + arrstring[i];
                    }
                    Class2525.oiy.vua().d(new Class200(arrstring[0], (String)object));
                }
                bufferedReader.close();
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public static void jmt() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(rcn));
            if (!rcn.exists()) {
                PrintWriter printWriter = new PrintWriter(new FileWriter(rcn));
                printWriter.println();
                printWriter.close();
            } else if (rcn.exists()) {
                String string;
                while ((string = bufferedReader.readLine()) != null) {
                    Object object;
                    String[] arrstring;
                    if (string.contains("\t")) {
                        string = string.replace("\t", "    ");
                    }
                    if (string.contains("    ")) {
                        arrstring = string.split("    ");
                        object = arrstring[1].split(":");
                        if (((String[])object).length == 2) {
                            Class2525.oiy.vua();
                            Class203.npj().add(new Class200(object[0], object[1], arrstring[0]));
                            continue;
                        }
                        String string2 = object[1];
                        for (int i = 2; i < ((String[])object).length; ++i) {
                            string2 = String.valueOf(String.valueOf(string2)) + ":" + object[i];
                        }
                        Class2525.oiy.vua();
                        Class203.npj().add(new Class200(object[0], string2, arrstring[0]));
                        continue;
                    }
                    arrstring = string.split(":");
                    if (arrstring.length == 1) {
                        Class2525.oiy.vua();
                        Class203.npj().add(new Class200(arrstring[0], ""));
                        continue;
                    }
                    if (arrstring.length == 2) {
                        try {
                            Class2525.oiy.vua();
                            Class203.npj().add(new Class200(arrstring[0], arrstring[1]));
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                        }
                        continue;
                    }
                    object = arrstring[1];
                    for (int i = 2; i < arrstring.length; ++i) {
                        object = String.valueOf(String.valueOf(object)) + ":" + arrstring[i];
                    }
                    Class2525.oiy.vua();
                    Class203.npj().add(new Class200(arrstring[0], (String)object));
                }
            }
            bufferedReader.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void jmh() {
        try {
            PrintWriter printWriter = new PrintWriter(rcn);
            Class2525.oiy.vua();
            for (Class200 class200 : Class203.npj()) {
                if (class200.npz().equals("")) {
                    printWriter.println(String.valueOf(String.valueOf(class200.npc())) + ":" + class200.npq());
                    continue;
                }
                printWriter.println(String.valueOf(String.valueOf(class200.npz())) + "    " + class200.npc() + ":" + class200.npq());
            }
            printWriter.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public void jmr() {
        File file = new File(String.valueOf(String.valueOf(rqe)) + "/blocks.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            for (int n : Class151.jce()) {
                printWriter.print(String.valueOf(String.valueOf(String.valueOf(n))) + "\n");
            }
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void jmf() throws IOException {
        File file = new File(String.valueOf(String.valueOf(rqe)) + "/blocks.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((string = bufferedReader.readLine()) != null) {
                try {
                    int n = Integer.valueOf(string);
                    Class151.jce().add(n);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
        }
    }

    public void jmm() {
        File file = new File(String.valueOf(String.valueOf(rqe)) + "/friends.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            for (Class1639 class1639 : Class1632.nrb()) {
                printWriter.print(String.valueOf(class1639.ce()) + ":" + class1639.nri() + "\n");
            }
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void jmg() throws IOException {
        File file = new File(String.valueOf(String.valueOf(rqe)) + "/friends.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((string = bufferedReader.readLine()) != null) {
                if (!string.contains(":")) continue;
                String[] arrstring = string.split(":");
                if (string.length() < 2) continue;
                Class1639 class1639 = new Class1639(arrstring[0], arrstring[1]);
                Class1632.nrb().add(class1639);
            }
        }
    }

    public void jma() {
        File file = new File(String.valueOf(String.valueOf(rqe)) + "/keys.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            for (Class1611 class1611 : Class1609.nzn()) {
                String string = class1611.xj() < 0 ? "None" : Keyboard.getKeyName((int)class1611.xj());
                printWriter.write(String.valueOf(String.valueOf(class1611.ce())) + ":" + string + "\n");
            }
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void jml() throws IOException {
        File file = new File(String.valueOf(String.valueOf(rqe)) + "/keys.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((string = bufferedReader.readLine()) != null) {
                if (!string.contains(":")) continue;
                String[] arrstring = string.split(":");
                Class1611 class1611 = Class1609.px(arrstring[0]);
                int n = Keyboard.getKeyIndex((String)arrstring[1]);
                if (class1611 == null || n == -1) continue;
                class1611.zn(n);
            }
        }
    }

    public void jmb() {
        File file = new File(String.valueOf(String.valueOf(rqe)) + "/mods.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            for (Class1611 class1611 : Class1609.nzn()) {
                printWriter.print(String.valueOf(String.valueOf(class1611.ce())) + ":" + class1611.nji() + "\n");
            }
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void jyd() throws IOException {
        File file = new File(String.valueOf(String.valueOf(rqe)) + "/mods.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((string = bufferedReader.readLine()) != null) {
                if (!string.contains(":")) continue;
                String[] arrstring = string.split(":");
                Class1611 class1611 = Class1609.px(arrstring[0]);
                boolean bl = Boolean.parseBoolean(arrstring[1]);
                if (class1611 == null) continue;
                class1611.p(bl, false);
            }
        }
    }

    public void jmi() {
        File file = new File(String.valueOf(String.valueOf(rqe)) + "/values.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            for (Value Value : Value.obb) {
                String string = Value.vus();
                if (Value.obu) {
                    printWriter.print(String.valueOf(String.valueOf(string)) + ":b:" + Value.vut() + "\n");
                    continue;
                }
                if (Value.obt) {
                    printWriter.print(String.valueOf(String.valueOf(string)) + ":d:" + Value.vut() + "\n");
                    continue;
                }
                if (!Value.obh) continue;
                printWriter.print(String.valueOf(String.valueOf(string)) + ":s:" + Value.vuq() + ":" + Value.vuj() + "\n");
            }
            printWriter.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void jyn() throws IOException {
        File file = new File(String.valueOf(String.valueOf(rqe)) + "/values.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            String string;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((string = bufferedReader.readLine()) != null) {
                if (!string.contains(":")) continue;
                String[] arrstring = string.split(":");
                for (Value Value : Value.obb) {
                    if (!arrstring[0].equalsIgnoreCase(Value.vus())) continue;
                    if (Value.obu && arrstring[1].equalsIgnoreCase("b")) {
                        Value.k(Boolean.parseBoolean(arrstring[2]));
                        continue;
                    }
                    if (Value.obt && arrstring[1].equalsIgnoreCase("d")) {
                        Value.k(Double.parseDouble(arrstring[2]));
                        continue;
                    }
                    if (!Value.obh || !arrstring[1].equalsIgnoreCase("s") || !arrstring[2].equalsIgnoreCase(Value.vuq())) continue;
                    Value.tp(Integer.parseInt(arrstring[3]));
                }
            }
        }
    }

    public static void ry() {
        if (!rcd.exists()) {
            rcd.mkdir();
        }
        Class169.jmk();
        Class169.jmt();
    }
}

