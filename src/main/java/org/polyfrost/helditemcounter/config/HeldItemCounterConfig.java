package org.polyfrost.helditemcounter.config;

import org.polyfrost.helditemcounter.HeldItemCounterMod;
import org.polyfrost.helditemcounter.hud.HeldItemCounterHud;
import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.HUD;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import cc.polyfrost.oneconfig.config.data.OptionSize;

/**
 * The main Config entrypoint that extends the Config type and inits the config options.
 * See <a href="https://docs.polyfrost.cc/oneconfig/config/adding-options">this link</a> for more config Options
 */
public class HeldItemCounterConfig extends Config {
    @Switch(
            name = "Only Arrow Count",
            description = "Disable counting all items except arrows, which will only be counted when you're holding a bow",
            category = "Options",
            size = OptionSize.SINGLE // Optional
    )
    public static boolean onlyArrowCount = false; // The default value for the boolean Switch.

    @HUD(
            name = "Customize HUD",
            category = "HUD"
    )
    public HeldItemCounterHud hud = new HeldItemCounterHud();

    public HeldItemCounterConfig() {
        super(new Mod(HeldItemCounterMod.NAME, ModType.HUD, "C:/Users/PC/Desktop/hypixel api/held-item-counter-mod/src/main/resources/logo.png"), HeldItemCounterMod.MODID + ".json");
        initialize();
    }

}