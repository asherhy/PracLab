class Booking implements Comparable<Booking> {
  private final Cars car;
  private final RideServices ride;
  private final Request request;
  private final int waitingTime;
  private final int fare;

  Booking(Cars car, RideServices ride, Request request) throws IllegalArgumentException {
    if (car instanceof Cab && ride instanceof ShareARide) {
      throw new IllegalArgumentException(car.toString() + " does not provide the ShareARide service.");
    } else if (car instanceof PrivateCar && ride instanceof TakeACab) {
      throw new IllegalArgumentException(car.toString() + " does not provide the TakeACab service.");
    }
    this.car = car;
    this.ride = ride;
    this.request = request;
    waitingTime = car.getAvailTime();
    fare = ride.computeFare(request);
  }

  public int getFare() {
    return this.fare;
  }

  public int getWaitingTime() {
    return this.waitingTime;
  }

  @Override
  public int compareTo(Booking b) {
    if (fare < b.getFare()) {
      return - 1;
    } else if (fare > b.getFare()) {
      return 1;
    } else if (waitingTime < b.getWaitingTime()) {
      return -1;
    } else {
      return 1;
    }
  }
}
