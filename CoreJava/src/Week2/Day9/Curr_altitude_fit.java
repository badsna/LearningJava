package Week2.Day9;

import Week2.Day9.FlightInfo;

import java.util.Comparator;
 class Curr_altitude_fit implements Comparator<FlightInfo> {
    @Override
    public int compare(FlightInfo o1, FlightInfo o2) {
        int aa = o1.getCurr_altitude_fit();
        int bb = o2.getCurr_altitude_fit();
        if (aa < bb) {
            return -1;
        } else if (aa > bb) {
            return 1;
        }
        return 0;
    }
}