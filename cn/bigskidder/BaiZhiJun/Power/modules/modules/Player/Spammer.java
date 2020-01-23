/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import java.io.IOException;
import java.util.Random;
import client87.client86.Class2525;
import client87.client86.Value;
import client87.client86.client087.minecraft140.Class1657;
import client87.client86.minecraft30.minecraft993.Class964;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2256;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package4133.Class0;

public class Class1048
extends Module {
    Class964 ww = new Class964();
    private Value<Double> we = new Value<Double>("Spammer_Random", 6.0, 1.0, 36.0, 1.0);
    public static String ed = "Power " + Class2525.oix + " Client";

    public Class1048() {
        super("Spammer", Category.Category.Player);
        try {
            Class1657.jyv();
        }
        catch (IOException iOException) {
            iOException.printStackTragetName();
        }
    }

    @EventTarget
    public void d(Class2256 class2256) {
        if (this.ww.no(8000L)) {
            Minecraft.thePlayer.zn(" [" + Class1048.s(this.we.vut()) + "]\u2192\u2192\u2192" + ed + "\u2190\u2190\u2190 [" + Class1048.s(this.we.vut()) + "]");
            this.ww.npr();
        }
    }

    public static String s(double d) {
        String string = "zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        int n = 0;
        while ((double)n < d) {
            int n2 = random.nextInt(62);
            stringBuffer.append(string.charAt(n2));
            ++n;
        }
        return stringBuffer.toString();
    }
}

