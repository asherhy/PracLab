class Cars {
  private final String licenseNo;
  private final int availTime;

  Cars(String licenseNo, int availTime) {
    this.licenseNo = licenseNo;
    this.availTime = availTime;
  }

  public String toString() {
    String str;
    if (availTime <= 1) {
      str = String.format("%s (%s min away)", licenseNo, availTime);
    } else {
      str = String.format("%s (%s mins away)", licenseNo, availTime);
    }
    return str;
  }

  public int getAvailTime() {
    return availTime;
  }
}
