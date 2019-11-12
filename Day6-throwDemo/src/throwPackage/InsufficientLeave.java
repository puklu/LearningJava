package throwPackage;

public class InsufficientLeave extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 546372819L;
	private String msg;

	public InsufficientLeave(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}

}
