class Canvas {
	List<Point> pointsList = new LinkedList<>();

	void addPoint(Point point){
		pointsList.add(point);
	void deletePoint(){
		pointsList.remove();
	}
}