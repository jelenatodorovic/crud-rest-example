package example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Document")
public class Document {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "date")
	@JsonFormat(pattern = "MM/dd/yyyy")
	private Date date;
	
	@Column(name = "name")
	private String name;
	
	public Document() {}
	
	public Document(String code, Date date, String name) {
		this.code = code;
		this.date = date;
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCode() {
		return code;
	}

	public Date getDate() {
		return date;
	}
	
	public String getName() {
		return name;
	}
}
