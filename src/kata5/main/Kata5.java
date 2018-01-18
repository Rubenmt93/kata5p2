package kata5.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kata5.model.Histogram;
import kata5.view.HistogramDisplay;
import kata5.view.MailHistogramBuilder;
import kata5.view.MailListBuilder;
import java.sql.SQLException;
import kata5.view.MailListReaderDDBB;
 

public class Kata5 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Kata5 kata4 = new Kata5();
        kata4.execute();
    }
    private List<String> mailList;
    private HistogramDisplay histoDisplay;
    private Histogram<String> histogram;
    
    public void execute() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        input();
        process();
        output();
    }
    private void input()throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        String filename = "C:\\Users\\usuario\\Documents\\Kata3-master\\Kata3-master\\src\\kata4\\emails.txt";
        mailList = MailListReaderDDBB.read();
    }
    
    private void output(){
        histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
    private void process(){
        histogram = MailHistogramBuilder.build(mailList); 
    }
}
