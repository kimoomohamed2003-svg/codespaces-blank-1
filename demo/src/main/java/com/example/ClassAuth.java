package com.example;

public class ClassAuth {

    public String name;
    public String pin;
    public long cardnumber;
    private String cardreading;
    private String checkpin;
    private String verifsecurity;
    int attempts = 0;

    public ClassAuth(
            String name, String pin, long cardnumber, String cardreading, String checkpin, String verifsecurity) {
        this.name = name;
        this.pin = pin;
        this.cardnumber = cardnumber;
        this.cardreading = cardreading;
        this.checkpin = checkpin;
        this.verifsecurity = verifsecurity;
    }

    public String getPin() {
        if (pin == null || pin.isEmpty()) {
            return "PIN is not available.";
        }
        if (pin.length() < 4) {
            return "PIN is too short. It should be at least 4 digits.";
        }
        if (pin.length() > 8) {
            return "PIN is too long. It should be no more than 8 digits.";
        }
        if (pin.equals("1234")) {
            return "PIN is valid and show the Main Menu.";
        }
        attempts++;
        if (attempts >= 3) {
            return "Invalid PIN. Please try again.";
        }
        else{  
            return "show pin error .";
        }
        
    }

    public long getCardnumber() {
        return cardnumber;
    }

    public String getName() {
        return name;
    }

    public String cardreading() {
        if (cardreading == null || cardreading.isEmpty()) {
            return "Card reading is not available.";
        } else if ("true".equals(cardreading)) {
        
            if (verifsecurity == null || verifsecurity.isEmpty()) {
                return "Security verification is not available.";
            } else if ("true".equals(verifsecurity)) {
                return "show card error.";
            } else if ("false".equals(verifsecurity)) {
                return "Security error detected. Calling police immediately.";
            } else {
                return "Invalid security status.";
            }
        } else if ("false".equals(cardreading)) {
            return "Card reading is unsuccessful.";
        } else {
            return "Show card error.";
        }
    }

    public String getcheckpin() {
        return checkpin;
    }

    public String getverifsecurity() {
        if (verifsecurity == null || verifsecurity.isEmpty()) {
            return "Security verification is not available.";
        } else if ("true".equals(verifsecurity)) {
            return "show card error.";
        } else if ("false".equals(verifsecurity)) {
            return "Security error detected. Calling police immediately.";
        } else {
            return "Invalid security status.";
        }
    }
}
