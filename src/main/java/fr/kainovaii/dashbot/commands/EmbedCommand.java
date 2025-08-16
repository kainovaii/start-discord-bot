package fr.kainovaii.dashbot.commands;

import net.dv8tion.jda.api.interactions.commands.build.SlashCommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.Color;

public class EmbedCommand implements Command {

    @Override
    public String getName()
    {
        return "embed";
    }

    @Override
    public SlashCommandData getCommandData()
    {
        return Commands.slash(getName(), "Dit bonjour à l'utilisateur");
    }

    @Override
    public void execute(SlashCommandInteractionEvent event) {
        EmbedBuilder embed = new EmbedBuilder();
        embed.setTitle("Titre de l'embed");
        embed.setDescription("Ceci est un message embed généré par JDA !");
        embed.setColor(Color.MAGENTA);
        embed.setFooter("Footer text");

        event.replyEmbeds(embed.build()).queue();
    }
}
