package bean.estudante;

import model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Teste1","Teste2","Teste3"};
    private List<String> nomesList = asList("Teste4","Teste5","Teste6");
    private Set<String> nomesSet = new HashSet<>(asList("Teste7","Teste8","Teste9"));
    private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("Teste1", " ok");
        nomesMap.put("Teste2", " Falha");
        nomesMap.put("Teste3", " ok");

        for (String nome : nomesSet){
            System.out.println(nome);
        }

        for (Map.Entry<String, String> entry : nomesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }
}
