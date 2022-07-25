package Travel;

public class InvalidPackageIdException extends Exception {
	public InvalidPackageIdException() {
		System.err.println("Invalid Package Id");
	}
	public InvalidPackageIdException(String message) {
		super(message);
	}

}
