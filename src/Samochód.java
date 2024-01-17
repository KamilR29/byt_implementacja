import java.util.Date;
import java.util.List;

enum Status{
    //wszystkie możliwe statusy
}

public class Samochód {
    String aktualnyPrzebieg;
    String marka;
    Date rokProdukcji;
    Status status;
    String terminWażnościPolisyUbezpieczeniowej;
    List<Rezerwacja> rezerwacje;
    public boolean OdczytWażnościPolisyUbezpieczeniowej(){return false;}
    public void WprowadzenieDanychUbezpieczenia(Date TerminWażnościPolisy){}
    public void ZmianaStatusuPojazduZeWzględuNaAktualnegoPosiadacza(Status aktualnyStatus){}

}
