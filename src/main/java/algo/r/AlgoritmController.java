package algo.r;

import org.springframework.web.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlgoritmController {
    List<Algoritm> algoritms = new ArrayList<>();

    public AlgoritmController() {
        algoritms.addAll(List.of(
                new Algoritm(1L, "Бинарный поиск", "Поисковые алгоритмы",
                        "Эффективный алгоритм поиска в отсортированном массиве",
                        "public int binarySearch(int[] arr, int target) { ... }")
        ));
    }

    @GetMapping("/")
    Iterable<Algoritm> getAlgoritms(){
        return algoritms;
    }
}
