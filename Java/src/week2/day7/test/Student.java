package week2.day7.test;

public class Student {

    static final int SUBJECT_COUNT = 3;

    private String _name;
    private int _kor;
    private int _eng;
    private int _math;
   
    private static int totalKor;
    private static int totalMath;
    private static int totalEng;
   
    public Student() {
       
    }
    public Student(String name, int kor, int eng, int math) {
        _name = name;
        _kor = kor;
        _eng = eng;
        _math = math;
       
        totalKor += kor;
        totalMath += math;
        totalEng += eng;
    }

    public String getName() {
        return _name;
    }
    public void setName(String name) {
        _name = name;
    }
    public int getKor() {
        return _kor;
    }
    public void setKor(int kor) {
        totalKor -= _kor;
        _kor = kor;
        totalKor += kor;
    }
    public int getEng() {
        return _eng;
    }
    public void setEng(int eng) {
        totalEng -= _eng;
        _eng = eng;
        totalEng += eng;
    }
    public int getMath() {
        return _math;
    }
    public void setMath(int math) {
        totalMath -= _math;
        _math = math;
        totalMath += math;
    }
   
    public int getTotal() {
        return _kor + _eng + _math;
    }
   
    public float getAverage() {
        return (float)getTotal() / SUBJECT_COUNT;
    }
   
    public static int getTotalEng() {
        return totalEng;
    }
   
    public static int getTotalMath() {
        return totalMath;
    }
   
    public static int getTotalKor() {
        return totalKor;
    }
}