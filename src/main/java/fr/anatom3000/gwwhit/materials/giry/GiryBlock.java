package fr.anatom3000.gwwhit.materials.giry;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
public class GiryBlock extends Block {
public GiryBlock() {super(FabricBlockSettings.of(Material.METAL).strength(4.650919625155666f,3.400853871662096f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1));}

}