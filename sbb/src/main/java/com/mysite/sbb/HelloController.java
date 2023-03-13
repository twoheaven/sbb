package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller 애너테이션은 HelloController 클래스가 컨트롤러의 기능을 수행한다는 의미이다.
@Controller 
public class HelloController {
	//@GetMapping 애너테이션은 http://localhost:8080/hello URL 요청이 발생하면 hello 메서드가 실행됨을 의미한다. 즉, /hello URL과 hello 메서드를 매핑하는 역할을 한다.
	@GetMapping("/hello")

	//@ResponseBody 애너테이션은 hello 메서드의 응답결과가 문자열임을 나타낸다.
	@ResponseBody 
	public String hello() {
		return "Hello Spring Boot Board";
	}

}
