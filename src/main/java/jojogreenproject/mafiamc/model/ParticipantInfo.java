package jojogreenproject.mafiamc.model;

public class ParticipantInfo {

	private Integer citizenNumber;
	private Integer mafiaNumber;
	private Integer doctorNumber;
	private Integer policeNumber;

	private static ParticipantInfo participantInfo = new ParticipantInfo();

	private ParticipantInfo() {
	}

	public static ParticipantInfo getParticipantInfo() {
		return participantInfo;
	}

	public Integer getCitizenNumber() {
		return citizenNumber;
	}

	public void setCitizenNumber(Integer citizenNumber) {
		this.citizenNumber = citizenNumber;
	}

	public Integer getMafiaNumber() {
		return mafiaNumber;
	}

	public void setMafiaNumber(Integer mafiaNumber) {
		this.mafiaNumber = mafiaNumber;
	}

	public Integer getDoctorNumber() {
		return doctorNumber;
	}

	public void setDoctorNumber(Integer doctorNumber) {
		this.doctorNumber = doctorNumber;
	}

	public Integer getPoliceNumber() {
		return policeNumber;
	}

	public void setPoliceNumber(Integer policeNumber) {
		this.policeNumber = policeNumber;
	}

	@Override
	public String toString() {
		return "ParticipantInfo{" +
			"citizenNumber=" + citizenNumber +
			", mafiaNumber=" + mafiaNumber +
			", doctorNumber=" + doctorNumber +
			", policeNumber=" + policeNumber +
			'}';
	}
}
