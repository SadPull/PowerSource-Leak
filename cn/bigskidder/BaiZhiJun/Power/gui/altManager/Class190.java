/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.UserAuthentication
 *  com.mojang.authlib.exceptions.AuthenticationException
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication
 */
package cn.bigskidder.BaiZhiJun.Power.package185.package588;

import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.UserAuthentication;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.net.Proxy;
import java.util.UUID;
import cn.bigskidder.BaiZhiJun.Power.Class2525;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class200;
import cn.bigskidder.BaiZhiJun.Power.package185.package588.Class203;
import cn.bigskidder.BaiZhiJun.Power.utils.Class169;
import package3.package2.package1.Class2556;
import package3.package2.package152.Class426;

public class Class190
extends Thread {
    private final Class2556 nee = Class2556.nmk();
    private final String pdd;
    private String pdn;
    private final String pdp;

    public Class190(String string, String string2) {
        super("Alt Login Thread");
        this.pdp = string;
        this.pdd = string2;
        this.pdn = "\u00a7eWaiting...";
    }

    private final Class426 s(String string, String string2) {
        YggdrasilAuthenticationService yggdrasilAuthenticationService = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
        YggdrasilUserAuthentication yggdrasilUserAuthentication = (YggdrasilUserAuthentication)yggdrasilAuthenticationService.createUserAuthentication(Agent.MINECRAFT);
        yggdrasilUserAuthentication.setUsername(string);
        yggdrasilUserAuthentication.setPassword(string2);
        try {
            yggdrasilUserAuthentication.logIn();
            return new Class426(yggdrasilUserAuthentication.getSelectedProfile().getName(), yggdrasilUserAuthentication.getSelectedProfile().getId().toString(), yggdrasilUserAuthentication.getAuthenticatedToken(), "mojang");
        }
        catch (AuthenticationException authenticationException) {
            return null;
        }
    }

    public String nps() {
        return this.pdn;
    }

    @Override
    public void run() {
        if (this.pdd.equals("")) {
            this.nee.vrp = new Class426(this.pdp, "", "", "mojang");
            this.pdn = "\u00a7aLogged in. (" + this.pdp + " - offline name)";
            return;
        }
        this.pdn = "\u00a7eLogging in...";
        Class426 class426 = this.s(this.pdp, this.pdd);
        if (class426 == null) {
            this.pdn = "\u00a7cLogin failed!";
        } else {
            Class2525.oiy.vua().d(new Class200(this.pdp, this.pdd));
            Class169.jmy();
            this.pdn = "\u00a7aLogged in. (" + class426.npc() + ")";
            this.nee.vrp = class426;
        }
    }

    public void pn(String string) {
        this.pdn = string;
    }
}

