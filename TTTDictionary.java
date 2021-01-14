

public class TTTDictionary implements TTTDictionaryADT{
	
	TTTRecordLinkedList[] Dict;
	int numEle;
	
	public  TTTDictionary(int size) {	
		Dict = new TTTRecordLinkedList[size];
		numEle=0;
	}
	
	public int put(TTTRecord record) throws DuplicatedKeyException{
		TTTRecordNode node= new TTTRecordNode(record);
		int location =h(record.getConfiguration());
		
		if(Dict[location]!=null  &&  Dict[location].exists(record.getConfiguration())){
			throw new DuplicatedKeyException("Duplication!");
		}
		
		else if(Dict[location]==null){
			Dict[location]= new TTTRecordLinkedList(node);
			return 0;		
		}
		
		else{
			Dict[location].add(node);
			return 1;
		}
		
	}

	public void remove(String config) throws InexistentKeyException{
		
		TTTRecordLinkedList location = Dict[h(config)];
		
		if(location==null|| !location.exists(config)){
			throw new InexistentKeyException("No Key found");
		}
		else{
			location.remove(config);		
		} 
	}

	public TTTRecord get(String config) {
		TTTRecordLinkedList location = Dict[h(config)];
		return location.find(config);
		
	}

	public int numElements() {
		return numEle;
	}
	
	private int h(String layout){
		String [] values=layout.split("");		
		int length = values.length;
		double translation = 0;
		for(int i=0; i<length; i++){
			if(values[i]=="b") {
				translation+= 3 + (i*500);
			}
			if(values[i]=="x"){
				translation+= 2 +(i*200);
			}
			if(values[i]=="o"){
				translation+= 1+ (i*100);
			}
			if(values[i]==" "){
				translation+=0;
			}		
		}	
		return (int)translation;	
	}

}
