package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("Gandalf")
public class Gandalf implements WizardInterface{
	Outfit mOutfit;
	
	public Gandalf(Outfit outfit) {
		this.mOutfit = outfit;
	}
	
	@Override
	public String giveAdvice() {
		return "Use the Force, Frodo";
	}

	@Override
	public String changeDress() {		
		return this.mOutfit.changeDress();
	}

}
