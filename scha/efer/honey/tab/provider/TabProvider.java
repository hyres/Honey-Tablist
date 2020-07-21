package scha.efer.honey.tab.provider;

import org.bukkit.entity.Player;

import scha.efer.honey.tab.TabAdapter;
import scha.efer.honey.tab.HoneyTemplate;

public class TabProvider implements TabAdapter {
    public HoneyTemplate getTemplate(Player player) {
        HoneyTemplate template = new HoneyTemplate();

        template.middle("&5&lhoney tab api");
        template.middle("");
        template.middle("&dYou: &5" + player.getName());

        template.left(5, "&di just coded");
        template.middle(5, "&dhoney api for");
        template.right(5, "&deveryone and i");
        template.left(6, "&ddon't need anymore");
        template.middle(6, "&dits my release");
        template.right(6, "&dreason for free lol");

        template.left(8, "&dyou liked this tab");
        template.middle(8, "&dapi because i coded.");
        template.middle(9, "&5i love you dude");

        template.left(18, "&dmy discord:");
        template.middle(18, "&dmy twitter:");
        template.right(18, "&dgithub:");
        template.left(19, "&5schaefer#0001");
        template.middle(19, "&5@schaeferrr");
        template.right(19, "&5schaeferrr");

        return template;
    }
}
