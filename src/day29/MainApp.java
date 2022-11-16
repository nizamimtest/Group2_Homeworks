package day29;

public class MainApp {
    public static void main(String[] args) {
        Araba araba=new Araba();
        YarisArabasi yarisArabasi=new YarisArabasi();
      Araba yarisArabasi1=new YarisArabasi();
        System.out.println();
        araba.ilerle();
        yarisArabasi.ilerle();
        yarisArabasi1.ilerle();
        System.out.println();
        yarisArabasi.turbo();
        ( (YarisArabasi)yarisArabasi1).turbo();
    }
}
