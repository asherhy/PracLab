class ShareARide extends RideServices {
  @Override
  public int computeFare(Request request) {
    int additionalFare;
    if (request.checkPeak()) {
     additionalFare = 500;
    } else {
     additionalFare = 0;
    }
    return 50 * request.getDist() / request.getPassenger()
      + additionalFare;
  }

  @Override 
  public String toString() {
    return "ShareARide";
  }
}
