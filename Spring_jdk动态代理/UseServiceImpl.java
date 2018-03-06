package j2ee_study_Spring.jdk;

public class UseServiceImpl implements UserService {

	@Override
	public void adduser() {

		System.out.println("add...");
	}

	@Override
	public void deleteuser() {

		System.out.println("delete...");
	}

	@Override
	public void updateuser() {

		System.out.println("update...");
	}

}
