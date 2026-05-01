package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		//TODO ここから実装する
		Member nullMember = new Member();
		nullMember.showMember();
		Member miura = new Member(":Miura Manabu", 28, 2);
		miura.showMember();
	}

}
