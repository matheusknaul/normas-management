package com.matheusknaul.normas_management.domain.enums;

public enum VerificationStatus {


	ERROR(0, "ERROR"), PENDING(1, "PENDING"), OK(2, "OK"), NOT_OK(3, "NOT OK");
	
	private Integer code;
	private String description;
	
	VerificationStatus(Integer code, String description){
		this.code = code;
		this.description = description;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	@SuppressWarnings("unused")
	public static VerificationStatus toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}

		for (VerificationStatus vs : VerificationStatus.values()) {
			if (codigo.equals(vs.getCode())) {
				return vs;
			}
		}
		throw new IllegalArgumentException("Status inválido!");
	}
}
