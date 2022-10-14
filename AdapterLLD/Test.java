public class Test {
    public static void main(String[] args) {
        EngineerNumberProvider obj1 = new EngineerNumberProvider();
        StudentNumberProvider obj2 = new StudentNumberProvider();
        Consumer consumer1 = new Consumer(obj1);
        Consumer consumer2 = new Consumer(obj2);
        consumer1.nameOfClients();
        consumer1.advertisementSentTo();
        consumer2.nameOfClients();
        consumer2.advertisementSentTo();
    }
}