/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 */
package cn.bigskidder.BaiZhiJun.Power.utils;

import com.google.gson.Gson;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1392;
import cn.bigskidder.BaiZhiJun.Power.utils.Class886;
import package3.package2.package1.Class2556;
import package3.package2.package1.package82.Class385;
import package3.package2.package1.package82.Class475;
import package3.package2.package1.package82.package356.Class2492;
import package3.package2.package1.package82.package356.Class2512;
import package3.package2.package152.Class421;

public class Class136 {
    public static String rzw;

    public static Class421 jfi() {
        Gson gson = new Gson();
        rzw = Class1392.c(Class2556.vmm, "TP[", "]");
        MinecraftProfileTexture minecraftProfileTexture = new MinecraftProfileTexture(rzw, new HashMap());
        Class421 class421 = new Class421("bingWallPaper/" + minecraftProfileTexture.getHash());
        Class886 class886 = new Class886();
        Class385 class385 = new Class385(null, minecraftProfileTexture.getUrl(), null, class886);
        Class2556.nmk().ngv().d(class421, class385);
        return class421;
    }

    public void jfw() {
    }
}

