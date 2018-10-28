public class Point3 extends Point2{

	private int z; 

	public Point3(int x, int y, int z){
		super(x,y);
		this.z = z; 
	}
	public Point3(){
		super();
		this.z = 0; 
	}

	// above is liskov broken implementation of equals 

	public boolean equals(Object p){
		if (p instanceof Point3)
			return this.equals((Point3) p); 
		return super.equals(p);
	}

	public boolean equals(Point2 p){
		if (p instanceof Point3)
			return this.equals((Point3) p); 
		return super.equals(p);
	}

	public boolean equals(Point3 p){
		if (p == null || z != p.z)
			return false; 
		return super.equals(p);
	}

	// just to have a nice abstract function for the point class  
	public String toString(){
		return  super.toString() + " " +this.z;
	}


}