package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {
		ConsoleReader cr = new ConsoleReader();
		MemberStorage ms = new MemberStorage();

		LoginService loginService = new LoginService(ms);
		Member loginname = null;

		while (loginname == null) {

			try {
				System.out.println("ログイン情報を入力してください");
				//				boolean isLogin = false;
				//TODO ここから実装する

				System.out.println("input id>>");
				int id = cr.inputNumber();
				System.out.println("input password>>");
				String password = cr.inputString();
				//				MemberManager.updatePassword(members, targetId, newPassword);

				loginname = loginService.doLogin(id, password);
				if (loginname == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");

				} else {
					System.out.println("ログインに成功しました");
					break;
				}

			} catch (IOException | NumberFormatException e) {
				System.out.println("不正な入力です");
				e.printStackTrace();
				return;
			}
		}
		System.out.println("ログインユーザ情報を表示します。");
		loginname.showMember();
	}

}
