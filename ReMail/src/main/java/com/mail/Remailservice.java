package com.mail;

import java.util.Properties;



import org.springframework.stereotype.Service;

import jakarta.mail.Folder;
import jakarta.mail.Message;
import jakarta.mail.Session;
import jakarta.mail.Store;


@Service
public class Remailservice 
{
	

    public void receiveEmails()throws Exception
    {
        Properties props = new Properties();
        props.put("mail.store.protocol", "imaps");

        
            Session session = Session.getDefaultInstance(props);
            
            Store store = session.getStore("imaps");
            store.connect("imap.gmail.com","sindhunk9498@gmail.com","syqh yfor qbrh kjjo");

            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            
            Message[] messages = inbox.getMessages();
            System.out.println("TOTAL MESSAGES:"+messages.length);
            
            
            for(int i=0;i<100 && i<messages.length;i++)
            {
            	Message message=messages[i];
                    System.out.println("Email Subject: " + message.getSubject());
                    System.out.println("Email From: " + message.getFrom()[0]);
                    System.out.println("Email Body: " + message.getContent());
                    System.out.println("******************************************");
                
            }

            inbox.close(false);
            store.close();
        } 
}
