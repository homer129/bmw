public class TestDrive {
    
    public static void main(String[] args) {
        Mercedes ms1 = new Mercedes(268, 1, "w212", 70001);
        Mercedes ms2 = new Mercedes(262, 2, "w221", 70002);
        Mercedes ms3 = new Mercedes(263, 6, "w205", 70008);
        Mercedes ms4 = new Mercedes(269, 4, "w222", 70004);
        Mercedes ms5 = new Mercedes(265, 7, "w204", 70005);
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
        } else if (minORmax.equals("max")) {
            return getCarMaxAll(msAr1, param1);
        }
        return null;
    }
        
    public static String getCarMinAll(Mercedes[] msAr, String param) {     
        if (param.equals("cost")) {
            return getCarMinCost(msAr);
        } else if (param.equals("v")) {
            return getCarMinV(msAr);
        } else if (param.equals("maxSpeed")) {            
            return getCarMinMaxSpeed(msAr);                      
        }
        return null;
    }
    
    public static String getCarMinCost(Mercedes[] msAr) {
        String minCostCar = msAr[0].model;
        int minik = msAr[0].cost;
        for (int i = 1; i < msAr.length; i++) {                 
            if (minik > msAr[i].cost) {
                minik = msAr[i].cost;
                minCostCar = msAr[i].model;
            }
        }
        return minCostCar;
    }

    public static String getCarMinV(Mercedes[] msAr) {
        String minVCar = msAr[0].model;
        int minik = msAr[0].v;
        for (int i = 1; i < msAr.length; i++) {                 
            if (minik > msAr[i].v) {
                minik = msAr[i].v;
                minVCar = msAr[i].model;
            }
        }
        return minVCar;
    }

    public static String getCarMinMaxSpeed(Mercedes[] msAr) {
        String minMaxSpeedCar = msAr[0].model;
        int minik = msAr[0].maxSpeed;
        for (int i = 1; i < msAr.length; i++) {                 
            if (minik > msAr[i].maxSpeed) {
                minik = msAr[i].maxSpeed;
                minMaxSpeedCar = msAr[i].model;
            }
        }
        return minMaxSpeedCar;
    }

    public static String getCarMaxAll(Mercedes[] msAr, String param) {
        if (param.equals("cost")) {
            return getCarMaxCost(msAr);
        } else if (param.equals("v")) {
            return getCarMaxV(msAr);
        } else if (param.equals("maxSpeed")) {            
            return getCarMaxMaxSpeed(msAr);                      
        }
        return null;
    }

    public static String getCarMaxCost(Mercedes[] msAr) {
        String maxCostCar = msAr[0].model;
        int maxik = msAr[0].cost;
        for (int i = 1; i < msAr.length; i++) {                 
            if (maxik < msAr[i].cost) {
                maxik = msAr[i].cost;
                maxCostCar = msAr[i].model;
            }
        }
        return maxCostCar;
    }

    public static String getCarMaxV(Mercedes[] msAr) {
        String maxVCar = msAr[0].model;
        int maxik = msAr[0].v;
        for (int i = 1; i < msAr.length; i++) {                 
            if (maxik < msAr[i].v) {
                maxik = msAr[i].v;
                maxVCar = msAr[i].model;
            }
        }
        return maxVCar;
    }

    public static String getCarMaxMaxSpeed(Mercedes[] msAr) {
        String maxMaxSpeedCar = msAr[0].model;
        int maxik = msAr[0].maxSpeed;
        for (int i = 1; i < msAr.length; i++) {                 
            if (maxik < msAr[i].maxSpeed) {
                maxik = msAr[i].maxSpeed;
                maxMaxSpeedCar = msAr[i].model;
            }
        }
        return maxMaxSpeedCar;
    }    
}

