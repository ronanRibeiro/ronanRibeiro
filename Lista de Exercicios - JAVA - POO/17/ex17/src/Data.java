import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Data {
    //variavel
    LocalDate data;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //Getters and Setter
    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public DateTimeFormatter getFormato() {
        return this.formato;
    }

    public void setFormato(DateTimeFormatter formato) {
        this.formato = formato;
    }

    //construtor
    public Data(String data) {
        try {
            LocalDate.parse(data, formato);
        } catch (DateTimeParseException e) {
            this.data = LocalDate.parse("01/01/0001", formato);
        }
        this.data = LocalDate.parse(data, formato);
    }

    //Métodos
    public int compara () {
        if (this.data.compareTo(LocalDate.now())  == 0) {
            return 0;
        } else if (this.data.compareTo(LocalDate.now()) > 0) {
            return 1;
        } else {
            return -1;
        }
    } 
    
    public int getDia () {
        return this.data.getDayOfMonth();
    }

    public int getMes () {
        return this.data.getMonthValue();
    }

    public String getMesExtenso () {
        switch (this.data.getMonthValue()) {
            case 1: 
                return "Janeiro";
            case 2: 
                return "Fevereiro";
            case 3: 
                return "Março";
            case 4: 
                return "Abril";
            case 5: 
                return "Maio";
            case 6: 
                return "Junho";
            case 7: 
                return "Julho";
            case 8: 
                return "Agosto";
            case 9: 
                return "Setembro";
            case 10: 
                return "Outubro";
            case 11: 
                return "Novembro";
            case 12: 
                return "Dezembro";
            default:
                return "Mês iInválido";
        }
    }
    
    public int getAno () {
        return this.data.getYear();
    }

    public String isBissexto () {
        if (this.data.isLeapYear()) {
            return "É ano bissexto";
        } else {
            return "Não é ano bissexto";
        }
    }

    public Data clone () {
        return new Data(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public String getDataString() {
        return data.format(getFormato());
    }
}
