package Staff;

import java.util.ArrayList;
import java.util.List;

public class Bookings {

    public List<BookingConstructor> bookingList = new ArrayList<>();

    public void populate() {
        bookingList.add(new BookingConstructor("1", "123456789", "Ricardo", "20/5/21", "18:00"));
        bookingList.add(new BookingConstructor("2","321654987", "Adriana", "20/5/21", "17:00"));
        bookingList.add(new BookingConstructor("3","147258369", "Raphael", "20/5/21", "15:00"));
        bookingList.add(new BookingConstructor("4","159487263", "John", "20/5/21", "22:00"));
    }

    public List<BookingConstructor> getBookings() {
        return bookingList;
    }

    public void addBooking(String memberId, String memberName, String bookingDate, String bookingTime) {
        int newBookingId = Integer.parseInt(bookingList.get(bookingList.size()-1).getBookingId()) + 1;
        bookingList.add(new BookingConstructor(String.valueOf(newBookingId),memberId, memberName, bookingDate, bookingTime));

        System.out.println(newBookingId);
    }

    public String[] bookingsIds() {

        String[] ids = new String[bookingList.size()];
        for(int i = 0; i < bookingList.size(); i++) {
            ids[i] = bookingList.get(i).getBookingId() + " -> " + bookingList.get(i).getMemberId() + " :: " + bookingList.get(i).getMemberName();
        }

        return ids;
    }

}
