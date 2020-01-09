public class BookList {
    public String searchBook(String bookName) {
        String location = null;
        if (bookName == "昆虫図鑑") {
            location = "右奥の棚";
        }
        return location;
    }
}