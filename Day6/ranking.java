public class ranking {
    int rollNo;
    String name;
    int avgscore;

    public ranking(int avgscore, String name, int rollNo) {
        this.avgscore = avgscore;
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAvgscore() {
        return avgscore;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
