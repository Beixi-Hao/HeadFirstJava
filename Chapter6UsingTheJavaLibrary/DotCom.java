import java.uti.ArrayList;

publilc class DotCom {
    private ArrayList<String> locationCells;

    public d setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            ocationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            } // close if
        } // close if
        return result;
    } // end methodo checkYourself
} // end class DotCom