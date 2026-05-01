package q01_basic.question06;

public class Member extends AbstMember {
	private int id;
	private String password;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	private String name;
	private int age;
	private int rank;

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	/**
	 * 
	 */
	public Member() {
	}

	//	public void showMember() {
	//		getId();
	//		getName();
	//		getAge();
	//		getPassword();
	//		getRank();
	//		System.out.println("\nid:" + id + "\npassword" + password + "\nname:" + name + "\nage:" + age + "\nrank:" + rank
	//				+ "\n*****************");
	//
	//	}

	@Override

	public void buyItem() {
		System.out.println("\n---BUY ITEM---" + name + " purchased the item at a fixed price"
				+ "");
	}

	public void showMember() {
		getId();
		getName();
		getAge();
		getPassword();
		getRank();
		System.out.println("\nid:" + id + "\npassword" + password + "\nname:" + name + "\nage:" + age + "\nrank:" + rank
				+ "\n*****************");
	}

}