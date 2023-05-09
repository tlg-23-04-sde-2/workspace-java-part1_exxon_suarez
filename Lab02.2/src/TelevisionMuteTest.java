class TelevisionMuteTest {
    public static void main(String[] args) {
        Television tv = new Television("samsung", 32);
        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.mute();
        System.out.println(tv);
        tv.setVolume(50);
        System.out.println("");
        System.out.println(tv);

    }
}