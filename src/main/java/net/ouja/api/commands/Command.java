package net.ouja.api.commands;

import net.ouja.api.entity.Player;

public interface Command {

    /**
     * @param player
     * @return true if the command is successful, false for not.
     */
    public boolean command(Player player);
}
