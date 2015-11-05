class GameShape {
	public void displayShape(){
		System.out.println("next gen graphics");
	}
}

class PlayerPiece extends GameShape {
	public void movePiece(){
		System.out.println("checkmate");
	}
}

class TilePiece extends GameShape {
	public void getAdjacent() {
		System.out.println("adjacent tile is: xyz");
	}
	
	public void displayShape() {
		System.out.println("next gen graphics applicable to tiles only");
	}
}

public class TestShapes2 {
	public static void main(String[] args){
		PlayerPiece player = new PlayerPiece();
		TilePiece tile = new TilePiece();
		doShapes(player);
		doShapes(tile);
	}
	
	// polymorphism: this method also takes as argument anything extending from GameShape
	public static void doShapes(GameShape shape) {
		shape.displayShape();
		if (shape instanceof PlayerPiece)
			System.out.println("I can see that this shape is actually a player piece!");
		// compilation fails for:
		// shape.getAdjacent();
	}
}