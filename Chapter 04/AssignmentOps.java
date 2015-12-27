public class AssignmentOps {
	public static void main(String[] args) {
		int sizeOfYard = 10;
		int numOfPets = 4;
		String status = 
			(numOfPets<4)
			?
				true
				?"Pet count OK"
				:"this never hits"
			:
				(sizeOfYard>8)
				?"Pet limit on the edge"
				:"Too many pets";
		System.out.println(status);
	}
}