package com.example.KodlamaIO.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.KodlamaIO.entities.concretes.Language;


public interface LanguageRepository {
	List<Language> getAll();
	

	
}

