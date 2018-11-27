package fr.wildcodeschool.thewizardproject.models;

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
		
		return this.mOutfit.whatIsTheColor();
	}

}
