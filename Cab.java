class Cab extends Cars {
 Cab(String licenseNo, int availTime) {
  super(licenseNo, availTime);
 }

 @Override
 public String toString() {
  return "Cab " + super.toString();
 }
}
