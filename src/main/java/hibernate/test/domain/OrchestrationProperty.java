package hibernate.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrchestrationProperty {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String value;

	@ManyToOne
	@JoinColumn(name = "TASK_ID", nullable = false)
	private OrchestrationTask task;

	public OrchestrationProperty() {
	}

	public OrchestrationProperty(final String name, final String value) {
		this.name = name;
		this.value = value;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

	public OrchestrationTask getTask() {
		return this.task;
	}

	public void setTask(final OrchestrationTask task) {
		this.task = task;
	}

}
