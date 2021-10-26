package mvc.quest7;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactValidator implements ConstraintValidator<IsContactValid, String> {

	public void initialize(IsContactValid arg0) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String contact, ConstraintValidatorContext arg1) {
		if (contact.length() == 10) {
			for (int i = 0; i < contact.length(); i++) {
				if (!(contact.charAt(i) >= '0' && contact.charAt(i) <= '9'))
					return false;
			}
			return true;
		}
		return false;
	}

}
