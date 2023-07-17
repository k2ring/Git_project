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
//		System.out.println("����� RestController��");
		logger.info("����� RestController��");
		return "nice";

	}

	
	
	// �߿� @RestController�� ������ View�� �������� ���� ä �����͸� �����ϹǷ� ���� ��������
	// ���ܰ� �߻��� �� �ִ�.
	// ���ܿ� ���� �� �� �����ϰ� ��� �ʿ���
	// �׷� ��� REsponseEntity Ŭ������ ����ϸ� ��, �� JSON�̳� HTML �ڹٽ�ũ��Ʈ�� �������� ������ �� �־� ��
	// ������� ����� ���� �ۿ��� ���� �� �ֹ��� ���� ������ ���ϰ� �ɸ� ���, ���� �ð��� ������
	// �ֹ��� ó������ ������ �������� ResponseEntity Ŭ������ HTTP ���� �ڵ带 �����Ͽ� ������ �����ϵ��� �ϸ� ��
	// �׷��� �ۿ��� HTTP ���� �ڵ带 �ν��� �� �ִ� ����� �̿��� �ֹ� ���³� ���� �߻��� �˷���
	
	//�б�
	// 200 OK ��û�� ���������� �Ϸ�
	// 201 CREATED ��û�� �������̰� �� ��� ���ο� ���ҽ� ����
	
	
//	HttpEntity	����� �������� ������ HTTP ��û �Ǵ� ���� ��ƼƼ�� ��Ÿ���ϴ�.
	@RequestMapping("/hi2") // HttpStatusCode ���� �ڵ带 �߰��ϴ� HttpEntity�� Ȯ���Դϴ�.
							// RestTemplate�� @controller �޼��忡�� ���˴ϴ�.
	ResponseEntity fsdfsd2() {
//		System.out.println("����� RestController��2");
		HttpHeaders responsHeaders = new HttpHeaders();

		responsHeaders.add("Content-Type", "text/html;charset=utf-8");

		logger.info("����� RestController��2");
		// return "nice" + "�ѱ�" ;
		return new ResponseEntity("hihi" + "�ѱ�", responsHeaders, HttpStatus.CREATED);

	}

	
//	@RequestMapping("/hi2") // HttpStatusCode ���� �ڵ带 �߰��ϴ� HttpEntity�� Ȯ���Դϴ�.
//	// RestTemplate�� @controller �޼��忡�� ���˴ϴ�.
//	ResponseEntity fsdfsd2() {
////		System.out.println("����� RestController��2");
//		HttpHeaders responsHeaders = new HttpHeaders();
//		
//		responsHeaders.add("Content-Type", "text/html;charset=utf-8");
//		
//		logger.info("����� RestController��2");
//		// return "nice" + "�ѱ�" ;
//		return new ResponseEntity("hihi" + "�ѱ�", responsHeaders, HttpStatus.CREATED);
//		
//	}
	
	
	// �������� ��� ��ü ���� �� Ŭ���̾�Ʈ�� ��� ��ü ��� (jackson-databind �ʿ�)
	@RequestMapping("/member")
	public MemberVO member() {
		MemberVO vo = new MemberVO();
		vo.setId("hong");
		vo.setPwd("1234");
		vo.setName("ȫ�浿");
		vo.setEmail("hong@test.com");
		return vo;
	}

	
	// �ݴ�� Ŭ���̾�Ʈ���� ������ ��� ��ü�� ������ ������ �α�â���� ���(Ajax ��� �̿�)
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
			vo.setName("ȫ�浿" + i);
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
//			vo.setName("�̼���" + i);
//			vo.setEmail("lee" + i + "@test.com");
//			list.add(vo);
//		}
//		return new ResponseEntity(list, HttpStatus.INTERNAL_SERVER_ERROR);
//	}

	
	@RequestMapping("/addMember")
	ResponseEntity addMember() {

		HttpHeaders responseHeaders = new HttpHeaders();

		String message = "<script>n" + "" + "	alert('��ȸ�� ���');" + "	location.href('/pro29/memberList')" + ""
				+ "</script>";

		return new ResponseEntity(message, responseHeaders, HttpStatus.CREATED);
	}

	
	@RequestMapping("article/{articleNumber}")
	void pathVariableEx(@PathVariable("articleNumber") String articleNumber) {
		logger.info("PathVariableEx �޼��忡 ����");
		logger.info(articleNumber);
	}

	
	@RequestMapping("article2/{articleNumber}")
	String pathVariableEx2(@PathVariable("articleNumber") String articleNumber) {
		logger.info("PathVariableEx �޼��忡 ����");
		logger.info(articleNumber);
		return articleNumber;
	}

	
	@RequestMapping("article3/{articleNumber}")
	int pathVariableEx3(@PathVariable("articleNumber") int articleNumber) {
		logger.info("PathVariableEx �޼��忡 ����");
		logger.info(String.valueOf(articleNumber));
		return articleNumber;
	}

}
