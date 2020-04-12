class Canvas {
	List<Point> pointsList = new ArrayList<Point>();

	// add point to the list of points
	public void addPoint(Point point) {
		pointsList.add(point);
	}

	// move all points in the Canvas class
	public void moveAllPoints(char xDirection, char yDirection) {
		for (int i=0; i < pointsList.length; i++) {
			 pointsList[i].move(xDirection, yDirection);
		}

	}
}
