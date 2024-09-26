package org.polyfrost.helditemcounter;

import org.polyfrost.helditemcounter.command.GuiCommand;
import org.polyfrost.helditemcounter.config.HeldItemCounterConfig;
import cc.polyfrost.oneconfig.events.event.InitializationEvent;
import net.minecraftforge.fml.common.Mod;
import cc.polyfrost.oneconfig.utils.commands.CommandManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * The entrypoint of the Example Mod that initializes it.
 *
 * @see Mod
 * @see InitializationEvent
 */
@Mod(modid = HeldItemCounterMod.MODID, name = HeldItemCounterMod.NAME, version = HeldItemCounterMod.VERSION)
public class HeldItemCounterMod {

    // Sets the variables from `gradle.properties`. See the `blossom` config in `build.gradle.kts`.
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    @Mod.Instance(MODID)
    public static HeldItemCounterMod INSTANCE; // Adds the instance of the mod, so we can access other variables.
    public static HeldItemCounterConfig config;

    // Register the config and commands.
    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        config = new HeldItemCounterConfig();
        CommandManager.INSTANCE.registerCommand(new GuiCommand());
    }
}
