class Point {
	String id
	double x,y;
	String color;

	public Point(String id, double x, double y, String color) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	//TODO add new variable



	//TODO constructor

	//TODO setters and getters

	public void move (char xDirection, char yDirection) {
		if(xDirection == "L") {
			this.x--;
		}
		else if(xDirection == "R"){
			this.x++;
		}
		else return;
		if(yDirection == "U"){
			this.y++;
		} else if(yDirection == "D"){
			this.y--;
		}
		else return;
	}

	public void draw () {
		System.out.println("x: "+ this.x + "  y:" + this.y);
	}


	public String getId() {
		return id;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getColor() {
		return color;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setColor(String color) {
		this.color = color;
	}
}