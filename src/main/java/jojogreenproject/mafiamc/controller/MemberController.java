package jojogreenproject.mafiamc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jojogreenproject.mafiamc.model.MemberNames;

@Controller
public class MemberController {

	@PostMapping("/member/member-info")
	public String postMemberNames(String names) {
		MemberNames memberNames = MemberNames.getMemberNames();

		memberNames.setNames(names);

		return "member";
	}
}
