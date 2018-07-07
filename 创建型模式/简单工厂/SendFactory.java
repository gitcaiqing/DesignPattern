package ¼òµ¥¹¤³§;

public class SendFactory {

	public Sender mailSend() {
		return new MailSend();
	}
	
	public Sender smSend() {
		return new Smsend();
	}
}
