package com.areyes.junit.svc;

/**
 * The Class MessageService.
 */
public class MessageService {

	/** The message. */
	private String message;


	/**
	 * Instantiates a new message service.
	 *
	 * @param message the message
	 */
	public MessageService(String message) {
		this.message = message;
	}

	/**
	 * Prints the message.
	 *
	 * @return the string
	 */
	public String printMessage() {
		return message;
	}

	/**
	 * Salutation message.
	 *
	 * @return the string
	 */
	public String salutationMessage() {
		message = "Hi!" + message;
		return message;
	}

}
