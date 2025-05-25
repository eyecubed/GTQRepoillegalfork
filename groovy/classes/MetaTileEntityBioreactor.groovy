package classes

import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.builders.SimpleRecipeBuilder
import gregtech.client.renderer.ICubeRenderer
import gregtech.common.ConfigHolder

import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.BlockGlassCasing
import gregtech.common.blocks.BlockMachineCasing
import gregtech.common.blocks.MetaBlocks

import net.minecraft.init.Blocks
import net.minecraft.util.ResourceLocation

import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly

public class MetaTileEntityBioreactor extends RecipeMapMultiblockController {

    private static final RecipeMap<SimpleRecipeBuilder> BIOREACTOR_RECIPES = new RecipeMap<>("bioreactor", 3, 4, 1, 0, new SimpleRecipeBuilder(), false);

    public MetaTileEntityBioreactor(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, BIOREACTOR_RECIPES);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityBioreactor(metaTileEntityId);
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle(" GGG ", " CCC ", " CCC ", " CCC ")
                .aisle("GAAAG", "CAAAC", "C###C", "CGGGC")
                .aisle("GAAAG", "CDDDC", "C###C", "CGGGC")
                .aisle("GAAAG", "CDDDC", "C###C", "CGGGC")
                .aisle(" GGG ", " CSC ", " CCC ", " CCC ")
                .where('S' as char, selfPredicate())
                .where('G' as char, states(blockstate("gtaurora:machine_casing_ampridge")))
                .where('D' as char, states(blockstate("minecraft:cobblestone")))

                .where('A' as char, states(blockstate('gregtech:metal_casing', 'variant=steel_solid'))
                        .setMinGlobalLimited(42)
                        .or(autoAbilities()))
                .where('#' as char, air())
                .build();
    }
}
