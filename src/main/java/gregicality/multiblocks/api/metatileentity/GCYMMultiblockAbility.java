package gregicality.multiblocks.api.metatileentity;

import static gregtech.api.metatileentity.multiblock.MultiblockAbility.ability;

import gregtech.api.metatileentity.ITieredMetaTileEntity;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;

import gregicality.multiblocks.api.capability.IParallelHatch;

public final class GCYMMultiblockAbility {

    public static final MultiblockAbility<IParallelHatch> PARALLEL_HATCH = ability("parallel_hatch",
            IParallelHatch.class);

    public static final MultiblockAbility<ITieredMetaTileEntity> TIERED_HATCH = ability("tiered_hatch",
            ITieredMetaTileEntity.class);

    private GCYMMultiblockAbility() {}
}
