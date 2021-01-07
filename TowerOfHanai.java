class TowerOfHanai{
	 static void towerOfHanai(int n,char source,char extra, char destination)
	{
		if(n>=1){
			towerOfHanai(n-1,source,destination,extra);
			System.out.println(source+" to "+destination);
			towerOfHanai(n-1,extra,source,destination);
		}
	}
	public static void main(String args[])
	{
		//TowerOfHanai obj = new TowerOfHanai();
		towerOfHanai(1,'A','B','C');
	}
}