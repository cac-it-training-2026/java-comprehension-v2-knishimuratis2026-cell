package q02_advanced.question03;

import java.util.List;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	private List<Member> members;

	/**
	 * @param memberStorage
	 */
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	//TODO ここから処理を記述

	public Member doLogin(int id, String password) {
		for (Member m : memberStorage.getMembers()) {
			if (m.getId() == id) {

				if (m.getPassword() == null && password == null) {
					return m;
				}

				if (m.getPassword() != null && m.getPassword().equals(password)) {
					return m;
				}
			}
		}

		return null;
	}
}