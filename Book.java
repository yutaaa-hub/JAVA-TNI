public class Book {
    private String Title;
    private int totalBook;
    private int availableBook;
Book (String title,int totalBook){
this.Title = title;
this.totalBook = totalBook;
this.availableBook = totalBook;
}
Book (String title){
    this.Title = title;
    this.totalBook = 0;
    this.availableBook = 0;
}
Book(){
    this.Title = "";
    this.totalBook = 0;
    this.availableBook = 0;
}
String getTitle(){
return this.Title;
}
int getTotalBook(){
    return this.totalBook;
}
int getAvailableBook(){
return this.getTotalBook();
}
void borrowBook(){
if (this.availableBook > 0){
this.availableBook--;
}
}
    void returnBook() {
        if (this.availableBook < this.totalBook) {
            this.availableBook++;
        }
    }
}
