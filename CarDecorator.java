package slip12;

public class CarDecorator implements Car {
    private final Car car;

    public CarDecorator(Car c) {
        this.car = c;
    }


	@Override
	public void assemble() {
		// TODO Auto-generated method stub
        this.car.assemble();


	}

}
