

import be.jforce.components.validators.CvsValidator;
import be.jforce.components.validators.DssValidator;

public enum ValidationType {

	DSS_VALIDION(DssValidator.class),CVS_VALIDATION(CvsValidator.class),LINK_VALIDATION(null),CHOICEVALIDATION(null);
	
	private Class validatorClass;
	
	private ValidationType(Class validatorClass){
		this.validatorClass=validatorClass;
	}

	public Class getValidatorClass() {
		return validatorClass;
	}

	public void setValidatorClass(Class validatorClass) {
		this.validatorClass = validatorClass;
	}
	
	public ValidationType[] getVcsValidationTypes(){
		return new ValidationType[]{ValidationType.DSS_VALIDION,ValidationType.CVS_VALIDATION}; 
	}
	
}
