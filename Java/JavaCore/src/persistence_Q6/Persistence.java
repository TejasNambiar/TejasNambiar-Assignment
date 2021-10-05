package persistence_Q6;

public abstract class Persistence {
	public abstract void persist();
	
	public void callPersist(Persistence object) {
		object.persist();
	}
	
}
