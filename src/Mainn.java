public class Mainn {

    interface Readbale {
        public String getContent();
    }

    static class Book implements Readbale {
        @Override
        public String getContent() {
            return "Book Content";
        }
    }

    static class Magazine implements Readbale {
        @Override
        public String getContent() {
            return "Magazine Content";
        }
    }

    static class MyBook {
        private Readbale readbale;

        public void setReadbale(Readbale readbale) {
            this.readbale = readbale;
        }

        public void read() {
            System.out.println(this.readbale.getContent());
        }

    }

    public static void main(String[] args) {
        MyBook myBook = new MyBook();
        Book book = new Book();
        myBook.setReadbale(book);
        myBook.read();
    }


}
