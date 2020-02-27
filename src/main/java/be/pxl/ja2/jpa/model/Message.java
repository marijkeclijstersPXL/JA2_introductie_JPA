package be.pxl.ja2.jpa.model;

public class Message {
	private long id;
	private String text;


	public Message(long messageId, String text) {
		this.id = messageId;
		this.text = text;
	}

	public long getId() {
		return id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
