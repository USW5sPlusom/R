package algo.r;

import org.springframework.web.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlgoritmController {
    List<Algoritm> algoritms = new ArrayList<>();

    public AlgoritmController() {
        algoritms.addAll(List.of(
                new Algoritm("Бинарный поиск", "Поисковые алгоритмы",
                        "Эффективный алгоритм поиска в отсортированном массиве",
                        "public int binarySearch(int[] arr, int target) { ... }", "search")
        ));


    }

    @GetMapping("/")
    Iterable<Algoritm> getAlgoritms(){
        return algoritms;
    }

    @PostMapping("/")
    Algoritm postAlgoritm (@RequestBody Algoritm algoritm){
        algoritms.add(algoritm);
        return algoritm;
    }

    @PutMapping("/{id}")
    Algoritm putAlgoritm(@PathVariable String id, @RequestBody Algoritm algoritm){
        int algoIndex = -1;
        for (Algoritm a : algoritms){
            if (a.getId().equals(id)){
                algoIndex = algoritms.indexOf(a);
                algoritms.set(algoIndex, algoritm);
            }
        }
        return algoIndex == -1 ? postAlgoritm(algoritm) : algoritm;
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable String id){
        algoritms.removeIf(c -> c.getId().equals(id));
    }
}
