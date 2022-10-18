package model.exceptions;

public class DomainExcepton extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public DomainExcepton(String msg) {
		super(msg);
	}

}
