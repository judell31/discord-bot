package com.bot;

import com.bot.constants.EnvironmentConstants;
import com.bot.events.EventHandler;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
public class Main {
    protected static JDA jda;

    public static void main(String[] args) throws Exception{
        jda = JDABuilder.createDefault(EnvironmentConstants.TOKEN).build();
        jda.addEventListener(new EventHandler());
    }
}
