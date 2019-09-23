
public class fizz {
    //Note 1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre = 1;
		while (nombre <= 200){
			if (nombre % 3 == 0 && nombre % 5 == 0){
				System.out.print("FizzBuzz \n");
			}else if (nombre % 3 == 0){
				System.out.print("Fizz \n");
			}else if (nombre % 5 == 0){
				System.out.print("Buzz \n");
			}else{
				System.out.print(nombre + " \n");
			}
			nombre++;
		
		}
	}
    //Commentaire 2
}
