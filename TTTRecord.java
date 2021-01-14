
public class TTTRecord {
	String CON;
	int SC;
	int LVL;
	
	public TTTRecord(String config, int score, int level) {
		String CON= config;
		int SC= score;
		int LVL= level;
		
	}
	
	public String getConfiguration() {
		return CON;
	}
	public int getScore(){
		return SC;
	}
	public int getLevel(){
		return LVL;
		
	}

}
