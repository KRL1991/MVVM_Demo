package model;
import java.util.Observable;

public class Model extends Observable {

    private String data;

    public String getData() {
        return data;
    }

    public Model(String data) {
        data = "Hello";
    }

    public void setData(String data){
        if (data == null)
            return;

        this.data = data;
        super.setChanged();
        super.notifyObservers();

    }
}


