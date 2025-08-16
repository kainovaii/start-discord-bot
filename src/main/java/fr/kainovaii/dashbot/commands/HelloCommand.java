package fr.kainovaii.dashbot.commands;

import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData;

public class HelloCommand implements Command
{
    @Override
    public String getName()
    {
        return "hello";
    }

    @Override
    public SlashCommandData getCommandData()
    {
        return Commands.slash(getName(), "Dit bonjour à l'utilisateur");
    }

    @Override
    public void execute(SlashCommandInteractionEvent event)
    {
        event.reply("Hello " + event.getUser().getAsMention() + "!").queue();
    }
}