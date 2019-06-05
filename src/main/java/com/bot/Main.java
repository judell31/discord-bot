package com.bot;

import com.bot.events.EventHandler;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class Main {
    protected static JDA jda;

    public static void main(String[] args) throws Exception{
        jda = new JDABuilder(AccountType.BOT).setToken(Token.botToken()).build();
        jda.addEventListener(new EventHandler());
    }
}
