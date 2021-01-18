package com.bot.events;

import com.bot.constants.EndpointConstants;
import com.bot.requests.UserRequest;
import com.bot.service.ServiceCall;
import com.bot.triggers.Triggers;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;

import java.io.IOException;

public class Events {

    public static String event(GuildMessageReceivedEvent event) throws IOException {
        String[] args = event.getMessage().getContentRaw().split(" ");

        UserRequest userRequest = new UserRequest();

        if(args[0].equalsIgnoreCase(Triggers.triggerKeys("hello"))){
            userRequest.firstName = args[1];
            userRequest.lastName = args[2];
            userRequest.description = args[3];
//            event.getChannel()
//                    .sendTyping().queue();
//            event.getChannel()
//                    .sendMessage(
//                            Response.publicRespKey("whats-up")
//                    ).queue();
            event.getChannel().sendMessage(ServiceCall.addUser(
                    EndpointConstants.ENDPOINT + "/add-user", userRequest)).queue();
//            ServiceCall.deleteUser(EndpointConstants.ENDPOINT + "/delete/3");
        }

        return event.toString();
    }
}
