public class OracleConnection implements DatabaseConnection{

    public void connect(){
        System.out.println("Oracle Connected...");
    }
    public void executeQuery(String query){
        System.out.println("Executing Query on Oracle DB: " + query);
    }
    public void disconnect(){
        System.out.println("Oracle disconnected...");
    }


}

