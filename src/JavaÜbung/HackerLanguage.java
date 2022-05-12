package JavaÜbung;

public class HackerLanguage {
    public static void main(String[] args) {
        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.
        String str2 = "cuma bereketi devam ediyor";
        System.out.println("hackerLanguage( str) = " + hackerLanguage(str2));
    }

    private static String hackerLanguage(String str) {

        str = str.replace("s", "5");
        str = str.replace("a", "4");
        str = str.replace("e", "3");
        str = str.replace("i", "1");
        str = str.replace("o", "0");


        return str;


    }
}