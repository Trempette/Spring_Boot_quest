package fr.wildcodeschool.thewizardproject.controllers;

import fr.wildcodeschool.thewizardproject.models.Dumbledore;
import fr.wildcodeschool.thewizardproject.models.Outfit;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;

public class App {
	
	public void start() {
        WizardInterface dumbledore = new Dumbledore(new Outfit("blue with a little white"));
        System.out.println("");
        System.out.println("******************");
        System.out.println(myBook.readExtract());
        System.out.println("******************");
    }

}
