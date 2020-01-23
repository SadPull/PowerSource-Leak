/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package1087.package2140;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import cn.bigskidder.BaiZhiJun.Power.Class2525;
import cn.bigskidder.BaiZhiJun.Power.Value;
import cn.bigskidder.BaiZhiJun.Power.package1087.Class1818;
import cn.bigskidder.BaiZhiJun.Power.package185.Class1610;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.utils.Class169;
import cn.bigskidder.BaiZhiJun.Power.utils.package2993.Class964;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1609;
import cn.bigskidder.BaiZhiJun.Power.package639.Class1611;
import package3.package2.package1.Class2556;

public class Class1633
extends Class1818 {
    public Class964 hhf = new Class964();

    public Class1633(String[] arrstring) {
        super(arrstring);
        this.e("-Config <Hypixel>");
    }

    @Override
    public void d(String[] arrstring) {
        if (arrstring.length < 2) {
            Class1386.d(this.tz(), Class1610.heq);
        } else if (arrstring.length > 1 && arrstring[1].equalsIgnoreCase("hypixel")) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Writer writer;
            Object object5;
            Class1611.pxz = true;
            Class1609.px("HUD").ni(false);
            try {
                URL uRL = new URL(Class2556.vmi);
                object3 = uRL.openConnection();
                object4 = new BufferedReader(new InputStreamReader(((URLConnection)object3).getInputStream()));
                object5 = new File(String.valueOf(String.valueOf(Class169.rqe)) + "/Hypixelmods.txt");
                if (!((File)object5).exists()) {
                    ((File)object5).createNewFile();
                }
                object = new FileWriter(((File)object5).getAbsoluteFile());
                writer = new BufferedWriter((Writer)object);
                while ((object2 = ((BufferedReader)object4).readLine()) != null) {
                    writer.write(String.valueOf(object2) + "\n");
                }
                ((BufferedWriter)writer).close();
                ((BufferedReader)object4).close();
            }
            catch (MalformedURLException malformedURLException) {
                malformedURLException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            try {
                object3 = new URL(Class2556.vmw);
                object4 = ((URL)object3).openConnection();
                object2 = new BufferedReader(new InputStreamReader(((URLConnection)object4).getInputStream()));
                object = new File(String.valueOf(String.valueOf(Class169.rqe)) + "/Hypixelvaluse.txt");
                if (!((File)object).exists()) {
                    ((File)object).createNewFile();
                }
                writer = new FileWriter(((File)object).getAbsoluteFile());
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                while ((object5 = ((BufferedReader)object2).readLine()) != null) {
                    bufferedWriter.write(String.valueOf(object5) + "\n");
                }
                bufferedWriter.close();
                ((BufferedReader)object2).close();
            }
            catch (MalformedURLException malformedURLException) {
                malformedURLException.printStackTrace();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            try {
                this.jyd();
                this.jyn();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            if (Class2525.oic.contains("You_is_LLL")) {
                Class1609.px("NoRotate").ni(true);
            }
            Class1611.pxz = false;
        } else {
            Class1386.d(this.tz(), Class1610.heq);
        }
    }

    public void jyd() throws IOException {
        File file = new File(String.valueOf(String.valueOf(Class169.rqe)) + "/Hypixelmods.txt");
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

    public void jyn() throws IOException {
        File file = new File(String.valueOf(String.valueOf(Class169.rqe)) + "/Hypixelvaluse.txt");
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
}

