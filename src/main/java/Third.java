import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

public class Third {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        Flux flux = Flux.just(1,2, 3,4);


     // .log()
        flux.subscribe(
                item -> System.out.println(item),
                err-> System.out.println(err),
                () -> System.out.println("Completed")
        );

    }


}
