package main;

public class BeanExample {

	private String message;

	public BeanExample(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("main.BeanExample [message=%s]", message);
	}

}
