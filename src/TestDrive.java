public class TestDrive {
    
    public static void main(String[] args) {
        Mercedes ms1 = new Mercedes(280, 3, "w212", 70000);
        Mercedes ms2 = new Mercedes(260, 4, "w221", 75000);
        Mercedes ms3 = new Mercedes(240, 2, "w205", 59000);
        Mercedes ms4 = new Mercedes(260, 3, "w222", 69000);
        Mercedes ms5 = new Mercedes(240, 3, "w204", 74000);
        Mercedes[] msAr = {ms1, ms2, ms3, ms4, ms5};
        Bmw bm1 = new Bmw(290, 4, "540ix", 75000);
        Bmw bm2 = new Bmw(270, 2, "320i", 55000);
        Bmw bm3 = new Bmw(280, 3, "630d", 80000);
        Bmw bm4 = new Bmw(320, 5, "850i", 85000);
        Bmw bm5 = new Bmw(260, 4, "740d", 79000);
        Bmw[] bmAr = {bm1, bm2, bm3, bm4, bm5};

            System.out.println(getCarMaxSpeed(msAr, bmAr));
    }
        
    public static String getCarV(Bmw bm, Mercedes ms) {
        if (bm.v > ms.v) {
            return "BMW";
        } else {
            return "MERCEDES";
        }
    }
    
    public static String getCarSpeed(Bmw bm, Mercedes ms) {
        if (bm.maxSpeed > ms.maxSpeed) {
            return "BMW";
        } else {
            return "MERCEDES";
        }
    }

    public static String getCarCost(Mercedes[] msAr, Bmw[] bmAr) {
        int min = msAr[0].cost;
        int min1 = bmAr[0].cost;
        String modl = "";
        String modl1= "";
        for (int i = 1; i < msAr.length; i++) {
            if (msAr[i].cost < min) {
            min = msAr[i].cost;
            modl = msAr[i].model;
            }    
        }
        for (int j = 1; j < bmAr.length; j++) {
            if (bmAr[j].cost < min1) {
                min1 = bmAr[j].cost;
                modl1 = bmAr[j].model;
            }
        }
        if (min < min1) {
            return "MERCEDES_" + modl;
        } else {
            return "BMW_" + modl1;
        }        
    }

    public static String getCarMaxSpeed(Mercedes[] msAr, Bmw[] bmAr) {
        int max = msAr[0].maxSpeed;
        int max1 = bmAr[0].maxSpeed;
        String modl = "";
        String modl1= "";
        for (int i = 1; i < msAr.length; i++) {
            if (msAr[i].maxSpeed > max) {
            max = msAr[i].maxSpeed;
            modl = msAr[i].model;
            }    
        }
        for (int j = 1; j < bmAr.length; j++) {
            if (bmAr[j].maxSpeed > max1) {
                max1 = bmAr[j].maxSpeed;
                modl1 = bmAr[j].model;
            }
        }
        if (max > max1) {
            return "MERCEDES_" + modl;
        } else {
            return "BMW_" + modl1;
        }        
    }


}

