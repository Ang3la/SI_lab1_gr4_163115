class Point {
	String id;
	double x,y;

	//TODO add new variable
	String color;

	//TODO constructor
	public Point(String id, double x, double y, String color) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	//TODO setters and getters
	public String getId() {
		return this.id;
	}

	public String setId(String id) {
		this.id = id;
	}

	public double getX() {
		return this.x;
	}

	public double setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public double setY(double y) {
		this.y = y;
	}
	
	public String getColor() {
		return this.color;
	}

	public String setColor(String color) {
		this.color = color;
	}

	public void move (char xDirection, char yDirection) {
		if (xDirection == 'U') {
			this.x += 1;
		}

		if (xDirection == 'D') {
			this.x -= 1;
		}

		if (yDirection == 'R') {
			this.y += 1;
		}

		if (yDirection == 'L') {
			this.y -= 1;
		}
	}

	public void draw () {
		return "The point's location is: X -> " + this.x +"; Y -> " + this.y;
	}



}
