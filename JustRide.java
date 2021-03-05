class JustRide extends RideServices {
  @Override 
  public int computeFare(Request request) {
    int additionalFare;
    if (request.checkPeak()) {
      additionalFare = 500;
    } else {
      additionalFare = 0;
    }
    return 22 * request.getDist() + additionalFare;
  }

  @Override
  public String toString() {
    return "JustRide";
  }
}
