package jojogreenproject.mafiamc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jojogreenproject.mafiamc.model.ParticipantInfo;

@Controller
public class SettingController {

	@PostMapping("/setting/participant-info")
	public String postParticipantInfo(ParticipantInfo input) {
		ParticipantInfo participantInfo = ParticipantInfo.getParticipantInfo();

		participantInfo.setCitizenNumber(input.getCitizenNumber());
		participantInfo.setMafiaNumber(input.getMafiaNumber());
		participantInfo.setDoctorNumber(input.getDoctorNumber());
		participantInfo.setPoliceNumber(input.getPoliceNumber());

		return "member";
	}
}
