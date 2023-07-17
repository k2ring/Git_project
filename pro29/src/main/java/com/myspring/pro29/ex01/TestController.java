package com.myspring.pro29.ex01;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // A convenience annotation that is itself annotated with @Controllerand
				// @ResponseBody.
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	
	@RequestMapping("/nice")
	String fsdfsd() {
//		System.out.println("여기는 RestController다");
		logger.info("여기는 RestController다");
		return "nice";

	}

	
	
	// 중요 @RestController는 별도의 View를 제공하지 않은 채 데이터를 전달하므로 전달 과정에서
	// 예외가 발생할 수 있다.
	// 예외에 대해 좀 더 세밀하게 제어가 필요함
	// 그럴 경우 REsponseEntity 클래스를 사용하면 됨, 즉 JSON이나 HTML 자바스크립트를 브라우저로 전송할 수 있어 편리
	// 예를들어 모바일 쇼핑 앱에서 명절 때 주문이 몰려 서버에 부하가 걸릴 경우, 일정 시간이 지나도
	// 주문이 처리되지 않으면 서버에서 ResponseEntity 클래스에 HTTP 상태 코드를 설정하여 앱으로 전송하도록 하면 됨
	// 그러면 앱에서 HTTP 상태 코드를 인식할 수 있는 기능을 이용해 주문 상태나 예외 발생을 알려줌
	
	//압기
	// 200 OK 요청이 성공적으로 완료
	// 201 CREATED 요청이 성공적이고 그 결과 새로운 리소스 생성
	
	
//	HttpEntity	헤더와 본문으로 구성된 HTTP 요청 또는 응답 엔티티를 나타냅니다.
	@RequestMapping("/hi2") // HttpStatusCode 상태 코드를 추가하는 HttpEntity의 확장입니다.
							// RestTemplate과 @controller 메서드에서 사용됩니다.
	ResponseEntity fsdfsd2() {
//		System.out.println("여기는 RestController다2");
		HttpHeaders responsHeaders = new HttpHeaders();

		responsHeaders.add("Content-Type", "text/html;charset=utf-8");

		logger.info("여기는 RestController다2");
		// return "nice" + "한글" ;
		return new ResponseEntity("hihi" + "한글", responsHeaders, HttpStatus.CREATED);

	}

	
//	@RequestMapping("/hi2") // HttpStatusCode 상태 코드를 추가하는 HttpEntity의 확장입니다.
//	// RestTemplate과 @controller 메서드에서 사용됩니다.
//	ResponseEntity fsdfsd2() {
////		System.out.println("여기는 RestController다2");
//		HttpHeaders responsHeaders = new HttpHeaders();
//		
//		responsHeaders.add("Content-Type", "text/html;charset=utf-8");
//		
//		logger.info("여기는 RestController다2");
//		// return "nice" + "한글" ;
//		return new ResponseEntity("hihi" + "한글", responsHeaders, HttpStatus.CREATED);
//		
//	}
	
	
	// 서버에서 멤버 객체 생성 후 클라이언트에 멤버 객체 찍기 (jackson-databind 필요)
	@RequestMapping("/member")
	public MemberVO member() {
		MemberVO vo = new MemberVO();
		vo.setId("hong");
		vo.setPwd("1234");
		vo.setName("홍길동");
		vo.setEmail("hong@test.com");
		return vo;
	}

	
	// 반대로 클라이언트에서 서버로 멤버 객체를 보내서 서버의 로그창에서 찍기(Ajax 방식 이용)
	@RequestMapping(value = "/member2", method = RequestMethod.POST)
	void member2(@RequestBody MemberVO vo) {
		logger.info(vo.toString());
	}

	
	@RequestMapping("/memberList")
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i = 0; i < 5; i++) {
			MemberVO vo = new MemberVO();
			vo.setId("hong" + i);
			vo.setPwd("123" + i);
			vo.setName("홍길동" + i);
			vo.setEmail("hong" + i + "@test.com");
			list.add(vo);
		}
		return list;
	}

	
//	@RequestMapping("/membersList2")
//	public ResponseEntity<List<MemberVO>> listMembers2() {
//		List<MemberVO> list = new ArrayList<MemberVO>();
//		for (int i = 0; i < 5; i++) {
//			MemberVO vo = new MemberVO();
//			vo.setId("lee" + i);
//			vo.setPwd("123" + i);
//			vo.setName("이순신" + i);
//			vo.setEmail("lee" + i + "@test.com");
//			list.add(vo);
//		}
//		return new ResponseEntity(list, HttpStatus.INTERNAL_SERVER_ERROR);
//	}

	
	@RequestMapping("/addMember")
	ResponseEntity addMember() {

		HttpHeaders responseHeaders = new HttpHeaders();

		String message = "<script>n" + "" + "	alert('새회원 등록');" + "	location.href('/pro29/memberList')" + ""
				+ "</script>";

		return new ResponseEntity(message, responseHeaders, HttpStatus.CREATED);
	}

	
	@RequestMapping("article/{articleNumber}")
	void pathVariableEx(@PathVariable("articleNumber") String articleNumber) {
		logger.info("PathVariableEx 메서드에 들어옴");
		logger.info(articleNumber);
	}

	
	@RequestMapping("article2/{articleNumber}")
	String pathVariableEx2(@PathVariable("articleNumber") String articleNumber) {
		logger.info("PathVariableEx 메서드에 들어옴");
		logger.info(articleNumber);
		return articleNumber;
	}

	
	@RequestMapping("article3/{articleNumber}")
	int pathVariableEx3(@PathVariable("articleNumber") int articleNumber) {
		logger.info("PathVariableEx 메서드에 들어옴");
		logger.info(String.valueOf(articleNumber));
		return articleNumber;
	}

}
