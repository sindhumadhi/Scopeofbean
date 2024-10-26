package com.mail;

import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;



@Service
public class MailService 
{
	 @Value("${spring.mail.username}")
	    private String username;

	    @Value("${spring.mail.password}")
	    private String password;

	    public void receiveEmails() {
	        Properties props = new Properties();
	        props.put("mail.store.protocol", "imaps");
	        props.put("mail.imap.host", "imap.gmail.com");
	        props.put("mail.imap.port", "993");

	        try {
	            Session session = Session.getDefaultInstance(props);
	            Store store = session.getStore("imaps");
	            store.connect(username, password);

	           Folder inbox = store.getFolder("INBOX");
	            inbox.open(Folder.READ_ONLY);

	            Message[] messages = inbox.getMessages();
	            for (Message message : messages) {
	                if (message instanceof MimeMessage) {
	                    MimeMessage mimeMessage = (MimeMessage) message;
	                    System.out.println("Email Subject: " + mimeMessage.getSubject());
	                    // Process the email as needed
	                }
	            }

	            inbox.close(false);
	            store.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    @Scheduled(fixedRate = 60000) // Check for emails every minute
	    public void receiveEmailsScheduled() {
	        receiveEmails();
	    }
	    
	    

}
