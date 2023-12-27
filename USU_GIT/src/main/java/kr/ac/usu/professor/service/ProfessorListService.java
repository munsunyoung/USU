package kr.ac.usu.professor.service;


import kr.ac.usu.paging.vo.PaginationInfo;

import kr.ac.usu.user.vo.ProfessorVO;

/**
 * 
 * @author PC-25
 *
 * @author 이재혁
 * @since 2023. 11. 7.
 * @version 1.0
 * @see javax.servlet.http.HttpServlet 
 * <pre>
 * [[개정이력(Modification Information)]]
 * 수정일                          수정자               수정내용
 * --------     --------    ----------------------
 * 2023. 11. 7.      작성자명       최초작성
 * Copyright (c) 2023 by DDIT All right reserved
 * </pre>
 */
public interface ProfessorListService {
	
	public void retrieveProfessorList(PaginationInfo<ProfessorVO> paging);
	
	public ProfessorVO retrieveProfessor(String prfsorNo);
	
	public int createProfessor(ProfessorVO professor);

	public int modifyProfessor(ProfessorVO professor);

}
