package treeMap_Contact;


public class Contact implements Comparable<Contact>{

	private long PhonenUmber;
	private String Name;
	private String Email;
	private String Gender;
	
	public Contact() {}

	public Contact(long phonenUmber, String name, String email, String gender) {
		PhonenUmber = phonenUmber;
		Name = name;
		Email = email;
		Gender = gender;
	}

	public long getPhonenUmber() {
		return PhonenUmber;
	}

	public String getName() {
		return Name;
	}

	public String getEmail() {
		return Email;
	}

	public String getGender() {
		return Gender;
	}

	@Override
	public int compareTo(Contact o) {
		int result = (int) (o.getPhonenUmber() - this.getPhonenUmber());
		return result;
	}

	@Override
	public String toString() {
		return "Contact [PhonenUmber=" + PhonenUmber + ", Name=" + Name + ", Email=" + Email + ", Gender=" + Gender
				+ "]";
	}

}
