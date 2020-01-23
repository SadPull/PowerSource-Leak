/*
 * Decompiled with CFR 0.145.
 */
package cn.bigskidder.BaiZhiJun.Power.package185;

import java.awt.Color;
import cn.bigskidder.BaiZhiJun.Power.Value;
import cn.bigskidder.BaiZhiJun.Power.package185.Class1610;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1384;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1386;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1387;
import cn.bigskidder.BaiZhiJun.Power.utils.Class1388;
import cn.bigskidder.BaiZhiJun.Power.utils.package2993.Class964;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1652;
import cn.bigskidder.BaiZhiJun.Power.utils.package393.package392.Class1655;
import cn.bigskidder.BaiZhiJun.Power.package639.package638.Class1484;
import package3.package2.package1.Class2556;
import package3.package2.package1.package0.Class1815;
import package3.package2.package1.package4133.Class0;
import package3.package2.package152.Class421;

public class Class451 {
    private String message;
    private TimeHelper timer;
    private double lastY;
	private double posY;
	private double width;
	private double height;
	private double animationX;
    private int color;
	private int imageWidth;
	private ResourceLocation image;
	private long stayTime;
    Class2556 hea = Class2556.nmk();

    public Class451(String string, Class1610 class1610) {
		this.message = message;
		this.timer = new TimeHelper();
		this.timer.reset();
		UnicodeFontRenderer font = Client.getInstance().getFontManager().consolasbold14;
		this.width = (double)(font.getStringWidth(message) + 30);
		this.height = 15.0D;
		this.animationX = this.width;
		this.stayTime = 800L;
		this.imageWidth = 11;
		this.posY = -1.0D;
        this.hem = new Class421("Power/notification/" + class1610.name().toLowerCase() + ".png");
        if (type.equals(ClientNotification.Type.INFO)) {
            this.her = Class1386.s(Class1387.d(Color.BLUE), 0.5f);
            if (Class1484.udj.vut().booleanValue()) {
                Class2556.nmk();
				
				//PlaySound
                Class2556.vhw.d("random.click", 20.0f, 20.0f);
            }
        } else if (type.equals(ClientNotification.Type.ERROR)) {
            this.her = Class1386.s(Class1387.d(Color.RED), 0.5f);
            if (Class1484.udj.vut().booleanValue()) {
                Class2556.nmk();
				
				//PlaySound
                Class2556.vhw.d("random.click", 1.0f, 0.8f);
            }
        } else if (type.equals(ClientNotification.Type.SUCCESS)) {
            this.her = Class1386.s(Class1387.d(Color.GREEN), 0.5f);
            if (Class1484.udj.vut().booleanValue()) {
                Class2556.nmk();
				
				//PlaySound
                Class2556.vhw.d("random.click", 1.0f, 1.0f);
            }
        } else if (type.equals(ClientNotification.Type.WARNING)) {
            this.her = Class1386.s(Class1387.d(Color.YELLOW), 0.5f);
            if (Class1484.udj.vut().booleanValue()) {
				
                Class2556.nmk();
				
				//PlaySound
                Class2556.vhw.d("random.orb", 1.0f, 1.0f);
            }
        }
    }

    public void f(double d, double d2) {
        this.heu = d2;
        this.heh = Class1384.nl(this.heh, this.naf() ? this.hek : 0.0, Math.max((double)(this.naf() ? 200 : 30), Math.abs(this.heh - (this.naf() ? this.hek : 0.0)) * 30.0));
        this.hey = this.hey == -1.0 ? d : Class1384.nl(this.hey, d, 200.0);
        Class1815 class1815 = new Class1815(Class2556.nmk());
        int n = (int)((double)class1815.jvs() - this.hek + this.heh);
        int n2 = (int)((double)class1815.jvs() + this.heh);
        int n3 = (int)this.hey;
        int n4 = (int)((double)n3 + this.het);
        Class1388.z(n + 20, n3, n2 + 18, n4, -2030043136);
        Class1388.z(n + 20, n3, n + 18, n4, this.her);
        Class1655 class1655 = Class1652.jpe;
        class1655.p(this.hex, (float)((double)n + this.hek / 2.0) + 10.0f, (float)((double)n3 + this.het / 3.5) + 1.0f, -1);
    }

	//shouldDelete
    public boolean jta() {
        return this.naf() && this.heh >= this.hek;
    }
	
	//isFinished
    private boolean naf() {
        return this.heo.no(this.heg) && this.hey == this.heu;
    }

	//getHeight
    public double jtl() {
        return this.het;
    }
	
	public boolean shouldDelete() {
		return this.isFinished() && this.animationX >= this.width;
	}

	private boolean isFinished() {
		return this.timer.isDelayComplete(this.stayTime) && this.posY == this.lastY;
	}

	public double getHeight() {
		return this.height;
	}
}

