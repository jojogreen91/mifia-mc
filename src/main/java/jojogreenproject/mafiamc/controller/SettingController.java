package jojogreenproject.mafiamc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jojogreenproject.mafiamc.model.ParticipantInfo;

@Controller
public class SettingController {

	@PostMapping("/setting/participant-info")
	public String citizenNumber(ParticipantInfo input) {
		ParticipantInfo participantInfo = new ParticipantInfo();

		participantInfo.setCitizenNumber(input.getCitizenNumber());
		participantInfo.setMafiaNumber(input.getMafiaNumber());
		participantInfo.setDoctorNumber(input.getDoctorNumber());
		participantInfo.setPoliceNumber(input.getPoliceNumber());

		return "setting";
	}
}
