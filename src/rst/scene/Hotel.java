package rst.scene;

import rst.assets.AssetRegistry;
import rst.character.Characters;
import rst.dialogue.DialogueStarter;
import rst.render.Block;
import rst.render.CameraFollowable;
import rst.render.InteractableBlock;

public class Hotel extends Scene {

	public Hotel() {
		super("plank", null, 10, 10, AssetRegistry.getSounds().get("test"),
				(CameraFollowable) Characters.getCharacters().getCharacter("Connor Adams"), 
				"Saloon", Characters.getCharacters().getCharacter("Connor Adams"),
				new InteractableBlock(Block.GRID_SIZE * 10, Block.GRID_SIZE * 10, "path", 0, 0).onInteract(new DialogueStarter("testDialogue")),
				
				new ScenePortal(Block.GRID_SIZE * 10, Block.GRID_SIZE * 10, "cactus1", -1, 4, "Town", 0, 0));

	}
}