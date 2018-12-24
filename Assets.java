

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 64, height = 64;
	
	public static BufferedImage player, dirt, grass, stone, tree;

	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/res/textures/Sheet3.png"));
		
		player = ImageLoader.loadImage("/textures/PixelMan.png");
		dirt = sheet.crop(width, height, width, height);
		grass = sheet.crop(width*2, 0, width, height);
		stone = sheet.crop(width*3, 0, width, height);
		tree = sheet.crop(0, 0, width, height);
	}
	
}
