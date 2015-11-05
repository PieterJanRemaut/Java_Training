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

public class TestShapes {
	public static void main(String[] args){
		PlayerPiece shape = new PlayerPiece();
		// code reuse
		shape.displayShape();
		shape.movePiece();
		if (shape instanceof GameShape)
			System.out.println("instanceof GameShape");
	}
}