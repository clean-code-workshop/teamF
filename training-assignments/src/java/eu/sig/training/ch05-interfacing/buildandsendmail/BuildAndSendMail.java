package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail (Mailman m, MailAddress mAddress, Mailbody mBody) {
        // build the mail
        Mail mail = new Mail(mAddress, mBody);
        // send the mail (x3)
        m.sendMail(mail);
    }
        
    prive class Mail {
        private MailAddress address;
        private MailBody body;
        
        private Mail(MailAddress mAddress, MailBody mBody) {
            this.address = mAddress;
            this.body = mBody;
        }
    }
    
    private class MailBody {
        String subject;
        MailmMessage message;
        
        public MailBody(String subject, MailMessage message) {
            this.subject = subject;
            this.message = message;
        }
    }
    
    private class MailAddress {
        private String mId;
        
        private MailAddress(String firstname, String lastname, String division) {
            this.mId = firstName.charAt(0) + "." lastName.substring(0, 7)
                + "0"
                + division.substring(0, 5) + ".compa.ny";
        }
    )              

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}
