package com.notker.xp_storage.regestry;

import com.notker.xp_storage.XpStorage;
import com.notker.xp_storage.blocks.StorageBlock;
import com.notker.xp_storage.blocks.StorageBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final StorageBlock BLOCK_XP_OBELISK = new StorageBlock(FabricBlockSettings
            .of(Material.METAL)
            .sounds(BlockSoundGroup.METAL)
            .strength(0.25f, 1000.0f)
            .requiresTool()
    );

    public static final Block BLOCK_SOUL_COPPER = new Block(FabricBlockSettings
            .of(Material.METAL)
            .sounds(BlockSoundGroup.METAL)
            .strength(0.25f, 1000f)
            .requiresTool()
    );


    public static final String TAG_ID = "BlockEntityTag";
    public static final BlockEntityType<StorageBlockEntity> STORAGE_BLOCK_ENTITY = FabricBlockEntityTypeBuilder.create(StorageBlockEntity::new, BLOCK_XP_OBELISK).build(null);
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(XpStorage.MOD_ID, "block_xp_obelisk"), BLOCK_XP_OBELISK);

        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(XpStorage.MOD_ID, "entity_xp_obelisk"), STORAGE_BLOCK_ENTITY);
        Registry.register(Registry.BLOCK, new Identifier(XpStorage.MOD_ID, "block_soul_copper"), BLOCK_SOUL_COPPER);


        BlockEntityType<StorageBlockEntity> STORAGE = null;
//        FluidStorage.SIDED.registerForBlockEntity((storage, direction) -> switch (direction) {
//            case DOWN -> storage.liquidXp;
//            default -> null;
//        }, STORAGE_BLOCK_ENTITY);
        FluidStorage.SIDED.registerForBlockEntity((storage, direction) -> storage.liquidXp, STORAGE_BLOCK_ENTITY);
    }
}
