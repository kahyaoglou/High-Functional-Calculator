import java.util.Scanner;
public class LoopCounter {
    Scanner input = new Scanner(System.in);
    int answer;

    public int LoopCounter(){
        System.out.println("İşleme Devam Edelim mi?");
        System.out.println("Evet(1) / Hayır(2)");
        answer = input.nextInt();

        if(answer == 1) {
            answer = 0;
        }
        else if (answer == 2) {
            answer = 1;
        }
        else{
            System.out.println("Hatalı Seçim!");
            System.out.println("Ana Menüye Yönlendiriliyorsunuz...");
            answer = 1;
        }
        return answer;
    }
}
