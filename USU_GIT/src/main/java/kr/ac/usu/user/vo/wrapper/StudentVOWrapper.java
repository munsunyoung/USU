package kr.ac.usu.user.vo.wrapper;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import kr.ac.usu.user.vo.StudentVO;


/**
 * 시큐리티 로그인 인증객체용 랩퍼
 * @author 김석호
 * @since 2023. 11. 9.
 * @version 1.0
 * @see javax.servlet.http.HttpServlet 
 * <pre>
 * [[개정이력(Modification Information)]]
 * 수정일         수정자               수정내용
 * --------     --------    ----------------------
 * 2023. 11. 9.      김석호       최초작성
 * Copyright (c) 2023 by DDIT All right reserved
 * </pre>
 */
public class StudentVOWrapper extends User{
	private StudentVO realUser;

	public StudentVOWrapper(StudentVO realUser) {
		super(realUser.getStdntNo(), realUser.getStdntPassword(), AuthorityUtils.createAuthorityList(realUser.getUserRole()));
		this.realUser = realUser;
	}
	
	public StudentVO getRealUser() {
		return realUser;
	}
}
