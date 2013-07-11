package hibernate.test.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "orchestration_task")
public class OrchestrationTask {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "task")
	private Set<OrchestrationProperty> properties = new HashSet<OrchestrationProperty>();

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Set<OrchestrationProperty> getProperties() {
		return this.properties;
	}

	public void setProperties(final Set<OrchestrationProperty> properties) {
		this.properties = properties;
	}

	public void addProperty(final OrchestrationProperty property) {
		property.setTask(this);
		this.properties.add(property);
	}


}
