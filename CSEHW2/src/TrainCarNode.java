
public class TrainCarNode {
	private TrainCarNode prev;
	private TrainCarNode next;
	private TrainCar car;
	
	public TrainCarNode(TrainCar car) {
		this.car = car;
	}

	public String toString() {
		String x = "";
		if(car.getReference().isDangerous()) {
			x = "YES";
		}else {
			x = "NO";
		}
		return(x);
	}
	
	public TrainCarNode getPrev() {
		return prev;
	}
	public void setPrev(TrainCarNode prev) {
		this.prev = prev;
	}

	public TrainCarNode getNext() {
		return next;
	}
	public void setNext(TrainCarNode next) {
		this.next = next;
	}

	public TrainCar getCar() {
		return car;
	}
	public void setCar(TrainCar car) {
		this.car = car;
	}
}
