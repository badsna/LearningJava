package Week2.Day9;
class FlightInfo{
    String flight_id;
    int curr_altitude_fit;
    String destination_airport_code;
    String dept_time;
    String curr_location;

    public FlightInfo(String flight_id, int curr_altitude_fit, String destination_airport_code, String dept_time, String curr_location) {
        this.flight_id = flight_id;
        this.curr_altitude_fit = curr_altitude_fit;
        this.destination_airport_code = destination_airport_code;
        this.dept_time = dept_time;
        this.curr_location = curr_location;
    }


    public int getCurr_altitude_fit() {
        return curr_altitude_fit;
    }


    public String getDestination_airport_code() {
        return destination_airport_code;
    }


    public String getDept_time() {
        return dept_time;
    }

    public String getFlight_id() {
        return flight_id;
    }

    public String getCurr_location() {
        return curr_location;
    }

    @Override
    public String toString() {
        return flight_id +" "+ curr_altitude_fit+" " + destination_airport_code+" " + dept_time+ " "+curr_location;
    }
}