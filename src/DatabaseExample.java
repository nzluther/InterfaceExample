public class DatabaseExample {

    public static void main (String args[]) {
        MySqlConnection msqlconn = new MySqlConnection();
        msqlconn.connect();
        msqlconn.executeQuery("SELECT * FROM STUDENTS_MYSQL;");
        msqlconn.disconnect();

        System.out.println();

        OracleConnection orclconn = new OracleConnection();
        orclconn.connect();
        orclconn.executeQuery("SELECT * FROM STUDENTS_ORACLE;");
        orclconn.disconnect();

        DbService dbservice = new DbService(msqlconn);
        dbservice.dbAction("INSERT INTO STUDENTS_MYSQL (ID, Name) VALUES (1, 'Luther' );");

    }

}
