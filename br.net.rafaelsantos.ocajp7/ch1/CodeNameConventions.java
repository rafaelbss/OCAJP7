class CodeNameConventions {
	
	//Private instance var
	private String name;
	private boolean valid;

	//Constants
	private static final String FLAG = "ok";

	//Getter and Setter publics
	public void setName(String name) { this.name = name; }
	public String getName() { return this.name; }

	public void setValid(boolean valid) { this.valid = valid; }
	public boolean isValid() { return this.valid; }
}