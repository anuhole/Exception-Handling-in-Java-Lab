public class TestBook {
    public static void main(String[] args) {
        try {
            Book book =new Book(101,"AAA","BBB",1200,"Read");
            System.out.println(book);
            book.incrementPrice(25);
            System.out.println(book);

        }catch (PriceOutOfEception e){
            System.out.println(e.getMessage());
        }
    }
}
