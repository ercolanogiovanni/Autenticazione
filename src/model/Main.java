package model;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User("gio@email.it", "gio@email.it");
//		System.out.println(user1.getEmail());
//		System.out.println(user1.getPassword());
		
//		String email = user1.getEmail();
//		if (email.equals("gio@email.it")) {
//			System.out.println("Stessa Mail");
//		}
		
		User user2 = new User("fra@email.it", "pass2");
		User user3 = new User("fra@email.it", "pass2");
//		System.out.println(user2.getEmail());
//		System.out.println(user2.getPassword());
		user2 = user1;
		
//		user1.setEmail("giacomo@email.it");
//		System.out.println(user1.getEmail());
//		System.out.println(user2.getEmail());
//		
//		user1.setEmail("luca@email.it");
//		System.out.println(user1.getEmail());
//		System.out.println(user2.getEmail());
		
		if ( user1.email == user2.password ) {
			System.out.println("user1.email punta a user2.email");
		} else {
			System.out.println("user1.email non punta a user2.email");
		}
		
		if ( user1 == user2 ) {
			System.out.println("user1 punta a user2");
		} else {
			System.out.println("user1 non punta a user2");
		}
		
		if ( user1 == user3 ) {
			System.out.println("user1 punta a user3");
		} else {
			System.out.println("user1 non punta a user3");
		}
		
		if ( user1.getEmail().equals( user2.getEmail() ) ) {
			System.out.println("Sono uguali");
		}
	}

}
