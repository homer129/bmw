public class TestDrive {
    
    public static void main(String[] args) {
        Mercedes ms1 = new Mercedes(261, 1, "w212", 70001);
        Mercedes ms2 = new Mercedes(262, 2, "w221", 70002);
        Mercedes ms3 = new Mercedes(263, 6, "w205", 70003);
        Mercedes ms4 = new Mercedes(264, 4, "w222", 70004);
        Mercedes ms5 = new Mercedes(265, 5, "w204", 70005);
        Mercedes[] msAr = {ms1, ms2, ms3, ms4, ms5};
        Bmw bm1 = new Bmw(290, 4, "540ix", 75000);
        Bmw bm2 = new Bmw(270, 2, "320i", 55000);
        Bmw bm3 = new Bmw(280, 3, "630d", 80000);
        Bmw bm4 = new Bmw(320, 5, "850i", 85000);
        Bmw bm5 = new Bmw(260, 4, "740d", 79000);
        Bmw[] bmAr = {bm1, bm2, bm3, bm4, bm5};
        
        System.out.println(getCar(msAr, "v", "max"));
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

    public static String getCarMinCost(Mercedes[] msAr) {
        int mini = msAr[0].cost;
        String minCostCar = msAr[0].model;
        for (int i = 1; i < msAr.length; i++) {
            if (msAr[i].cost < mini) {
                mini = msAr[i].cost;
                minCostCar = msAr[i].model;
            }
        }
        return minCostCar;
        
    }

    public static String getCarVAndSpeed(Mercedes ms, Bmw bm, String parametr) {
        if (parametr.equals("maxSpeed")) {
            if (bm.maxSpeed > ms.maxSpeed) {
                return "BMW_" + bm.model;
            } else {
                return "MERCEDES_" + ms.model;
            }
        }    
        if (parametr.equals("v")) {
            if (bm.v > ms.v) {
                return "BMW";
            } else {
                return "MERCEDES";
            }
        }
        return null;
    }

    public static String getCarMinAll(Mercedes[] msAr, String param) {
        String minAllCar = msAr[0].model;
        if (param.equals("cost")) {
            int minik = msAr[0].cost;
            for (int i = 1; i < msAr.length; i++) {                 
                if (minik > msAr[i].cost) {
                    minik = msAr[i].cost;
                    minAllCar = msAr[i].model;
                }
            }
        } else if (param.equals("v")) {
            int minik = msAr[0].v;
            for (int i = 1; i < msAr.length; i++) {                 
                if (minik > msAr[i].v) {
                    minik = msAr[i].v;
                    minAllCar = msAr[i].model;
                }
            }
        } else if (param.equals("maxSpeed")) {            
            int minik = msAr[0].maxSpeed;
            for (int i = 1; i < msAr.length; i++) {                 
                if (minik > msAr[i].maxSpeed) {
                    minik = msAr[i].maxSpeed;
                    minAllCar = msAr[i].model;
                }
            }                       
        }
        return minAllCar;
    }

    public static String getCarMaxAll(Mercedes[] msAr, String param) {
        String maxAllCar = msAr[0].model;
        if (param.equals("cost")) {
            int maxik = msAr[0].cost;
            for (int i = 1; i < msAr.length; i++) {                 
                if (maxik < msAr[i].cost) {
                    maxik = msAr[i].cost;
                    maxAllCar = msAr[i].model;
                }
            }
        } else if (param.equals("v")) {
            int maxik = msAr[0].v;
            for (int i = 1; i < msAr.length; i++) {                 
                if (maxik < msAr[i].v) {
                    maxik = msAr[i].v;
                    maxAllCar = msAr[i].model;
                }
            }
        } else if (param.equals("maxSpeed")) {            
            int maxik = msAr[0].maxSpeed;
            for (int i = 1; i < msAr.length; i++) {                 
                if (maxik < msAr[i].maxSpeed) {
                    maxik = msAr[i].maxSpeed;
                    maxAllCar = msAr[i].model;
                }
            }                       
        }
        return maxAllCar;
    }

    public static String getCar(Mercedes[] msAr1, String param1, String minORmax) {
        if (minORmax.equals("min")) {
            return getCarMinAll(msAr1, param1);
        } else if (minORmax.equals("max")) {
            return getCarMaxAll(msAr1, param1);
        }
        return null;
    }
}

