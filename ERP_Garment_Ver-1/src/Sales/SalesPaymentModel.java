
package Sales;

import MainSystem.DB_Connect;
import static MainSystem.MainWindow.autoSqlQuery;
import java.sql.ResultSet;

/**
 *
 * @author Dinushka
 */
public class SalesPaymentModel {
    
 public ResultSet ViewAllSalesInvoice(){
    return DB_Connect.DB_ResultSet = autoSqlQuery.executeAutoViewAll("d_salesInvoice_table");
    }
    
}
