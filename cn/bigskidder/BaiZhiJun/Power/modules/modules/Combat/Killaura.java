package cn.bigskidder.BaiZhiJun.Power.modules.Render.Combat;

import com.darkmagician6.eventapi.EventTarget;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C02PacketUseEntity;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C07PacketPlayerDigging;
import net.minecraft.network.play.client.C08PacketPlayerBlockPlacement;
import org.lwjgl.opengl.GL11;
import client87.client86.Value;
import cn.bigskidder.BaiZhiJun.Power.modules.Module;
import cn.bigskidder.BaiZhiJun.Power.modules.Category;
import cn.bigskidder.BaiZhiJun.Power.modules.Render.Player.Class1035;

public class Killaura
extends Module {
    float kmq;
    Class964 kmc = new Class964();
    public ArrayList<Entity> kms = new ArrayList();
    public ArrayList<Entity> kmx = new ArrayList();
    public static Entity kmo = null;
    public static Entity kmu = null;
    public static Entity kmy = null;
    public Value<String> kmk = new Value("Killaura", "Mode", 0);
    public Value<String> kmt = new Value("Killaura", "Priority", 0);
    public Value<Double> kmh = new Value<Double>("Killaura_Reach", 4.2, 3.0, 8.0, 0.1);
    public Value<Double> kmr = new Value<Double>("Killaura_CPS", 10.0, 1.0, 20.0, 1.0);
    public Value<Double> kmf = new Value<Double>("Killaura_TurnSpeed", 120.0, 10.0, 300.0, 5.0);
    public Value<Double> kmm = new Value<Double>("Killaura_SwitchDelay", 11.0, 10.0, 50.0, 1.0);
    public Value<Double> kmg = new Value<Double>("Killaura_HurtTime", 8.0, 1.0, 10.0, 1.0);
    public Value<Double> kma = new Value<Double>("Killaura_Mistakes", 5.0, 0.0, 20.0);
    public Value<Double> kml = new Value<Double>("Killaura_CrackSize", 1.0, 0.0, 10.0, 1.0);
    public Value<Boolean> kmb = new Value<Boolean>("Killaura_AutoBlock", true);
    public Value<Boolean> kmi = new Value<Boolean>("Killaura_targetHP", false);
    public Value<Boolean> kmw = new Value<Boolean>("Killaura_targetESP", true);
    public Value<Boolean> kme = new Value<Boolean>("Killaura_targetEXHUD", true);
    public Value<Boolean> kgd = new Value<Boolean>("Killaura_HeadRotations", true);
    public Value<Boolean> kgn = new Value<Boolean>("Killaura_Players", true);
    public Value<Boolean> kgp = new Value<Boolean>("Killaura_Invisibles", false);
    public Value<Boolean> kgv = new Value<Boolean>("Killaura_Animals", false);
    public Value<Boolean> kgj = new Value<Boolean>("Killaura_Mobs", false);
    public Value<Boolean> kgz = new Value<Boolean>("Killaura_RayTrace", false);
    public Value<Boolean> kgq = new Value<Boolean>("Killaura_AutoDisable", true);
    public static Value<Boolean> kgc = new Value<Boolean>("Killaura_Rotary animation", false);
    private Class964 kgs = new Class964();
    private boolean kgx = false;
    private boolean kgo = false;
    private Random kgu = new Random();
    private long kgy;
    private int kgk = 0;
    private float kgt = 0.0f;
    private float kgh = 0.0f;
    private int kgr = 0;
    private float kgf;
    private int kgm;
    public static float[] kgg;
    public static float kga;
    public static float kgl;
    public static boolean kgb;
    public static int kgi;
    public static int kgw;
    private Class964 kge = new Class964();

    public Class2173() {
        super("Killaura", Category.Combat);
        this.psh = this.kmh;
        this.kmk.obg.add("Switch");
        this.kmk.obg.add("Single");
        this.kmt.obg.add("Health");
        this.kmt.obg.add("Reach");
    }

    @EventTarget
    public void v(Class2204 class2204) {
        Class1815 class1815;
        if (this.kme.vut().booleanValue()) {
            class1815 = new Class1815(this.pst);
            Class171.k(class1815);
        }
        if (this.kmi.vut().booleanValue() && kmo != null) {
            int n;
            class1815 = new Class1815(this.pst);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            this.pst.ngv().n(new Class421("textures/gui/icons.png"));
            int n2 = Class608.jn(kmo.po());
            boolean bl = this.pst.vrt.onDisablew > (long)this.pst.vrt.onDisablez && (this.pst.vrt.onDisablew - (long)this.pst.vrt.onDisablez) / 3L % 2L == 1L;
            int n3 = this.pst.vrt.onDisableb;
            this.pst.vrt.onDisabled.setSeed(this.pst.vrt.onDisablez * 312871);
            Class445 class445 = kmo.d(Class1877.vl);
            int n4 = class1815.jvs() / 2 - 44;
            int n5 = class1815.jvs() / 2 + 91;
            int n6 = class1815.jvx() - 242;
            float f = (float)class445.pcq();
            float f2 = kmo.vw();
            int n7 = Class608.jn((f + f2) / 2.0f / 10.0f);
            int n8 = Math.max(10 - (n7 - 2), 3);
            int n9 = n6 - (n7 - 1) * n8 + 40;
            float f3 = f2;
            int n10 = kmo.pf();
            int n11 = -1;
            if (kmo.d(Class2418.vew)) {
                n11 = this.pst.vrt.onDisablez % Class608.jn(f + 5.0f);
            }
            for (n = 0; n < 10; ++n) {
                if (n10 <= 0) continue;
                int n12 = n4 + n * 9;
                if (n * 2 + 1 < n10) {
                    this.pst.vrt.u(n12, n9, 34, 9, 9, 9);
                }
                if (n * 2 + 1 == n10) {
                    this.pst.vrt.u(n12, n9, 25, 9, 9, 9);
                }
                if (n * 2 + 1 <= n10) continue;
                this.pst.vrt.u(n12, n9, 16, 9, 9, 9);
            }
            for (int i = Class608.jn((float)((f + f2) / 2.0f)) - 1; i >= 0; --i) {
                n = 16;
                if (kmo.d(Class2418.jdc)) {
                    n += 36;
                } else if (kmo.d(Class2418.jds)) {
                    n += 72;
                }
                boolean bl2 = false;
                if (bl) {
                    bl2 = true;
                }
                int n13 = Class608.jn((float)(i + 1) / 10.0f) - 1;
                int n14 = n4 + i % 10 * 9;
                int n15 = n6 - n13 * n8 + 50;
                if (n2 <= 4) {
                    n15 += this.pst.vrt.onDisabled.nextInt(2);
                }
                if (i == n11) {
                    n15 -= 2;
                }
                int n16 = 0;
                if (Class2173.kmo.ok.lt().hd()) {
                    n16 = 5;
                }
                this.pst.vrt.u(n14, n15, 16 + (Class2173.kmo.jb > 1 ? 1 : 0) * 9, 9 * n16, 9, 9);
                if (bl) {
                    if (i * 2 + 1 < n3) {
                        this.pst.vrt.u(n14, n15, n + 54, 9, 9, 9);
                    }
                    if (i * 2 + 1 == n3) {
                        this.pst.vrt.u(n14, n15, n + 63, 9, 9, 9);
                    }
                }
                if (f3 <= 0.0f) {
                    if (i * 2 + 1 < n2) {
                        this.pst.vrt.u(n14, n15, n + 36, 9 * n16, 9, 9);
                    }
                    if (i * 2 + 1 != n2) continue;
                    this.pst.vrt.u(n14, n15, n + 45, 9 * n16, 9, 9);
                    continue;
                }
                if (f3 == f2 && f2 % 2.0f == 1.0f) {
                    this.pst.vrt.u(n14, n15, n + 153, 9 * n16, 9, 9);
                } else {
                    this.pst.vrt.u(n14, n15, n + 144, 9 * n16, 9, 9);
                }
                f3 -= 2.0f;
            }
            String string = "\u00a7c[\u00a7r " + kmo.getName() + " \u00a7c]";
            this.pst.vrj.v(string, class1815.jvs() / 2 - this.pst.vrj.jj(string) / 2, n9 - 10, 16777215);
        }
    }

    @EventTarget
    public void n(Class2227 class2227) {
        Color color = new Color(Class1386.s(Class140.jcj(), 1.0f));
        if (Class2173.kmo.jb > 0) {
            color = new Color(-1618884);
        }
        if (this.kmw.vut().booleanValue()) {
            this.pst.ngf();
            double d = Class2173.kmo.uf + (Class2173.kmo.of - Class2173.kmo.uf) * (double)this.pst.vhf.odc - Class1543.jxf;
            this.pst.ngf();
            double d2 = Class2173.kmo.um + (Class2173.kmo.om - Class2173.kmo.um) * (double)this.pst.vhf.odc - Class1543.jxm;
            this.pst.ngf();
            double d3 = Class2173.kmo.ug + (Class2173.kmo.og - Class2173.kmo.ug) * (double)this.pst.vhf.odc - Class1543.jxg;
            if (kmo != null) {
                double d4 = kmo.cg() ? 0.25 : 0.0;
                double d5 = Class2173.kmo.sy().xay + 0.2 - Class2173.kmo.sy().xax - 0.02;
                double d6 = 0.5;
                GL11.glPushMatrix();
                GL11.glEnable((int)3042);
                GL11.glBlendFunc((int)770, (int)771);
                GL11.glTranslated((double)((d -= 0.5) + 0.5), (double)((d2 += (double)kmo.nk() + 0.35 - d4) + 0.5), (double)((d3 -= 0.5) + 0.5));
                GL11.glRotated((double)(-Class2173.kmo.oi % 360.0f), (double)0.0, (double)1.0, (double)0.0);
                GL11.glTranslated((double)(-(d + 0.5)), (double)(-(d2 + 0.5)), (double)(-(d3 + 0.5)));
                GL11.glDisable((int)3553);
                GL11.glEnable((int)2848);
                GL11.glDisable((int)2929);
                GL11.glDepthMask((boolean)false);
                GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)1.0f);
                GL11.glLineWidth((float)2.0f);
                Class1384.h(new Class614(d, d2 + 0.02, d3, d + 1.0, d2 - d5, d3 + 1.0));
                Class1384.az(Class1386.s(Class140.jcj(), 0.5f));
                GL11.glColor4f((float)((float)color.getRed() / 255.0f), (float)((float)color.getGreen() / 255.0f), (float)((float)color.getBlue() / 255.0f), (float)0.5f);
                GL11.glDisable((int)2848);
                GL11.glEnable((int)3553);
                GL11.glEnable((int)2929);
                GL11.glDepthMask((boolean)true);
                GL11.glDisable((int)3042);
                GL11.glPopMatrix();
            }
        }
    }

    @EventTarget
    public void d(Class2206 class2206) {
        if (Minecraft.thePlayer.uw % this.kmm.vut().intValue() == 0 && this.kms.size() > 1) {
            ++this.kgm;
        }
        if (!this.kms.isEmpty() && this.kgm >= this.kms.size()) {
            this.kgm = 0;
        }
        this.kgx = false;
        this.wm();
        this.j(class2206);
        this.vev();
        if (kmo != null) {
            float[] arrf;
            kmy = kmo;
            if (!Minecraft.vte) {
                arrf = Class2173.pj(kmo);
                class2206.tp = arrf[0];
                class2206.tv = arrf[1];
            } else {
                arrf = this.pq(kmo);
                float[] arrf2 = Class2173.d(kgg, arrf, (float)(Math.random() * ((double)this.kmf.vut().floatValue() / 3.0 * 1.2 - (double)this.kmf.vut().floatValue() / 3.0 * 0.8) + (double)this.kmf.vut().floatValue() / 3.0 * 0.8));
                class2206.tp = arrf2[0];
                class2206.tv = arrf2[1];
                Class2173.nn(arrf2[0], arrf2[1]);
            }
        } else {
            this.kms.clear();
            this.kmx.clear();
            this.kgy = System.currentTimeMillis();
            if (this.kgo) {
                Minecraft.getNetworkManager().sendPacket(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, Class891.xrk, Class910.xkq));
                Minecraft.thePlayer.nre = 0;
                this.kgo = false;
            }
        }
        if ((double)Minecraft.thePlayer.u(kmo) < this.kmh.vut()) {
            int n = 0;
            while ((double)n < this.kml.vut()) {
                this.pst.vrn.d(kmo, Class889.xtu);
                this.pst.vrn.d(kmo, Class889.xto);
                ++n;
            }
        }
    }

    @EventTarget
    public void n(Class2256 class2256) {
        if (kgb && ++kgw > kgi) {
            Class2173.vej();
        }
    }

    @EventTarget
    public void c(Class2228 class2228) {
        Packet packet = class2228.xv();
        if (packet instanceof C03PacketPlayer) {
            C03PacketPlayer c03PacketPlayer = (C03PacketPlayer)packet;
            if (kgb) {
                c03PacketPlayer.yaw = kga;
                c03PacketPlayer.pitch = kgl;
            }
            if (packet instanceof C03PacketPlayer.C05PacketPlayerLook || packet instanceof C03PacketPlayer.C06PacketPlayerPosLook) {
                kgg = new float[]{c03PacketPlayer.yaw, c03PacketPlayer.pitch};
            }
        }
    }

    public static double t(double d, double d2) {
        return ((d - d2) % 360.0 + 540.0) % 360.0 - 180.0;
    }

    public static float[] d(float[] arrf, float[] arrf2, float f) {
        double d = Class2173.t(arrf2[0], arrf[0]);
        double d2 = Class2173.t(arrf2[1], arrf[1]);
        arrf[0] = (float)((double)arrf[0] + (d > (double)f ? (double)f : (d < (double)(-f) ? (double)(-f) : d)));
        arrf[1] = (float)((double)arrf[1] + (d2 > (double)f ? (double)f : (d2 < (double)(-f) ? (double)(-f) : d2)));
        return arrf;
    }

    private static int ja(int n, int n2) {
        return -n2 + (int)(Math.random() * (double)(n - -n2 + 1));
    }

    public static float[] pj(EntityLivingBase EntityLivingBase) {
        double d;
        if (EntityLivingBase == null) {
            return null;
        }
        double d2 = EntityLivingBase.of - Class1390.jrtoggle().of;
        double d3 = EntityLivingBase.og - Class1390.jrtoggle().og;
        if (EntityLivingBase instanceof Entity) {
            Entity Entity = (Entity)EntityLivingBase;
            d = Entity.om + ((double)Entity.nk() - 0.4) - (Class1390.jrtoggle().om + (double)Class1390.jrtoggle().nk());
        } else {
            d = (EntityLivingBase.un.xax + EntityLivingBase.un.xay) / 2.0 - (Class1390.jrtoggle().om + (double)Class1390.jrtoggle().nk());
        }
        double d4 = Class608.nd(d2 * d2 + d3 * d3);
        float f = (float)(Math.atan2(d3, d2) * 180.0 / 3.141592653589793) - 90.0f;
        float f2 = (float)(-(Math.atan2(d, d4) * 180.0 / 3.141592653589793));
        return new float[]{f, f2};
    }

    private void vetoggle() {
        int n = this.kmr.vut().intValue();
        int n2 = (20 / n + Class2173.ja(1, 2)) * 50;
        int n3 = 1000 / n + this.kgu.nextInt(100) - 50;
        if ((double)Minecraft.thePlayer.u(kmo) <= this.kmh.vut() && this.kgr == 0 && this.kgs.no((Minecraft.vte ? n3 : n2 - 20) + this.kgu.nextInt(50))) {
            boolean bl = false;
            this.kgs.npr();
            if ((double)Class2173.kmo.jb > this.kmg.vut() || new Random().nextInt(100) < this.kma.vut().intValue()) {
                bl = true;
            }
            if (Minecraft.thePlayer.bf() || Minecraft.thePlayer.vtoggle() != null && Minecraft.thePlayer.vtoggle().vrw() instanceof Class2070 && this.kmb.vut().booleanValue()) {
                Minecraft.getNetworkManager().sendPacket(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, Class891.xrk, Class910.xkq));
                this.kgo = false;
            }
            if (!Minecraft.thePlayer.bf() && !this.kmb.vut().booleanValue() && Minecraft.thePlayer.nre > 0) {
                Minecraft.thePlayer.nre = 0;
            }
            this.zx(bl);
            this.kgx = true;
        }
    }

    @EventTarget
    public void d(Class2203 class2203) {
        if (kmo != null) {
            this.vetoggle();
        }
        if (kmo != null && (Minecraft.thePlayer.vtoggle() != null && Minecraft.thePlayer.vtoggle().vrw() instanceof Class2070 && this.kmb.vut().booleanValue() || Minecraft.thePlayer.bf()) && this.kgx) {
            Minecraft.thePlayer.nre = Minecraft.thePlayer.vtoggle().vmn();
            Minecraft.getNetworkManager().sendPacket(new C08PacketPlayerBlockPlacement(new Class891(-1, -1, -1), 255, Minecraft.thePlayer.nhl.wx(), 0.0f, 0.0f, 0.0f));
            this.kgo = true;
        }
    }

    private void zx(boolean bl) {
        Minecraft.thePlayer.swing();
        if (!bl) {
            double d = 0.0;
            this.kgx = true;
            Minecraft.thePlayer.sendQueue.addToSendQueue(new C02PacketUseEntity((EntityLivingBase)(kmu != null ? kmu : kmo), C02PacketUseEntity.Action.ATTACK));
            kmu = null;
        }
    }

    private void vev() {
        if (this.kms.size() == 0) {
            kmo = null;
            return;
        }
        kmo = this.kms.get(this.kgm);
    }

    private void wm() {
        kmo = null;
        kmu = null;
        for (Entity Entity : this.kms) {
            if (this.r(Entity)) continue;
            this.kms.remove(Entity);
            if (!this.kmx.contains(Entity)) continue;
            this.kmx.remove(Entity);
        }
    }

    private void j(Class2206 class2206) {
        if (this.kmk.xm("Switch")) {
            this.pc("Switch");
        }
        if (this.kmk.xm("Single")) {
            this.pc("Single");
        }
        int n = this.kmk.xm("Switch") ? 4 : 1;
        for (EntityLivingBase EntityLivingBase : Minecraft.theWorld.nkp) {
            Entity Entity3;
            if (EntityLivingBase instanceof Entity && this.r(Entity3 = (Entity)EntityLivingBase) && !this.kms.contains(Entity3)) {
                if (Class1632.vg(Entity3.getName())) continue;
                this.kms.add(Entity3);
            }
            if (this.kms.size() >= n) break;
        }
        if (this.kmt.xm("Reach")) {
            this.kms.sort((Entity, Entity2) -> (int)(Entity.u(Minecraft.thePlayer) - Entity2.u(Minecraft.thePlayer)));
        }
        if (this.kmt.xm("Fov")) {
            this.kms.sort(Comparator.comparingDouble(Entity -> Class1393.nj(Minecraft.thePlayer.ow, Class1393.pj(Entity)[0])));
        }
        if (this.kmt.xm("Angle")) {
            this.kms.sort((Entity, Entity2) -> {
                float[] arrf = Class134.nq(Entity);
                float[] arrf2 = Class134.nq(Entity2);
                return (int)(Minecraft.thePlayer.oi - arrf[0] - (Minecraft.thePlayer.oi - arrf2[0]));
            });
        }
        if (this.kmt.xm("Health")) {
            this.kms.sort((Entity, Entity2) -> (int)(Entity.getHealth() - Entity2.po()));
        }
        if (this.kgq.vut().booleanValue() && (Minecraft.thePlayer == null || Minecraft.theWorld == null || this.pst.vrq instanceof Class565 || this.pst.vrq instanceof Class965 || this.pst.vrq instanceof Class573 || Minecraft.thePlayer.ux || Minecraft.thePlayer.po() <= 0.0f)) {
            this.toggle(false);
        }
    }

    public float[] pz(EntityLivingBase EntityLivingBase) {
        double d = EntityLivingBase.of - Minecraft.thePlayer.of;
        double d2 = EntityLivingBase.om - Minecraft.thePlayer.om;
        double d3 = EntityLivingBase.og - Minecraft.thePlayer.og;
        float f = (float)(Math.atan2(d3, d) * 180.0 / 3.141592653589793) - 90.0f;
        float f2 = (float)(-Math.atan2(EntityLivingBase.om + (double)EntityLivingBase.nk() / 0.0 - (Minecraft.thePlayer.om + (double)Minecraft.thePlayer.nk()), Math.hypot(d, d3)) * 180.0 / 3.141592653589793);
        if (d2 > -0.2 && d2 < 0.2) {
            f2 = (float)(-Math.atan2(EntityLivingBase.om + (double)EntityLivingBase.nk() / Class745.kmp.ven() - (Minecraft.thePlayer.om + (double)Minecraft.thePlayer.nk()), Math.hypot(d, d3)) * 180.0 / 3.141592653589793);
        } else if (d2 > -0.2) {
            f2 = (float)(-Math.atan2(EntityLivingBase.om + (double)EntityLivingBase.nk() / Class745.kmv.ven() - (Minecraft.thePlayer.om + (double)Minecraft.thePlayer.nk()), Math.hypot(d, d3)) * 180.0 / 3.141592653589793);
        } else if (d2 < 0.3) {
            f2 = (float)(-Math.atan2(EntityLivingBase.om + (double)EntityLivingBase.nk() / Class745.kmn.ven() - (Minecraft.thePlayer.om + (double)Minecraft.thePlayer.nk()), Math.hypot(d, d3)) * 180.0 / 3.141592653589793);
        }
        return new float[]{f, f2};
    }

    public float[] pq(EntityLivingBase EntityLivingBase) {
        if (EntityLivingBase != null) {
            Minecraft.nmk();
            double d = Minecraft.thePlayer.of;
            Minecraft.nmk();
            Minecraft.nmk();
            double d2 = Minecraft.thePlayer.om + (double)Minecraft.thePlayer.nk();
            Minecraft.nmk();
            double d3 = Minecraft.thePlayer.og;
            double d4 = Class2173.kmo.of;
            double d5 = Class2173.kmo.om + (double)(Class2173.kmo.uu / 2.0f);
            double d6 = Class2173.kmo.og;
            double d7 = d - d4;
            double d8 = d2 - d5;
            double d9 = d3 - d6;
            double d10 = Math.sqrt(Math.pow(d7, 2.0) + Math.pow(d9, 2.0));
            float f = (float)(Math.toDegrees(Math.atan2(d9, d7)) + 90.0);
            float f2 = (float)Math.toDegrees(Math.atan2(d10, d8));
            return new float[]{(float)((double)f + (new Random().nextBoolean() ? Math.random() : -Math.random())), (float)((double)(90.0f - f2) + (new Random().nextBoolean() ? Math.random() : -Math.random()))};
        }
        return null;
    }

    public static void vej() {
        kgb = false;
        kgw = 0;
        kga = 0.0f;
        kgl = 0.0f;
    }

    public static void nn(float f, float f2) {
        if (!Double.isNaN(f) && !Double.isNaN(f2)) {
            kga = f;
            kgl = f2;
            kgb = true;
            kgw = 0;
            kgi = 2;
        }
    }

    private boolean r(Entity Entity) {
        if (Entity instanceof Class633) {
            return false;
        }
        if (Entity == null) {
            return false;
        }
        if (Entity == Minecraft.thePlayer) {
            return false;
        }
        if (Entity.getName().equalsIgnoreCase("?6Dealer")) {
            return false;
        }
        if (Entity instanceof Entity && !this.kgn.vut().booleanValue()) {
            return false;
        }
        if ((Entity instanceof Class937 || Entity instanceof Class933) && !this.kgv.vut().booleanValue()) {
            return false;
        }
        if ((Entity instanceof Class518 || Entity instanceof Class941 || Entity instanceof Class920) && !this.kgj.vut().booleanValue()) {
            return false;
        }
        if ((double)Minecraft.thePlayer.u(Entity) > this.kmh.vut()) {
            return false;
        }
        if (Entity.isDead || Entity.getHealth() <= 0.0f) {
            return false;
        }
        if (Entity.cl() && !this.kgp.vut().booleanValue()) {
            return false;
        }
        if (Class2183.kaa.contains(Entity)) {
            return false;
        }
        if (Class2183.kal.contains(Entity)) {
            return false;
        }
        if (Minecraft.thePlayer.ux) {
            return false;
        }
        if (Entity instanceof Entity && Class1035.l(Entity)) {
            return false;
        }
        return this.kgz.vut() == false || !Class1386.z(new Class891(Minecraft.thePlayer.of, Minecraft.thePlayer.om + (double)Minecraft.thePlayer.nk(), Minecraft.thePlayer.og), new Class891(Entity.of, Entity.om + (double)Entity.nk(), Entity.og));
    }

    @Override
    public void onDisable() {
        this.kgm = 0;
        this.kgt = Minecraft.thePlayer.oi;
        this.kgh = Minecraft.thePlayer.ow;
        super.onDisable();
    }

    @Override
    public void onEnable() {
        this.kms.clear();
        this.kmx.clear();
        kmo = null;
        Minecraft.thePlayer.nre = 0;
        Minecraft.getNetworkManager().sendPacket(new C07PacketPlayerDigging(C07PacketPlayerDigging.Action.RELEASE_USE_ITEM, Class891.xrk, Class910.xkq));
        super.onEnable();
    }

    private float d(float f, Entity Entity) {
        return Class1393.nz(f, Class1393.pj(Entity)[0]);
    }
}

