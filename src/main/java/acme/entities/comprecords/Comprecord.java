
package acme.entities.comprecords;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Comprecord extends DomainEntity {

	//Identificador

	private static final long	serialVersionUID	= 1L;

	//Atributos

	@NotBlank
	@NotNull
	private String				companyname;

	@NotBlank
	@NotNull
	private String				sector;

	@NotBlank
	@NotNull
	private String				ceoname;

	@NotBlank
	@NotNull
	private String				activdescription;

	@NotBlank
	@NotNull
	private String				website;

	@NotBlank
	@NotNull
	@Pattern(regexp = "^((?:[+][0-9]{1,3})?(?:[ ]{1})?(?:[\\(]{1})?(?:[0-9]{0,4})?(?:[\\)]{1})?[ ]{1}[0-9]{6,10})$")
	private String				phone;

	@NotBlank
	@Email
	@NotNull
	private String				email;

	@NotNull
	private Boolean				incorporated;

	@Range(min = 0, max = 5)
	private String				rating;
}
