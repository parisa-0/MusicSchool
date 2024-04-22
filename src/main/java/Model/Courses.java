package Model;

public class Courses {

    private static String courseID;
    private double coursePrice;

    private String courseType;

    public Courses(String courseID, double coursePrice, String courseType) {
        this.courseID = courseID;
        this.coursePrice = coursePrice;
        this.courseType = courseType;
    }


    public static String getCourseID() {
        return courseID;
    }

    public Double getCoursePrice() {
        return coursePrice;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setRoomPrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
}
