package com.bot;

import com.bot.constants.EnvironmentConstants;
import com.bot.events.EventHandler;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
public class SandBoxBot {
    protected static JDA jda;

    public static void main(String[] args) throws Exception{
        jda = JDABuilder.createDefault("Nzk2MDUxNTkyODg5MjM3NTM0.X_SS0Q.NvvkTnILhQ_zezX-gEOqLjELtTM").build();
        jda.addEventListener(new EventHandler());
    }
}
