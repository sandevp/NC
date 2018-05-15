package com.example.NC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Giftcategory")
public class Giftcategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long GiftcategoryId;
	
	@NotBlank
	private String Giftcategoryname;
	
	@Column(columnDefinition="tinyint(1) default 1")
	private int Status;
}
