package fr.ebook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "typology")

public class Typology {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="typology_id")
	private int id;
	
	@Column(name = "typology_label", length = 100, nullable = false)
	@NotBlank(message = "Le libell� ne peut �tre vide.")
	@Size(max = 100, message = "Le libell� ne peut pas faire plus de 100 caract�res.")
	private String label;
	
	// Getters et setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	public Typology() {
		
	}

	
}
