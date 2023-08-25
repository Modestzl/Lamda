import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private List<ElectricityConsumer> listeners = new ArrayList<>() ;// поле типа интерфейс. Это поле которое может содержать ссылку
                                        // на объект  класса реализуещего данный интерфейс.
    public void addElectricityListener(ElectricityConsumer listener ){
        listeners.add(listener);
    }
    public void removeElectricityListener(ElectricityConsumer listener ){
        listeners.remove(listener);
    }
    public void switchOn(){
        System.out.println("Выключатель включен");
//        if(consumer!=null){
//            consumer.electricityOn();// Проверяет ссылку на объет
//        }
        for(ElectricityConsumer c : listeners){
            c.electricityOn();
        }
    }
}
