package com.bot.events;

import com.bot.responses.Response;
import com.bot.triggers.Triggers;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;

public class Event {

    public String event(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase(Triggers.triggerKeys("hello"))){
            event.getChannel()
                    .sendTyping().queue();
            event.getChannel()
                    .sendMessage(
                            Response.publicRespKey("whats-up")
                    ).queue();
        }
        return event.toString();
    }
}
