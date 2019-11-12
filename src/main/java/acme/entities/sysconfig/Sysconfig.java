
package acme.entities.sysconfig;

import javax.persistence.Entity;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Sysconfig extends DomainEntity {

	// Identificador

	private static final long	serialVersionUID	= 1L;

	// Atributos

	private String				spamwords;

	private Double				threshold;

	// Atributos derivados

}
