public class Radio implements ElectricityConsumer{
    public void playMusic(){
        System.out.println("Музыка играет");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
