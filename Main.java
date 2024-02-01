package packageSketch;
public class Main{

public static void main(String[] args) {

	System.out.println("FAST ATTACK METHOD:\n");
	AnnalynsInfiltration.canFastAttack(true);
	AnnalynsInfiltration.canFastAttack(false);
	System.out.println("\n");


	System.out.println("SPY METHOD:\n");
	AnnalynsInfiltration.canSpy(false, true, false);
	AnnalynsInfiltration.canSpy(false, false, false);
	System.out.println("\n");


	System.out.println("SIGNAL PRISONER METHOD:\n");
	AnnalynsInfiltration.canSignalPrisoner(false, true);
	AnnalynsInfiltration.canSignalPrisoner(false, false);
	System.out.println("\n");
	
	System.out.println("FREE PRISONER METHOD:\n");
	AnnalynsInfiltration.canFreePrisoner(true, false, false, true);
	AnnalynsInfiltration.canFreePrisoner(false, false, true, false);
	AnnalynsInfiltration.canFreePrisoner(false, false, false, false);
	
	
	
	
}// end of main
}// end of it all