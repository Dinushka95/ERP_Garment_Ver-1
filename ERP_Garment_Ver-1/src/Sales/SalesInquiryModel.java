package Sales;

import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;

/**
 *
 * @author Dinushka
 */
public class SalesInquiryModel {
    
    public String generate_sdi(){
    AutoIdGenerator aid = new AutoIdGenerator();
    return(aid.generate("sii",Integer.toString(MainWindow.userid)));
    }
    
}
