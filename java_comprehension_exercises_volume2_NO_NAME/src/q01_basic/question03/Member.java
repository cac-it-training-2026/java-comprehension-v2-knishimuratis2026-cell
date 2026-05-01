package q01_basic.question03;

class Member {
	//TODO ここから実装する
	private String name;
	private int age;
	private int rank;

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

	public void showMember() {
		System.out.println("\nname:" + name + "\nage:" + age + "\nrank:" + rank + "\n*****************");
	}

	public void rankUp() {
		++rank;
		System.out.println(">>>RANK UP>>>\n"
				+ "---GET RANK---\n"
				+ "newRank:" + rank);

	}

	/**
	 * 
	 */
	public Member() {

	}

	/**
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

}
