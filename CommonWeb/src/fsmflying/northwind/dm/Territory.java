
package fsmflying.northwind.dm;


public class Territory{
	
	


	private String mTerritoryID;
	private String mTerritoryDescription;
	private int mRegionID;

	public String getTerritoryID(){
		 return this.mTerritoryID;
	}

	public void setTerritoryID(String territoryID){
		 this.mTerritoryID = territoryID ;
	}

	public String getTerritoryDescription(){
		 return this.mTerritoryDescription;
	}

	public void setTerritoryDescription(String territoryDescription){
		 this.mTerritoryDescription = territoryDescription ;
	}

	public int getRegionID(){
		 return this.mRegionID;
	}

	public void setRegionID(int regionID){
		 this.mRegionID = regionID ;
	}


}
