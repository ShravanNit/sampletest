package in.nit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sttab")
public class Student {

	@Id
	@Column(name="sid")
	private Integer sid;

	@Column(name="sname")
	private String sname;
	@Column(name="sfee")
	private double sfee;
	
}
