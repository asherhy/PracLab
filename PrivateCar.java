class PrivateCar extends Cars {
 PrivateCar(String licenseNo, int availTime) {
  super(licenseNo, availTime);
 }

 @Override
 public String toString() {
  return "PrivateCar " + super.toString();
 }
}
