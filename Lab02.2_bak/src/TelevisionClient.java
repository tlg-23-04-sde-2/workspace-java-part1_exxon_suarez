/*
 * Client side main class to create a few instances of Television
 * and give them a basic test drive
 */
class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created ");
        // creating new INSTANCE of Television
       Television tv1 = new Television("samsung", 30);
        tv1.setVolume(Television.MAX_VOLUME); // setting the volume to the static MAX_VOLUME after instantiating a new Television
        tv1.turnOn();
        // creating new INSTANCE of Television
        Television tv2 = new Television("LG", Television.MIN_VOLUME);  // instantiating with the MIN_VOLUME static variable


        // creating new INSTANCE of Television
        Television tv3 = new Television();


        //        tv1.turnOn();
        //        tv2.turnOff();
        //        tv3.turnOn();

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println(Television.getInstanceCount() + " instances have been created ");

    }
}