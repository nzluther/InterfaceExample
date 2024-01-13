public class DbService {

    DatabaseConnection dbConn;

    DbService(DatabaseConnection dbConn){
        this.dbConn=dbConn;
    }

    void dbAction(String query){
        dbConn.connect();
        dbConn.executeQuery(query);
        dbConn.disconnect();

    }
}
