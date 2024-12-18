package praktikum.sesi12;

// Interface Phone
interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getVolume();
}

// Class Xiaomi
class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi is powered ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi is powered OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Xiaomi volume: " + volume);
        } else {
            System.out.println("Turn ON the phone first.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Xiaomi volume: " + volume);
        } else {
            System.out.println("Turn ON the phone first.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

// Class iPhone
class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone is powered ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone is powered OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("iPhone volume: " + volume);
        } else {
            System.out.println("Turn ON the phone first.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("iPhone volume: " + volume);
        } else {
            System.out.println("Turn ON the phone first.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

// Class Samsung
class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung is powered ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung is powered OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Samsung volume: " + volume);
        } else {
            System.out.println("Turn ON the phone first.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Samsung volume: " + volume);
        } else {
            System.out.println("Turn ON the phone first.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

// Class Oppo
class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo is powered ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo is powered OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Oppo volume: " + volume);
        } else {
            System.out.println("Turn ON the phone first.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Oppo volume: " + volume);
        } else {
            System.out.println("Turn ON the phone first.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

// Class PhoneUser
class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }
}

// Main Class
public class Soal3 {
    public static void main(String[] args) {
        Phone xiaomi = new Xiaomi();
        PhoneUser user = new PhoneUser(xiaomi);

        System.out.println("Testing Xiaomi:");
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println("\nTesting iPhone:");
        Phone iphone = new iPhone();
        user = new PhoneUser(iphone);
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println("\nTesting Samsung:");
        Phone samsung = new Samsung();
        user = new PhoneUser(samsung);
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println("\nTesting Oppo:");
        Phone oppo = new Oppo();
        user = new PhoneUser(oppo);
        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();
    }
}
