package kata5.view;

import java.util.List;
import kata5.model.Histogram;
import kata5.model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<String> mail){
        Histogram<String> histo = new Histogram();
        for (String mail1 : mail) {
            histo.increment(new Mail (mail1).getDomain());
        }
        return histo;
    }
}
