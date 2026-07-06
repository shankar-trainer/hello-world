package designPattern.creational.builder;

public class Computer {
    private final String HDD;
    private final String RAM;

    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(Builder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicCardEnabled=builder.isGraphicCardEnabled;
        this.isBluetoothEnabled=builder.isBluetoothEnabled;
    }

    static class  Builder{

        private final String HDD;
        private final String RAM;

        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public Builder setGraphicCardEnabled(boolean graphicCardEnabled) {
            isGraphicCardEnabled = graphicCardEnabled;
          return this;
        }

        public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return  this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGraphicCardEnabled=" + isGraphicCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
