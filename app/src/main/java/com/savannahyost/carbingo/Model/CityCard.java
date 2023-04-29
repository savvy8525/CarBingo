package com.savannahyost.carbingo.Model;

public class CityCard {

    public String[] cityCard;

    public CityCard() {
        this.cityCard = new String[]{"Train", "Traffic Light", "Grocery Store", "Sports Car", "Tractor Trailer",
                "Fast Food", "Book Store", "Coffee Shop", "Bar", "Library",
                "Stop Sign", "Bridge", "Mall", "Boat", "Bus",
                "Bus Stop", "Park", "Theater", "Police Car", "Fire Truck",
                "Ambulance", "Motorcycle", "Gym", "Airplane", "Taxi"};
    }

    public String[] getCityCard() {
        return cityCard;
    }


    /*original setup with 2D array, moved to single array for license plate*/
    //    public String [][] cityCard;
//    //Makes the card choices in a 2D array
//    public CityCard() {
//        this.cityCard = new String[][]{
//                {"Train", "Traffic Light", "Grocery Store", "Sports Car", "Tractor Trailer"},
//                {"Fast Food", "Book Store", "Coffee Shop", "Bar", "Library"},
//                {"Stop Sign", "Bridge", "Mall", "Boat", "Bus"},
//                {"Bus Stop", "Park", "Theater", "Police Car", "Fire Truck"},
//                {"Ambulance", "Motorcycle", "Gym", "Airplane", "Taxi"}
//        };
//    }
//
//    public String[][] getCityCard() {
//        return cityCard;
//    }
//
//    public void setCityCard(String[][] cityCard) {
//        this.cityCard = cityCard;
//    }


}
