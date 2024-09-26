package org.polyfrost.helditemcounter.command;

import org.polyfrost.helditemcounter.HeldItemCounterMod;
import cc.polyfrost.oneconfig.utils.commands.annotations.Command;
import cc.polyfrost.oneconfig.utils.commands.annotations.Main;

/**
 * An example command implementing the Command api of OneConfig.
 * Registered in HeldItemCounterMod.java with `CommandManager.INSTANCE.registerCommand(new GuiCommand());`
 *
 * @see Command
 * @see Main
 * @see HeldItemCounterMod
 */
@Command(value = HeldItemCounterMod.MODID, description = "Access the " + HeldItemCounterMod.NAME + " GUI.")
public class GuiCommand {
    @Main
    private void handle() {
        HeldItemCounterMod.INSTANCE.config.openGui();
    }
}