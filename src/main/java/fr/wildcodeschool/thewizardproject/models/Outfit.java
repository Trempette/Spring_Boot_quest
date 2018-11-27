package fr.wildcodeschool.thewizardproject.models;



public class Outfit {
	private String mColor;
	
	public Outfit(String color) {
        this.mColor = color;
    }
	
	public void setColor(String color) {
		this.mColor = color;
	}
	
	public String getGolor() {
		return mColor;
	}
	
	public String whatIsTheColor() {
		return "the color of the dress is fucking "+mColor;
	}
}
