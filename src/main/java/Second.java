import reactor.core.publisher.Mono;

public class Second {
    public static void main(String[] args) {


     //   Mono<Integer> mono = Mono.just(1);
     //   System.out.println(mono);

      //  mono.subscribe(i-> System.out.println("Recieved "+ i));
       Mono<Integer> mono = Mono.just("ball")
                .log()
                .map(String::length)
                .map(l ->l/1);

        mono.subscribe(

                item -> System.out.println(item),
                err-> System.out.println(err),
               () -> System.out.println("Completed")
        );


    }
}
