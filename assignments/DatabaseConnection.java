package week4.assignments;

public interface DatabaseConnection {
	public abstract  void connect();
	public  abstract void disconnect();
	public abstract void executeUpdate();

}
