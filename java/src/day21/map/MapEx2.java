package day21.map;

import lombok.Data;

@Data
public class MapEx2 {
	private int memberId;
	private String memberName;

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " +memberId+"입니다.";
	}

}

