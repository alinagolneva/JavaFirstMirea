package ru.mirea.task28;

public class Automobile {
    private String brand, color;
    private int price;

    public Automobile(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }


    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public class Wheels {
        private int size;
        private String type;

        private Wheels(int size, String type) {
            this.size = size;
            this.type = type;
        }

        public int getSize() {
            return size;
        }

        public String getType() {
            return type;
        }

    }
    private class InformAuto extends Automobile {
        public InformAuto(String brand, String color, int price) {
            super(brand, color, price);
        }

        @Override
        public void sInform() {
            System.out.println("Brand this car is " + getBrand() + ", color this car is " + getColor() + ", price this car is " + getPrice());
        }
    }



    public void sInform() {
        System.out.println("Brand this car is " + getBrand() + ", color this car is " + getColor() + ", price this car is " + getPrice());
    }

    public static void main(String[] args) {
        Automobile anonAuto = new Automobile("BMW", "black", 2000000) {

           @Override
            public void sInform() {
                System.out.println("Brand this car is " + getBrand() + ", color this car is " + getColor() + ", price this car is " + getPrice());
            }
        };

        anonAuto.sInform();

    }

}
