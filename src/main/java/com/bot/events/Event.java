package com.bot.events;

import com.bot.constants.EndpointConstants;
import com.bot.constants.EnvironmentConstants;
import com.bot.responses.Response;
import com.bot.service.ServiceCall;
import com.bot.triggers.Triggers;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.io.IOException;

public class Event {

    public String event(GuildMessageReceivedEvent event) throws IOException {
        String[] args = event.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase(Triggers.triggerKeys("hello"))){
            event.getChannel()
                    .sendTyping().queue();
            event.getChannel()
                    .sendMessage(
                            Response.publicRespKey("whats-up")
                    ).queue();
            event.getChannel().sendMessage(ServiceCall.getUser(EndpointConstants.ENDPOINT + "/get-user/2")).queue();
//            ServiceCall.deleteUser(EndpointConstants.ENDPOINT + "/delete/3");
        }

        return event.toString();
    }
}
