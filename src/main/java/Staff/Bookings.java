package Staff;

import java.util.ArrayList;
import java.util.List;

public class Bookings {

    public List<Booking> bookingList = new ArrayList<>();

    public void populate() {
        bookingList.add(new Booking("1", "123456789", "Ricardo", "20/5/21", "18:00"));
//        bookingList.add(new Booking("2","321654987", "Adriana", "20/5/21", "17:00"));
    }

    public List<Booking> getBookings() {
        return bookingList;
    }

    public void addBooking(String memberId, String memberName, String bookingDate, String bookingTime) {
        int newBookingId = Integer.parseInt(bookingList.get(bookingList.size()-1).getBookingId()) + 1;
        bookingList.add(new Booking(String.valueOf(newBookingId),memberId, memberName, bookingDate, bookingTime));
    }

    public String[] bookingsIds() {

        String[] ids = new String[bookingList.size()];
        for(int i = 0; i < bookingList.size(); i++) {
            ids[i] = bookingList.get(i).getBookingId() + " -> " + bookingList.get(i).getMemberId() + " :: " + bookingList.get(i).getMemberName()
                    + " :: " + bookingList.get(i).getBookingDate()+ " :: " + bookingList.get(i).getBookingTime();
        }

        return ids;
    }
    
    /**
     * BookingConstructor Class
     */
    public class Booking {

        private final String bookingId;
        private final String memberId;
        private final String memberName;
        private final String bookingDate;
        private final String bookingTime;

        public Booking(String bookingId, String memberId, String memberName, String bookingDate, String bookingTime) {
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

}
