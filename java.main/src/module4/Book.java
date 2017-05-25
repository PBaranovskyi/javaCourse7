package module4;

/**
 * Created by citsym on 18.05.17.
 */
public class Book implements Cloneable {

   private String name;
   private String authorName;
   private int pageCount;

    public Book(String name, String authorName, int pageCount) {
        this.name = name;
        this.authorName = authorName;
        this.pageCount = pageCount;
    }


    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (pageCount != book.pageCount) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        return !(authorName != null ? !authorName.equals(book.authorName) : book.authorName != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + pageCount;
        return result;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    //
////    @Override
//    public int compareTo(Book book) {
//
//        int result = this.getAuthorName().compareTo(book.getAuthorName());
//
//        if (result == 0){
//            return this.getPageCount() - book.getPageCount();
//        } else {
//            return result;
//        }
//
//    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }


    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
