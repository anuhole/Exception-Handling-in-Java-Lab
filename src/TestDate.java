public class TestDate {
    public static void main(String[] args) {
        Date date=new Date();
        try {
            date.setDate(31);
            date.setMonth(14);
            date.setYear(2005);
            System.out.println(date);

        }catch (DayOutOfRange | MonthOutOfRange e){
            System.out.println("Error :"+e.getMessage());
        }
       //
    }
}
