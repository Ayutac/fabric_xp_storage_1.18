package com.notker.xp_storage.items;

import com.notker.xp_storage.regestry.ModItems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class StorageItem extends Item {
    public StorageItem(Settings settings) {
        super(settings);
    }


    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {

        if (this.equals(ModItems.INSPECTOR)) {
            tooltip.add( new TranslatableText("item.tooltip.inspector").formatted(Formatting.AQUA));
        }

        if (this.equals(ModItems.LOCK)) {
            tooltip.add( new TranslatableText("item.tooltip.lock").formatted(Formatting.AQUA));
        }

        if (this.equals(ModItems.KEY)) {
            tooltip.add( new TranslatableText("item.tooltip.key").formatted(Formatting.AQUA));
        }


    }
}

