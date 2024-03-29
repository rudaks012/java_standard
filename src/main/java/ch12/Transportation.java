package ch12;

public enum Transportation {
    BUS(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    TRAIN(150) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    SHIP(100) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    },
    AIRPLANE(300) {
        int fare(int distance) {
            return distance * BASIC_FARE;
        }
    };
    protected final int BASIC_FARE; // protected로 선언해야 각 상수에서 접근할 수 있다.

    Transportation(int basicFare) {
        BASIC_FARE = basicFare;
    }

    public int getBasicFare() {
        return BASIC_FARE;
    }
    abstract int fare(int distance); // 거리에 따른 요금을 계산한다.
}
