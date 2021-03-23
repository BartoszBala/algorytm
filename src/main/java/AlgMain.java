import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlgMain {


  public static int findMaxSumOfNonNeighborsNumber(List<Integer> lista) {

    if (lista.isEmpty()) {
      return 0;
    }

    Map<Integer, Integer> nodeValue = new HashMap<>();

    nodeValue.put(1, lista.get(0));
    if (lista.size() > 1)
      nodeValue.put(2, lista.get(1));

    for (int i = 1; i < lista.size() - 1; i++) {
      if (!nodeValue.containsKey(i + 2) && i + 2 <= lista.size()) {
        nodeValue.put(i + 2, lista.get(i + 1) + nodeValue.get(i));
      } if (i + 2 <= lista.size() && nodeValue.get(i + 2) < lista.get(i + 1) + nodeValue.get(i)) {
        nodeValue.replace(i + 2, lista.get(i + 1) + nodeValue.get(i));
      }

      if (!nodeValue.containsKey(i + 3) && i + 3 <= lista.size()) {
        nodeValue.put(i + 3, lista.get(i + 2) + nodeValue.get(i));
      } else if (i + 3 <= lista.size() && nodeValue.get(i + 3) < (i + 3 < lista.size() ? lista.get(i + 2) : 0) + nodeValue.get(i)) {
        nodeValue.replace(i + 3, lista.get(i + 2)  + nodeValue.get(i));
      }
    }

    return lista.size() > 1 ? Math.max(nodeValue.get(lista.size()), nodeValue.get(lista.size() - 1)) : lista.get(0);

  }

}

