
package acme.entities.companyRecords;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CompanyRecord extends DomainEntity {

	//Identificador

	private static final long	serialVersionUID	= 1L;

	//Atributos

	@NotBlank
	private String				companyname;

	@NotBlank
	private String				sector;

	@NotBlank
	private String				ceoname;

	@NotBlank
	private String				activdescription;

	@NotBlank
	@URL
	private String				website;

	// Message added to pattern to make the error message more readable to users. Not completely needed
	@NotBlank
	@Pattern(regexp = "^(?:((?:[+][0-9]{1,3})?(?:[ ]{1})?(?:[\\(]{1})?(?:[0-9]{0,4})?(?:[\\)]{1})?[ ]{1})?)([0-9]{6,10})$", message = "+XX (XXX) YYYYYYXXXX")
	private String				phone;

	@NotBlank
	@Email
	private String				email;

	private boolean				incorporated;

	@Pattern(regexp = "^[0-5]|\\s*$")
	private String				rating;
}
