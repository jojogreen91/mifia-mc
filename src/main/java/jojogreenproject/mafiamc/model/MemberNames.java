package jojogreenproject.mafiamc.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MemberNames {

	private String names;
	private List<String> nameList;

	private static MemberNames memberNames = new MemberNames();

	private MemberNames() {
	}

	public static MemberNames getMemberNames() {
		return memberNames;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;

		String[] split = names.split(",");
		List<String> list = Arrays.stream(split).collect(Collectors.toList());
		setNameList(list);
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
}
