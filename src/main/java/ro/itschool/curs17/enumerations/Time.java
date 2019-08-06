package ro.itschool.curs17.enumerations;

public enum Time {
    HOUR {
        @Override
        public double toHour(int timeUnit) {
            return timeUnit;
        }

        @Override
        public double toMinute(int timeUnit) {
            return timeUnit * 60;
        }

        @Override
        public double toSeconds(int timeUnit) {
            return timeUnit * 60 * 60;
        }
    },
    MINUTE {
        @Override
        public double toHour(int timeUnit) {
            return timeUnit / 60;
        }

        @Override
        public double toMinute(int timeUnit) {
            return timeUnit;
        }

        @Override
        public double toSeconds(int timeUnit) {
            return timeUnit * 60;
        }
    },
    SECONDS {
        @Override
        public double toHour(int timeUnit) {
            return timeUnit / 3600;
        }

        @Override
        public double toMinute(int timeUnit) {
            return timeUnit / 60;
        }

        @Override
        public double toSeconds(int timeUnit) {
            return timeUnit;
        }
    };

    public abstract double toHour(int timeUnit);

    public abstract double toMinute(int timeUnit);

    public abstract double toSeconds(int timeUnit);
}
