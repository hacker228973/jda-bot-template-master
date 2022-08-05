package me.kodysimpson;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class DiscordBot {

    public static void main(String[] args) throws LoginException {

        JDA bot = JDABuilder.createDefault("MTAwNTE1MjI5ODYyMTc1MTM4Ng.Gs-pab.F7b4pCo7I3WZsYw7vCdSESorC64_QJVy415t48")
                .setActivity(Activity.playing("with your mom"))
                .build();

    }
}
