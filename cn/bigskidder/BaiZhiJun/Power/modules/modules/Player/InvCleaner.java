/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package cn.bigskidder.BaiZhiJun.Power.modules.Render.Player;

import com.darkmagician6.eventapi.EventTarget;
import com.google.common.collect.Multimap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import client87.client86.Value;
import client87.client86.minecraft30.minecraft993.Class953;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import client87.client86.package858.Class2256;
import net.minecraft.client.Minecraft;
import net.minecraft.client.package0.Class970;
import net.minecraft.client.client03.Class1226;
import net.minecraft.client.package4133.Class0;
import net.minecraft.client52.Class892;
import net.minecraft.net29.Class2001;
import net.minecraft.net29.Class2002;
import net.minecraft.net29.Class2045;
import net.minecraft.net29.Class2049;
import net.minecraft.net29.Class2052;
import net.minecraft.net29.Class2059;
import net.minecraft.net29.Class2065;
import net.minecraft.net29.Class2070;
import net.minecraft.net29.Class2074;
import net.minecraft.net29.Class2076;
import net.minecraft.net29.Class2099;
import net.minecraft.net29.Class2139;
import net.minecraft.net29.Class2149;
import net.minecraft.net579.Class2418;
import net.minecraft.net579.Class2421;
import net.minecraft.net9.Class1879;
import net.minecraft.net9.net530.Entity;
import net.minecraft.net9.net530.Class859;
import net.minecraft.net9.package714.net700.Class461;
import net.minecraft.net99.Class1449;
import net.minecraft.net99.Class1467;
import net.minecraft.package4.Class31;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1049
extends Module {
    public final Set<Integer> iy = new HashSet<Integer>();
    Class953 ik = new Class953();
    public static final Minecraft it = Minecraft.nmk();
    public static final Random ih = new Random();
    private int ir;
    private double if;
    private boolean im;
    public Class2059[] ig;
    public Class2059 ia;
    public Class2059 il;
    public Class2059 ib;
    public Value<Double> ii = new Value<Double>("InvCleaner_CleanSpeed", 30.0, 1.0, 20.0, 1.0);
    public Value<Boolean> iw = new Value<Boolean>("InvCleaner_OpenInv", true);
    public Value<Boolean> ie = new Value<Boolean>("InvCleaner_Uhc", false);
    public Value<Boolean> wd = new Value<Boolean>("InvCleaner_AutoDisable", true);

    public Class1049() {
        super("InvCleaner", Category.Category.Player);
        Arrays.stream(new int[]{404, 344, 280, 287, 318, 288, 384, 116, 54, 332, 145}).forEach(this.iy::add);
    }

    @Override
    public void onDisable() {
        this.ir = 9;
        super.onDisable();
    }

    public boolean ke() {
        return this.iw.vut();
    }

    public int td() {
        return this.ii.vut().intValue();
    }

    public boolean tn() {
        return this.wd.vut();
    }

    @EventTarget
    public void d(Class2256 class2256) {
        if (this.ke() && this.pst.vrq == null) {
            return;
        }
        if (Minecraft.thePlayer.uw % this.td() == 0) {
            this.ig = this.ttoggle();
            this.ia = this.d(Class2070.class, Comparator.comparingDouble(this::o));
            this.il = this.d(Class2149.class, Comparator.comparingDouble(this::y));
            this.ib = this.d(Class2052.class, Comparator.comparingDouble(this::u));
            Optional<Class1449> optional = Minecraft.thePlayer.nhi.sau.stream().filter(Class1449::c).filter(class1449 -> Arrays.stream(Minecraft.thePlayer.nhl.getNetworkManager).noneMatch(class1449.q()::equals)).filter(class1449 -> !class1449.q().equals(Minecraft.thePlayer.vtoggle())).filter(class1449 -> this.x(class1449.q())).findFirst();
            if (optional.isPresent()) {
                this.nc(optional.get().slf);
            } else if (this.tn()) {
                this.toggle(false);
            }
        }
    }

    public void nc(int n) {
        Minecraft.vhx.d(0, n, 1, 4, Minecraft.thePlayer);
    }

    public boolean x(Class2059 class2059) {
        Class2001 class2001 = class2059.vrw();
        return this.iy.contains(Class2001.u(class2001)) || class2001 instanceof Class2052 && !this.ib.equals(class2059) || class2001 instanceof Class2099 && !this.il.equals(class2059) || class2001 instanceof Class2076 || class2001 instanceof Class2139 || class2001 instanceof Class2049 || class2001 instanceof Class2045 && !(class2001 instanceof Class2074) || class2001 instanceof Class2070 && !this.ia.equals(class2059) || class2001 instanceof Class2002 && !this.ig[((Class2002)class2001).ymr].equals(class2059) || class2001 instanceof Class2065 && this.t(class2059);
    }

    public Class2059 d(Class<? extends Class2001> class_, Comparator comparator) {
        Optional<Class2059> optional = Minecraft.thePlayer.nhi.sau.stream().matoggle(Class1449::q).filter(Objects::nonNull).filter(class2059 -> class2059.vrw().getClass().equals((Object)class_)).max(comparator);
        return optional.orElse(null);
    }

    public Class2059[] ttoggle() {
        Class2059[] arrclass2059 = new Class2059[4];
        List list = Minecraft.thePlayer.nhi.sau.stream().filter(Class1449::c).matoggle(Class1449::q).filter(class2059 -> class2059.vrw() instanceof Class2002).collect(Collectors.toList());
        for (Class2059 class20592 : list) {
            Class2002 class2002 = (Class2002)class20592.vrw();
            Class2059 class20593 = arrclass2059[class2002.ymr];
            if (class20593 != null && !(this.k(class20592) > this.k(class20593))) continue;
            arrclass2059[class2002.ymr] = class20592;
        }
        return arrclass2059;
    }

    public double o(Class2059 class2059) {
        double d = 0.0;
        Optional optional = class2059.vmh().values().stream().findFirst();
        if (optional.isPresent()) {
            d = ((Class461)optional.get()).pcu();
        }
        return d += (double)Class31.d(class2059, Class1879.st);
    }

    public double u(Class2059 class2059) {
        double d = 0.0;
        Optional optional = class2059.vmh().values().stream().findFirst();
        if (optional.isPresent()) {
            d = ((Class461)optional.get()).pcu();
        }
        return d += (double)Class31.d(class2059, Class1879.st);
    }

    public double y(Class2059 class2059) {
        double d = 0.0;
        Optional optional = class2059.vmh().values().stream().findFirst();
        if (optional.isPresent()) {
            d = ((Class461)optional.get()).pcu();
        }
        return d += (double)Class31.d(class2059, Class1879.st);
    }

    public double k(Class2059 class2059) {
        int n = ((Class2002)class2059.vrw()).ymf;
        return n += Class31.d(new Class2059[]{class2059}, Class892.nj(Minecraft.thePlayer));
    }

    public boolean t(Class2059 class2059) {
        Class2065 class2065 = (Class2065)class2059.vrw();
        List<Class2421> list = class2065.po(class2059);
        return list.stream().matoggle(class2421 -> Class2418.vey[class2421.nli()]).anyMatch(Class2418::nlm);
    }
}

