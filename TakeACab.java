class TakeACab extends RideServices {
 @Override
 public int computeFare(Request request) {
  return 200 + 33 * request.getDist();
 }

 @Override
 public String toString() {
  return "TakeACab";
 }
}
