public class TestDrive {
    
    public static void main(String[] args) {
        Mercedes ms1 = new Mercedes(280, 8, "w212", 70001);
        Mercedes ms2 = new Mercedes(262, 2, "w221", 70002);
        Mercedes ms3 = new Mercedes(266, 6, "w205", 70000);
        Mercedes ms4 = new Mercedes(264, 4, "w222", 70004);
        Mercedes ms5 = new Mercedes(270, 7, "w204", 70002);
        Mercedes[] msAr = {ms1, ms2, ms3, ms4, ms5};
        Bmw bm1 = new Bmw(290, 4, "540ix", 75000);
        Bmw bm2 = new Bmw(270, 2, "320i", 55000);
        Bmw bm3 = new Bmw(280, 3, "630d", 80000);
        Bmw bm4 = new Bmw(320, 5, "850i", 85000);
        Bmw bm5 = new Bmw(260, 4, "740d", 79000);
        Bmw[] bmAr = {bm1, bm2, bm3, bm4, bm5};
        
        System.out.println(getCar(msAr, "maxSpeed", "max"));
    }

    public static String getCar(Mercedes[] msAr1, String param1, String minORmax) {
        if (minORmax.equals("min")) {
          return getCarMinAll(msAr1, param1);
        } if (minORmax.equals("max")) {
          return getCarMaxAll(msAr1, param1);
        }
        return null;
    }
        
    public static String getCarMaxAll(Mercedes[] msAr, String param) {
        String maxAllCar = msAr[0].model;
        int maxik1 = msAr[0].maxSpeed;
        int maxik2 = msAr[0].v;
        int maxik3 = msAr[0].cost;
        for (int i = 1; i < msAr.length; i++) {
            if (param.equals("maxSpeed")) {
                if (maxik1 < msAr[i].maxSpeed) {
                    maxik1 = msAr[i].maxSpeed;
                    maxAllCar = msAr[i].model;
                }
            } if (param.equals("v")) {
                if (maxik2 < msAr[i].v) {
                    maxik2 = msAr[i].v;
                    maxAllCar = msAr[i].model;
                }
            } if (param.equals("cost")) {
                if (maxik3 < msAr[i].cost) {
                    maxik3 = msAr[i].cost;
                    maxAllCar = msAr[i].model;
                }
            }           
        }
        return maxAllCar;
    }
    
    public static String getCarMinAll(Mercedes[] msAr, String param) {
        String minAllCar = msAr[0].model;
        int minik1 = msAr[0].maxSpeed;
        int minik2 = msAr[0].v;
        int minik3 = msAr[0].cost;
        for (int i = 1; i < msAr.length; i++) {
            if (param.equals("maxSpeed")) {
                if (minik1 > msAr[i].maxSpeed) {
                    minik1 = msAr[i].maxSpeed;
                    minAllCar = msAr[i].model;
                }
            } else if (param.equals("v")) {                
                if (minik2 > msAr[i].v) {
                    minik2 = msAr[i].v;
                    minAllCar = msAr[i].model;
                }
            } else if (param.equals("cost")) {
                if (minik3 > msAr[i].cost) {
                    minik3 = msAr[i].cost;
                    minAllCar = msAr[i].model;
                }
            }           
        }
        return minAllCar;
    } 
}

