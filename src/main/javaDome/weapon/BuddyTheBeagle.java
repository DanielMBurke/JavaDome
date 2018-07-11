package net.jerickson.javajam.weapon;

import net.jerickson.javajam.weapon.classes.Pet;

public class BuddyTheBeagle extends Pet{
	 
	public BuddyTheBeagle() {
	        super(20, 1);
	    }

	    public String toString() {
	        return "Buddy the Beagle";
	    }
	    //Buddy bites
        public DamageType getDamageType() {
	        return DamageType.PUNCTURE;
	    }

		
	}

