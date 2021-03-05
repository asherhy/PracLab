class Request{
  private final int distance;
  private final int noOfPass;
  private final int time;

  Request(int dist, int passenger, int time) {
    distance = dist;
    noOfPass = passenger;
    this.time = time;
  }

  public boolean checkPeak() {
    return time >= 600 && time <= 900; 
  }

  public int getDist() {
    return this.distance;
  }

  public int getPassenger() {
    return this.noOfPass;
  }
  
}
