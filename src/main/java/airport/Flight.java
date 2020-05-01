package airport;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Flight {
    private String flightNumber;
    private Date departureTime;
    private int duration;
    private List<Flight> flight;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        duration = duration;
    }

    public Date getArrivalTime(){
        Date arrivalTime = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(departureTime);
        c.add(Calendar.MINUTE, duration);
        arrivalTime = c.getTime();
        return arrivalTime;
    }

    private void delayBy(int minutes){
        duration = duration + minutes;

    }
}
