<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<style>
.sub_tit04 {
	font-size: 18px;
	color: #304b73;
	padding-left: 0px;
	font-weight: 600;
	width: 60%;
	float: left;
	text-align: left;
	margin-bottom: 5px;
}

.sub_tit04 span {
	width: 8px;
	height: 8px;
	background: #304b73;
	display: block;
	float: left;
	margin-right: 8px;
	position: relative;
	top: 9px;
}

#btn1 {
	width: 80px;
	height: 30px;
	float: right;
	margin-top: 10px;
	color: white;
	text-align: center;
	padding-bottom: 30px;
}
</style>

<div class="homework_wrap mb-4">

	<div>
		<div class="sub_tit04">
			<span></span>강의개설 정보
		</div>
		<br />
		<br />
		<table class="table_style02 table_center">
			<colgroup>
				<col width="12%">
				<col width="12%">
				<col width="12%">
				<col width="12%">
				<col width="12%">
				<col width="12%">
				<col width="12%">
				<col width="12%">
			</colgroup>
			<tr>
				<th>교과목명</th>
				<td colspan="3">${lectureRequestView.courseNm}</td>
				<th>학과</th>
				<td colspan="3">${lectureRequestView.professor.subjctNm}</td>
			</tr>
			<tr>
				<th>강의실 위치</th>
				<td colspan="3">${lectureRequestView.buldNm}(
					${lectureRequestView.fcltsNm} )</td>
				<th>승인구분</th>
				<td colspan="3">${lectureRequestView.confmSe}</td>
			</tr>
			<tr>
				<th>학점</th>
				<td>${lectureRequestView.coursePnt}학점</td>
				<th>학기</th>
				<td>
				 ${lectureRequestView.semstrSe}학기
				</td>
				<th>강의형태</th>
				<td>${lectureRequestView.lctreSe}</td>
				<th>이수구분</th>
				<td>${lectureRequestView.complSe}</td>
			</tr>
		</table>
		<br />
		<br />

		<div class="sub_tit04">
			<span></span>성적평가기준
		</div>
		<table class="table_style02 table_center">

			<tr>
				<th colspan="8">(백분율 100% 기준 산출)</th>
			</tr>
			<tr>
				<c:forEach items="${lectureRequestView.lectureActionPlanVO.lectureEvaluationStandardVOList}" var="evalution">
					<th>${evalution.scoreSe}</th>
					<td>${evalution.lctreEvlStdrReflct} %</td>
				</c:forEach>
			</tr>
		</table>
		<br />
		<br />
		<div class="sub_tit04">
			<span></span>강의개설정보
		</div>
		<table class="table_style02 table_center">
			<col width="15%">
			<col width="15%">
			<col width="15%">
			<col width="15%">
			<col width="15%">
			<col width="15%">
			<tr>
				<th colspan="6">강의목표</th>
			</tr>
			<tr>
				<td colspan="6">${lectureRequestView.lectureActionPlanVO.lctreAcnutnoGoal}</td>
			</tr>
			<tr>
				<th colspan="6">강의계획</th>
			</tr>
			<tr>
				<td colspan="6">${lectureRequestView.lectureActionPlanVO.lctreAcnutnoPlan}</td>
			</tr>
			<tr>
				<th colspan="6">참고사항</th>
			</tr>
			<tr>
				<td colspan="6">${lectureRequestView.lectureActionPlanVO.lctreAcnutnoRefer}</td>
			</tr>
		</table>

		<div class="sub_tit04">
			<span></span>강의시간표
		</div>
		<table class="table_style02 table_center">

			<tr>
				<th>수업 시간표</th>
				<c:forEach items="${lectureRequestView.lectureRequestInfoVOList}" var="time">
					 <td>${time.tmtbSe}</td>
				</c:forEach>
			</tr>
		</table>
		
		<div class="sub_tit04">
			<span></span>강의실
		</div>
		<table class="table_style02 table_center">

			<tr>
				<th>건물(호실)</th>
					<td>${lectureRequestView.buldNm} -  ${lectureRequestView.fcltsPurps}  (${lectureRequestView.fcltsNm})</td>
					
			</tr>
		</table>
		
		<security:authorize url="/staff">
			<div>
				<table class="table_style02 table_right table_center">
					<colgroup>
						<col width="30%">
						<col width="70%">
					</colgroup>
					<tr><th>교 수</th><td>${lectureRequestView.professor.prfsorNm}</td></tr>
					<tr><th>신청일자</th><td>${lectureRequestView.lctreReqstDate}</td></tr>				
					<tr><th>승인 구분</th><td>${lectureRequestView.confmSeNm}</td></tr>				
				</table>
			</div><br>
		
			
			<c:if test="${lectureRequestView.confmSe eq '반려'}">
					<div class="sub_tit04"><span></span>반려 사유</div> 
					<div>
						<table class="table_style02 table_center">
							<colgroup>
								<col width="100%">
							</colgroup>
							<tr>
								<th>반려 사유</th>
							</tr>
							<tr>
								<td>${lectureRequestView.lctreReqstReturn}</td>
							</tr>					
						</table>
					</div>					
			</c:if>
						
			<c:if test="${lectureRequestView.confmSe eq '승인 대기'}">
				<br>
				<div>		
					<button class="btn btn-danger ft_right" id="refuseBtn" data-toggle="modal" data-target="lectureRefuseModal">반려</button>
					<button class="btn btn-primary ft_right" id="applyBtn" data-toggle="modal" data-target="lectureRefuseModal" style="margin-right:10px; ">승인</button>
					<input type="hidden" id="lctreReqstNo" value="${lectureRequestView.lctreReqstNo }"/>
					<%--
					<form id="appliedLectureRequest" action="/staff/lecture/updateAppliedLectureRequest" method="post">
						<input type="hidden" id="lctreReqstNo" name="lctreReqstNo" value="${lectureRequestInfo.lctreReqstNo}">
						<input type="hidden" id="lctreNmpr" name="lctreNmpr" value="30">						
						<input type="hidden" id="lctreSe0" name="lctreSe" value="">						
						<input type="hidden" id="complSe" name="complSe" value="${lectureRequestInfo.complSe}">								
						<input type="hidden" id="fcltsNo" name="fcltsNo" value="${lectureRequestInfo.facilities.fcltsNo}">								
						<input type="hidden" id="prfsorNo" name="prfsorNo" value="${lectureRequestInfo.professor.prfsorNo}">								
						<input type="hidden" id="semstrSe" name="semstrSe" value="${lectureRequestInfo.semstrSe}">								
						<input type="hidden" id="complSe" name="complSe" value="${lectureRequestInfo.complSe}">								
						<input type="hidden" id="couresNo" name="couresNo" value="${lectureRequestInfo.course.courseNo}">								
						<input type="submit" value="승인" class="btn btn-primary ft_right" id="applyBtn" style="margin-right:10px; ">
					</form>
					--%>
				
				</div>								
			</c:if>
		</security:authorize>
		
	</div>
</div>
