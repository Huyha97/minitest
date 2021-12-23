//package baiTapTOngHop.baingay22_12.bai01.lamlaibai01;
//
//import java.sql.SQLOutput;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class HotelManager {
//  Scanner scanner = new Scanner(System.in);
//  ArrayList<Hotel> hotels;
//
//    public HotelManager() {
//        this.hotels = new ArrayList<>();
//    }
//
//    public Hotel creatHotel(Human human){
//        System.out.println("input start rent day: ");
//        String date = scanner.next();
//        DateTimeFormatter formatter;
//        LocalDate startDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-LL-yyyy"));
//        System.out.println(" input the kind of room: ");
//        String kind = scanner.next();
//        System.out.println("input price: ");
//        double price = scanner.nextDouble();
//        Hotel hotel = new Hotel(startDate,kind,price,human);
//        hotels.add(hotel);
//        return hotel;
//    }
//
//    public void displayRoomTenants(){
//        HashSet<Human> humanHashSet = new HashSet<>();
//        for (Hotel hotel: hotels) {
//            humanHashSet.add(hotel.getHuman());
//        }
//        System.out.println(humanHashSet);
//    }
// }
//
//// public double patForRoom(String idCard) {
////     ArrayList<Hotel> hotelPay = new ArrayList<>();
////     double sumPrice = 0;
////     for (Hotel hotel: hotels) {
////         if (hotel.getHuman().getIdCard().equals(idCard))
////     }
//
// }
//
//
