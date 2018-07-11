package net.jerickson.javajam.combatant;

import net.jerickson.javajam.combatant.classes.Tank;
import net.jerickson.javajam.weapon.DamageType;

public class Ginzolla extends Tank{

	public Ginzolla() {
		super(100, 5);
	}
	
	@Override
    public int takeDamage(int damage, DamageType type) {
        // Buddy is mad at me
        if(type.equals(DamageType.NECROMANTIC)) {
            damage *= 3;
        }
        else if(type.equals(DamageType.FIRE)||(type.equals(DamageType.ICE))) {
        		damage = (1/2) ;
        }
        return super.takeDamage(damage, type);
    }
	
	 public String toString() {
	        return "Ginzolla";
	    }
}
