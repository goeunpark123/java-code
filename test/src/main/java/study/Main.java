package study;

public class Main {

    public static void main(String[] args) {
        StaticTest st = new StaticTest();

        StaticTest.increaseNumber();
        st.getStaticNumber();

        StaticTest.increaseNumber();
        st.getStaticNumber();

        StaticTest.increaseNumber();
        st.getStaticNumber();

        Song[] songArr = new Song[3];

        songArr[0] = new Song("song1", "가", "대한민국", 2010);
        songArr[1] = new Song("song2", "나", "미국", 2015);
        songArr[2] = new Song("song3", "다", "대한민국", 2020);

        for (Song song: songArr) {
            song.play();
        }
    }
}
