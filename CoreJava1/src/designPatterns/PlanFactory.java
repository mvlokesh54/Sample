package designPatterns;

class PlanFactory {
	
	public Plan getPlanFactory(String planname)
	{
		if (planname==null)
		{
			return null;
		}
		
		if(planname.equalsIgnoreCase("DomasticPlan")){
			return new DemosticPlan();
		}
		else if (planname.equalsIgnoreCase("FactoryPlan")) {
			return new FactoryPlan();
		}
		else if (planname.equalsIgnoreCase("commeritailPlan"))
		{
			return new CommertialPaln();
		}
		
		return null;
	}

	
}
