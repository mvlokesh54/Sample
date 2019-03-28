package designPatterns;

abstract class Plan {
	protected Double rate;
	abstract void getRate();
	void getCalucalation(int units)
	{
		
		
		System.out.println(""+rate*units);
	}
	

}
