package com.bot.events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class EventHandler extends ListenerAdapter{

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        new Event().event(event);
    }
}
