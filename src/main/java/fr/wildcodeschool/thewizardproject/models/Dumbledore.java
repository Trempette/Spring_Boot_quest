package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	Outfit mOutfit;
	
	public Dumbledore(Outfit outfit) {
		this.mOutfit = outfit;
	}

	@Override
	public String giveAdvice() {
		
		return "I'm your father, Harry";
	}

	@Override
	public String changeDress() {
		return this.mOutfit.whatIsTheColor();
	}

}
