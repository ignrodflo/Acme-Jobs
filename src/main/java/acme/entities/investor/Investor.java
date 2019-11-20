
package acme.entities.investor;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Investor extends DomainEntity {

	//Identificador
	private static final long	serialVersionUID	= 1L;
	//Atributos

	@NotBlank
	private String				name;

	@NotBlank
	private String				sector;

	@NotBlank
	private String				investingStatement;

	@Min(0)
	@Max(5)
	private Integer				star;

}
