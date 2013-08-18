package groovy.samples.exceptionhandling

class InvalidAlbumNameException extends Exception {

	public InvalidAlbumNameException() {
		super();
	}

	public InvalidAlbumNameException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidAlbumNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidAlbumNameException(String message) {
		super(message);
	}

	public InvalidAlbumNameException(Throwable cause) {
		super(cause);
	}

}
