package hiber01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Teachers02")
@Entity
public class Teachers01 {
    @Id
	private int id;
    @Column(name="fullname")
	private String name;
	private String subject;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getSubject() {
		return subject;
	}
	void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Students01 [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	
	
}
