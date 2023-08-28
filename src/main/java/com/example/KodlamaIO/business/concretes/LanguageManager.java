package com.example.KodlamaIO.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.KodlamaIO.business.abstracts.LanguageService;
import com.example.KodlamaIO.dataAccess.abstracts.LanguageRepository;
import com.example.KodlamaIO.entities.concretes.Language;

@Service // bu sınıf bir business nesnesidir
public class LanguageManager implements LanguageService{
	private LanguageRepository languageRepository;
	
	
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}


	@Override
	public List<Language> getAll() {
	//iş kuralları
		return languageRepository.getAll();
	}
	
	

}
