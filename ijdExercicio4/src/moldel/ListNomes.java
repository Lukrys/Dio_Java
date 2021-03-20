package moldel;

import java.util.ArrayList;

public class ListNomes {
    ArrayList<String> nomes = new ArrayList<>();

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void setNomes(ArrayList<String> nomes) {
        this.nomes = nomes;
    }
    
    public void addNome(String n){
        nomes.add(n);
    }
}
