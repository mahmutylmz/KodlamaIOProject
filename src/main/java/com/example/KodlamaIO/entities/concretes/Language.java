package com.example.KodlamaIO.entities.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Language {
	private int id;
	private String name;

}
