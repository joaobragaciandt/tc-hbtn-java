import java.util.TreeMap;


public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String s) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String newString = s.replace("?","").replace("!","").replace(".","");
        String[] listaStrings = newString.toLowerCase().split(" ");

        for(String palavra: listaStrings) {
            int cont = 1;
            if(treeMap.containsKey(palavra)){
                cont = treeMap.get(palavra);
                cont++;
            }
            treeMap.put(palavra,cont);
        }
        return treeMap;
    }

}