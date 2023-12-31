package com.example.Filter;
import org.json.simple.JSONArray;



public class Email {

    private String sender;
    private String receiver;
    private String date;
    private String importance;
    private String subject;
    private boolean attachment;
    private JSONArray attachments;
	private String text;

	public boolean isAttachment() {
		return attachment;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getImportance() {
		return importance;
	}
	public void setImportance(String importance) {
		this.importance = importance;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
    public boolean hasAttachments() {
        return attachment;
    }
	public void setAttachment(boolean attachment) {
		this.attachment = attachment;
	}
	public JSONArray getAttachments() {
		return attachments;
	}
	public void setAttachments(JSONArray attachments) {
		this.attachments = attachments;
	}

}
