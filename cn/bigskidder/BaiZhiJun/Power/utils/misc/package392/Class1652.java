/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.utils.package393.package392;

import java.awt.Font;
import java.io.InputStream;
import java.io.PrintStream;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import package3.package2.package1.Class2556;
import package3.package2.package1.package474.Class1948;
import package3.package2.package1.package474.Class1952;
import package3.package2.package152.Class421;

public abstract class Class1652 {
    public static Class1655 jpe = new Class1655(Class1652.cn(16), true, true);
    public static Class1655 jvd = new Class1655(Class1652.cn(18), true, true);
    public static Class1655 jvn = new Class1655(Class1652.cn(28), true, true);
    public static Class1655 jvp = new Class1655(Class1652.cp(16), true, true);
    public static Class1655 jvv = new Class1655(Class1652.cv(12), true, true);
    public static Class1655 jvj = new Class1655(Class1652.cv(14), true, true);
    public static Class1655 jvz = new Class1655(Class1652.cv(15), true, true);
    public static Class1655 jvq = new Class1655(Class1652.cv(18), true, true);
    public static Class1655 jvc = new Class1655(Class1652.cv(20), true, true);
    public static Class1655 jvs = new Class1655(Class1652.cv(25), true, true);
    public static Class1655 jvx = new Class1655(Class1652.cj(16), true, true);
    public static Class1655 jvo = new Class1655(Class1652.cz(12), true, true);
    public static Class1655 jvu = new Class1655(Class1652.cz(17), true, true);
    public static Class1655 jvy = new Class1655(Class1652.cz(18), true, true);

    private static Font cn(int n) {
        Font font;
        try {
            InputStream inputStream = Class2556.nmk().ngj().g(new Class421("Power/fonts/raleway.ttf")).pxy();
            font = Font.createFont(0, inputStream);
            font = font.deriveFont(0, n);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Error loading font");
            font = new Font("default", 0, n);
        }
        return font;
    }

    private static Font cp(int n) {
        Font font;
        try {
            InputStream inputStream = Class2556.nmk().ngj().g(new Class421("Power/fonts/Power.ttf")).pxy();
            font = Font.createFont(0, inputStream);
            font = font.deriveFont(0, n);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Error loading font");
            font = new Font("default", 0, n);
        }
        return font;
    }

    private static Font cv(int n) {
        Font font;
        try {
            InputStream inputStream = Class2556.nmk().ngj().g(new Class421("Power/fonts/tahoma.ttf")).pxy();
            font = Font.createFont(0, inputStream);
            font = font.deriveFont(0, n);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Error loading font");
            font = new Font("default", 0, n);
        }
        return font;
    }

    private static Font cj(int n) {
        Font font;
        try {
            InputStream inputStream = Class2556.nmk().ngj().g(new Class421("Power/fonts/Sigma.ttf")).pxy();
            font = Font.createFont(0, inputStream);
            font = font.deriveFont(0, n);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Error loading font");
            font = new Font("default", 0, n);
        }
        return font;
    }

    private static Font cz(int n) {
        Font font;
        try {
            InputStream inputStream = Class2556.nmk().ngj().g(new Class421("Power/fonts/simpleton.ttf")).pxy();
            font = Font.createFont(0, inputStream);
            font = font.deriveFont(0, n);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Error loading font");
            font = new Font("default", 0, n);
        }
        return font;
    }
}

