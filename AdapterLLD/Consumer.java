public class Consumer {

    INumberProvider provider;

    Consumer(INumberProvider provider) {
        this.provider = provider;
    }

    public void advertisementSentTo() {
        System.out.println(provider.getPhoneNos());
    }
    public void nameOfClients() {
        System.out.println(provider.getNames());
    }
}