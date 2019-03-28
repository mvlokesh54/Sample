package Collection.hashmapInternal;

public class Key {
	
	String key;

	public Key(String key) {
		super();
		this.key = key;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		
		return key.equals(((Key)obj).key);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash= key.charAt(0);
		System.out.println("hash code for key :"+key+" = :"+hash);
		
		return hash;
	}
	

}
