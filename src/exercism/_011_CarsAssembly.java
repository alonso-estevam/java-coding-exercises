package exercism;

public class _011_CarsAssembly {
    public static void main(String[] args) {
        CarsAssemble carsAssemble = new CarsAssemble();
        double res = carsAssemble.workingItemsPerMinute(6);
        System.out.println(res);
    }
    public static class CarsAssemble {
        private static final int CARS_PER_HOUR = 221;

        public double productionRatePerHour(int speed) {
            double successRate = successRate(speed);
            return speed * CARS_PER_HOUR * successRate;
        }

        public int workingItemsPerMinute(int speed) {
            return (int) productionRatePerHour(speed) / 60;
        }

        private double successRate(int speed){
            if(speed >= 1 && speed <= 4){
                return 1.0;
            } else if (speed >= 5 && speed <= 8) {
                return 0.9;
            } else if (speed == 9) {
                return 0.8;
            } else {
                return 0.77;
            }
        }
    }
}

