package fr.anatom3000.gwwhit.materials.gycu;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
public class GycuBlock extends Block {
public GycuBlock() {super(FabricBlockSettings.of(Material.METAL).strength(4.892806394861206f,4.7106023570127515f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1));}

}