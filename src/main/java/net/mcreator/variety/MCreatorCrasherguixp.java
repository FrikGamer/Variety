package net.mcreator.variety;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementsvariety.ModElement.Tag
public class MCreatorCrasherguixp extends Elementsvariety.ModElement {
	public MCreatorCrasherguixp(Elementsvariety instance) {
		super(instance, 242);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCrasherguixp!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).addExperience((int) 2);
	}
}
