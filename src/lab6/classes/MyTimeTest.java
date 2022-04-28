package lab6.classes;

class MyTimeTest {

  public static void main(String[] args) {
    MyTime time1 = new MyTime();
    System.out.println(time1);
    time1.setTime(12, 34, 56);
    System.out.println(time1);

    MyTime time2 = new MyTime(23, 59, 0);
    System.out.println(time2);

    time2.setHour(22);
    System.out.println("hour = " + time2.getHour());
    time2.setMinute(58);
    System.out.println("minute = " + time2.getMinute());
    time2.setSecond(59);
    System.out.println("second = " + time2.getSecond());
    System.out.println(time2);

    System.out.println(time2.nextSecond());
    System.out.println(time2.nextMinute());
    System.out.println(time2.nextHour());

    System.out.println(time2.previousHour());
    System.out.println(time2.previousMinute());
    System.out.println(time2.previousSecond());
  }
}
