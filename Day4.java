class Day4 {
  private int year;
  private int month;
  private int day;
  private int dayOfWeek;
  
  private String[] dayofweek = {"“ú", "Œ", "‰Î", "…", "–Ø", "‹à", "“y"};
  
  public Day4(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
    
    if (this.month == 1 || this.month == 2) {
      this.month += 12;
      this.year -= 1;
    }
    dayOfWeek = (this.year + this.year / 4 - this.year / 100 + this.year / 400 + (13 * this.month + 8) / 5 + this.day) % 7;
    
    if (this.month == 13 || this.month == 14) {
      this.month = month;
      this.year = year;
    }
  
  }
  
  public String toFormatString() {
    return year + "”N" + month + "Œ" + day + "“ú(" + dayofweek[dayOfWeek] + ")";
  }


}