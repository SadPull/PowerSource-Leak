/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.World;

import com.darkmagician6.eventapi.EventTarget;
import java.util.Objects;
import org.lwjgl.input.Keyboard;
import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2206;
import client87.client86.package858.Class2256;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class1821;
import net.minecraft.client.package0.Class970;
import net.minecraft.client.minecraft860.Class1027;
import net.minecraft.client.minecraft860.Class1029;
import net.minecraft.client.package4133.Class0;

public class Class567
extends Module {
    public Value<Boolean> oml = new Value<Boolean>("InvMove_NEW", false);

    public Class567() {
        super("InvMove", Category.Category.World);
    }

    @EventTarget
    public void d(Class2256 class2256) {
        block2 : {
            Class1027[] arrclass1027;
            block3 : {
                if (this.oml.vut().booleanValue()) break block2;
                arrclass1027 = new Class1027[]{this.pst.vrf.usz, this.pst.vrf.usc, this.pst.vrf.usq, this.pst.vrf.uss, this.pst.vrf.usu, this.pst.vrf.usx};
                if (this.pst.vrq == null || this.pst.vrq instanceof Class1821) break block3;
                for (Class1027 class1027 : arrclass1027) {
                    Class1027.x(class1027.vkq(), Keyboard.isKeyDown((int)class1027.vkq()));
                }
                break block2;
            }
            if (!Objects.isNull(this.pst.vrq)) break block2;
            for (Class1027 class1027 : arrclass1027) {
                if (Keyboard.isKeyDown((int)class1027.vkq())) continue;
                Class1027.x(class1027.vkq(), false);
            }
        }
    }

    @EventTarget
    public void v(Class2206 class2206) {
        block2 : {
            Class1027[] arrclass1027;
            block3 : {
                if (!this.oml.vut().booleanValue()) break block2;
                arrclass1027 = new Class1027[]{this.pst.vrf.uss, this.pst.vrf.usq, this.pst.vrf.usc, this.pst.vrf.usz, this.pst.vrf.usx, this.pst.vrf.usu};
                if (this.pst.vrq == null || this.pst.vrq instanceof Class1821) break block3;
                Class1027[] arrclass10272 = arrclass1027;
                int n = arrclass1027.length;
                for (int i = 0; i < n; ++i) {
                    Class1027 class1027 = arrclass10272[i];
                    class1027.ukj = Keyboard.isKeyDown((int)class1027.vkq());
                }
                break block2;
            }
            if (!Objects.isNull(this.pst.vrq)) break block2;
            Class1027[] arrclass10273 = arrclass1027;
            int n = arrclass1027.length;
            for (int i = 0; i < n; ++i) {
                Class1027 class1027 = arrclass10273[i];
                if (Keyboard.isKeyDown((int)class1027.vkq())) continue;
                Class1027.x(class1027.vkq(), false);
            }
        }
    }

    public static void jz(float f) {
        Minecraft.nmk();
        Minecraft.thePlayer.ow = f;
    }

    public static void jq(float f) {
        Minecraft.nmk();
        Minecraft.thePlayer.oi = f;
    }
}

