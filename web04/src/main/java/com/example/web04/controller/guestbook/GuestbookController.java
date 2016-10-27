package com.example.web04.controller.guestbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestbookController {

	@RequestMapping("/guestbook/list")
	public void list(){
		System.out.println("방명록이 호출되었습니다.");
	}
}
