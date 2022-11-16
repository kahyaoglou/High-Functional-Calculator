public class LoopCounter {
    public int LoopCounter(int answer){
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
