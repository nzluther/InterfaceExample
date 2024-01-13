public class MySqlConnection implements DatabaseConnection{

    public void connect(){
        System.out.println("MYSQL Connected...");
    }
    public void executeQuery(String query){
        System.out.println("Executing Query on MySQL DB: " + query);
    }
    public void disconnect(){
        System.out.println("MYSQL disconnected...");
    }


}
