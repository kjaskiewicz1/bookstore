package Bookstore.Bookstore.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "Books")
public class Bookstore {

        @Id
        @Column
        private long ISBN;
        @Column(name ="Book Name")
        private String bookName;
        @Column(name ="Book Description")
        private String bookDescription;
        @Column(name ="Price")
        private double price;
        @Column(name ="Author First Name")
        private String authorFirst;
        @Column(name ="Author Last Name")
        private String authorLast;
        @Column(name ="Genre")
        private String genre;
        @Column(name ="Publisher")
        private String publisher;
        @Column(name ="Year Published")
        private int yearPublished;
        @Column(name ="Copies Sold")
        private int copiesSold;
        @Column(name ="Rating")
        private float rating;
        @Column(name ="Star Rating")
        private double starRating;

        public Bookstore() {
        }
        public Bookstore(long ISBN, String bookName, String bookDescription, double price, String authorFirst, String authorLast, String genre, String publisher, int yearPublished, int copiesSold, float rating, double starRating) {
                this.ISBN = ISBN;
                this.bookName = bookName;
                this.bookDescription = bookDescription;
                this.price = price;
                this.authorFirst = authorFirst;
                this.authorLast = authorLast;
                this.publisher = publisher;
                this.yearPublished = yearPublished;
                this.copiesSold = copiesSold;
                this.rating = rating;
                this.genre = genre;
                this.starRating = starRating;
        }

        public long getISBN() {
                return ISBN;
        }

        public void setISBN(long ISBN) {
                this.ISBN = ISBN;
        }

        public String getBookName() {
                return bookName;
        }

        public void setBookName(String bookName) {
                this.bookName = bookName;
        }

        public String getBookDescription() {
                return bookDescription;
        }

        public void setBookDescription(String bookDescription) {
                this.bookDescription = bookDescription;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public String getAuthorFirst() {
                return authorFirst;
        }

        public void setAuthorFirst(String authorFirst) {
                this.authorFirst = authorFirst;
        }

        public String getAuthorLast() {
                return authorLast;
        }

        public void setAuthorLast(String authorLast) {
                this.authorLast = authorLast;
        }

        public String getGenre() {
                return genre;
        }

        public void setGenre(String genre) {
                this.genre = genre;
        }

        public String getPublisher() {
                return publisher;
        }

        public void setPublisher(String publisher) {
                this.publisher = publisher;
        }

        public int getYearPublished() {
                return yearPublished;
        }

        public void setYearPublished(int yearPublished) {
                this.yearPublished = yearPublished;
        }

        public int getCopiesSold() {
                return copiesSold;
        }

        public void setCopiesSold(int copiesSold) {
                this.copiesSold = copiesSold;
        }

        public float getRating() {
                return rating;
        }

        public void setRating(float rating) {
                this.rating = rating;
        }

        public double getStarRating() {
                return starRating;
        }

        public void setStarRating(double starRating) {
                this.starRating = starRating;
        }

        @Override
        public String toString() {
                return "Bookstore{" +
                        "ISBN=" + ISBN +
                        ", bookName='" + bookName + '\'' +
                        ", bookDescription='" + bookDescription + '\'' +
                        ", price=" + price +
                        ", authorFirst='" + authorFirst + '\'' +
                        ", authorLast='" + authorLast + '\'' +
                        ", genre='" + genre + '\'' +
                        ", publisher='" + publisher + '\'' +
                        ", yearPublished=" + yearPublished +
                        ", copiesSold=" + copiesSold +
                        ", rating=" + rating +
                        ", starRating='" + starRating + '\'' +
                        '}';
        }
}
