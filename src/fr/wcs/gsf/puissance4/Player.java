package fr.wcs.gsf.puissance4;



public class Player {
	
	
	public String name;
	public String jeton;
	
	public Player(String name, String jeton) {
		this.name = name;
		this.jeton = jeton;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJeton() {
		return jeton;
	}
	public void setJeton(String jeton) {
		this.jeton = jeton;
	}
	
    public static void yourTurn(String arg) {
    	System.out.println(arg);
    }
}