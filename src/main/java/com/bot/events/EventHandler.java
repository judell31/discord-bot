package com.bot.events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.IOException;

public class EventHandler extends ListenerAdapter{

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        try {
            new Event().event(event);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
