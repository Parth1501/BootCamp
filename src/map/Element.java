package map;
//Design and implement chemical elements
//
//The periodic table of chemical elements classifies and displays all chemical elements. Each chemical element has a unique symbolic name and atomic number (number of protons). Chemcial elements are grouped together by common characteristics (alkali metal, poor metal, ...) called the chemical series.
//
//Examples of chemical elements:
//
//H (hydrogenium): Hydrogen with atomic number 1.
//O (oxygenium): Oxygen with atomic number 8.
//K: Potassium with atomic number 19. It is an alkali metal.
//Zn: Zinc (from german Zink) with atomic number 30. It is a transition metal.
//Ga: Gallium with atomic number 31. It is a metal.
//We consider the following chemical series:
//
//Alkali metals are all chemical element with atomic number 3, 11, 19, 37, 55, or 87
//Transition metals are all chemical elements with atomic number from 21 to 31, 39 to 48, 72 to 80, and 104 to 112.
//Metalsare all chemical elements with atomic number 13, 49, 50, 81, 82, 83, 113, 114, 115, or 116.
//Design and implement a class ChemicalElement. The class should contain methods to retrieve for a chemical element its name, symbolic name, atomic number, and which type of metal it is (three different methods for each metal property). Implement these three methods without if or else, but
//
//one method with a switch
//one method with a single boolean expression
//one method with a static boolean-array where the index is the atomic number. You can initialize the array in the static initializer of the class ( static { ... } ).
//Make sure that you choose for each of these three methods the best of the above implementations. How do these variants differ with respect to the maintainability and performance of the program?
//
//Add constants for the above five examples of chemical elements to the class.
//
//The values of a chemical element must be unmutable: once a chemical element is constructed, its must not be possible to change its internal state (like String objects).
//
//Let the class have fields for name,symbolicNAme and atomicNumber
//Methods : isAlkaliMetal,isTransitionMetal and isMetal
public class Element {
//	private final String name;
//	private final String symbolicName;
//	private final int atomicNumber;
//	public Element(String name,String symbolicName,int atomicNumber) {
//		this.name=name;
//		this.symbolicName=symbolicName;
//		this.atomicNumber=atomicNumber;
//	}
//	public boolean isAlkaliMetal() {
//		switch(atomicNumber) {
//			case 3:
//				return true;
//			case 11:
//				return true;
//			case 19:
//				return true;
//			case 37:
//				return true;
//			case 55:
//				return true;
//			case 87:
//				return true;
//		}
//			
//		return false;
//	}
//	public boolean isMetal( ) {
//		return atomicNumber==13 || atomicNumber==49|| atomicNumber==50|| atomicNumber==81|| atomicNumber==82|| atomicNumber==83|| atomicNumber==113|| atomicNumber==114|| atomicNumber==115|| atomicNumber==116;
//		
//	}
//	public boolean isTransitionMetal() {
//		
//	}
//	
//	
//	public static void main(String[] args) {
//		
//	}

	private int atomicNumber;
	private String symbol;
	private String name;

	private static boolean[] alkaliMetals = new boolean[120];

	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}

	public Element(int atomicNumber, String symbol, String name) {
		super();
		this.atomicNumber = atomicNumber;
		this.symbol = symbol;
		this.name = name;
	}

	public boolean isAlkaliMetal() {

		return alkaliMetals[atomicNumber];
	}

	public boolean isTransitionMetal() {
		return (atomicNumber >= 21 && atomicNumber <= 31) || (atomicNumber >= 39 && atomicNumber <= 48)
				|| (atomicNumber >= 72 && atomicNumber <= 80) || (atomicNumber >= 104 && atomicNumber <= 112);
	}

	public boolean isMetal() {
		switch (atomicNumber) {
		case 13:
		case 49:
		case 50:
		case 81:
		case 82:
		case 83:
		case 113:
		case 114:
		case 115:
		case 116:
			return true;
		default:
			return false;
		}
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

	public String getSymbol() {
		return symbol;
	}

	public String getName() {
		return name;
	}
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Atomic number----> "+ atomicNumber;
		}
	
}
