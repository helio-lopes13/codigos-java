package lispector;

public class DataException extends Exception {
	
	
	public static void main(String[] args) {
		try {
			Data d = new Data(15, 13, 1903);
			System.out.println(d);
		} catch(DataException dE) {
			System.out.println(dE.getMessage());
		}
	}
}
