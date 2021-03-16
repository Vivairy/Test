interface BiBicycle {
		void changeCadence (int newValue);
		void changeGear (int newValue);
		void speedUp (int increment);
		void applyBreaks (int decrement);
	}

class Bicycle implements BiBicycle {

	int cadence = 0;
	int gear = 1; 
	int speed = 0;
	
	public void changeCadence (int newValue) {
		cadence = newValue;
	}
	
	public void changeGear (int newValue) {
		gear = newValue;
	}
	
	public void speedUp (int increment) {
		speed = speed + increment;
	}
	
	public void applyBreaks (int decrement) {
		speed = speed - decrement;
	}
	
	void printStates () {
		System.out.println("cadence:" + cadence + " gear:" + gear + " speed:" + speed);
	}
	
	public static void main (String[] args) {
		Bicycle bike1 = new Bicycle();
		MountainBike bike3 = new MountainBike();
		
		bike1.changeCadence(3);
		bike1.changeGear(5);
		bike1.speedUp(15);
		bike1.applyBreaks(5);
		bike1.printStates();
		
		bike3.changeCadence(60);
        bike3.speedUp(13);
        bike3.changeGear(4);
		bike3.applyBreaks(5);
        bike3.assignColor("Yellow");
        bike3.printStates();
		
	}
	
	static class MountainBike extends Bicycle {
        String color;

        void assignColor(String newColor) {
            color = newColor;
        }

        void printStates() {
            System.out.println("cadence:" +
                    cadence + " speed:" +
                    speed + " gear:" +
                    gear + " color:" + color);
        }
    }
	
	
	
}
		
		
	
	