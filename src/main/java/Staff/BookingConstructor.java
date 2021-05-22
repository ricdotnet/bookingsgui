package Staff;

public class BookingConstructor {

    private String bookingId;
    private String memberId;
    private String memberName;
    private String bookingDate;
    private String bookingTime;

    public BookingConstructor(String bookingId, String memberId, String memberName, String bookingDate, String bookingTime) {
        this.bookingId = bookingId;
        this.memberId = memberId;
        this.memberName = memberName;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
    }

    public String getBookingId() {
        return bookingId;
    }
    public String getMemberId() {
        return memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public String getBookingDate() {
        return bookingDate;
    }
    public String getBookingTime() {
        return bookingTime;
    }

}
