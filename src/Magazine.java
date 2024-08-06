public class Magazine extends LibraryItem{


    private int issueNumber;


    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getDescription() {
        String s =  "Titlu: " + title +" \n" + "Autor: " + author + " \n" + "IssueNumber: " + issueNumber;
        return  s;
    }

}
