public class Point2{

	private int x; 
	private int y; 

	public Point2(int x, int y){
		this.x = x; 
		this.y = y;
	}
	public Point2(){
		this.x = 0; 
		this.y = 0; 
	}

	// following block recepie for equals we have; 
	public boolean equals(Object o){
		if( o == this)	// check with reference first 
			return true;
		if(!(o instanceof Point2)) // check if same type 
			return false;
		Point2 p2 = (Point2) o; // safe to cast 
		return this.x == p2.x && this.y == p2.y; // check all relevant fields  
	}


	// just to have a nice abstract function for the point class  
	public String toString(){
		return  this.x + " " + this.y; 
	}

}