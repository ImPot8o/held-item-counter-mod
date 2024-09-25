package org.polyfrost.example.hud;

import cc.polyfrost.oneconfig.hud.SingleTextHud;
import net.minecraft.item.ItemStack;
import net.minecraft.client.Minecraft;

import org.polyfrost.example.config.TestConfig;

/**
 * An example OneConfig HUD that is started in the config and displays text.
 *
 * @see HeldItemCounterConfig#hud
 */
public class TestHud extends SingleTextHud {
    final Minecraft mc = Minecraft.getMinecraft();
    public TestHud() {
        super("Held Item Count", true);
    }

    @Override
    public String getText(boolean example) {

        ItemStack heldItem = mc.thePlayer.getHeldItem();
        int itemCount = 0;

        // Determine what to count based on the item and configuration
        if (heldItem.getItem() == net.minecraft.init.Items.bow) {
            itemCount = getItemCount(new ItemStack(net.minecraft.init.Items.arrow));

        } else {
            if (!TestConfig.onlyArrowCount) {
                // If not holding a bow and arrow count display is not enabled, count the held item
                itemCount = getItemCount(heldItem);
            }
        }

        if (itemCount == 0) {
            return String.valueOf(null); // Do not render if the item count is zero
        }

        return String.valueOf(itemCount);
    }
    private int getItemCount(ItemStack item) {
        int count = 0;
        for (ItemStack stack : mc.thePlayer.inventory.mainInventory) {
            if (stack != null && stack.isItemEqual(item)) {
                count += stack.stackSize;
            }
        }
        return count;
    }
}
