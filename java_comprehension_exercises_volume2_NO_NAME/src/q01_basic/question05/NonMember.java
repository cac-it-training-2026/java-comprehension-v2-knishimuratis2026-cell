package q01_basic.question05;

public class NonMember extends AbstMember {

	/**
	 * 
	 */
	public NonMember(String name) {
		setName(name);
		getName();
	}

	@Override
	public void buyItem() {
		System.out.println(name + " purchased the item at 50% off");
	}

	@Override
	public void showMember() {

		System.out.println(name + "is a non-member");
		// TODO 自動生成されたメソッド・スタブ

	}

}
